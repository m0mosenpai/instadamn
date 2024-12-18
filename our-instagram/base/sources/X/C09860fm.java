package X;

import android.content.Context;

/* renamed from: X.0fm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09860fm {
    public static C09970fz A00;

    public static synchronized C09970fz A00(Context context) {
        C09970fz c09970fz;
        synchronized (C09860fm.class) {
            c09970fz = A00;
            if (c09970fz == null) {
                c09970fz = new C09970fz(context);
                A00 = c09970fz;
            }
        }
        return c09970fz;
    }
}
