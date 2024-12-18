package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes11.dex */
public final class V95 extends C17T implements XG7 {
    @Override // X.XG7
    public final XG4 Aet() {
        return (XG4) A05(-1332194002, C68057V8j.class);
    }

    @Override // X.XG7
    public final XG9 ApX() {
        return (XG9) A05(950398559, C68058V8k.class);
    }

    @Override // X.XG7
    public final XGA Bb2() {
        return (XGA) A05(883692091, C68062V8q.class);
    }

    @Override // X.XG7
    public final InterfaceC72036XFy C7x() {
        return (InterfaceC72036XFy) A05(1330532588, V8r.class);
    }

    @Override // X.XG7
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(VPP.A00(this), this);
    }

    @Override // X.XG7
    public final URV F45() {
        UR4 ur4;
        UR5 ur5;
        URB urb;
        XG4 Aet = Aet();
        URC urc = null;
        if (Aet != null) {
            ur4 = Aet.Ex6();
        } else {
            ur4 = null;
        }
        XG9 ApX = ApX();
        if (ApX != null) {
            ur5 = ApX.Ex7();
        } else {
            ur5 = null;
        }
        XGA Bb2 = Bb2();
        if (Bb2 != null) {
            urb = Bb2.ExD();
        } else {
            urb = null;
        }
        InterfaceC72036XFy C7x = C7x();
        if (C7x != null) {
            urc = C7x.ExE();
        }
        return new URV(ur4, ur5, urb, urc);
    }
}
