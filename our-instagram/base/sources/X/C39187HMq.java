package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.HMq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39187HMq extends C17T implements JK7 {
    @Override // X.JK7
    public final InterfaceC43499JJl B3i() {
        return (InterfaceC43499JJl) A05(747380345, C39188HMr.class);
    }

    @Override // X.JK7
    public final InterfaceC106354qp BgF() {
        return (InterfaceC106354qp) A05(-1817464817, C39179HMh.class);
    }

    @Override // X.JK7
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, Hk9.A00(this));
    }

    @Override // X.JK7
    public final H2E Eqm() {
        H2F h2f;
        InterfaceC43499JJl B3i = B3i();
        C106344qo c106344qo = null;
        if (B3i != null) {
            h2f = B3i.Eql();
        } else {
            h2f = null;
        }
        InterfaceC106354qp BgF = BgF();
        if (BgF != null) {
            c106344qo = BgF.Eqd();
        }
        return new H2E(c106344qo, h2f);
    }
}
