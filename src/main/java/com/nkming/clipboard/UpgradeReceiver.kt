package com.nkming.clipboard

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.nkming.utils.Log

class UpgradeReceiver: BroadcastReceiver()
{
	companion object
	{
		private val LOG_TAG = UpgradeReceiver::class.java.canonicalName
	}

	override fun onReceive(context: Context, intent: Intent?)
	{
		if (intent?.action != Intent.ACTION_MY_PACKAGE_REPLACED)
		{
			return
		}
		Log.i("$LOG_TAG.onReceive", "Package upgraded")
		// We don't need to do anything here since the service will be started
		// by Application
	}
}
