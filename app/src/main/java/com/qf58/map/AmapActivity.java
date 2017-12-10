package com.qf58.map;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.MapView;
import com.amap.api.maps2d.model.BitmapDescriptorFactory;
import com.amap.api.maps2d.model.LatLng;
import com.amap.api.maps2d.model.Marker;
import com.amap.api.maps2d.model.MarkerOptions;


/**
 * Created by linSir
 * date at 2017/12/8.
 * describe:
 */

public class AmapActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basicmap_activity);

        MapView mapView = (MapView) findViewById(R.id.map);
        mapView.onCreate(savedInstanceState);// 此方法必须重写
        AMap aMap = mapView.getMap();


        Marker marker2 = aMap.addMarker(new MarkerOptions()
                .position(new LatLng(39.986919,115))

                .icon(BitmapDescriptorFactory.fromBitmap(BitmapFactory
                        .decodeResource(getResources(), R.mipmap.red_icon)))
                .draggable(true));

        Marker marker3 = aMap.addMarker(new MarkerOptions()
                .position(new LatLng(39.986919,116))

                .icon(BitmapDescriptorFactory.fromBitmap(BitmapFactory
                        .decodeResource(getResources(), R.mipmap.red_icon)))
                .draggable(true));

        Marker marker4 = aMap.addMarker(new MarkerOptions()
                .position(new LatLng(39.986919,117))

                .icon(BitmapDescriptorFactory.fromBitmap(BitmapFactory
                        .decodeResource(getResources(), R.mipmap.red_icon)))
                .draggable(true));

        Marker marker5 = aMap.addMarker(new MarkerOptions()
                .position(new LatLng(39.986919,118))

                .icon(BitmapDescriptorFactory.fromBitmap(BitmapFactory
                        .decodeResource(getResources(), R.mipmap.red_icon)))
                .draggable(true));

        //aMap.setTrafficEnabled(true);// 显示实时交通状况
        //地图模式可选类型：MAP_TYPE_NORMAL,MAP_TYPE_SATELLITE,MAP_TYPE_NIGHT
        //aMap.setMapType(AMap.MAP_TYPE_SATELLITE);// 卫星地图模式
    }

}