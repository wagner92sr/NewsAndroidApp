package wagnerrodrigues.io.newsappstarter.presenter.search

import wagnerrodrigues.io.newsappstarter.model.NewsResponse

interface SearchHome {

    interface Presenter{
        fun search(term: String)
        fun onSuccess(newsResponse: NewsResponse)
        fun onError(message: String)
        fun onComplete()
    }
}