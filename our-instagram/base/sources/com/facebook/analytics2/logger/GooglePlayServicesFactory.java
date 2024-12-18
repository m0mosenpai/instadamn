package com.facebook.analytics2.logger;

import X.AbstractC40481uH;
import X.AbstractC58318PtA;
import X.C0K8;
import X.C58858QCt;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtil;

/* loaded from: classes10.dex */
public class GooglePlayServicesFactory {
    public static final String TAG = "GooglePlayServicesFactory";

    public static boolean canLoadUploaderService() {
        try {
            Class.forName("com.facebook.analytics2.logger.GooglePlayUploadService");
            return true;
        } catch (ClassNotFoundException e) {
            C0K8.A0N(TAG, "Can't class load GooglePlayUploadService %s, className: %s", e, "com.facebook.analytics2.logger.GooglePlayUploadService");
            return false;
        }
    }

    public static boolean canUseGooglePlayServices(Context context) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && (bundle = ((PackageItemInfo) applicationInfo).metaData) != null) {
                return bundle.containsKey("com.google.android.gms.version");
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            throw AbstractC58318PtA.A0f(e);
        }
    }

    public static AbstractC40481uH createUploadSchedulerImpl(Context context) {
        if (canLoadUploaderService() && canUseGooglePlayServices(context)) {
            if (AbstractC58318PtA.A05(context, GoogleApiAvailability.A00) != 0) {
                boolean z = GooglePlayServicesUtil.A00;
            } else {
                synchronized (GooglePlayUploadService.class) {
                    if (!GooglePlayUploadService.A01) {
                        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) GooglePlayUploadService.class), 1, 1);
                        GooglePlayUploadService.A01 = true;
                    }
                }
                return new C58858QCt(context);
            }
        }
        return null;
    }
}
