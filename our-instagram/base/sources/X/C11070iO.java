package X;

import java.util.Iterator;

/* renamed from: X.0iO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11070iO {
    public AbstractC19330xH A00;
    public final AbstractC12990ll A01;
    public final Object A02;

    public C11070iO(AbstractC12990ll abstractC12990ll) {
        C07460aL c07460aL = new C07460aL();
        this.A01 = abstractC12990ll;
        this.A00 = c07460aL;
        this.A02 = new Object();
    }

    public final void A00(InterfaceC11230ie interfaceC11230ie) {
        C07460aL c07460aL;
        boolean z;
        InterfaceC19300xE A01 = C11120iT.A01(interfaceC11230ie, this.A01);
        synchronized (this.A02) {
            AbstractC19330xH abstractC19330xH = this.A00;
            if (abstractC19330xH instanceof C07460aL) {
                c07460aL = (C07460aL) abstractC19330xH;
                this.A00 = new C07440aJ(A01);
            } else if (abstractC19330xH instanceof C07440aJ) {
                c07460aL = null;
            } else {
                throw new B4Z();
            }
        }
        if (c07460aL != null) {
            synchronized (c07460aL.A01) {
                z = false;
                if (c07460aL.A00 != null) {
                    z = true;
                }
                c07460aL.A00 = A01;
            }
            if (!z) {
                Iterator it = c07460aL.A03.iterator();
                while (it.hasNext()) {
                    A01.EIu((C19280xC) it.next());
                }
                Iterator it2 = c07460aL.A02.iterator();
                while (it2.hasNext()) {
                    A01.EHW((C19280xC) it2.next());
                }
            }
            c07460aL.A03.clear();
            c07460aL.A02.clear();
        }
    }

    public C11070iO(InterfaceC11230ie interfaceC11230ie, AbstractC12990ll abstractC12990ll) {
        C07440aJ c07440aJ = new C07440aJ(C11120iT.A01(interfaceC11230ie, abstractC12990ll));
        this.A01 = abstractC12990ll;
        this.A00 = c07440aJ;
        this.A02 = new Object();
    }
}
