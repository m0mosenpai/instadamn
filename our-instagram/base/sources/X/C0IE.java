package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.DeadObjectException;

/* renamed from: X.0IE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0IE {
    public final Context A00;

    public final String A00(String str, String str2) {
        Bundle bundle;
        Object obj;
        try {
            ApplicationInfo applicationInfo = this.A00.getPackageManager().getApplicationInfo(str2, 128);
            if (applicationInfo != null && (bundle = ((PackageItemInfo) applicationInfo).metaData) != null && (obj = bundle.get(str)) != null) {
                return obj.toString();
            }
        } catch (PackageManager.NameNotFoundException e) {
            android.util.Log.e(C0IE.class.getName(), "Error reading <meta-data> from AndroidManifest.xml.", e);
            return null;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof DeadObjectException) {
                android.util.Log.e(C0IE.class.getName(), "Error reading <meta-data> from AndroidManifest.xml.", e2);
            } else {
                throw e2;
            }
        }
        return null;
    }

    public C0IE(Context context) {
        this.A00 = context;
    }
}
