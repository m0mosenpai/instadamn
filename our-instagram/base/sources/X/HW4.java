package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.model.venue.ImmutablePandoLocationDict;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.LocationDictIntf;

/* loaded from: classes7.dex */
public final class HW4 extends C17T implements InterfaceC1123955r {
    public SubscriptionStickerDictIntf A00;
    public InterfaceC1124155t A01;

    @Override // X.InterfaceC1123955r
    public final InterfaceC1124155t BAp() {
        InterfaceC1124155t interfaceC1124155t = this.A01;
        if (interfaceC1124155t == null) {
            return (InterfaceC1124155t) A05(-1774465693, HW1.class);
        }
        return interfaceC1124155t;
    }

    @Override // X.InterfaceC1123955r
    public final LocationDictIntf BOL() {
        return (LocationDictIntf) A05(1901043637, ImmutablePandoLocationDict.class);
    }

    @Override // X.InterfaceC1123955r
    public final SubscriptionStickerDictIntf C3Y() {
        return AbstractC37302Gc3.A0F(this.A00, this);
    }

    @Override // X.InterfaceC1123955r
    public final StickerTraySurface C4I() {
        return AbstractC37303Gc4.A09(this, C43309JCc.A00);
    }

    @Override // X.InterfaceC1123955r
    public final C1123855q F4w(C1DY c1dy) {
        C1124055s c1124055s;
        String A0d = A0d();
        String A0c = A0c();
        String A0b = A0b();
        String A0Z = A0Z();
        Float A0E = A0E();
        InterfaceC1124155t BAp = BAp();
        LocationDict locationDict = null;
        if (BAp != null) {
            c1124055s = BAp.F4j(c1dy);
        } else {
            c1124055s = null;
        }
        Float A0C = A0C();
        String A0e = A0e();
        Integer A0V = AbstractC37301Gc2.A0V(this);
        Integer A0W = AbstractC37301Gc2.A0W(this);
        Integer A0X = AbstractC37301Gc2.A0X(this);
        Integer A0Y = AbstractC37301Gc2.A0Y(this);
        LocationDictIntf BOL = BOL();
        if (BOL != null) {
            locationDict = BOL.F6g();
        }
        String A0a = A0a();
        return new C1123855q(AbstractC37303Gc4.A09(this, C43309JCc.A00), AbstractC37301Gc2.A09(c1dy, AbstractC37302Gc3.A0F(this.A00, this)), c1124055s, locationDict, A0E, A0C, A0F(), A0D(), A0G(), A0J(), A0H(), A0I(), A0V, A0W, A0X, A0Y, AbstractC37301Gc2.A0a(this), A0d, A0c, A0b, A0Z, A0e, A0a);
    }

    @Override // X.InterfaceC1123955r
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I0N.A00(this));
    }

    @Override // X.InterfaceC1123955r
    public final String AdC() {
        return A0d();
    }

    @Override // X.InterfaceC1123955r
    public final String AdO() {
        return A0c();
    }

    @Override // X.InterfaceC1123955r
    public final String AvN() {
        return A0b();
    }

    @Override // X.InterfaceC1123955r
    public final String Ayd() {
        return A0Z();
    }

    @Override // X.InterfaceC1123955r
    public final Float B29() {
        return A0E();
    }

    @Override // X.InterfaceC1123955r
    public final Float BDR() {
        return A0C();
    }

    @Override // X.InterfaceC1123955r
    public final Float Bpa() {
        return A0F();
    }

    @Override // X.InterfaceC1123955r
    public final Float Bzq() {
        return A0D();
    }

    @Override // X.InterfaceC1123955r
    public final Integer C0i() {
        return AbstractC37301Gc2.A0a(this);
    }

    @Override // X.InterfaceC1123955r
    public final Float CHf() {
        return A0G();
    }

    @Override // X.InterfaceC1123955r
    public final Float CI1() {
        return A0J();
    }

    @Override // X.InterfaceC1123955r
    public final Float CIa() {
        return A0H();
    }

    @Override // X.InterfaceC1123955r
    public final Float CIh() {
        return A0I();
    }

    @Override // X.InterfaceC1123955r
    public final Integer CUY() {
        return AbstractC37301Gc2.A0V(this);
    }

    @Override // X.InterfaceC1123955r
    public final Integer CVk() {
        return AbstractC37301Gc2.A0W(this);
    }

    @Override // X.InterfaceC1123955r
    public final Integer CaJ() {
        return AbstractC37301Gc2.A0X(this);
    }

    @Override // X.InterfaceC1123955r
    public final Integer Cdh() {
        return AbstractC37301Gc2.A0Y(this);
    }

    @Override // X.InterfaceC1123955r
    public final InterfaceC1123955r EBY(C1DY c1dy) {
        InterfaceC1124155t BAp = BAp();
        SubscriptionStickerDictIntf subscriptionStickerDictIntf = null;
        if (BAp != null) {
            BAp.EBS(c1dy);
        } else {
            BAp = null;
        }
        this.A01 = BAp;
        SubscriptionStickerDictIntf A0F = AbstractC37302Gc3.A0F(this.A00, this);
        if (A0F != null) {
            A0F.EAt(c1dy);
            subscriptionStickerDictIntf = A0F;
        }
        this.A00 = subscriptionStickerDictIntf;
        return this;
    }

    @Override // X.InterfaceC1123955r
    public final C1123855q F4x(C1DV c1dv) {
        return F4w(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.InterfaceC1123955r
    public final String getId() {
        return A0e();
    }

    @Override // X.InterfaceC1123955r
    public final String getMediaType() {
        return A0a();
    }
}
