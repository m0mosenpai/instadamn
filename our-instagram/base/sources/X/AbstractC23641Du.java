package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.1Du, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC23641Du {
    public static final C50112Sa A02(C12W c12w, InterfaceC16620sF interfaceC16620sF, C19L c19l) {
        return A01(C05F.A00, c12w, interfaceC16620sF, c19l);
    }

    public static final C23671Dx A04(C12W c12w, InterfaceC16620sF interfaceC16620sF, C19L c19l) {
        return A03(C05F.A00, c12w, interfaceC16620sF, c19l);
    }

    public static final void A05(C12W c12w, InterfaceC16620sF interfaceC16620sF, C19L c19l) {
        A03(C05F.A00, c12w, interfaceC16620sF, c19l);
    }

    public static final Object A00(InterfaceC23621Ds interfaceC23621Ds, C12W c12w, InterfaceC16620sF interfaceC16620sF) {
        C12W A00;
        C12W context = interfaceC23621Ds.getContext();
        if (!((Boolean) c12w.fold(false, C23661Dw.A00)).booleanValue()) {
            A00 = context.plus(c12w);
        } else {
            A00 = AbstractC23651Dv.A00(context, c12w, false);
        }
        C2QZ.A01(A00);
        if (A00 == context) {
            C1UX c1ux = new C1UX(interfaceC23621Ds, A00);
            return C1UZ.A00(c1ux, interfaceC16620sF, c1ux);
        }
        C212512c c212512c = C12X.A00;
        if (C14360o3.A0K(A00.get(c212512c), context.get(c212512c))) {
            C3HO c3ho = new C3HO(interfaceC23621Ds, A00);
            C12W c12w2 = ((AbstractC23681Dy) c3ho).A00;
            Object A002 = C1E8.A00(null, c12w2);
            try {
                return C1UZ.A00(c3ho, interfaceC16620sF, c3ho);
            } finally {
                C1E8.A01(A002, c12w2);
            }
        }
        C1UX c1ux2 = new C1UX(interfaceC23621Ds, A00);
        C1E1.A00(c1ux2, c1ux2, interfaceC16620sF);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C50172Sg.A00;
        do {
            int i = atomicIntegerFieldUpdater.get(c1ux2);
            if (i != 0) {
                if (i == 2) {
                    Object A003 = AnonymousClass199.A00(c1ux2.A0C());
                    if (!(A003 instanceof C1JW)) {
                        return A003;
                    }
                    throw ((C1JW) A003).A00;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(c1ux2, 0, 1));
        return C1JX.A02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.2Sa, java.lang.Object, X.1Dy] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public static final C50112Sa A01(Integer num, C12W c12w, final InterfaceC16620sF interfaceC16620sF, C19L c19l) {
        ?? r1;
        final C12W A01 = AbstractC23651Dv.A01(c12w, c19l);
        if (num == C05F.A01) {
            r1 = new C50112Sa(A01, interfaceC16620sF) { // from class: X.4hR
                public final InterfaceC23621Ds A00;

                {
                    this.A00 = C1E2.A01(this, this, interfaceC16620sF);
                }

                @Override // X.AnonymousClass198
                public final void A0I() {
                    C1E1.A01(this.A00, this);
                }
            };
        } else {
            r1 = new AbstractC23681Dy(A01, true, true);
        }
        r1.A0W(num, r1, interfaceC16620sF);
        return r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.1Dx, java.lang.Object, X.1Dy] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public static final C23671Dx A03(Integer num, C12W c12w, InterfaceC16620sF interfaceC16620sF, C19L c19l) {
        ?? r1;
        C12W A01 = AbstractC23651Dv.A01(c12w, c19l);
        if (num == C05F.A01) {
            r1 = new C44214JgI(A01, interfaceC16620sF);
        } else {
            r1 = new AbstractC23681Dy(A01, true, true);
        }
        r1.A0W(num, r1, interfaceC16620sF);
        return r1;
    }
}
