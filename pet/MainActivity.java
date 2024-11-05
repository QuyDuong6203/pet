// MainActivity.java
package duan1.pet;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Chuyển đến màn hình đăng nhập khi ứng dụng khởi động
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();

    }

}
