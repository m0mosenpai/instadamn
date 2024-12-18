package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.facebook.common.build.BuildConstants;

/* renamed from: X.0la, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12880la {
    public static String A00;

    public static final long A01(Context context) {
        C14360o3.A0B(context, 0);
        C0I8 c0i8 = C0I9.A00;
        if (c0i8 == null) {
            c0i8 = C0I9.A00(new C0IE(context), context.getPackageName());
            C0I9.A00 = c0i8;
        }
        return c0i8.A00;
    }

    public static final String A02(Context context) {
        Bundle bundle;
        Object obj;
        C14360o3.A0B(context, 0);
        Context applicationContext = context.getApplicationContext();
        String str = null;
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo != null && (bundle = ((PackageItemInfo) applicationInfo).metaData) != null && (obj = bundle.get("com.facebook.versioncontrol.branch")) != null) {
                str = obj.toString();
            }
        } catch (PackageManager.NameNotFoundException e) {
            android.util.Log.e(C0IE.class.getName(), "Error reading <meta-data> from AndroidManifest.xml.", e);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof DeadObjectException) {
                android.util.Log.e(C0IE.class.getName(), "Error reading <meta-data> from AndroidManifest.xml.", e2);
            } else {
                throw e2;
            }
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static final String A03(Context context) {
        C14360o3.A0B(context, 0);
        C0I8 c0i8 = C0I9.A00;
        if (c0i8 == null) {
            c0i8 = C0I9.A00(new C0IE(context), context.getPackageName());
            C0I9.A00 = c0i8;
        }
        return c0i8.A01;
    }

    public static final String A04(Context context) {
        C14360o3.A0B(context, 0);
        String str = A00;
        if (str == null) {
            try {
                String str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                A00 = str2;
                C14360o3.A0A(str2);
                return str2;
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return str;
    }

    public static final boolean A05() {
        return false;
    }

    public static final int A00() {
        return BuildConstants.A01();
    }
}
