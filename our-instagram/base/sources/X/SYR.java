package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* loaded from: classes10.dex */
public final class SYR {
    public static final String A02 = AnonymousClass001.A0R("com.facebook.services", ".identity.FEO2");
    public final Context A00;
    public final PackageManager A01;

    public final int A00() {
        Bundle bundle;
        if (!(this.A00.checkSelfPermission(A02) == 0)) {
            return -1;
        }
        try {
            ApplicationInfo applicationInfo = this.A01.getPackageInfo("com.facebook.services", 128).applicationInfo;
            if (applicationInfo != null && applicationInfo.enabled && (bundle = ((PackageItemInfo) applicationInfo).metaData) != null) {
                return bundle.getInt("com.facebook.services.identity.feo2.api.level", -1);
            }
            return -1;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public SYR(Context context, PackageManager packageManager) {
        this.A00 = context;
        this.A01 = packageManager;
    }
}
