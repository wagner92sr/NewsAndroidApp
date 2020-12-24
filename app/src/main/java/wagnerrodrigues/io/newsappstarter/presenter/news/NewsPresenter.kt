package wagnerrodrigues.io.newsappstarter.presenter.news

import wagnerrodrigues.io.newsappstarter.model.NewsResponse
import wagnerrodrigues.io.newsappstarter.model.data.NewsDataSource
import wagnerrodrigues.io.newsappstarter.presenter.ViewHome

class NewsPresenter (
    val view: ViewHome.View,
            private val dataSource: NewsDataSource
) : NewsHome.Presenter{
    override fun requestAll() {
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