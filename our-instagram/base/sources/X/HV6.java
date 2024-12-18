package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TextAppTextFragmentType;

/* loaded from: classes7.dex */
public final class HV6 extends C17T implements JMW {
    public InterfaceC43542JLc A00;

    @Override // X.JMW
    public final InterfaceC43495JJh B5W() {
        return (InterfaceC43495JJh) A05(1209835371, HV1.class);
    }

    @Override // X.JMW
    public final TextAppTextFragmentType B8V() {
        return (TextAppTextFragmentType) A0N(-858826807, JC0.A00);
    }

    @Override // X.JMW
    public final InterfaceC43517JKd BNO() {
        return (InterfaceC43517JKd) A05(2132983029, HV2.class);
    }

    @Override // X.JMW
    public final InterfaceC43542JLc BSM() {
        InterfaceC43542JLc interfaceC43542JLc = this.A00;
        if (interfaceC43542JLc == null) {
            return (InterfaceC43542JLc) A05(-252379899, HV3.class);
        }
        return interfaceC43542JLc;
    }

    @Override // X.JMW
    public final InterfaceC43496JJi C4y() {
        return (InterfaceC43496JJi) A05(-742702763, HV5.class);
    }

    @Override // X.JMW
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40395Hvi.A00(this));
    }

    @Override // X.JMW
    public final String Bdh() {
        return A0i(1973234167);
    }

    @Override // X.JMW
    public final JMW EB3(C1DY c1dy) {
        InterfaceC43542JLc BSM = BSM();
        if (BSM != null) {
            BSM.EB2(c1dy);
        } else {
            BSM = null;
        }
        this.A00 = BSM;
        return this;
    }

    @Override // X.JMW
    public final C38791H6g F30(C1DY c1dy) {
        C38787H6c c38787H6c;
        C38788H6d c38788H6d;
        C38789H6e c38789H6e;
        InterfaceC43495JJh B5W = B5W();
        C38790H6f c38790H6f = null;
        if (B5W != null) {
            c38787H6c = B5W.F2t();
        } else {
            c38787H6c = null;
        }
        TextAppTextFragmentType B8V = B8V();
        InterfaceC43517JKd BNO = BNO();
        if (BNO != null) {
            c38788H6d = BNO.F2u();
        } else {
            c38788H6d = null;
        }
        InterfaceC43542JLc BSM = BSM();
        if (BSM != null) {
            c38789H6e = BSM.F2v(c1dy);
        } else {
            c38789H6e = null;
        }
        String A0i = A0i(1973234167);
        InterfaceC43496JJi C4y = C4y();
        if (C4y != null) {
            c38790H6f = C4y.F2z();
        }
        return new C38791H6g(c38787H6c, c38788H6d, c38789H6e, c38790H6f, B8V, A0i);
    }

    @Override // X.JMW
    public final C38791H6g F31(C1DV c1dv) {
        return F30(AbstractC37304Gc5.A09(c1dv));
    }
}
