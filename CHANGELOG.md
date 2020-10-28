# Changelog

## [1.1.0]

- Added `var holdersItemDecoration` to configure placeholders item decoration when needed.
- Renamed package from ...__view__.PlaceHolderRecyclerView to ...__views__.PlaceHolderRecyclerView

---

## [1.0.1]

- Added check for current adapter before changing it.  
This is important in pagination situations where we could call `toggleHoldersAdapter(false)` thus making the list refresh and lose its scroll position.

---

## [1.0.0]

First version released
