package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.FeedItemType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HWO extends C17T implements InterfaceC38671qy {
    public List A00;

    @Override // X.InterfaceC38671qy
    public final long BF4() {
        return A03(3355);
    }

    @Override // X.InterfaceC38671qy
    public final FeedItemType BWc() {
        return (FeedItemType) A0M(-1852539703, JD2.A00);
    }

    @Override // X.InterfaceC38671qy
    public final List C3x() {
        List list = this.A00;
        if (list == null) {
            return A0o(-1525319953, HUm.class);
        }
        return list;
    }

    @Override // X.InterfaceC38671qy
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40706I2m.A00(this));
    }

    @Override // X.InterfaceC38671qy
    public final String AYe() {
        return A0h(1583739286);
    }

    @Override // X.InterfaceC38671qy
    public final boolean B05() {
        return getBooleanValueByHashCode(-103247416);
    }

    @Override // X.InterfaceC38671qy
    public final boolean BAE() {
        return getBooleanValueByHashCode(591789623);
    }

    @Override // X.InterfaceC38671qy
    public final boolean BL8() {
        return getBooleanValueByHashCode(-598077295);
    }

    @Override // X.InterfaceC38671qy
    public final boolean BOA() {
        return getBooleanValueByHashCode(-2096559507);
    }

    @Override // X.InterfaceC38671qy
    public final boolean BVQ() {
        return getBooleanValueByHashCode(519330262);
    }

    @Override // X.InterfaceC38671qy
    public final boolean BXA() {
        return getBooleanValueByHashCode(-1960299899);
    }

    @Override // X.InterfaceC38671qy
    public final String BkC() {
        return A0h(648884134);
    }

    @Override // X.InterfaceC38671qy
    public final boolean Bx9() {
        return getBooleanValueByHashCode(1074687995);
    }

    @Override // X.InterfaceC38671qy
    public final boolean Bxq() {
        return getBooleanValueByHashCode(1175160178);
    }

    @Override // X.InterfaceC38671qy
    public final String CAR() {
        return A0h(-1938614671);
    }

    @Override // X.InterfaceC38671qy
    public final boolean Cf1() {
        return getBooleanValueByHashCode(-1947593954);
    }

    @Override // X.InterfaceC38671qy
    public final InterfaceC38671qy EBe(C1DY c1dy) {
        List<C47H> C3x = C3x();
        ArrayList A0q = AbstractC167017dG.A0q(C3x);
        for (C47H c47h : C3x) {
            c47h.EAu(c1dy);
            A0q.add(c47h);
        }
        this.A00 = A0q;
        return this;
    }

    @Override // X.InterfaceC38671qy
    public final C38661qx F5U(C1DY c1dy) {
        String A0h = A0h(1583739286);
        int intValueByHashCode = getIntValueByHashCode(-1992012396);
        boolean booleanValueByHashCode = getBooleanValueByHashCode(-103247416);
        boolean booleanValueByHashCode2 = getBooleanValueByHashCode(591789623);
        long A03 = A03(3355);
        boolean booleanValueByHashCode3 = getBooleanValueByHashCode(-1947593954);
        boolean booleanValueByHashCode4 = getBooleanValueByHashCode(-598077295);
        boolean booleanValueByHashCode5 = getBooleanValueByHashCode(-2096559507);
        boolean booleanValueByHashCode6 = getBooleanValueByHashCode(519330262);
        FeedItemType BWc = BWc();
        boolean booleanValueByHashCode7 = getBooleanValueByHashCode(-1960299899);
        String A0h2 = A0h(648884134);
        boolean booleanValueByHashCode8 = getBooleanValueByHashCode(1074687995);
        boolean booleanValueByHashCode9 = getBooleanValueByHashCode(1175160178);
        List C3x = C3x();
        ArrayList A0q = AbstractC167017dG.A0q(C3x);
        Iterator it = C3x.iterator();
        while (it.hasNext()) {
            A0q.add(((C47H) it.next()).F2Y(c1dy));
        }
        return new C38661qx(BWc, A0h, A0h2, A0S(), A0h(-1938614671), A0q, intValueByHashCode, A03, booleanValueByHashCode, booleanValueByHashCode2, booleanValueByHashCode3, booleanValueByHashCode4, booleanValueByHashCode5, booleanValueByHashCode6, booleanValueByHashCode7, booleanValueByHashCode8, booleanValueByHashCode9);
    }

    @Override // X.InterfaceC38671qy
    public final int getDuration() {
        return getIntValueByHashCode(-1992012396);
    }

    @Override // X.InterfaceC38671qy
    public final String getTitle() {
        return A0S();
    }
}
