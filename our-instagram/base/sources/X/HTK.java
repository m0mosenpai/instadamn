package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;

/* loaded from: classes7.dex */
public final class HTK extends C17T implements InterfaceC73614YQc {
    public SubscriptionStickerDictIntf A00;
    public XGL A01;

    @Override // X.InterfaceC73614YQc
    public final XGL BKJ() {
        XGL xgl = this.A01;
        if (xgl == null) {
            return (XGL) A05(-254399413, V9D.class);
        }
        return xgl;
    }

    @Override // X.InterfaceC73614YQc
    public final SubscriptionStickerDictIntf C3Y() {
        return AbstractC37302Gc3.A0F(this.A00, this);
    }

    @Override // X.InterfaceC73614YQc
    public final StickerTraySurface C4I() {
        return AbstractC37303Gc4.A09(this, JB6.A00);
    }

    @Override // X.InterfaceC73614YQc
    public final H5T F0C(C1DY c1dy) {
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
        XGL BKJ = BKJ();
        C66645URj c66645URj = null;
        if (BKJ != null) {
            c66645URj = BKJ.F6m(c1dy);
        }
        String A0a = A0a();
        Float A0F = A0F();
        Float A0D = A0D();
        Integer A0a2 = AbstractC37301Gc2.A0a(this);
        return new H5T(AbstractC37303Gc4.A09(this, JB6.A00), AbstractC37301Gc2.A09(c1dy, AbstractC37302Gc3.A0F(this.A00, this)), c66645URj, A0E, A0C, A0F, A0D, A0G(), A0J(), A0H(), A0I(), A0V, A0W, A0X, A0Y, A0a2, A0d, A0c, A0b, A0Z, A0e, A0a);
    }

    @Override // X.InterfaceC73614YQc
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC72593XhZ.A00(this));
    }

    @Override // X.InterfaceC73614YQc
    public final String AdC() {
        return A0d();
    }

    @Override // X.InterfaceC73614YQc
    public final String AdO() {
        return A0c();
    }

    @Override // X.InterfaceC73614YQc
    public final String AvN() {
        return A0b();
    }

    @Override // X.InterfaceC73614YQc
    public final String Ayd() {
        return A0Z();
    }

    @Override // X.InterfaceC73614YQc
    public final Float B29() {
        return A0E();
    }

    @Override // X.InterfaceC73614YQc
    public final Float BDR() {
        return A0C();
    }

    @Override // X.InterfaceC73614YQc
    public final Float Bpa() {
        return A0F();
    }

    @Override // X.InterfaceC73614YQc
    public final Float Bzq() {
        return A0D();
    }

    @Override // X.InterfaceC73614YQc
    public final Integer C0i() {
        return AbstractC37301Gc2.A0a(this);
    }

    @Override // X.InterfaceC73614YQc
    public final Float CHf() {
        return A0G();
    }

    @Override // X.InterfaceC73614YQc
    public final Float CI1() {
        return A0J();
    }

    @Override // X.InterfaceC73614YQc
    public final Float CIa() {
        return A0H();
    }

    @Override // X.InterfaceC73614YQc
    public final Float CIh() {
        return A0I();
    }

    @Override // X.InterfaceC73614YQc
    public final Integer CUY() {
        return AbstractC37301Gc2.A0V(this);
    }

    @Override // X.InterfaceC73614YQc
    public final Integer CVk() {
        return AbstractC37301Gc2.A0W(this);
    }

    @Override // X.InterfaceC73614YQc
    public final Integer CaJ() {
        return AbstractC37301Gc2.A0X(this);
    }

    @Override // X.InterfaceC73614YQc
    public final Integer Cdh() {
        return AbstractC37301Gc2.A0Y(this);
    }

    @Override // X.InterfaceC73614YQc
    public final InterfaceC73614YQc EA3(C1DY c1dy) {
        XGL BKJ = BKJ();
        SubscriptionStickerDictIntf subscriptionStickerDictIntf = null;
        if (BKJ != null) {
            BKJ.EBz(c1dy);
        } else {
            BKJ = null;
        }
        this.A01 = BKJ;
        SubscriptionStickerDictIntf A0F = AbstractC37302Gc3.A0F(this.A00, this);
        if (A0F != null) {
            A0F.EAt(c1dy);
            subscriptionStickerDictIntf = A0F;
        }
        this.A00 = subscriptionStickerDictIntf;
        return this;
    }

    @Override // X.InterfaceC73614YQc
    public final H5T F0D(C1DV c1dv) {
        return F0C(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.InterfaceC73614YQc
    public final String getId() {
        return A0e();
    }

    @Override // X.InterfaceC73614YQc
    public final String getMediaType() {
        return A0a();
    }
}