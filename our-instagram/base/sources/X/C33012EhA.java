package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.EhA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33012EhA extends C17T implements InterfaceC81833l1 {
    @Override // X.InterfaceC81833l1
    public final InterfaceC110324y3 BNb() {
        return (InterfaceC110324y3) A05(1071958028, C33021EhP.class);
    }

    @Override // X.InterfaceC81833l1
    public final C43H BNc() {
        return (C43H) A05(1072124232, C33022EhQ.class);
    }

    @Override // X.InterfaceC81833l1
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC31519Dt3.A00(this));
    }

    @Override // X.InterfaceC81833l1
    public final C81823l0 EtK() {
        C110314y2 c110314y2;
        InterfaceC110324y3 BNb = BNb();
        C43G c43g = null;
        if (BNb != null) {
            c110314y2 = BNb.Evw();
        } else {
            c110314y2 = null;
        }
        C43H BNc = BNc();
        if (BNc != null) {
            c43g = BNc.Evx();
        }
        return new C81823l0(c110314y2, c43g);
    }
}
