package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;

/* loaded from: classes7.dex */
public final class HTN extends C17T implements InterfaceC73616YQe {
    public SubscriptionStickerDictIntf A00;

    @Override // X.InterfaceC73616YQe
    public final InterfaceC43525JKl B0o() {
        return (InterfaceC43525JKl) A05(-1950737641, HW9.class);
    }

    @Override // X.InterfaceC73616YQe
    public final SubscriptionStickerDictIntf C3Y() {
        return AbstractC37302Gc3.A0F(this.A00, this);
    }

    @Override // X.InterfaceC73616YQe
    public final StickerTraySurface C4I() {
        return AbstractC37303Gc4.A09(this, JB8.A00);
    }

    @Override // X.InterfaceC73616YQe
    public final InterfaceC73616YQe EA6(C1DY c1dy) {
        this.A00 = AbstractC37302Gc3.A0E(c1dy, AbstractC37302Gc3.A0F(this.A00, this));
        return this;
    }

    @Override // X.InterfaceC73616YQe
    public final H5W F0J(C1DY c1dy) {
        String A0d = A0d();
        String A0c = A0c();
        String A0b = A0b();
        String A0Z = A0Z();
        InterfaceC43525JKl B0o = B0o();
        H7X h7x = null;
        if (B0o != null) {
            h7x = B0o.F54();
        }
        Float A0E = A0E();
        Float A0C = A0C();
        String A0e = A0e();
        Integer A0V = AbstractC37301Gc2.A0V(this);
        Integer A0W = AbstractC37301Gc2.A0W(this);
        Integer A0X = AbstractC37301Gc2.A0X(this);
        Integer A0Y = AbstractC37301Gc2.A0Y(this);
        String A0a = A0a();
        Float A0F = A0F();
        Float A0D = A0D();
        Integer A0a2 = AbstractC37301Gc2.A0a(this);
        return new H5W(AbstractC37303Gc4.A09(this, JB8.A00), AbstractC37301Gc2.A09(c1dy, AbstractC37302Gc3.A0F(this.A00, this)), h7x, A0E, A0C, A0F, A0D, A0G(), A0J(), A0H(), A0I(), A0V, A0W, A0X, A0Y, A0a2, A0d, A0c, A0b, A0Z, A0e, A0a);
    }

    @Override // X.InterfaceC73616YQe
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC72595Xhb.A00(this));
    }

    @Override // X.InterfaceC73616YQe
    public final String AdC() {
        return A0d();
    }

    @Override // X.InterfaceC73616YQe
    public final String AdO() {
        return A0c();
    }

    @Override // X.InterfaceC73616YQe
    public final String AvN() {
        return A0b();
    }

    @Override // X.InterfaceC73616YQe
    public final String Ayd() {
        return A0Z();
    }

    @Override // X.InterfaceC73616YQe
    public final Float B29() {
        return A0E();
    }

    @Override // X.InterfaceC73616YQe
    public final Float BDR() {
        return A0C();
    }

    @Override // X.InterfaceC73616YQe
    public final Float Bpa() {
        return A0F();
    }

    @Override // X.InterfaceC73616YQe
    public final Float Bzq() {
        return A0D();
    }

    @Override // X.InterfaceC73616YQe
    public final Integer C0i() {
        return AbstractC37301Gc2.A0a(this);
    }

    @Override // X.InterfaceC73616YQe
    public final Float CHf() {
        return A0G();
    }

    @Override // X.InterfaceC73616YQe
    public final Float CI1() {
        return A0J();
    }

    @Override // X.InterfaceC73616YQe
    public final Float CIa() {
        return A0H();
    }

    @Override // X.InterfaceC73616YQe
    public final Float CIh() {
        return A0I();
    }

    @Override // X.InterfaceC73616YQe
    public final Integer CUY() {
        return AbstractC37301Gc2.A0V(this);
    }

    @Override // X.InterfaceC73616YQe
    public final Integer CVk() {
        return AbstractC37301Gc2.A0W(this);
    }

    @Override // X.InterfaceC73616YQe
    public final Integer CaJ() {
        return AbstractC37301Gc2.A0X(this);
    }

    @Override // X.InterfaceC73616YQe
    public final Integer Cdh() {
        return AbstractC37301Gc2.A0Y(this);
    }

    @Override // X.InterfaceC73616YQe
    public final H5W F0K(C1DV c1dv) {
        return F0J(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.InterfaceC73616YQe
    public final String getId() {
        return A0e();
    }

    @Override // X.InterfaceC73616YQe
    public final String getMediaType() {
        return A0a();
    }
}
