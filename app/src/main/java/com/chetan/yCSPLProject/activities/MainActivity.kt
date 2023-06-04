package com.chetan.yCSPLProject.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.chetan.yCSPLProject.R
import com.chetan.yCSPLProject.databinding.ActivityMainBinding
import com.chetan.yCSPLProject.viewModels.LoginVModel
import com.chetan.yCSPLProject.viewModels.LoginVModelFactory

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: LoginVModel
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewModel = ViewModelProvider(this, LoginVModelFactory()).get(LoginVModel::class.java)
        binding.viewModel = viewModel

        binding.btnLogin.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("email", viewModel.loginModel.getEmail())
            val intent = Intent(this, MapActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
            finishAffinity()
        }

    }

}