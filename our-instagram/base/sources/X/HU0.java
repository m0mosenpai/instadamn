package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;

/* loaded from: classes7.dex */
public final class HU0 extends C17T implements YR8 {
    public SubscriptionStickerDictIntf A00;

    @Override // X.YR8
    public final SubscriptionStickerDictIntf C3Y() {
        return AbstractC37302Gc3.A0F(this.A00, this);
    }

    @Override // X.YR8
    public final StickerTraySurface C4I() {
        return AbstractC37303Gc4.A09(this, C43284JBd.A00);
    }

    @Override // X.YR8
    public final YR8 EAa(C1DY c1dy) {
        this.A00 = AbstractC37302Gc3.A0E(c1dy, AbstractC37302Gc3.A0F(this.A00, this));
        return this;
    }

    @Override // X.YR8
    public final C38779H5t F1P(C1DY c1dy) {
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
        String A0j = A0j(-871029981);
        Float A0F = A0F();
        Float A0D = A0D();
        Integer A0a2 = AbstractC37301Gc2.A0a(this);
        String A0j2 = A0j(-1560288530);
        SubscriptionStickerDict A0B = AbstractC37304Gc5.A0B(c1dy, AbstractC37302Gc3.A0F(this.A00, this));
        return new C38779H5t(AbstractC37303Gc4.A09(this, C43284JBd.A00), A0B, A0E, A0C, A0F, A0D, A0G(), A0J(), A0H(), A0I(), A0V, A0W, A0X, A0Y, A0a2, A0d, A0c, A0b, A0Z, A0e, A0a, A0j, A0j2, A0j(-277885525), A0j(1930701774));
    }

    @Override // X.YR8
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC72613Xht.A00(this));
    }

    @Override // X.YR8
    public final String AdC() {
        return A0d();
    }

    @Override // X.YR8
    public final String AdO() {
        return A0c();
    }

    @Override // X.YR8
    public final String AvN() {
        return A0b();
    }

    @Override // X.YR8
    public final String Ayd() {
        return A0Z();
    }

    @Override // X.YR8
    public final Float B29() {
        return A0E();
    }

    @Override // X.YR8
    public final Float BDR() {
        return A0C();
    }

    @Override // X.YR8
    public final String Bip() {
        return A0j(-871029981);
    }

    @Override // X.YR8
    public final Float Bpa() {
        return A0F();
    }

    @Override // X.YR8
    public final Float Bzq() {
        return A0D();
    }

    @Override // X.YR8
    public final Integer C0i() {
        return AbstractC37301Gc2.A0a(this);
    }

    @Override // X.YR8
    public final String C3J() {
        return A0j(-1560288530);
    }

    @Override // X.YR8
    public final String C7J() {
        return A0j(-277885525);
    }

    @Override // X.YR8
    public final String C7K() {
        return A0j(1930701774);
    }

    @Override // X.YR8
    public final Float CHf() {
        return A0G();
    }

    @Override // X.YR8
    public final Float CI1() {
        return A0J();
    }

    @Override // X.YR8
    public final Float CIa() {
        return A0H();
    }

    @Override // X.YR8
    public final Float CIh() {
        return A0I();
    }

    @Override // X.YR8
    public final Integer CUY() {
        return AbstractC37301Gc2.A0V(this);
    }

    @Override // X.YR8
    public final Integer CVk() {
        return AbstractC37301Gc2.A0W(this);
    }

    @Override // X.YR8
    public final Integer CaJ() {
        return AbstractC37301Gc2.A0X(this);
    }

    @Override // X.YR8
    public final Integer Cdh() {
        return AbstractC37301Gc2.A0Y(this);
    }

    @Override // X.YR8
    public final C38779H5t F1Q(C1DV c1dv) {
        return F1P(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.YR8
    public final String getId() {
        return A0e();
    }

    @Override // X.YR8
    public final String getMediaType() {
        return A0a();
    }
}
