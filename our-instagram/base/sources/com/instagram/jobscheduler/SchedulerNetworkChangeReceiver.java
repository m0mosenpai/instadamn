package com.instagram.jobscheduler;

import X.AbstractC15820qc;
import X.AbstractC31171DnF;
import X.AbstractC58318PtA;
import X.C0f9;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public class SchedulerNetworkChangeReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A04 = AbstractC58318PtA.A04(this, context, intent, 2051876086);
        if (!(AbstractC31171DnF.A0F(this) instanceof UserSession)) {
            ComponentName componentName = new ComponentName(context, (Class<?>) SchedulerNetworkChangeReceiver.class);
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            packageManager.setComponentEnabledSetting(componentName, 2, 1);
            i = 799911547;
        } else {
            if (AbstractC15820qc.A0G(context)) {
                ComponentName componentName2 = new ComponentName(context, (Class<?>) SchedulerNetworkChangeReceiver.class);
                PackageManager packageManager2 = context.getPackageManager();
                packageManager2.getClass();
                packageManager2.setComponentEnabledSetting(componentName2, 2, 1);
            }
            i = 15233489;
        }
        C0f9.A0E(i, A04, intent);
    }
}
