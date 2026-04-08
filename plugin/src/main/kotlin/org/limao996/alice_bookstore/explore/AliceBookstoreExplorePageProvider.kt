package org.limao996.alice_bookstore.explore

import io.nightfish.lightnovelreader.api.explore.ExploreBooksRow
import io.nightfish.lightnovelreader.api.web.explore.ExploreExpandedPageDataSource
import io.nightfish.lightnovelreader.api.web.explore.ExplorePageProvider
import io.nightfish.lightnovelreader.api.web.explore.ExploreTapPageDataSource
import io.nightfish.lightnovelreader.api.web.explore.filter.Filter
import io.nightfish.lightnovelreader.api.web.search.SearchResult
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

object AliceBookstoreExplorePageProvider : ExplorePageProvider.DefaultExplorePageProvider {
    override val explorePageIdList: List<String> = listOf("1", "2", "3")
    override val exploreTapPageDataSourceMap: Map<String, ExploreTapPageDataSource> = mapOf(

        "首页" to MainExploreTapPageDataSource
    )
    override val exploreExpandedPageDataSourceMap: Map<String, ExploreExpandedPageDataSource> =
        mapOf(
            "首页" to object : ExploreExpandedPageDataSource {
                override val title: String
                    get() = TODO("Not yet implemented")
                override val filters: List<Filter<*>>
                    get() = TODO("Not yet implemented")

                override fun loadMore() {
                    TODO("Not yet implemented")
                }

                override fun getResultFlow(): Flow<SearchResult> {
                    TODO("Not yet implemented")
                }

            })
}