package wagnerrodrigues.io.newsappstarter.model.data

import android.media.browse.MediaBrowser
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import wagnerrodrigues.io.newsappstarter.network.RetrofitInstance
import wagnerrodrigues.io.newsappstarter.presenter.ViewHome
import wagnerrodrigues.io.newsappstarter.presenter.news.NewsHome

class NewsDataSource{

    fun getBreakingNews(callback: NewsHome.Presenter) {
        GlobalScope.launch(Dispatchers.Main){
            val response = RetrofitInstance.api.getBreakingNews("br")
            if(response.isSuccessful){
                response.body()?.let { newsResponse ->
                    callback.onSuccess(newsResponse)
                }
                callback.onComplete()
            } else{
                callback.onError(response.message())
                callback.onComplete()
            }
        }
    }
}