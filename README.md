# PlaceHolderRecyclerView

<img src="https://raw.githubusercontent.com/Guilhe/PlaceHolderRecyclerView/master/assets/stone.gif" /> <img src="https://raw.githubusercontent.com/Guilhe/PlaceHolderRecyclerView/master/assets/lottie.gif" /> <img src="https://raw.githubusercontent.com/Guilhe/PlaceHolderRecyclerView/master/assets/emoji.gif" />  

A RecyclerView that can switch between items and placeholders.  
This libs doesn't force a placehoder type, the developer is responsible for creating one, checkout the sample module and see how simple it is.  

You can use the best beloved [Shimmer-Android](http://facebook.github.io/shimmer-android/), a [Lottie](https://airbnb.design/lottie/) animation or even [Property Animation](https://developer.android.com/guide/topics/resources/animation-resource). Use your imagination, it's your placeholder 😊

## Getting started

The first step is to include PlaceHolderRecyclerView into your project, for example, as a Gradle compile dependency:

```groovy
implementation 'com.github.guilhe:placeholder-recyclerview:${LATEST_VERSION}'
```
[![Maven Central](https://img.shields.io/maven-central/v/com.github.guilhe/placeholder-recyclerview.svg)](https://search.maven.org/search?q=g:com.github.guilhe%20AND%20placeholder-recyclerview) [![Download](https://api.bintray.com/packages/gdelgado/android/PlaceHolderRecyclerView/images/download.svg)](https://bintray.com/gdelgado/android/PlaceHolderRecyclerView/_latestVersion)

## Sample usage
```xml
 <com.github.guilhe.view.PlaceHolderRecyclerView
         android:id="@+id/my_RecyclerView"
         android:layout_width="match_parent"
         android:layout_height="match_parent" />
```
```java
class MyItemsPlaceHolderAdapter : ..., PlaceHolderAdapter { ...}
...

private val itemsAdapter = MyItemsAdapter()
...
with(binding.myRecyclerView) {
    adapter = itemsAdapter
    holdersAdapter = MyItemsPlaceHolderAdapter()
}
...
viewModel.items.observe(this, Observer { itemsAdapter.update(it) })
viewModel.isLoading.observe(this, Observer { isLoading -> binding.myRecyclerView.toggleHoldersAdapter(isLoading) })
```

<img src="https://raw.githubusercontent.com/Guilhe/PlaceHolderRecyclerView/master/assets/sample.gif" />  

Don't recognise those chinese characters? They're from an awesome game called [Mahjong](https://en.wikipedia.org/wiki/Mahjong)  
Lottie animation by [puput Santoso](https://lottiefiles.com/puput_santoso)

    
## Dependencies
- [androidx.recyclerview:recyclerview](https://developer.android.com/jetpack/androidx/releases/recyclerview)

## Bugs and Feedback

For bugs, questions and discussions please use the [Github Issues](https://github.com/GuilhE/PlaceHolderRecyclerView/issues).

## Binaries
Additional binaries and dependency information for can be found [here](https://search.maven.org/artifact/com.github.guilhe/placeholder-recyclerview).  
<a href='https://bintray.com/gdelgado/android/PlaceHolderRecyclerView?source=watch' alt='Get automatic notifications about new "PlaceHolderRecyclerView" versions'><img src='https://www.bintray.com/docs/images/bintray_badge_bw.png'></a>

## LICENSE

Copyright (c) 2020-present GuilhE

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

<http://www.apache.org/licenses/LICENSE-2.0>

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
