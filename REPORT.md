 GIT HOMEWORK REPORT

## I. Project Initialization and Commit Chain

My first step was to configure my identity in **Git Bash** and create an empty repository named **Git\_Homework** on GitHub.

### 1. Local Setup and Initial Commit (a, b, c, d)

1.  I cloned the repository to my local machine using the **`git clone`** command.
2.  I opened the cloned folder in **IntelliJ IDEA** and created a basic Java project (including a Main class).
3.  I added the initial project configuration files (`.idea`, `.iml`, etc.) using **`git add .`** and recorded my first commit: **`Initial commit: IntelliJ Java project structure setup`**.

### 2. Feature Implementation and Staged Commits (e through j)

I developed the code according to project requirements in three stages, recording each stage with a separate commit:

* **Stage 1 (e, f):** I created a 10-element integer array (table). My commit message was: **`Feature: Table creation and display added`**.
* **Stage 2 (g, h):** I added the code to fill the array with **random values**. My commit message was: **`Feature: Table initialized with random values`**.
* **Stage 3 (i, j):** I added the code to **sort** the array using Java's built-in `Arrays.sort()` method. My commit message was: **`Feature: Array sorting algorithm added`**.

***

## II. Historical Review and Revision Control

### 1. History and Annotation (k, l)
I verified my entire commit history using the **`git log --oneline --graph`** command. I then used the **`git blame poland3/src/Main.java`** command to confirm which lines of code were introduced by which specific commit, successfully validating the staged development.

### 2. Time Travel (m)
I used the hash of the initialization commit (`6fb55bb`) from the `git log` output to revert the code to the state **before the sorting algorithm was added** using **`git checkout 6fb55bb`**. I verified the file contents in IntelliJ and then returned to the current revision with **`git checkout main`**.

### 3. Undoing Uncommitted Changes (n, o)
I deliberately added a test comment to `Main.java` but did not commit it. I then used the **`git restore poland3/src/Main.java`** command to quickly discard this uncommitted change, restoring the file to its last committed state.

***

## III. Branching, Merging, and Remote Operations

### 1. Tagging and Initial Push (p, t)
I pushed all my initial commits using the **`git push`** command. I then created a tag marking the current stable state with **`git tag v1.0`** and pushed it to the remote repository using **`git push origin v1.0`**.

### 2. Cloning Again and Branching (r, s, u, w)
* I deleted the local **`Git_Homework`** folder (**r**).
* I re-cloned the project from GitHub using **`git clone`** (**s**).
* I created a new branch for the improvement using **`git branch feature/bubble-sort`** (**u**), and switched to it using **`git checkout feature/bubble-sort`** (**w**).

### 3. Feature Development and Merge (x, y)
* In the `feature/bubble-sort` branch, I replaced the simple `Arrays.sort()` code with a manual **Bubble Sort** algorithm. I committed this change with the message: **`Refactor: Switched sorting algorithm to Bubble Sort`** (**x**).
* After development, I returned to the main branch with **`git checkout main`**.
* I merged the new feature into the main branch using **`git merge feature/bubble-sort`** (**y**), which resulted in a **Fast-forward** merge.
* Finally, I pushed this merged code to GitHub using **`git push`**.

***

## IV. Conflict Resolution (The Hard Part)

### 1. Conflict Setup (z1)
To simulate the core challenge of collaborative work, I set up a conflict scenario:
1.  **Local Change:** I made a small local commit (Seval's version) to `Main.java` but **did not push it**.
2.  **Remote Change:** My friend Furkan changed the **exact same line** on GitHub commit and pushed it directly to the remote `main` branch.

LENOVO@DESKTOP-9NF1MMS MINGW64 ~/Git_Homework (main)
$ git pull
remote: Enumerating objects: 9, done.
remote: Counting objects: 100% (9/9), done.
remote: Compressing objects: 100% (4/4), done.
remote: Total 5 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
Unpacking objects: 100% (5/5), 1.13 KiB | 32.00 KiB/s, done.
From https://github.com/sevalersoy/Git_Homework
   fa7b3a3..489fef2  main       -> origin/main
Auto-merging poland3/src/Main.java
CONFLICT (content): Merge conflict in poland3/src/Main.java
Automatic merge failed; fix conflicts and then commit the result.


### 2. Resolution and Delivery (z2, z3)
I triggered the conflict using **`git pull`**, which resulted in the expected **`CONFLICT (content)`** output in the terminal.

1.  I opened **IntelliJ IDEA** and manually resolved the conflict by deleting all Git markers (`<<<<<<<`, `=======`, `>>>>>>>`) and choosing to keep my local version of the code.
2.  I recorded the resolution using **`git add`** and a **`git commit -m "Conflict resolved..."`** command.
3.  Finally, I delivered the entire solution by executing **`git push`**, successfully concluding the merge and sending the resolution to GitHub.

---
