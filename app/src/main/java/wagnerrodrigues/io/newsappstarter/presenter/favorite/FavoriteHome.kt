package wagnerrodrigues.io.newsappstarter.presenter.favorite

import wagnerrodrigues.io.newsappstarter.model.Article

interface FavoriteHome {
    fun showArticles(articles: List<Article>)
}