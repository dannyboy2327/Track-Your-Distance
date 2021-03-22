package com.anomalydev.trackyourdistance

import android.Manifest
import android.content.Context
import androidx.fragment.app.Fragment
import com.anomalydev.trackyourdistance.Constants.PERMISSION_LOCATION_REQUEST_CODE
import pub.devrel.easypermissions.EasyPermissions

object Permissions {

    fun hasLocationPermission(context: Context) =
        EasyPermissions.hasPermissions(
                context,
                Manifest.permission.ACCESS_FINE_LOCATION
        )


    fun requestLocationPermission(fragment: Fragment) {
        EasyPermissions.requestPermissions(
                fragment,
                "This application cannot work without Location Permission",
                PERMISSION_LOCATION_REQUEST_CODE,
                Manifest.permission.ACCESS_FINE_LOCATION
        )
    }
}