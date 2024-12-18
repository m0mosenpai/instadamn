package X;

import java.lang.reflect.Field;

/* renamed from: X.0iV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11140iV extends AbstractC05460Qv {
    public static Class A00;
    public static boolean A01;
    public static final C03720In A03 = new C03720In("AppThreadBinderCode");
    public static final C11140iV A02 = new AbstractC05460Qv("Binder", "TRANSACTION_scheduleTransaction", "android.app.servertransaction.ClientTransaction", -19842, true);

    @Override // X.AbstractC05460Qv
    public final Field A03(C0H5 c0h5, Class cls, String str) {
        Field A0M;
        Field A0M2 = c0h5.A0M(null, cls, str);
        if (A0M2 == null) {
            A0M2 = null;
            if (!str.startsWith("TRANSACTION_") && !str.endsWith("_TRANSACTION") && (A0M = c0h5.A0M(null, cls, AnonymousClass001.A0R("TRANSACTION_", str))) != null) {
                return A0M;
            }
        }
        return A0M2;
    }

    @Override // X.AbstractC05460Qv
    public final Class A01(C0Cz c0Cz, C0H5 c0h5) {
        boolean z = A01;
        Class cls = A00;
        if (!z && cls == null) {
            cls = c0h5.A0I("android.app.IApplicationThread$Stub");
            Class A0I = c0h5.A0I("android.app.IApplicationThread");
            if (cls == null) {
                cls = A0I;
                if (A0I == null) {
                    A03.A08("Could not find binder key class to use.", new Object[0]);
                    cls = null;
                }
            }
            A00 = cls;
            A01 = true;
        }
        return cls;
    }
}
