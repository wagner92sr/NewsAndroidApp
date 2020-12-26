package wagnerrodrigues.io.newsappstarter.ui

import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import wagnerrodrigues.io.newsappstarter.R
import wagnerrodrigues.io.newsappstarter.adapter.MainAdapter
import wagnerrodrigues.io.newsappstarter.model.Article
import wagnerrodrigues.io.newsappstarter.model.data.NewsDataSource
import wagnerrodrigues.io.newsappstarter.presenter.ViewHome
import wagnerrodrigues.io.newsappstarter.presenter.news.NewsPresenter

class MainActivity : AbstractActivity(), ViewHome.View {

    private val mainAdapter by lazy {
        MainAdapter()
    }

    private lateinit var presenter: NewsPresenter

    override fun getLayout(): Int = R.layout.activity_main

    override fun onInject() {

        val dataSource = NewsDataSource()
        presenter = NewsPresenter(this,dataSource)
        presenter.requestAll()
        configRecycle()
    }

    private fun configRecycle(){
        with(rvNews){
            adapter = mainAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
            addItemDecoration(
                DividerItemDecoration(
                this@MainActivity, DividerItemDecoration.VERTICAL
            ))
        }
    }

    override fun showProgressBar() {
        rvProgressBar.visibility = View.VISIBLE
    }

    override fun showFailure(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun hideProgressBar() {
        rvProgressBar.visibility = View.INVISIBLE
    }

    override fun showArticles(articles: List<Article>) {
        mainAdapter.differ.submitList(articles.toList())
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_item, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.search_menu -> {
                Intent(this, SearchActivity::class.java).apply {
                    startActivity(this)
                }
            }
            R.id.favorite -> {
                Intent(this, FavoriteActivity::class.java).apply {
                    startActivity(this)
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }

}
