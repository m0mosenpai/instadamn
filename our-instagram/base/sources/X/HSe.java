package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import java.util.List;

/* loaded from: classes7.dex */
public final class HSe extends C17T implements YR7 {
    public SubscriptionStickerDictIntf A00;

    @Override // X.YR7
    public final SubscriptionStickerDictIntf C3Y() {
        return AbstractC37302Gc3.A0F(this.A00, this);
    }

    @Override // X.YR7
    public final StickerTraySurface C4I() {
        return AbstractC37303Gc4.A09(this, C43269JAo.A00);
    }

    @Override // X.YR7
    public final YR7 E9o(C1DY c1dy) {
        this.A00 = AbstractC37302Gc3.A0E(c1dy, AbstractC37302Gc3.A0F(this.A00, this));
        return this;
    }

    @Override // X.YR7
    public final H52 EzB(C1DY c1dy) {
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
        String A0j = A0j(574223090);
        List A0n = A0n(-1491303576);
        String A0j2 = A0j(641988061);
        Float A0F = A0F();
        Float A0D = A0D();
        Integer A0a2 = AbstractC37301Gc2.A0a(this);
        String A0i = A0i(-1477518707);
        return new H52(AbstractC37303Gc4.A09(this, C43269JAo.A00), AbstractC37304Gc5.A0B(c1dy, AbstractC37302Gc3.A0F(this.A00, this)), A0E, A0C, A0F, A0D, A0G(), A0J(), A0H(), A0I(), A0V, A0W, A0X, A0Y, A0a2, A0d, A0c, A0b, A0Z, A0e, A0a, A0j, A0j2, A0i, A0n);
    }

    @Override // X.YR7
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC72589XhT.A00(this));
    }

    @Override // X.YR7
    public final String AdC() {
        return A0d();
    }

    @Override // X.YR7
    public final String AdO() {
        return A0c();
    }

    @Override // X.YR7
    public final String AvN() {
        return A0b();
    }

    @Override // X.YR7
    public final String Ayd() {
        return A0Z();
    }

    @Override // X.YR7
    public final Float B29() {
        return A0E();
    }

    @Override // X.YR7
    public final Float BDR() {
        return A0C();
    }

    @Override // X.YR7
    public final String BSZ() {
        return A0j(574223090);
    }

    @Override // X.YR7
    public final List Bh4() {
        return A0n(-1491303576);
    }

    @Override // X.YR7
    public final String BoS() {
        return A0j(641988061);
    }

    @Override // X.YR7
    public final Float Bpa() {
        return A0F();
    }

    @Override // X.YR7
    public final Float Bzq() {
        return A0D();
    }

    @Override // X.YR7
    public final Integer C0i() {
        return AbstractC37301Gc2.A0a(this);
    }

    @Override // X.YR7
    public final Float CHf() {
        return A0G();
    }

    @Override // X.YR7
    public final Float CI1() {
        return A0J();
    }

    @Override // X.YR7
    public final Float CIa() {
        return A0H();
    }

    @Override // X.YR7
    public final Float CIh() {
        return A0I();
    }

    @Override // X.YR7
    public final Integer CUY() {
        return AbstractC37301Gc2.A0V(this);
    }

    @Override // X.YR7
    public final Integer CVk() {
        return AbstractC37301Gc2.A0W(this);
    }

    @Override // X.YR7
    public final Integer CaJ() {
        return AbstractC37301Gc2.A0X(this);
    }

    @Override // X.YR7
    public final Integer Cdh() {
        return AbstractC37301Gc2.A0Y(this);
    }

    @Override // X.YR7
    public final H52 EzC(C1DV c1dv) {
        return EzB(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.YR7
    public final String getId() {
        return A0e();
    }

    @Override // X.YR7
    public final String getMediaType() {
        return A0a();
    }

    @Override // X.YR7
    public final String getStorefrontAttributionUsername() {
        return A0i(-1477518707);
    }
}