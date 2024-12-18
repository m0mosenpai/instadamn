package X;

import android.content.Context;

/* renamed from: X.Feb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35134Feb {
    public static final C35134Feb A00 = new Object();

    public static final void A00(Context context, String str, String str2) {
        C14360o3.A0B(context, 0);
        if (A00.A01(context)) {
            if (str != null) {
                android.net.Uri A0B = AbstractC25227BEk.A0B(str);
                String str3 = "com.facebook.wakizashi";
                if (context.getPackageManager().getLaunchIntentForPackage("com.facebook.wakizashi") == null) {
                    str3 = "com.facebook.katana";
                }
                C12260kU.A0B(context, AbstractC31181DnP.A05(A0B, str3));
                return;
            }
            return;
        }
        if (str2 == null) {
            return;
        }
        try {
            C12260kU.A0G(context, AbstractC25227BEk.A0B(str2));
        } catch (NullPointerException | SecurityException unused) {
        }
    }

    public final boolean A01(Context context) {
        C14360o3.A0B(context, 0);
        if (context.getPackageManager().getLaunchIntentForPackage("com.facebook.wakizashi") == null && context.getPackageManager().getLaunchIntentForPackage("com.facebook.katana") == null) {
            return false;
        }
        return true;
    }
}
