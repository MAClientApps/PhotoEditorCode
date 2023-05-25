package com.msstore.ultraimageeditor
import android.app.Application



/**
 * Created by Burhanuddin Rashid on 1/23/2018.
 */
class PhotoApp : Application() {
    override fun onCreate() {
        super.onCreate()
    }

    companion object {
        var photoApp: PhotoApp? = null
            private set
        private val TAG = PhotoApp::class.java.simpleName
    }
}