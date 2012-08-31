HeaderViewBugDemo
=================

Project that demonstrates a bug with a header view of a ListView on Android 3.0+ (happens on tablet, but not on emulator).

Instructions to Reproduce Bug:
- Run the application on a tablet
- Click an item on the left hand column
- Observer the header text
- Tap the EditText box in the bottom of the right hand column to launch the virtual keyboard. When the keyboard launches,
  the TextView width is changed.
