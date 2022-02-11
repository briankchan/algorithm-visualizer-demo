# Algorithm Visualizer Demo

This is a browser-based demo of the algorithm visualizer that Brian has been working on.
The demo includes a series of example visualizations to showcase the system and its usage.

The first and last examples are near-complete visualizations to demonstrate what the system can do, and the others explain the basics&mdash;make sure to view them in **numerical order**.

## Usage

Normally, visualizations can be created in 2ish steps:

1. Write code for an algorithm in Java, and use the system to generate a program trace for the code.
2. Specify how to visualizate the trace in an `.av.jsonc` file.
3. (The final output would be a visualization with step/playback controls that could be embedded in a webpage.)

The full version of the visualizer currently runs as an extension to the Visual Studio Code (VSCode) text editor; this online demo uses a modified version of VSCode that can run in browsers and supports step 2, but not step 1.

You can view (and edit) the example visualizations by opening the various `.av.jsonc` files in the folders displayed in the file explorer to the left.

(Make sure to go through them in numerical order and read the header comments for full context.)

The visualizations can be previewed by clicking the "play" button at the top-right of the editor.

## Visualizations

Each directory (other than `.vscode`) in this demo contains a different visualization.

0. **Subarray Sum**
    * A near-complete visualization to show what this system can do.
    * This `.av.jsonc` file is rather dense; see the next example instead for a basic introduction.
1. **Basics**
    * A toy example to explain the `.av.jsonc` files.
2. **Arrays**
    * Another basic example to introduce the syntax to display arrays.
3. **Conditions**
    * A  easier way to add dynamic text or more-complex styles.
4. **Transitions**
    * One last toy example to explain how to customize animations.
5. **GCD**
    * Another complex example to finish things off.
    * This one stretches

For each visualization, the `.java` file(s) contain the code for the algorithm being visualized and the `.av.jsonc` file specifies the visualization.
(The `trace.json` files contain the program traces; they're not meant to be read by humans.)

## Notes

* The visualizations work best in Chrome/Firefox/Edge. Some visualizations are known to display incorrectly in Safari.
* This browser demo will allow you to make and preview changes to visualization files (`.av.jsonc`), but it **cannot** save those changes.
  Any changes made will be lost if you close the file or reload/close the browser tab.
* This browser demo provides only a basic introduction to the visualization system, and is not meant to be a full tutorial.
  If you want to see more, consider scheduling time with Brian to make a visualization together!
