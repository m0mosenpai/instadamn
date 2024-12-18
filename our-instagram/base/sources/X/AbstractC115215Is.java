package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;

/* renamed from: X.5Is, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC115215Is {
    public static final C115225It A00 = new InterfaceC08100bW() { // from class: X.5It
        @Override // X.InterfaceC08100bW
        public final void EH9(String str) {
        }

        @Override // X.InterfaceC08100bW
        public final void EHA(String str, String str2, Throwable th) {
            C14360o3.A0B(str, 0);
            C14360o3.A0B(str2, 1);
            if (th == null) {
                C0w9.A04(str, str2, 1);
            } else {
                C0w9.A05(str, str2, 1, th);
            }
        }
    };

    public static final boolean A00(Context context, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        return A01(context, userSession, str, null, false);
    }

    public static final boolean A01(Context context, UserSession userSession, String str, String str2, boolean z) {
        Intent launchIntentForPackage;
        String str3;
        if (str == null) {
            return false;
        }
        Intent data = new Intent("android.intent.action.VIEW").setFlags(268435456).setData(AbstractC08820cl.A01(A00, str));
        C14360o3.A07(data);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        ResolveInfo resolveActivity = packageManager.resolveActivity(data, Constants.LOAD_RESULT_PGO_ATTEMPTED);
        if (resolveActivity != null) {
            if (str2 == null || str2.equals("") || !z) {
                return true;
            }
            ActivityInfo activityInfo = resolveActivity.activityInfo;
            if (activityInfo != null) {
                str3 = ((PackageItemInfo) activityInfo).packageName;
            } else {
                str3 = null;
            }
            return str2.equals(str3);
        }
        if (str2 == null || !C18U.A06(C06090Tz.A05, userSession, 36325995870959150L) || (launchIntentForPackage = packageManager.getLaunchIntentForPackage(str2)) == null || packageManager.resolveActivity(launchIntentForPackage, Constants.LOAD_RESULT_PGO_ATTEMPTED) == null) {
            return false;
        }
        return true;
    }
}
