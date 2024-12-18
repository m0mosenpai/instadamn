package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2k5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC57302k5 {
    public static final C57312k6 A00(C07T c07t) {
        C57312k6 c57312k6;
        C14360o3.A0B(c07t, 0);
        while (true) {
            AtomicReference atomicReference = c07t.A00;
            c57312k6 = (C57312k6) atomicReference.get();
            if (c57312k6 != null) {
                break;
            }
            AnonymousClass197 anonymousClass197 = new AnonymousClass197(null);
            C12T c12t = C12P.A00;
            AnonymousClass137 A06 = AnonymousClass131.A00.A06();
            c57312k6 = new C57312k6(c07t, anonymousClass197.plus(A06));
            if (C1EM.A00(null, c57312k6, atomicReference)) {
                AbstractC23641Du.A03(C05F.A00, A06, new C9D0(c57312k6, null, 0), c57312k6);
                break;
            }
        }
        return c57312k6;
    }
}
