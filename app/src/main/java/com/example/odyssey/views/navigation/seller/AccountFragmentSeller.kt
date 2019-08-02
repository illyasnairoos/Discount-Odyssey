package com.example.odyssey.views.navigation.shopper

//import android.app.Fragment
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.odyssey.R
import com.example.odyssey.views.login.LogInActivity


class AccountFragmentSeller : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_account, container, false)
        val signin = view.findViewById<Button>(R.id.btn_sign_in)

        signin.setOnClickListener(View.OnClickListener {
            val intent = Intent(activity, LogInActivity::class.java)
            activity!!.startActivity(intent)
            /*swapFragment()
            openActivity()*/
        })

        return view
    }


/*    private fun swapFragment() {
        val newLoginfragment = LoginFragment()
        val fragmentTransaction = fragmentManager!!.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container_shopper, newLoginfragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

    fun openActivity() {
        val i = Intent(context, LogInActivity::class.java)
        context!!.startActivity(i)
    }*/


}

