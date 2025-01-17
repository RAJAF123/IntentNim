package com.intan.intentnim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.intan.intentnim.MoveWithDataActivity
import com.intan.intentnim.MoveActivity
import com.intan.intentnim.R

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnMoveActivity: Button
    private lateinit var btnMoveWithData: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMoveActivity = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        btnMoveWithData =  findViewById(R.id.btn_move_with_data)
        btnMoveWithData.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v !=null) {
            when(v.id) {
                R.id.btn_move_activity -> run {
                    val intent = Intent(this, MoveActivity::class.java)
                    startActivity(intent)
                }
                R.id.btn_move_with_data -> run {
                    val intent = Intent(this, MoveWithDataActivity::class.java)
                    val bundle = Bundle()
                    bundle.putString("Nama", "Nur Intan Maghfiroh")
                    bundle.putString("Alamat", "Kepanjen Malang")
                    intent.putExtras(bundle)
                    startActivity(intent)
                }
            }
        }

    }
}