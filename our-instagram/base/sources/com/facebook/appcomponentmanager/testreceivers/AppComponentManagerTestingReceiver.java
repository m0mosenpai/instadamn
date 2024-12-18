package com.facebook.appcomponentmanager.testreceivers;

import X.AbstractC25228BEl;
import X.AbstractC58318PtA;
import X.C0K8;
import X.C0f9;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;

/* loaded from: classes10.dex */
public class AppComponentManagerTestingReceiver extends BroadcastReceiver {
    public static void A00(PackageManager packageManager, ComponentInfo[] componentInfoArr) {
        for (ComponentInfo componentInfo : componentInfoArr) {
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(new ComponentName(((PackageItemInfo) componentInfo).packageName, ((PackageItemInfo) componentInfo).name));
            if (componentEnabledSetting != 0 && componentEnabledSetting != 1 && componentEnabledSetting != 2) {
                C0K8.A0P("AppComponentManagerTestingReceiver", "%s is marked as currently in state %d, which is not an expected state. Conservatively assuming it's disabled.", AbstractC25228BEl.A1Z(((PackageItemInfo) componentInfo).name, componentEnabledSetting));
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        int i;
        int A04 = AbstractC58318PtA.A04(this, context, intent, 1663029907);
        String action = intent.getAction();
        if (action == null) {
            C0K8.A0D("AppComponentManagerTestingReceiver", "Intent Action was null. Please supply an action.");
            i = -1666263287;
        } else {
            if (!action.equals("com.facebook.appcomponentmanager.ACTION_GET_CURRENT_ENABLE_STAGE")) {
                if (!action.equals("com.facebook.appcomponentmanager.ACTION_PRINT_COMPONENTS")) {
                    C0K8.A0P("AppComponentManagerTestingReceiver", "Intent Action %s is not a known action.", action);
                } else {
                    PackageManager packageManager = context.getPackageManager();
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 33423);
                        A00(packageManager, packageInfo.activities);
                        A00(packageManager, packageInfo.receivers);
                        A00(packageManager, packageInfo.services);
                        A00(packageManager, packageInfo.providers);
                    } catch (PackageManager.NameNotFoundException e) {
                        C0K8.A0G("AppComponentManagerTestingReceiver", "Ran into NameNotFoundException", e);
                    }
                }
            } else {
                PackageManager packageManager2 = context.getPackageManager();
                if (packageManager2 == null) {
                    C0K8.A0C("AppComponentManagerTestingReceiver", "PackageManager received from context was null. Aborting.");
                } else {
                    if (packageManager2.getComponentEnabledSetting(new ComponentName(context.getPackageName(), SecondEnableStageTestReceiver.class.getCanonicalName())) == 1) {
                        str = "Enable Stage: Warm Pre-TOS.";
                    } else {
                        str = "Enable Stage: Cold Pre-TOS.";
                    }
                    C0K8.A0D("AppComponentManagerTestingReceiver", str);
                }
            }
            i = 1835159994;
        }
        C0f9.A0E(i, A04, intent);
    }
}
