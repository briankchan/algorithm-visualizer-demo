# Algorithm Visualizer Demo

This is a browser-based demo of the algorithm visualizer that Brian has been working on.

This demo will introduce the visualization system through a series of example visualizations.
You can view (and edit) the example visualizations by opening the various `.av.jsonc` files in the folders displayed in the file explorer to the left.

The comments in the visualization files will explain the basics of the system, so make sure to read them in numerical order.

## About the system

Normally, visualizations can be created in 2ish steps:

1. Write code for an algorithm in Java, and use the system to generate a program trace for the code.
2. Specify how to visualizate the trace in an `.av.jsonc` file.

The full version of the visualizer currently runs as an extension to the Visual Studio Code (VSCode) text editor; this online demo uses a modified version of VSCode that can run in browsers and supports step 2, but not step 1.

## Notes

* The visualizations work best in Chrome/Firefox/Edge. Some visualizations are known to display incorrectly in Safari.
* This browser demo will allow you to make and preview changes to visualization files (`.av.jsonc`), but it **cannot** save those changes.
  Any changes made will be lost if you close the file or reload/close the browser tab.
* This browser demo provides only a basic introduction to the visualization system, and is not meant to be a full tutorial.
  If you want to see more, consider scheduling time with Brian to make a visualization together!

## Visualizations

Each directory (other than `.vscode`) in this demo contains a different visualization.
For each visualization, the `.java` file(s) contain the code for the algorithm being visualized and the `.av.jsonc` file specifies the visualization.
Open the `.av.jsonc` files in order to preview the visualizations.
(The `trace.json` files contain the program traces; they're not meant to be read by humans.)

1. **Subarray Sum:** an example of what this system can do.
2. **Basics:** a basic explanation of the `.av.jsonc` files.
3. **Arrays:** another simple example, this time with an array.
4. **Conditions:** an easier way to add dynamic text or more-complex styles.
5. **Transitions:** specifying how the visualization animates between steps.
6. **GCD:** another complex example to finish things off
