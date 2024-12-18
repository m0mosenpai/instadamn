package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes11.dex */
public final class V8T extends C17T implements InterfaceC109864xE {
    @Override // X.InterfaceC109864xE
    public final InterfaceC109884xG BEg() {
        return (InterfaceC109884xG) A05(3226745, C68054V8g.class);
    }

    @Override // X.InterfaceC109864xE
    public final InterfaceC31126Dm9 Brd() {
        return (InterfaceC31126Dm9) A05(1736619388, V91.class);
    }

    @Override // X.InterfaceC109864xE
    public final InterfaceC31126Dm9 C6A() {
        return (InterfaceC31126Dm9) A05(-2115337775, V91.class);
    }

    @Override // X.InterfaceC109864xE
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(CDA.A00(this), this);
    }

    @Override // X.InterfaceC109864xE
    public final Integer AYQ() {
        return getOptionalIntValueByHashCode(-1422950858);
    }

    @Override // X.InterfaceC109864xE
    public final Integer AjC() {
        return getOptionalIntValueByHashCode(-1759391705);
    }

    @Override // X.InterfaceC109864xE
    public final Boolean BBL() {
        return getOptionalBooleanValueByHashCode(1615957398);
    }

    @Override // X.InterfaceC109864xE
    public final String BDO() {
        return A0i(1520104632);
    }

    @Override // X.InterfaceC109864xE
    public final Boolean CeI() {
        return getOptionalBooleanValueByHashCode(523834417);
    }

    @Override // X.InterfaceC109864xE
    public final C109854xD ErT() {
        C109874xF c109874xF;
        URQ urq;
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1422950858);
        String A0i = A0i(1852205030);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(-1759391705);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1615957398);
        String A0i2 = A0i(1520104632);
        InterfaceC109884xG BEg = BEg();
        URQ urq2 = null;
        if (BEg != null) {
            c109874xF = BEg.Evd();
        } else {
            c109874xF = null;
        }
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(523834417);
        String A0i3 = A0i(-1170385640);
        InterfaceC31126Dm9 Brd = Brd();
        if (Brd != null) {
            urq = Brd.F35();
        } else {
            urq = null;
        }
        String A0X = A0X();
        InterfaceC31126Dm9 C6A = C6A();
        if (C6A != null) {
            urq2 = C6A.F35();
        }
        return new C109854xD(c109874xF, urq, urq2, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalIntValueByHashCode, optionalIntValueByHashCode2, A0i, A0i2, A0i3, A0X);
    }

    @Override // X.InterfaceC109864xE
    public final String getActionUrl() {
        return A0i(1852205030);
    }

    @Override // X.InterfaceC109864xE
    public final String getSecondaryText() {
        return A0i(-1170385640);
    }

    @Override // X.InterfaceC109864xE
    public final String getText() {
        return A0X();
    }
}
