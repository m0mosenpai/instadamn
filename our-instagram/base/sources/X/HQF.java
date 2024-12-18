package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class HQF extends C17T implements JM5 {
    @Override // X.JM5
    public final InterfaceC43557JLr Arj() {
        return (InterfaceC43557JLr) A05(1871919611, HQG.class);
    }

    @Override // X.JM5
    public final InterfaceC43572JMg C6p() {
        return (InterfaceC43572JMg) A05(150143260, HQH.class);
    }

    @Override // X.JM5
    public final JKK C8U() {
        return (JKK) A05(1135963089, HQI.class);
    }

    @Override // X.JM5
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40002Hoj.A00(this));
    }

    @Override // X.JM5
    public final Boolean BJJ() {
        return getOptionalBooleanValueByHashCode(138937490);
    }

    @Override // X.JM5
    public final String CB7() {
        return A0i(1006856931);
    }

    @Override // X.JM5
    public final C38726H3o EvG() {
        C38727H3p c38727H3p;
        H3q h3q;
        InterfaceC43557JLr Arj = Arj();
        C38728H3r c38728H3r = null;
        if (Arj != null) {
            c38727H3p = Arj.EvF();
        } else {
            c38727H3p = null;
        }
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(138937490);
        String A0X = A0X();
        InterfaceC43572JMg C6p = C6p();
        if (C6p != null) {
            h3q = C6p.EvH();
        } else {
            h3q = null;
        }
        JKK C8U = C8U();
        if (C8U != null) {
            c38728H3r = C8U.EvI();
        }
        return new C38726H3o(c38727H3p, h3q, c38728H3r, optionalBooleanValueByHashCode, A0X, A0i(1006856931));
    }

    @Override // X.JM5
    public final String getText() {
        return A0X();
    }
}
