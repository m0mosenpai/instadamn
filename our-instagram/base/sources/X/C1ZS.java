package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.instagram.common.session.UserSession;

/* renamed from: X.1ZS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ZS {
    public static Boolean A00;
    public static final C1ZS A01 = new Object();

    public final PackageInfo A00(Context context, UserSession userSession) {
        C14360o3.A0B(context, 0);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Boolean bool = A00;
            if (bool == null) {
                bool = false;
                A00 = bool;
            }
            try {
                if (bool.booleanValue()) {
                    return packageManager.getPackageInfo("com.facebook.stella_debug", 0);
                }
                return packageManager.getPackageInfo("com.facebook.stella", 0);
            } catch (PackageManager.NameNotFoundException e) {
                C1ZU.A00(userSession, C05F.A00, e.toString());
                return null;
            }
        }
        return null;
    }
}
