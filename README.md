# Films

Just click on the search button and write what to look for and the application will find and show you all the movies that are available on the IMDb for such a request! You can also click on the movie that will be found and see its detailed description.

## Preview:
<img src="https://user-images.githubusercontent.com/48939805/185735790-b3caf843-e91a-42fd-acdb-4c91a92a5c3b.gif" width=30% height=30%>


## Case Study:
* [Hilt](https://developer.android.com/training/dependency-injection/hilt-android) - Dependency injection in the project.
     - Simplify Dagger-related infrastructure for Android apps.
     - Create a standard set of components and scopes to ease setup, readability/understanding, and code sharing between apps.
     - Provide an easy way to provision different bindings to various build types (e.g. testing, debug, or release).
* [Paging 3](https://developer.android.com/topic/libraries/architecture/paging/v3-overview) - To load movies into an infinite list while user scrolls down

   - Repository layer:
      * The primary Paging library component in the repository layer is PagingSource. Each PagingSource object defines a source of data and how to retrieve data from          that source. A PagingSource object can load data from any single source, including network sources and local databases.
       Another Paging library component that you might use is RemoteMediator. A RemoteMediator object handles paging from a layered data source, such as a network data        source with a local database cache.
   - ViewModel layer:
      * ViewModel layerThe Pager component provides a public API for constructing instances of PagingData that are exposed in reactive streams, based on a PagingSource object and a PagingConfig configuration object.
The component that connects the ViewModel layer to the UI is PagingData. A PagingData object is a container for a snapshot of paginated data. It queries a PagingSource object and stores the result.
   - UI Layer:
     * The primary Paging library component in the UI layer is PagingDataAdapter, a RecyclerView adapter that handles paginated data.

<img src="https://user-images.githubusercontent.com/48939805/185756951-1645554c-cd3a-465c-9592-ba09782940a0.svg" width=60% height=60%>

# Libraries and technologies used.
- [Retrofit](https://square.github.io/retrofit/) - Making HTTP connection with the rest API and convert reponse json file to Kotlin/Java object.
- [MVVM & LiveData](https://developer.android.com/jetpack/docs/guide) : Saperate logic code from views and save the state in case the screen configuration changes.
- [Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) -Background code execution.
- [Data binding](https://developer.android.com/topic/libraries/data-binding) - Allows to bind UI components in layouts to data sources.
- [Hilt](https://developer.android.com/training/dependency-injection/hilt-android) - Compile-time framework for dependency injection.
- [Paging 3](https://developer.android.com/topic/libraries/architecture/paging/v3-overview) - Load and display small chunks of data at a time.
- [Glide](https://github.com/bumptech/glide) - Load and cache images by URL.
- [Navigation](https://developer.android.com/guide/navigation/navigation-getting-started) - Handle everything related for in-app navigation.
