package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.HUw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39286HUw extends C17T implements InterfaceC43516JKc {
    @Override // X.InterfaceC43516JKc
    public final InterfaceC43567JMb BjW() {
        return (InterfaceC43567JMb) A05(-1030574761, C39288HUy.class);
    }

    @Override // X.InterfaceC43516JKc
    public final InterfaceC38621qt BxU() {
        return (InterfaceC38621qt) A05(1737448803, HXN.class);
    }

    @Override // X.InterfaceC43516JKc
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40372HvJ.A00(this));
    }

    @Override // X.InterfaceC43516JKc
    public final H6U F2j() {
        H6W h6w;
        InterfaceC43567JMb BjW = BjW();
        C38611qr c38611qr = null;
        if (BjW != null) {
            h6w = BjW.F2l();
        } else {
            h6w = null;
        }
        InterfaceC38621qt BxU = BxU();
        if (BxU != null) {
            c38611qr = BxU.F6l();
        }
        return new H6U(h6w, c38611qr);
    }
}
