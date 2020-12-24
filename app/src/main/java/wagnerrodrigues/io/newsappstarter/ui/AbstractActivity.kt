package wagnerrodrigues.io.newsappstarter.ui

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

abstract class AbstractActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        onInject()
    }

    @LayoutRes//Garante que o inteiro que chegar aqui, é referente a um arquivo de layout
    protected abstract fun getLayout() : Int

    protected abstract fun onInject()


}