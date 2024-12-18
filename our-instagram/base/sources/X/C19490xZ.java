package X;

import android.content.Context;

/* renamed from: X.0xZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19490xZ {
    public static C19490xZ A03;
    public Context A00;
    public final C09970fz A01;
    public final C0g3 A02;

    public static synchronized C19490xZ A00(Context context) {
        C19490xZ c19490xZ;
        synchronized (C19490xZ.class) {
            c19490xZ = A03;
            if (c19490xZ == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                c19490xZ = new C19490xZ(context);
                A03 = c19490xZ;
            }
        }
        return c19490xZ;
    }

    public C19490xZ(Context context) {
        C09970fz A00 = C09860fm.A00(context);
        this.A02 = C0g3.A00();
        this.A01 = A00;
        this.A00 = context;
    }
}
