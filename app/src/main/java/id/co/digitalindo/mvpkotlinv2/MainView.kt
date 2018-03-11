package id.co.digitalindo.mvpkotlinv2

import id.co.digitalindo.mvpkotlinv2.base.BaseView
import id.co.digitalindo.mvpkotlinv2.model.Hasilmodel

/**
 * Created by nandoseptianhusni on 3/11/18.
 */
interface MainView : BaseView{

    fun success(hasil : Hasilmodel)
    fun error()

}