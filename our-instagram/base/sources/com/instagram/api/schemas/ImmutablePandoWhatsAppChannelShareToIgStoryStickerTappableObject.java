package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37301Gc2;
import X.AbstractC37302Gc3;
import X.AbstractC37303Gc4;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39305HXw;
import X.JCB;
import X.Xi6;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoWhatsAppChannelShareToIgStoryStickerTappableObject extends C17T implements WhatsAppChannelShareToIgStoryStickerTappableObject {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(23);
    public SubscriptionStickerDictIntf A00;

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final SubscriptionStickerDictIntf C3Y() {
        return AbstractC37302Gc3.A0F(this.A00, this);
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final StickerTraySurface C4I() {
        return AbstractC37303Gc4.A09(this, JCB.A00);
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final WhatsAppChannelShareToIgStoryStickerDict CHX() {
        return (WhatsAppChannelShareToIgStoryStickerDict) A05(-412877875, ImmutablePandoWhatsAppChannelShareToIgStoryStickerDict.class);
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final WhatsAppChannelShareToIgStoryStickerTappableObject EBE(C1DY c1dy) {
        this.A00 = AbstractC37302Gc3.A0E(c1dy, AbstractC37302Gc3.A0F(this.A00, this));
        return this;
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final WhatsAppChannelShareToIgStoryStickerTappableObjectImpl F3x(C1DY c1dy) {
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
        WhatsAppChannelShareToIgStoryStickerDictImpl whatsAppChannelShareToIgStoryStickerDictImpl = null;
        SubscriptionStickerDict A09 = AbstractC37301Gc2.A09(c1dy, AbstractC37302Gc3.A0F(this.A00, this));
        StickerTraySurface A092 = AbstractC37303Gc4.A09(this, JCB.A00);
        WhatsAppChannelShareToIgStoryStickerDict CHX = CHX();
        if (CHX != null) {
            whatsAppChannelShareToIgStoryStickerDictImpl = CHX.F3w();
        }
        return new WhatsAppChannelShareToIgStoryStickerTappableObjectImpl(A092, A09, whatsAppChannelShareToIgStoryStickerDictImpl, A0E, A0C, A0F, A0D, A0G(), A0J(), A0H(), A0I(), A0V, A0W, A0X, A0Y, A0a2, A0d, A0c, A0b, A0Z, A0e, A0a);
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, Xi6.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final String AdC() {
        return A0d();
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final String AdO() {
        return A0c();
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final String AvN() {
        return A0b();
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final String Ayd() {
        return A0Z();
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final Float B29() {
        return A0E();
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final Float BDR() {
        return A0C();
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final Float Bpa() {
        return A0F();
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final Float Bzq() {
        return A0D();
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final Integer C0i() {
        return AbstractC37301Gc2.A0a(this);
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final Float CHf() {
        return A0G();
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final Float CI1() {
        return A0J();
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final Float CIa() {
        return A0H();
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final Float CIh() {
        return A0I();
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final Integer CUY() {
        return AbstractC37301Gc2.A0V(this);
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final Integer CVk() {
        return AbstractC37301Gc2.A0W(this);
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final Integer CaJ() {
        return AbstractC37301Gc2.A0X(this);
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final Integer Cdh() {
        return AbstractC37301Gc2.A0Y(this);
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final WhatsAppChannelShareToIgStoryStickerTappableObjectImpl F3y(C1DV c1dv) {
        return F3x(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final String getId() {
        return A0e();
    }

    @Override // com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject
    public final String getMediaType() {
        return A0a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}