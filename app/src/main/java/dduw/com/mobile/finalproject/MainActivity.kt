package dduw.com.mobile.finalproject

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // BottomNavigationView 초기화
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnItemSelectedListener(this) // 리스너 설정

        //actionBar title 변경
        getSupportActionBar()?.setTitle("아트로그")
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_home -> { // 홈 메뉴
                val intent = Intent(this@MainActivity, )
                startActivity(intent)
                return false
            }
            R.id.menu_search -> { // 검색 메뉴
                val intent = Intent(this@MainActivity, )
                startActivity(intent)
                return false
            }
            R.id.menu_storage -> { // 보관함 메뉴
                val intent = Intent(this@MainActivity, )
                startActivity(intent)
                return false
            }
            R.id.menu_review -> { // 리뷰 메뉴
                val intent = Intent(this@MainActivity, )
                startActivity(intent)
                return false
            }
        }
        return false
    }
}