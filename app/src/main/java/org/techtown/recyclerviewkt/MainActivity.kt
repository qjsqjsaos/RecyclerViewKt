package org.techtown.recyclerviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import org.techtown.recyclerviewkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var mBinding : ActivityMainBinding? = null
    private val binding get() = mBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val profileList = arrayListOf(
            Profiles(R.drawable.ic_launcher_background, 26, "수열백", "안드개발자"),
            Profiles(R.drawable.ic_launcher_background, 245, "dsad", "안드개발자"),
            Profiles(R.drawable.ic_launcher_background, 25, "sadqwf", "안드개발자"),
            Profiles(R.drawable.ic_launcher_background, 254, "vadsv", "안드개발자"),
            Profiles(R.drawable.ic_launcher_background, 452, "vdsav", "안드개발자"),
            Profiles(R.drawable.ic_launcher_background, 25, "sdvaw", "안드개발자"),
        )
        binding.re.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        //레이아웃매니저를 이용해 어뎁터의 방향을 결정
        binding.re.setHasFixedSize(true)//어뎁터에 성능을 위한것
        binding.re.adapter = ProfileAdapter(profileList) //어뎁터에 리스트 자료를 넣는다.
    }
}