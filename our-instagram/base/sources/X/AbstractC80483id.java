package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3id, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC80483id {
    public static final C19L A00(C75793ak c75793ak) {
        AtomicReference atomicReference;
        AnonymousClass197 anonymousClass197;
        AnonymousClass137 A06;
        C80493ie c80493ie;
        C19L c19l;
        do {
            atomicReference = c75793ak.A04;
            Object obj = atomicReference.get();
            if ((obj instanceof C19L) && (c19l = (C19L) obj) != null) {
                return c19l;
            }
            anonymousClass197 = new AnonymousClass197(null);
            C12T c12t = C12P.A00;
            A06 = AnonymousClass131.A00.A06();
            c80493ie = new C80493ie(c75793ak, anonymousClass197.plus(A06));
        } while (!C1EM.A00(null, c80493ie, atomicReference));
        AbstractC23641Du.A03(C05F.A00, A06, new C206629Ct(c80493ie, null, 4), c80493ie);
        anonymousClass197.CPD(new C9F3(23, c75793ak, c80493ie));
        return c80493ie;
    }
}
