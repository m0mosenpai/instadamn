package X;

/* renamed from: X.Krf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47084Krf {
    public static final void A00(C47Z c47z, InterfaceC70363Du interfaceC70363Du) {
        AbstractC167017dG.A1N(c47z, interfaceC70363Du);
        if (!c47z.A5K) {
            interfaceC70363Du.EHd(c47z, "legit_cancellation_for_no_internet_creation");
            C915547l c915547l = c47z.A1T;
            int A00 = c915547l.A00();
            synchronized (c915547l) {
                c915547l.A0C.add(Integer.valueOf(A00));
            }
        }
    }
}
