package X;

import com.facebook.systrace.Systrace;

/* renamed from: X.4aB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC97734aB {
    public static final void A00(String str, InterfaceC16820sZ interfaceC16820sZ) {
        if (Systrace.A0E(1L)) {
            C0fO.A01(str, 1567289038);
        }
        try {
            interfaceC16820sZ.invoke();
            if (Systrace.A0E(1L)) {
                C0fO.A00(-319286994);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1287511839);
            }
            throw th;
        }
    }
}
