package wagnerrodrigues.io.newsappstarter.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import wagnerrodrigues.io.newsappstarter.model.NewsResponse
import wagnerrodrigues.io.newsappstarter.util.Constantes.Companion.API_KEY

interface NewsAPI {
    @GET("/v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String = "br",
        @Query("pageNumber")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY
    ): Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchNews(
        @Query("q")
        searchQuery: String,
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY
    ):Response<NewsResponse>
}