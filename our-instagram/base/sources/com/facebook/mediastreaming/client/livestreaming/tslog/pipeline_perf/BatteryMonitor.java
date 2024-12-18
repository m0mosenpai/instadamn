package com.facebook.mediastreaming.client.livestreaming.tslog.pipeline_perf;

import X.AbstractC50522MSa;
import X.C0DJ;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* loaded from: classes9.dex */
public final class BatteryMonitor {
    public final IntentFilter batteryChangeFilter;
    public final Intent batteryIntent;
    public final PowerManager powerManager;

    public final int getBatteryLevel() {
        Intent intent = this.batteryIntent;
        if (intent == null) {
            return 0;
        }
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra < 0 || intExtra2 <= 0) {
            return 0;
        }
        return (intExtra * 100) / intExtra2;
    }

    public final int getCurrentThermalStatus() {
        PowerManager powerManager;
        if (Build.VERSION.SDK_INT < 29 || (powerManager = this.powerManager) == null) {
            return -1;
        }
        return powerManager.getCurrentThermalStatus();
    }

    public final boolean getIsBatteryCharging() {
        Intent intent = this.batteryIntent;
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, -1);
        if (intExtra != 2 && intExtra != 5) {
            return false;
        }
        return true;
    }

    public BatteryMonitor(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        this.batteryChangeFilter = intentFilter;
        this.batteryIntent = C0DJ.A00(null, context, intentFilter);
        this.powerManager = AbstractC50522MSa.A0G(context);
    }
}
