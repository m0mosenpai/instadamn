package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.UrpIndexAction;

/* loaded from: classes7.dex */
public final class HVO extends C17T implements InterfaceC105004oG {
    public InterfaceC104924o5 A00;

    @Override // X.InterfaceC105004oG
    public final UrpIndexAction AYP() {
        return (UrpIndexAction) A0N(-1422950858, JC6.A00);
    }

    @Override // X.InterfaceC105004oG
    public final InterfaceC104924o5 Adb() {
        InterfaceC104924o5 interfaceC104924o5 = this.A00;
        if (interfaceC104924o5 == null) {
            return (InterfaceC104924o5) A05(93166550, HT4.class);
        }
        return interfaceC104924o5;
    }

    @Override // X.InterfaceC105004oG
    public final InterfaceC43564JLy BQX() {
        return (InterfaceC43564JLy) A05(488513999, HVP.class);
    }

    @Override // X.InterfaceC105004oG
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40429HwK.A00(this));
    }

    @Override // X.InterfaceC105004oG
    public final String Anz() {
        return A0i(-173873537);
    }

    @Override // X.InterfaceC105004oG
    public final Integer BHQ() {
        return getOptionalIntValueByHashCode(100346066);
    }

    @Override // X.InterfaceC105004oG
    public final InterfaceC105004oG EB9(C1DY c1dy) {
        InterfaceC104924o5 Adb = Adb();
        if (Adb != null) {
            Adb.E9v(c1dy);
        } else {
            Adb = null;
        }
        this.A00 = Adb;
        return this;
    }

    @Override // X.InterfaceC105004oG
    public final C114625Fm F3U(C1DY c1dy) {
        C114615Fj c114615Fj;
        UrpIndexAction AYP = AYP();
        InterfaceC104924o5 Adb = Adb();
        C38807H6x c38807H6x = null;
        if (Adb != null) {
            c114615Fj = Adb.Ezn(c1dy);
        } else {
            c114615Fj = null;
        }
        String A0i = A0i(-173873537);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(100346066);
        InterfaceC43564JLy BQX = BQX();
        if (BQX != null) {
            c38807H6x = BQX.F3W();
        }
        return new C114625Fm(c114615Fj, AYP, c38807H6x, optionalIntValueByHashCode, A0i);
    }

    @Override // X.InterfaceC105004oG
    public final C114625Fm F3V(C1DV c1dv) {
        return F3U(AbstractC25235BEs.A0b(c1dv));
    }
}
