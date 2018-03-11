package id.co.digitalindo.mvpkotlinv2.base

/**
 * Created by nandoseptianhusni on 3/11/18.
 */
interface BasePresenter<in T : BaseView> {

    fun onAttach(view : T)
    fun onDettach()
}