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

                                        //TODO 7
class MainActivity : AppCompatActivity(),MainView {


    //TODO 8 deklrasi
    lateinit var presenter: MainPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO 9 INISIAL

        presenter = MainPresenter(this)


        //TODO 14
        submitHitung.onClick {
            presenter.hitung(input1.text.toString(),input2.text.toString())
        }

    }

    override fun onAttachView() {
        //TODO 10
        presenter.onAttach(this)
    }

    override fun onDettachView() {
        //TODO 11
        onDettachView()
    }

                                            //TODO 15
    override fun success(hasil: Hasilmodel) {
       alert {
           title =hasil.hasilmodel
           noButton {  }
           yesButton {  }
       }
               .show()

    }

                                            //TODO 16
    override fun error() {
        toast("hei tidak boleh kosong")
    }

                                            //TODO 12
    override fun onStart() {
        super.onStart()
        onAttachView()
    }

                                            //TODO 13
    override fun onDestroy() {
        super.onDestroy()
        onDettachView()
    }
}
