package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: X.Mar, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50737Mar extends BroadcastReceiver {
    public final String A00;
    public final C13920nI A01 = C13920nI.A00;

    public C50737Mar(String str) {
        this.A00 = str;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = C0f9.A01(1786194874);
        C0fM.A01(this, context, intent);
        AbstractC167017dG.A1N(context, intent);
        String action = intent.getAction();
        if (action != null && action.length() != 0) {
            if (action.equals("android.intent.action.ACTION_SHUTDOWN")) {
                String str = this.A00;
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                C14360o3.A07(defaultSharedPreferences);
                InterfaceC19610xo ARD = new C17320tT(defaultSharedPreferences, "IgRtcDeviceStateBroadcastReceiver").ARD();
                ARD.E7G("rtc_device_shutdown_time", System.currentTimeMillis());
                ARD.E7K("rtc_device_shutdown_local_call_id", str);
                ARD.apply();
            }
            i = 1196126792;
        } else {
            i = 917025907;
        }
        C0f9.A0E(i, A01, intent);
    }
}
