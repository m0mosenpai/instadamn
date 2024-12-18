package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoMediaVCRTappableData;
import com.instagram.api.schemas.MediaVCRTappableData;
import com.instagram.api.schemas.MediaVCRTappableDataIntf;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;

/* loaded from: classes7.dex */
public final class HR2 extends C17T implements InterfaceC2042391v {
    public SubscriptionStickerDictIntf A00;
    public MediaVCRTappableDataIntf A01;

    @Override // X.InterfaceC2042391v
    public final SubscriptionStickerDictIntf C3Y() {
        return AbstractC37302Gc3.A0F(this.A00, this);
    }

    @Override // X.InterfaceC2042391v
    public final StickerTraySurface C4I() {
        return AbstractC37303Gc4.A09(this, JAD.A00);
    }

    @Override // X.InterfaceC2042391v
    public final MediaVCRTappableDataIntf CEg() {
        MediaVCRTappableDataIntf mediaVCRTappableDataIntf = this.A01;
        if (mediaVCRTappableDataIntf == null) {
            return (MediaVCRTappableDataIntf) A05(1009730147, ImmutablePandoMediaVCRTappableData.class);
        }
        return mediaVCRTappableDataIntf;
    }

    @Override // X.InterfaceC2042391v
    public final InterfaceC2042391v E9G(C1DY c1dy) {
        SubscriptionStickerDictIntf A0F = AbstractC37302Gc3.A0F(this.A00, this);
        MediaVCRTappableDataIntf mediaVCRTappableDataIntf = null;
        if (A0F != null) {
            A0F.EAt(c1dy);
        } else {
            A0F = null;
        }
        this.A00 = A0F;
        MediaVCRTappableDataIntf CEg = CEg();
        if (CEg != null) {
            CEg.E9F(c1dy);
            mediaVCRTappableDataIntf = CEg;
        }
        this.A01 = mediaVCRTappableDataIntf;
        return this;
    }

    @Override // X.InterfaceC2042391v
    public final C2042291u EwZ(C1DY c1dy) {
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
        Float A0F = A0F();
        Float A0D = A0D();
        Integer A0a2 = AbstractC37301Gc2.A0a(this);
        MediaVCRTappableData mediaVCRTappableData = null;
        SubscriptionStickerDict A09 = AbstractC37301Gc2.A09(c1dy, AbstractC37302Gc3.A0F(this.A00, this));
        StickerTraySurface A092 = AbstractC37303Gc4.A09(this, JAD.A00);
        MediaVCRTappableDataIntf CEg = CEg();
        if (CEg != null) {
            mediaVCRTappableData = CEg.EwX(c1dy);
        }
        return new C2042291u(mediaVCRTappableData, A092, A09, A0E, A0C, A0F, A0D, A0G(), A0J(), A0H(), A0I(), A0V, A0W, A0X, A0Y, A0a2, A0d, A0c, A0b, A0Z, A0e, A0a);
    }

    @Override // X.InterfaceC2042391v
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC225499xE.A00(this));
    }

    @Override // X.InterfaceC2042391v
    public final String AdC() {
        return A0d();
    }

    @Override // X.InterfaceC2042391v
    public final String AdO() {
        return A0c();
    }

    @Override // X.InterfaceC2042391v
    public final String AvN() {
        return A0b();
    }

    @Override // X.InterfaceC2042391v
    public final String Ayd() {
        return A0Z();
    }

    @Override // X.InterfaceC2042391v
    public final Float B29() {
        return A0E();
    }

    @Override // X.InterfaceC2042391v
    public final Float BDR() {
        return A0C();
    }

    @Override // X.InterfaceC2042391v
    public final Float Bpa() {
        return A0F();
    }

    @Override // X.InterfaceC2042391v
    public final Float Bzq() {
        return A0D();
    }

    @Override // X.InterfaceC2042391v
    public final Integer C0i() {
        return AbstractC37301Gc2.A0a(this);
    }

    @Override // X.InterfaceC2042391v
    public final Float CHf() {
        return A0G();
    }

    @Override // X.InterfaceC2042391v
    public final Float CI1() {
        return A0J();
    }

    @Override // X.InterfaceC2042391v
    public final Float CIa() {
        return A0H();
    }

    @Override // X.InterfaceC2042391v
    public final Float CIh() {
        return A0I();
    }

    @Override // X.InterfaceC2042391v
    public final Integer CUY() {
        return AbstractC37301Gc2.A0V(this);
    }

    @Override // X.InterfaceC2042391v
    public final Integer CVk() {
        return AbstractC37301Gc2.A0W(this);
    }

    @Override // X.InterfaceC2042391v
    public final Integer CaJ() {
        return AbstractC37301Gc2.A0X(this);
    }

    @Override // X.InterfaceC2042391v
    public final Integer Cdh() {
        return AbstractC37301Gc2.A0Y(this);
    }

    @Override // X.InterfaceC2042391v
    public final C2042291u Ewa(C1DV c1dv) {
        return EwZ(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.InterfaceC2042391v
    public final String getId() {
        return A0e();
    }

    @Override // X.InterfaceC2042391v
    public final String getMediaType() {
        return A0a();
    }
}
