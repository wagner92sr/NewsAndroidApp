package wagnerrodrigues.io.newsappstarter.presenter.news

import wagnerrodrigues.io.newsappstarter.model.NewsResponse
import wagnerrodrigues.io.newsappstarter.model.data.NewsDataSource
import wagnerrodrigues.io.newsappstarter.presenter.ViewHome

class NewsPresenter (
    val view: ViewHome.View,
    private val dataSource: NewsDataSource
) : NewsHome.Presenter{

    override fun requestAll() {
        this.view.showProgressBar()
        this.dataSource.getBreakingNews(this)
    }

    override fun onSuccess(newsResponse: NewsResponse) {
        this.view.showArticles(newsResponse.articles)
    }

    override fun onError(message: String) {
        this.view.showFailure(message)
    }

    override fun onComplete() {
        this.view.hideProgressBar()
    }

}