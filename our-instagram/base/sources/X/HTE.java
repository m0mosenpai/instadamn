package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;

/* loaded from: classes7.dex */
public final class HTE extends C17T implements InterfaceC102164im {
    public SubscriptionStickerDictIntf A00;

    @Override // X.InterfaceC102164im
    public final InterfaceC102144ik AeA() {
        return (InterfaceC102144ik) A05(234728843, HN6.class);
    }

    @Override // X.InterfaceC102164im
    public final SubscriptionStickerDictIntf C3Y() {
        return AbstractC37302Gc3.A0F(this.A00, this);
    }

    @Override // X.InterfaceC102164im
    public final StickerTraySurface C4I() {
        return AbstractC37303Gc4.A09(this, JB2.A00);
    }

    @Override // X.InterfaceC102164im
    public final InterfaceC102144ik CFz() {
        return (InterfaceC102144ik) A05(-1948148188, HN6.class);
    }

    @Override // X.InterfaceC102164im
    public final InterfaceC102164im E9z(C1DY c1dy) {
        this.A00 = AbstractC37302Gc3.A0E(c1dy, AbstractC37302Gc3.A0F(this.A00, this));
        return this;
    }

    @Override // X.InterfaceC102164im
    public final C102154il F00(C1DY c1dy) {
        C102134ij c102134ij;
        String A0d = A0d();
        String A0c = A0c();
        InterfaceC102144ik AeA = AeA();
        C102134ij c102134ij2 = null;
        if (AeA != null) {
            c102134ij = AeA.ErA();
        } else {
            c102134ij = null;
        }
        String A0i = A0i(-569369781);
        String A0b = A0b();
        String A0Z = A0Z();
        Float A0E = A0E();
        String A0i2 = A0i(1204402210);
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
        SubscriptionStickerDict A09 = AbstractC37301Gc2.A09(c1dy, AbstractC37302Gc3.A0F(this.A00, this));
        StickerTraySurface A092 = AbstractC37303Gc4.A09(this, JB2.A00);
        String A0V2 = AbstractC37303Gc4.A0V(this);
        InterfaceC102144ik CFz = CFz();
        if (CFz != null) {
            c102134ij2 = CFz.ErA();
        }
        return new C102154il(c102134ij, c102134ij2, A092, A09, A0E, A0C, A0F, A0D, A0G(), A0J(), A0H(), A0I(), A0V, A0W, A0X, A0Y, A0a2, A0d, A0c, A0i, A0b, A0Z, A0i2, A0e, A0a, A0V2);
    }

    @Override // X.InterfaceC102164im
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40269HtZ.A00(this));
    }

    @Override // X.InterfaceC102164im
    public final String AdC() {
        return A0d();
    }

    @Override // X.InterfaceC102164im
    public final String AdO() {
        return A0c();
    }

    @Override // X.InterfaceC102164im
    public final String Aei() {
        return A0i(-569369781);
    }

    @Override // X.InterfaceC102164im
    public final String AvN() {
        return A0b();
    }

    @Override // X.InterfaceC102164im
    public final String Ayd() {
        return A0Z();
    }

    @Override // X.InterfaceC102164im
    public final Float B29() {
        return A0E();
    }

    @Override // X.InterfaceC102164im
    public final String B3Q() {
        return A0i(1204402210);
    }

    @Override // X.InterfaceC102164im
    public final Float BDR() {
        return A0C();
    }

    @Override // X.InterfaceC102164im
    public final Float Bpa() {
        return A0F();
    }

    @Override // X.InterfaceC102164im
    public final Float Bzq() {
        return A0D();
    }

    @Override // X.InterfaceC102164im
    public final Integer C0i() {
        return AbstractC37301Gc2.A0a(this);
    }

    @Override // X.InterfaceC102164im
    public final Float CHf() {
        return A0G();
    }

    @Override // X.InterfaceC102164im
    public final Float CI1() {
        return A0J();
    }

    @Override // X.InterfaceC102164im
    public final Float CIa() {
        return A0H();
    }

    @Override // X.InterfaceC102164im
    public final Float CIh() {
        return A0I();
    }

    @Override // X.InterfaceC102164im
    public final Integer CUY() {
        return AbstractC37301Gc2.A0V(this);
    }

    @Override // X.InterfaceC102164im
    public final Integer CVk() {
        return AbstractC37301Gc2.A0W(this);
    }

    @Override // X.InterfaceC102164im
    public final Integer CaJ() {
        return AbstractC37301Gc2.A0X(this);
    }

    @Override // X.InterfaceC102164im
    public final Integer Cdh() {
        return AbstractC37301Gc2.A0Y(this);
    }

    @Override // X.InterfaceC102164im
    public final C102154il F01(C1DV c1dv) {
        return F00(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.InterfaceC102164im
    public final String getId() {
        return A0e();
    }

    @Override // X.InterfaceC102164im
    public final String getMediaType() {
        return A0a();
    }

    @Override // X.InterfaceC102164im
    public final String getUserId() {
        return AbstractC37303Gc4.A0V(this);
    }
}
