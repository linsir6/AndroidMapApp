package com.qf58.map;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationListener;

public class MainActivity extends AppCompatActivity {

    AMapLocationListener mLocationListener = new AMapLocationListener() {
        @Override
        public void onLocationChanged(AMapLocation aMapLocation) {
            Log.e("lin", "---lin--->  error code  " + aMapLocation.getErrorInfo());
            Log.e("lin", "---lin--->  error code  " + aMapLocation.getLocationDetail());
            Log.e("lin", "---lin--->  error code  " + aMapLocation.toString());

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //声明AMapLocationClient类对象
        AMapLocationClient mLocationClient = null;
        //声明定位回调监听器
        //初始化定位
        mLocationClient = new AMapLocationClient(getApplicationContext());
        //设置定位回调监听
        mLocationClient.setLocationListener(mLocationListener);
        //启动定位
        mLocationClient.startLocation();
        //异步获取定位结果
        AMapLocationListener mAMapLocationListener = new AMapLocationListener() {
            @Override
            public void onLocationChanged(AMapLocation amapLocation) {
                Log.e("lin", "---lin--->  error code  " + amapLocation.getErrorInfo());

                if (amapLocation != null) {

                    Log.e("lin", "---lin--->  error code  " + amapLocation.getErrorInfo());

                    if (amapLocation.getErrorCode() == 0) {
                        //解析定位结果


                    }
                }
            }
        };
    }

}
