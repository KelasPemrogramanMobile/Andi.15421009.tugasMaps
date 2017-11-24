package andi15421009.prj7;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.osmdroid.api.IMapController;
import org.osmdroid.api.IMapView;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR2)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        MapView map =(MapView) findViewById(R.id.map);
        map.setTileSource(TileSourceFactory.MAPNIK);
        map.setBuiltInZoomControls(true);
        map.setMultiTouchControls(true);
        GeoPoint starPoint = new GeoPoint(-5.397140,105,266789);
        IMapController mapController = map.getController();
        mapController.setZoom(20);
        mapController.setCenter(starPoint);

        Marker starMarker = new Marker(map);
        starMarker.setPosition(starPoint);
        starMarker.setAnchor(Marker.ANCHOR_BOTTOM,Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(starMarker);
        map.invalidate();
        starMarker.setIcon(getResources().getDrawable(R.drawable.gmbr3));
        starMarker.setTitle("universitas Bandar Lampung");

        GeoPoint startPoint2 = new GeoPoint(-5.375348,105.246246);
        IMapController mapController2 = map.getController();
        mapController2.setCenter(startPoint2);

        Marker startMarker2 = new Marker(map);
        startMarker2.setPosition(startPoint2);
        startMarker2.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker2);
        map.invalidate();
        startMarker2.setIcon(getResources().getDrawable(R.drawable.gmbr2));
        startMarker2.setTitle("Pascasarjana Universitas Bandar Lampung");


        GeoPoint startPoint3 = new GeoPoint(-5.372223,105.240894);
        IMapController mapController3 = map.getController();
        mapController3.setCenter(startPoint3);

        Marker startMarker3 = new Marker(map);
        startMarker3.setPosition(startPoint3);
        startMarker3.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker3);
        map.invalidate();
        startMarker3.setIcon(getResources().getDrawable(R.drawable.gmbr5));
        startMarker3.setTitle("Museum Lampung");


        GeoPoint startPoint4 = new GeoPoint(-5.381786,105.259613);
        IMapController mapController4 = map.getController();
        mapController4.setCenter(startPoint4);

        Marker startMarker4 = new Marker(map);
        startMarker4.setPosition(startPoint4);
        startMarker4.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker4);
        map.invalidate();
        startMarker4.setIcon(getResources().getDrawable(R.drawable.gmbr4));
        startMarker4.setTitle("Mall Boemi Kedaton");


        GeoPoint startPoint5 = new GeoPoint(-4.3201517,105.0641427);
        IMapController mapController5 = map.getController();
        mapController5.setCenter(startPoint5);

        Marker startMarker5 = new Marker(map);
        startMarker5.setPosition(startPoint5);
        startMarker5.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker5);
        map.invalidate();
        startMarker5.setIcon(getResources().getDrawable(R.drawable.gmbr1));
        startMarker5.setTitle("Hamur aug :)");

    }
}
