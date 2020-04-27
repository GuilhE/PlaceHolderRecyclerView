# Changelog

---

## [1.0.1] - April 27, 2020

Added check for current adapter before changing it.  
This is important in pagination situations where we could call `toggleHoldersAdapter(false)` thus making the list refresh and lose its scroll position.

---

## [1.0.0] - April 26, 2020

First version released
