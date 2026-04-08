package org.limao996.alice_bookstore.explore

import io.nightfish.lightnovelreader.api.explore.ExploreBooksRow
import io.nightfish.lightnovelreader.api.web.explore.ExploreTapPageDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.limao996.alice_bookstore.HOST
import org.limao996.alice_bookstore.utils.get

object MainExploreTapPageDataSource : ExploreTapPageDataSource {
    override val title: String = "首页"
    override fun getRowsFlow(): Flow<List<ExploreBooksRow>> = flow {
        val soup = get(HOST)
        soup?.select(".container .row .layout-col2")?.forEach { box ->
            val title = box.selectFirst(".layout-tit")?.ownText() ?: return@forEach
            box.select(".item")?.forEach { item ->
                val cover=item.selectFirst("")
            }
        }

        emit(listOf(ExploreBooksRow("1", listOf())))

    }
}