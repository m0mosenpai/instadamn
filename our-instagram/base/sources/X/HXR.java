package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HXR extends C17T implements InterfaceC189148Zf {
    public User A00;

    @Override // X.InterfaceC189148Zf
    public final C44I AqZ() {
        return (C44I) A04(1356895302, V98.class);
    }

    @Override // X.InterfaceC189148Zf
    public final User CDj() {
        return this.A00;
    }

    @Override // X.InterfaceC189148Zf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC22742A1m.A00(this));
    }

    @Override // X.InterfaceC189148Zf
    public final String getPk() {
        return A0k(3579);
    }

    @Override // X.InterfaceC189148Zf
    public final String AeK() {
        return A0i(1059836302);
    }

    @Override // X.InterfaceC189148Zf
    public final String Aj8() {
        return A0h(-2071290626);
    }

    @Override // X.InterfaceC189148Zf
    public final String B98() {
        return A0i(2098274224);
    }

    @Override // X.InterfaceC189148Zf
    public final String BFX() {
        return A0i(-2048280861);
    }

    @Override // X.InterfaceC189148Zf
    public final int BZy() {
        return getIntValueByHashCode(752358592);
    }

    @Override // X.InterfaceC189148Zf
    public final String Bys() {
        return A0h(-84827089);
    }

    @Override // X.InterfaceC189148Zf
    public final String C3f() {
        return A0h(-1663079300);
    }

    @Override // X.InterfaceC189148Zf
    public final String C8x() {
        return A0h(844796604);
    }

    @Override // X.InterfaceC189148Zf
    public final InterfaceC189148Zf EC3(C1DY c1dy) {
        this.A00 = AbstractC31179DnN.A0T(c1dy, this);
        return this;
    }

    @Override // X.InterfaceC189148Zf
    public final C189138Ze F6s(C1DY c1dy) {
        User user;
        User A0N;
        String A0i = A0i(1059836302);
        String A0h = A0h(-2071290626);
        C44H F55 = AqZ().F55();
        String A0h2 = A0h(-209971210);
        String A0i2 = A0i(2098274224);
        String A0i3 = A0i(-2048280861);
        int intValueByHashCode = getIntValueByHashCode(752358592);
        String A0k = A0k(3579);
        String A0h3 = A0h(-84827089);
        String A0h4 = A0h(-132220081);
        String A0h5 = A0h(-1663079300);
        String A0S = A0S();
        String A0h6 = A0h(844796604);
        ImmutablePandoUserDict A0R = AbstractC37301Gc2.A0R(this);
        if (A0R != null && (A0N = AbstractC37300Gc1.A0N(c1dy, A0R)) != null) {
            user = AbstractC37300Gc1.A0M(c1dy, A0N);
        } else {
            user = null;
        }
        return new C189138Ze(F55, user, A0i, A0h, A0h2, A0i2, A0i3, A0k, A0h3, A0h4, A0h5, A0S, A0h6, intValueByHashCode);
    }

    @Override // X.InterfaceC189148Zf
    public final C189138Ze F6t(C1DV c1dv) {
        return F6s(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.InterfaceC189148Zf
    public final String getEndBackgroundColor() {
        return A0h(-209971210);
    }

    @Override // X.InterfaceC189148Zf
    public final String getStartBackgroundColor() {
        return A0h(-132220081);
    }

    @Override // X.InterfaceC189148Zf
    public final String getTitle() {
        return A0S();
    }
}
