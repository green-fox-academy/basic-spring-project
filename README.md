# Spring Basic Project

## Dependencies

- Java Development Kit - JDK 11.0.6

## Steps    

- Create a new repository on Github and select `green-fox-academy/basic-spring-project` as the repository template
- OR Click the `Use this template` button at the top of the page
  - in order to initialise project team repo follow the project naming convention: https://docs.google.com/spreadsheets/d/1vdqn4i0GYWNDHL96jrNrXOZJJ6lQsN-_m3aFHGjOmng


## GIT Workflow

### Day Start

Use `git pull` in order to have the most recent

### Start New Feature/Bugfix

In order to minimise later merge conflicts always open feature branch from most recent state of `development`.

- `git checkout development`
- `git pull`
- `git checkout -b <branch_name>`

### Update Feature Branch

This is usual to have an update on `development` while you are working on your feature/bugfix and this is recommended to update your branch to keep consistency of your code. You can do this in 2 ways.

[`git merge` vs `git rebase`](https://www.atlassian.com/git/tutorials/merging-vs-rebasing)

#### Rebase

[`git rebase`](https://www.atlassian.com/git/tutorials/rewriting-history/git-rebase)

Because it rewrites commit history rebase only unpushed commits (you can rebase already pushed commits but then you can have serious issues).

Use `git rebase dev` on your branch.

#### Merge

[`git merge`](https://www.atlassian.com/git/tutorials/using-branches/git-merge)

It is going to put dev on the top of your current branch.

Use `git merge dev` on your branch.

### Commit and Push

You can work on your feature/bugfix separately but sometimes you may need to merge another branch into your branch (i.e. to try out your feature). In order to have clean workflow (and pull requests) always commit only feature related modifications. This is harder to reset files or hunks later.
