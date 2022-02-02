# Algorithm Visualizer Demo

Welcome to browser-based demo of Brian's algorithm visualizer!

This demo will introduce the visualization system through a series of example visualizations.

You can view (and edit) the example visualizations by opening the various `.av.jsonc` files in the folders displayed in the file explorer to the left.
These files have explanatory comments that will make the most sense if you read through the files in numerical order (and also finish reading this README file first).









## Introduction

Normally, the system can be used to create visualizations in 4ish steps:

1. Write code for an algorithm in Java.
2. Add Java labels to the code and use them to specify which "steps" to display in the visualization.
3. Choose what variables from the Java code to display in the visualization.
4. Configure display properties (e.g., colors, font size) and any transitions between steps.

The full version of the visualizer currently runs as an extension to the Visual Studio Code (VSCode) text editor; this online demo uses a modified version of VSCode that can run in browsers and supports part of the visualizer extension's functionality.
Specifically, visualizations can be edited and previewed, but

## Notes

* This repository is meant to be viewed from <https://homes.cs.washington.edu/~brianc42/algorithm-visualization/>.
  If you are viewing this file from elsewhere, this README file may not make much sense.
* The visualizations work best in Chrome/Firefox/Edge. Some visualizations are known to display incorrectly in Safari.
* This browser demo will allow you to make and preview changes to visualization files (`.av.jsonc`),
  but it **cannot** save those changes. Any changes made will be lost if you close the file or reload/close the browser tab.
* This browser demo provides only a basic preview of the visualization system, and is not meant to be a full tutorial.
  For more thorough documentation, see TODO

## Visualizations

Each directory in this demo continas a different algorithm visualization.
For each visualization, the `.java` file(s) contain the code for the algorithm being visualized and the `.av.jsonc` file specifies the visualization.
The latter are the ones to open in order to preview the visualizations.
(The `trace.json` contains a program trace generated from the Java code; it's not meant to be read by humans.)

0. [Subarray Sum](./av0/subarraysum.av.jsonc): an example of what this system can do.
1. [Basics](./av1_basics/basics.av.jsonc): an introduction to the file format for the `.av.jsonc`
2. [Arrays](./av2_arrays/arrays.av.jsonc): another basic example, this time with an array.
3. [Conditions](./av3_conditions/linearsearch.av.jsonc): introducing an easier way to add dynamic text or more-complex styles.
4. [Transitions](./av4_transitions/transitions.av.jsonc): specifying how the visualization animates between steps.
5. [GCD](./av99_gcd/gcd.av.jsonc): another complex example to finish things off
