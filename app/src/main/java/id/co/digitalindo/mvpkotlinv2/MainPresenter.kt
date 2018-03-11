package id.co.digitalindo.mvpkotlinv2

import id.co.digitalindo.mvpkotlinv2.base.BasePresenter
import id.co.digitalindo.mvpkotlinv2.model.Hasilmodel

/**
 * Created by nandoseptianhusni on 3/11/18.
 */
class MainPresenter : BasePresenter<MainView> {


    var modelview : MainView? = null

    constructor(model: MainView?) {
        this.modelview = model
    }

    fun hitung(satu : String,dua : String){

        if(satu.isNotEmpty() && dua.isNotEmpty()){

            val nilai1 = satu.toDouble()
            val nilai2 = dua.toDouble()
            val hasil = nilai1 * nilai2
            val model = Hasilmodel(hasil.toString())


            modelview?.success(model)
        }
        else{
            modelview?.error()
        }
    }

    override fun onAttach(view: MainView) {
        modelview = view
    }

    override fun onDettach() {
        modelview = null
    }
}