package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;

/* loaded from: classes7.dex */
public final class HU8 extends C17T implements InterfaceC106104qQ {
    public SubscriptionStickerDictIntf A00;

    @Override // X.InterfaceC106104qQ
    public final InterfaceC106084qO Bki() {
        return (InterfaceC106084qO) A05(61559079, HXW.class);
    }

    @Override // X.InterfaceC106104qQ
    public final SubscriptionStickerDictIntf C3Y() {
        return AbstractC37302Gc3.A0F(this.A00, this);
    }

    @Override // X.InterfaceC106104qQ
    public final StickerTraySurface C4I() {
        return AbstractC37303Gc4.A09(this, C43287JBg.A00);
    }

    @Override // X.InterfaceC106104qQ
    public final InterfaceC106104qQ EAg(C1DY c1dy) {
        this.A00 = AbstractC37302Gc3.A0E(c1dy, AbstractC37302Gc3.A0F(this.A00, this));
        return this;
    }

    @Override // X.InterfaceC106104qQ
    public final C106094qP F1e(C1DY c1dy) {
        String A0d = A0d();
        String A0c = A0c();
        String A0b = A0b();
        String A0Z = A0Z();
        Float A0E = A0E();
        Float A0C = A0C();
        String A0e = A0e();
        Integer A0V = AbstractC37301Gc2.A0V(this);
        Integer A0W = AbstractC37301Gc2.A0W(this);
        Integer A0X = AbstractC37301Gc2.A0X(this);
        Integer A0Y = AbstractC37301Gc2.A0Y(this);
        String A0a = A0a();
        InterfaceC106084qO Bki = Bki();
        C106074qN c106074qN = null;
        if (Bki != null) {
            c106074qN = Bki.F75();
        }
        Float A0F = A0F();
        Float A0D = A0D();
        Integer A0a2 = AbstractC37301Gc2.A0a(this);
        return new C106094qP(AbstractC37303Gc4.A09(this, C43287JBg.A00), AbstractC37301Gc2.A09(c1dy, AbstractC37302Gc3.A0F(this.A00, this)), c106074qN, A0E, A0C, A0F, A0D, A0G(), A0J(), A0H(), A0I(), A0V, A0W, A0X, A0Y, A0a2, A0d, A0c, A0b, A0Z, A0e, A0a);
    }

    @Override // X.InterfaceC106104qQ
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40318HuO.A00(this));
    }

    @Override // X.InterfaceC106104qQ
    public final String AdC() {
        return A0d();
    }

    @Override // X.InterfaceC106104qQ
    public final String AdO() {
        return A0c();
    }

    @Override // X.InterfaceC106104qQ
    public final String AvN() {
        return A0b();
    }

    @Override // X.InterfaceC106104qQ
    public final String Ayd() {
        return A0Z();
    }

    @Override // X.InterfaceC106104qQ
    public final Float B29() {
        return A0E();
    }

    @Override // X.InterfaceC106104qQ
    public final Float BDR() {
        return A0C();
    }

    @Override // X.InterfaceC106104qQ
    public final Float Bpa() {
        return A0F();
    }

    @Override // X.InterfaceC106104qQ
    public final Float Bzq() {
        return A0D();
    }

    @Override // X.InterfaceC106104qQ
    public final Integer C0i() {
        return AbstractC37301Gc2.A0a(this);
    }

    @Override // X.InterfaceC106104qQ
    public final Float CHf() {
        return A0G();
    }

    @Override // X.InterfaceC106104qQ
    public final Float CI1() {
        return A0J();
    }

    @Override // X.InterfaceC106104qQ
    public final Float CIa() {
        return A0H();
    }

    @Override // X.InterfaceC106104qQ
    public final Float CIh() {
        return A0I();
    }

    @Override // X.InterfaceC106104qQ
    public final Integer CUY() {
        return AbstractC37301Gc2.A0V(this);
    }

    @Override // X.InterfaceC106104qQ
    public final Integer CVk() {
        return AbstractC37301Gc2.A0W(this);
    }

    @Override // X.InterfaceC106104qQ
    public final Integer CaJ() {
        return AbstractC37301Gc2.A0X(this);
    }

    @Override // X.InterfaceC106104qQ
    public final Integer Cdh() {
        return AbstractC37301Gc2.A0Y(this);
    }

    @Override // X.InterfaceC106104qQ
    public final C106094qP F1f(C1DV c1dv) {
        return F1e(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.InterfaceC106104qQ
    public final String getId() {
        return A0e();
    }

    @Override // X.InterfaceC106104qQ
    public final String getMediaType() {
        return A0a();
    }
}
