package net.ralphpina.permissionsmanager.sample

import android.app.Application
import net.ralphpina.permissionsmanager.PermissionsComponent
import net.ralphpina.permissionsmanager.PermissionsManager

class PMApplication : Application() {

    lateinit var permissionsManager: PermissionsManager

    override fun onCreate() {
        super.onCreate()
        instance = this
        permissionsManager = PermissionsComponent.Initializer()
                .context(this)
                .prepare()
    }

    companion object {
        lateinit var instance: PMApplication
    }
}
