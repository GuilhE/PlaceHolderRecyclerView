# Changelog

## [1.1.0]

- Added `var holdersItemDecoration` to configure placeholders item decoration when needed.
- Renamed package from _...__view__.PlaceHolderRecyclerView_ to _...__views__.PlaceHolderRecyclerView_

---

## [1.0.1]

- Added check for current adapter before changing it.  
This is important in pagination situations where we could call `toggleHoldersAdapter(false)` thus making the list refresh and lose its scroll position.

---

## [1.0.0]

First version released
