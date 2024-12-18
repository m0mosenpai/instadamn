package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.Sgo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63289Sgo {
    public static final C63289Sgo A00 = new Object();

    public static final SharedPreferences A00(Context context, Integer num) {
        C14360o3.A0B(context, 0);
        SharedPreferences sharedPreferences = context.getSharedPreferences(AbstractC167017dG.A0n(num, "app_widget_id_", AbstractC166987dD.A1C()), 0);
        C14360o3.A07(sharedPreferences);
        return sharedPreferences;
    }

    public final String A02(Context context, Integer num) {
        C14360o3.A0B(context, 0);
        return A00(context, num).getString(AbstractC167017dG.A0n(num, "com.instagram.direct.appwidget.USER_ID", AbstractC166987dD.A1C()), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Jk, java.lang.Object] */
    public static final void A01(C0JG c0jg, String str) {
        if (str != null) {
            C023409i.A0A.A0A(new Object(), null, c0jg, str);
        }
    }
}
