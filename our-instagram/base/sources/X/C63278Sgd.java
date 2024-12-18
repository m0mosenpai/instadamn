package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;

/* renamed from: X.Sgd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63278Sgd {
    public static final C63278Sgd A06 = new Object();
    public int A00;
    public EnumC61066Ref A01;
    public C62915SWw A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    public static int A00(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.ar.core", 4);
            int i = packageInfo.versionCode;
            if (i == 0) {
                ServiceInfo[] serviceInfoArr = packageInfo.services;
                if (serviceInfoArr != null) {
                    if (serviceInfoArr.length != 0) {
                        return 0;
                    }
                }
                return -1;
            }
            return i;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public static final synchronized void A01(Context context, C63278Sgd c63278Sgd) {
        synchronized (c63278Sgd) {
            if (!c63278Sgd.A05) {
                try {
                    Bundle bundle = ((PackageItemInfo) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128)).metaData;
                    if (bundle.containsKey("com.google.ar.core")) {
                        c63278Sgd.A04 = AbstractC31173DnH.A0j(bundle, "com.google.ar.core").equals("required");
                        if (bundle.containsKey("com.google.ar.core.min_apk_version")) {
                            c63278Sgd.A00 = bundle.getInt("com.google.ar.core.min_apk_version");
                            c63278Sgd.A05 = true;
                        } else {
                            throw new RuntimeException("Application manifest must contain meta-data com.google.ar.core.min_apk_version");
                        }
                    }
                } catch (PackageManager.NameNotFoundException e) {
                }
            }
        }
    }
}
