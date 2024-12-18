package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0p2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14880p2 implements InterfaceC19390xP {
    public final /* synthetic */ InterfaceC16610sE A00;

    public C14880p2(InterfaceC16610sE interfaceC16610sE) {
        this.A00 = interfaceC16610sE;
    }

    @Override // X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        C06070Tx c06070Tx = new C06070Tx(null, this.A00, interfaceC19960yQ);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AnonymousClass198.A00;
        C1UX c1ux = new C1UX(interfaceC23621Ds, interfaceC23621Ds.getContext());
        Object A00 = C1UZ.A00(c1ux, c06070Tx, c1ux);
        if (A00 != C1JX.A02) {
            return C0eB.A00;
        }
        return A00;
    }
}
