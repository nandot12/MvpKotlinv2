package id.co.digitalindo.mvpkotlinv2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import id.co.digitalindo.mvpkotlinv2.model.Hasilmodel
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.noButton
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.toast
import org.jetbrains.anko.yesButton

class MainActivity : AppCompatActivity(),MainView {

    lateinit var presenter: MainPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(this)
        submitHitung.onClick {
            presenter.hitung(input1.text.toString(),input2.text.toString())
        }

    }

    override fun onAttachView() {
        presenter.onAttach(this)
    }

    override fun onDettachView() {
        onDettachView()
    }

    override fun success(hasil: Hasilmodel) {
       alert {
           title =hasil.hasilmodel
           noButton {  }
           yesButton {  }
       }
               .show()

    }

    override fun error() {
        toast("hei tidak boleh kosong")
    }


    override fun onStart() {
        super.onStart()
        onAttachView()
    }

    override fun onDestroy() {
        super.onDestroy()
        onDettachView()
    }
}
