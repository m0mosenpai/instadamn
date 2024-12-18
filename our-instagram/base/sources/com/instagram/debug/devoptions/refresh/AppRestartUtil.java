package com.instagram.debug.devoptions.refresh;

import X.AbstractC166997dE;
import X.AbstractC58322PtE;
import X.C14360o3;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes10.dex */
public final class AppRestartUtil {
    public static final AppRestartUtil INSTANCE = new Object();

    public static final void restartApp(Context context) {
        ComponentName component;
        Intent makeRestartActivityTask;
        C14360o3.A0B(context, 0);
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null && (component = launchIntentForPackage.getComponent()) != null && (makeRestartActivityTask = Intent.makeRestartActivityTask(component)) != null) {
            AbstractC58322PtE.A0Z().A0G(context, makeRestartActivityTask);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void restartAppHard(Context context) {
        ComponentName component;
        Intent makeRestartActivityTask;
        C14360o3.A0B(context, 0);
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null && (component = launchIntentForPackage.getComponent()) != null && (makeRestartActivityTask = Intent.makeRestartActivityTask(component)) != null) {
            AbstractC58322PtE.A0Z().A0G(context, makeRestartActivityTask);
            Runtime.getRuntime().exit(0);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
