package wagnerrodrigues.io.newsappstarter.presenter.search

import wagnerrodrigues.io.newsappstarter.model.NewsResponse
import wagnerrodrigues.io.newsappstarter.model.data.NewsDataSource
import wagnerrodrigues.io.newsappstarter.presenter.ViewHome

class SearchPresenter(val view: ViewHome.View,
                      private val dataSource: NewsDataSource ): SearchHome.Presenter{
    override fun search(term: String) {
        TODO("Not yet implemented")
    }

    override fun onSuccess(newsResponse: NewsResponse) {
        TODO("Not yet implemented")
    }

    override fun onError(message: String) {
        TODO("Not yet implemented")
    }

    override fun onComplete() {
        TODO("Not yet implemented")
    }
}