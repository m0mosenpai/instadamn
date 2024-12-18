package X;

import android.content.Context;

/* renamed from: X.60q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1334660q {
    public static final C1334760r A00 = new Object();
    public static volatile C1UM A01;

    public static final synchronized C1UM A00(Context context) {
        C1UM c1um;
        synchronized (C1334660q.class) {
            synchronized (A00) {
                C14360o3.A0B(context, 0);
                if (A01 != null) {
                    c1um = A01;
                    C14360o3.A0C(c1um, "null cannot be cast to non-null type com.facebook.crudolib.prefs.LightSharedPreferences");
                } else {
                    C1U5 c1u5 = new C1U5(context);
                    c1u5.A00 = 1;
                    c1u5.A03 = true;
                    A01 = c1u5.A00().A00("secureMessagePrefs");
                    c1um = A01;
                    C14360o3.A0C(c1um, "null cannot be cast to non-null type com.facebook.crudolib.prefs.LightSharedPreferences");
                }
            }
        }
        return c1um;
    }
}
