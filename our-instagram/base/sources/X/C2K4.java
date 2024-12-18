package X;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: X.2K4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2K4 extends AbstractC48222Jl {
    public static final android.net.Uri A00 = AbstractC08820cl.A03("content://com.android.badge/badge");

    @Override // X.AbstractC48222Jl
    public final boolean A01(Context context, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("app_badge_packageName", context.getPackageName());
        bundle.putInt("app_badge_count", i);
        try {
            if (context.getContentResolver().call(A00, "setAppBadgeCount", (String) null, bundle) == null) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C0w9.A06(getClass().getName(), "unexpected exception", e);
            return false;
        }
    }

    @Override // X.AbstractC48222Jl
    public final boolean A02(Context context, String str) {
        String str2 = Build.BRAND;
        if ((str2.equalsIgnoreCase("oppo") || str2.equalsIgnoreCase("realme")) && str.equals("com.android.launcher")) {
            try {
                if (!TextUtils.isEmpty((String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, "ro.build.version.oplusrom"))) {
                    return true;
                }
            } catch (Exception e) {
                C0w9.A06("oppo badging", "Exception while getting Oppo build version", e);
            }
        }
        return str.equals("com.oppo.launcher");
    }
}
