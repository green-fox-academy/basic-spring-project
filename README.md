# Spring Basic Project

## Game logic parameters
|        |Building time   ||Building cost       ||HP     |Effect                                                         |
|--------|-------|---------|--------|------------|-------|---------------------------------------------------------------|
|        |Level 1|Level n  |Level 1 |Level n     |Level n|Level n                                                        |
|Townhall|2:00   |n * 1:00 |200 gold|n * 200 gold|n * 200|can build level n buildings                                    |
|Farm    |1:00   |n * 1:00 |100 gold|n * 100 gold|n * 100|+(n * 5) + 5 food / minute                                     |
|Mine    |1:00   |n * 1:00 |100 gold|n * 100 gold|n * 100|+(n * 5) + 5 gold / minute                                     |
|Academy |1:30   |n * 1:00 |150 gold|n * 100 gold|n * 150|can build level n troops                                       |
|Troop   |0:30   |n * 0:30 |25 gold |n * 25 gold |n * 20 |-(n * 5) food / minute<br>+(n * 10) attack<br>+(n * 5) defense |


## Dependencies

- Java Development Kit - JDK 8.0

## Steps

- Create a new repository on Github and select `green-fox-academy/basic-spring-project` as the repository template
- OR Click the `Use this template` button at the top of the page
  - in order to initialize project team repo follow the project naming convention: https://docs.google.com/spreadsheets/d/1vdqn4i0GYWNDHL96jrNrXOZJJ6lQsN-_m3aFHGjOmng
- Add a new project on [CircleCi](https://onboarding.circleci.com/project-dashboard/github/green-fox-academy) with your new repository

## Git Workflow

### Day Start

Use `git fetch` in order to retrieve the most recent commits from GitHub.

### Start New Feature/Bugfix

In order to minimize merge conflicts later always open a new feature branch from the most recent state of the `development` branch on GitHub.

- `git fetch`
- `git checkout -b <branch_name> origin/development`

### Update Feature Branch

While you're working on your own feature/bugfix other developers make changes on `development` and it's required to update your branch to keep consistency of the codebase. You can do this in 2 ways.

[`git merge` vs `git rebase`](https://www.atlassian.com/git/tutorials/merging-vs-rebasing)

#### Rebase

[`git rebase`](https://www.atlassian.com/git/tutorials/rewriting-history/git-rebase)

Rebase rewrites commit history; therefore, do not use rebase on the `master` and `development` branches.
On the other hand feel free to use rebase on your own branches.

Use `git rebase development` while on your branch.

#### Merge

[`git merge`](https://www.atlassian.com/git/tutorials/using-branches/git-merge)

This creates a new commit (so called merge commit) containing changes from both your branch and the development branch.

Use `git merge development` while on your branch.

### Commit and Push

You can work on your feature/bugfix separately but sometimes you may need to merge another branch into your branch (i.e. to try out your feature). In order to have clean workflow (and pull requests) always commit only feature related modifications. This is harder to reset files or hunks later.
