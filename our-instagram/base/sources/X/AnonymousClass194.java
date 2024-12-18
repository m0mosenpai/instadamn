package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.194, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass194 {
    public static final C19K A01() {
        AnonymousClass197 anonymousClass197 = new AnonymousClass197(null);
        C12T c12t = C12P.A00;
        return new C19K(anonymousClass197.plus(AnonymousClass131.A00));
    }

    public static final void A04(String str, C19L c19l) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(null);
        A05(cancellationException, c19l);
    }

    public static final Object A00(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AnonymousClass198.A00;
        C1UX c1ux = new C1UX(interfaceC23621Ds, interfaceC23621Ds.getContext());
        return C1UZ.A00(c1ux, interfaceC16620sF, c1ux);
    }

    public static final C19K A02(C12W c12w) {
        if (c12w.get(AnonymousClass195.A00) == null) {
            c12w = c12w.plus(new AnonymousClass197(null));
        }
        return new C19K(c12w);
    }

    public static final C19K A03(C12W c12w, C19L c19l) {
        return new C19K(c19l.Arv().plus(c12w));
    }

    public static final void A05(CancellationException cancellationException, C19L c19l) {
        AnonymousClass195 anonymousClass195 = (AnonymousClass195) c19l.Arv().get(AnonymousClass195.A00);
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(cancellationException);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Scope cannot be cancelled because it does not have a job: ");
        sb.append(c19l);
        throw new IllegalStateException(sb.toString());
    }

    public static final void A06(C19L c19l) {
        C2QZ.A01(c19l.Arv());
    }

    public static final boolean A07(C19L c19l) {
        AnonymousClass195 anonymousClass195 = (AnonymousClass195) c19l.Arv().get(AnonymousClass195.A00);
        if (anonymousClass195 != null) {
            return anonymousClass195.isActive();
        }
        return true;
    }
}
