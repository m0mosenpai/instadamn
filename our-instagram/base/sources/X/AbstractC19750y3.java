package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.0y3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC19750y3 {
    public static final C17320tT A00(Context context, String str) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(str, 1);
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        C14360o3.A07(sharedPreferences);
        return new C17320tT(sharedPreferences, AnonymousClass001.A0R("DevicePreferenceUtil:", str));
    }

    public static final C17320tT A01(String str) {
        C14360o3.A0B(str, 0);
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        return A00(context, str);
    }
}
