# Contributing to the project

## Restricted branches
- `development` - all the implemented features which are done and deployed
- `master` - stable version deployed

## Workflow

1. Create a feature branch when you start to work on a story and commit your changes to this 
2. Push this frequently to the remote repository from your local
2. When the feature is done, create a Pull Request from the `feature_branch` to `development`, follow the guidelines
3. When the PR is approved, merge it, and delete your feature branch

## Git Commit Guidelines

Read this article how to write meaningful commit messages:
[How to Write a Git Commit Message](https://chris.beams.io/posts/git-commit/)

With the expectations listed below, we follow the rules contained in
[Angular.js's Git Commit Guidelines](https://github.com/angular/angular.js/blob/master/DEVELOPERS.md#commits):

 -  **Type**: Must be one of the following
     -  **feat**: A new feature implementation
     -  **fix**: A bug fix
     -  **refactor**: A code change that neither fixes a bug nor adds a feature
     -  **chore**: Changes to the build process or auxiliary tools and libraries such as documentation generation
     
 -  Consider starting the commit message with an applicable emoji:
    * :art: `:art:` when improving the format/structure of the code
    * :racehorse: `:racehorse:` when improving performance
    * :non-potable_water: `:non-potable_water:` when plugging memory leaks
    * :memo: `:memo:` when writing docs
    * :penguin: `:penguin:` when fixing something on Linux
    * :apple: `:apple:` when fixing something on macOS
    * :checkered_flag: `:checkered_flag:` when fixing something on Windows
    * :bug: `:bug:` when fixing a bug
    * :fire: `:fire:` when removing code or files
    * :green_heart: `:green_heart:` when fixing the CI build
    * :white_check_mark: `:white_check_mark:` when adding tests
    * :lock: `:lock:` when dealing with security
    * :arrow_up: `:arrow_up:` when upgrading dependencies
    * :arrow_down: `:arrow_down:` when downgrading dependencies

## Pull Request guidelines

- From `feature_branch` to `development`: add all developers and PM as reviewers, 2 approves needed for merging
- From `development` to `master`: this is managed by the PM
