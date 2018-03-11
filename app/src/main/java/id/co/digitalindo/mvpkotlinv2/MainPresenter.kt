package id.co.digitalindo.mvpkotlinv2

import id.co.digitalindo.mvpkotlinv2.base.BasePresenter
import id.co.digitalindo.mvpkotlinv2.model.Hasilmodel

/**
 * Created by nandoseptianhusni on 3/11/18.
 */
class MainPresenter : BasePresenter<MainView> {

//TODO 1 deklrasi
    var modelview : MainView? = null

    //TODO 2 klik kanan -> generate-> secondary contrucktor
    constructor(model: MainView?) {
        this.modelview = model
    }

    //TODO 3 buat function sendiri

    fun hitung(satu : String,dua : String){

        //TODO 4 kondisional
        if(satu.isNotEmpty() && dua.isNotEmpty()){

            val nilai1 = satu.toDouble()
            val nilai2 = dua.toDouble()
            val hasil = nilai1 * nilai2
            val model = Hasilmodel(hasil.toString())


            //TODO 5 masukkan k view
            modelview?.success(model)
        }
        else{
            //TODO 6 response ke view kalau string kososng
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