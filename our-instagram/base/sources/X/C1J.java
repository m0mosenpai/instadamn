package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes5.dex */
public final class C1J extends C17T implements InterfaceC99474dM {
    @Override // X.InterfaceC99474dM
    public final InterfaceC99464dK BIU() {
        return (InterfaceC99464dK) A05(-1748733239, C1I.class);
    }

    @Override // X.InterfaceC99474dM
    public final InterfaceC99464dK CCc() {
        return (InterfaceC99464dK) A05(1306897872, C1I.class);
    }

    @Override // X.InterfaceC99474dM
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, CDZ.A00(this));
    }

    @Override // X.InterfaceC99474dM
    public final C4dL F2n() {
        C99454dJ c99454dJ;
        InterfaceC99464dK BIU = BIU();
        C99454dJ c99454dJ2 = null;
        if (BIU != null) {
            c99454dJ = BIU.F2m();
        } else {
            c99454dJ = null;
        }
        InterfaceC99464dK CCc = CCc();
        if (CCc != null) {
            c99454dJ2 = CCc.F2m();
        }
        return new C4dL(c99454dJ, c99454dJ2);
    }
}
