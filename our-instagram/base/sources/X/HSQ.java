package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;

/* loaded from: classes7.dex */
public final class HSQ extends C17T implements YQX {
    public SubscriptionStickerDictIntf A00;

    @Override // X.YQX
    public final JJX Bj5() {
        return (JJX) A05(1844478170, HSP.class);
    }

    @Override // X.YQX
    public final SubscriptionStickerDictIntf C3Y() {
        return AbstractC37302Gc3.A0F(this.A00, this);
    }

    @Override // X.YQX
    public final StickerTraySurface C4I() {
        return AbstractC37303Gc4.A09(this, C43262JAh.A00);
    }

    @Override // X.YQX
    public final YQX E9j(C1DY c1dy) {
        this.A00 = AbstractC37302Gc3.A0E(c1dy, AbstractC37302Gc3.A0F(this.A00, this));
        return this;
    }

    @Override // X.YQX
    public final C38751H4r Eyo(C1DY c1dy) {
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
        JJX Bj5 = Bj5();
        C38750H4q c38750H4q = null;
        if (Bj5 != null) {
            c38750H4q = Bj5.Eyn();
        }
        Float A0F = A0F();
        Float A0D = A0D();
        Integer A0a2 = AbstractC37301Gc2.A0a(this);
        return new C38751H4r(c38750H4q, AbstractC37303Gc4.A09(this, C43262JAh.A00), AbstractC37301Gc2.A09(c1dy, AbstractC37302Gc3.A0F(this.A00, this)), A0E, A0C, A0F, A0D, A0G(), A0J(), A0H(), A0I(), A0V, A0W, A0X, A0Y, A0a2, A0d, A0c, A0b, A0Z, A0e, A0a);
    }

    @Override // X.YQX
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC72588XhS.A00(this));
    }

    @Override // X.YQX
    public final String AdC() {
        return A0d();
    }

    @Override // X.YQX
    public final String AdO() {
        return A0c();
    }

    @Override // X.YQX
    public final String AvN() {
        return A0b();
    }

    @Override // X.YQX
    public final String Ayd() {
        return A0Z();
    }

    @Override // X.YQX
    public final Float B29() {
        return A0E();
    }

    @Override // X.YQX
    public final Float BDR() {
        return A0C();
    }

    @Override // X.YQX
    public final Float Bpa() {
        return A0F();
    }

    @Override // X.YQX
    public final Float Bzq() {
        return A0D();
    }

    @Override // X.YQX
    public final Integer C0i() {
        return AbstractC37301Gc2.A0a(this);
    }

    @Override // X.YQX
    public final Float CHf() {
        return A0G();
    }

    @Override // X.YQX
    public final Float CI1() {
        return A0J();
    }

    @Override // X.YQX
    public final Float CIa() {
        return A0H();
    }

    @Override // X.YQX
    public final Float CIh() {
        return A0I();
    }

    @Override // X.YQX
    public final Integer CUY() {
        return AbstractC37301Gc2.A0V(this);
    }

    @Override // X.YQX
    public final Integer CVk() {
        return AbstractC37301Gc2.A0W(this);
    }

    @Override // X.YQX
    public final Integer CaJ() {
        return AbstractC37301Gc2.A0X(this);
    }

    @Override // X.YQX
    public final Integer Cdh() {
        return AbstractC37301Gc2.A0Y(this);
    }

    @Override // X.YQX
    public final C38751H4r Eyp(C1DV c1dv) {
        return Eyo(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.YQX
    public final String getId() {
        return A0e();
    }

    @Override // X.YQX
    public final String getMediaType() {
        return A0a();
    }
}