package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC37300Gc1;
import X.AbstractC72619Xhz;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class StorySmbSupportStickerObjectImpl extends C0T6 implements StorySmbSupportStickerObject, Parcelable {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(25);
    public final SMBSupportStickerDict A00;
    public final StickerTraySurface A01;
    public final SubscriptionStickerDict A02;
    public final Float A03;
    public final Float A04;
    public final Float A05;
    public final Float A06;
    public final Float A07;
    public final Float A08;
    public final Float A09;
    public final Float A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final StorySmbSupportStickerObjectImpl F1q(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final StorySmbSupportStickerObjectImpl F1r(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StorySmbSupportStickerObjectImpl) {
                StorySmbSupportStickerObjectImpl storySmbSupportStickerObjectImpl = (StorySmbSupportStickerObjectImpl) obj;
                if (!C14360o3.A0K(this.A0G, storySmbSupportStickerObjectImpl.A0G) || !C14360o3.A0K(this.A0H, storySmbSupportStickerObjectImpl.A0H) || !C14360o3.A0K(this.A0I, storySmbSupportStickerObjectImpl.A0I) || !C14360o3.A0K(this.A0J, storySmbSupportStickerObjectImpl.A0J) || !C14360o3.A0K(this.A03, storySmbSupportStickerObjectImpl.A03) || !C14360o3.A0K(this.A04, storySmbSupportStickerObjectImpl.A04) || !C14360o3.A0K(this.A0K, storySmbSupportStickerObjectImpl.A0K) || !C14360o3.A0K(this.A0B, storySmbSupportStickerObjectImpl.A0B) || !C14360o3.A0K(this.A0C, storySmbSupportStickerObjectImpl.A0C) || !C14360o3.A0K(this.A0D, storySmbSupportStickerObjectImpl.A0D) || !C14360o3.A0K(this.A0E, storySmbSupportStickerObjectImpl.A0E) || !C14360o3.A0K(this.A0L, storySmbSupportStickerObjectImpl.A0L) || !C14360o3.A0K(this.A05, storySmbSupportStickerObjectImpl.A05) || !C14360o3.A0K(this.A00, storySmbSupportStickerObjectImpl.A00) || !C14360o3.A0K(this.A06, storySmbSupportStickerObjectImpl.A06) || !C14360o3.A0K(this.A0F, storySmbSupportStickerObjectImpl.A0F) || !C14360o3.A0K(this.A02, storySmbSupportStickerObjectImpl.A02) || this.A01 != storySmbSupportStickerObjectImpl.A01 || !C14360o3.A0K(this.A07, storySmbSupportStickerObjectImpl.A07) || !C14360o3.A0K(this.A08, storySmbSupportStickerObjectImpl.A08) || !C14360o3.A0K(this.A09, storySmbSupportStickerObjectImpl.A09) || !C14360o3.A0K(this.A0A, storySmbSupportStickerObjectImpl.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0J);
        AbstractC167027dH.A0m(parcel, this.A03);
        AbstractC167027dH.A0m(parcel, this.A04);
        parcel.writeString(this.A0K);
        AbstractC167027dH.A0o(parcel, this.A0B, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A0C, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A0D, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A0E, 0, 1);
        parcel.writeString(this.A0L);
        AbstractC167027dH.A0m(parcel, this.A05);
        parcel.writeParcelable(this.A00, i);
        AbstractC167027dH.A0m(parcel, this.A06);
        AbstractC167027dH.A0o(parcel, this.A0F, 0, 1);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        AbstractC167027dH.A0m(parcel, this.A07);
        AbstractC167027dH.A0m(parcel, this.A08);
        AbstractC167027dH.A0m(parcel, this.A09);
        AbstractC167027dH.A0m(parcel, this.A0A);
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final String AdC() {
        return this.A0G;
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final String AdO() {
        return this.A0H;
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final String AvN() {
        return this.A0I;
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final String Ayd() {
        return this.A0J;
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final Float B29() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final Float BDR() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final Float Bpa() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final /* bridge */ /* synthetic */ SMBSupportStickerDictIntf Bxz() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final Float Bzq() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final Integer C0i() {
        return this.A0F;
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final /* bridge */ /* synthetic */ SubscriptionStickerDictIntf C3Y() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final StickerTraySurface C4I() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final Float CHf() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final Float CI1() {
        return this.A08;
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final Float CIa() {
        return this.A09;
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final Float CIh() {
        return this.A0A;
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final Integer CUY() {
        return this.A0B;
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final Integer CVk() {
        return this.A0C;
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final Integer CaJ() {
        return this.A0D;
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final Integer Cdh() {
        return this.A0E;
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStorySmbSupportStickerObject", AbstractC72619Xhz.A00(this));
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final String getId() {
        return this.A0K;
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final String getMediaType() {
        return this.A0L;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((AbstractC167017dG.A0O(this.A0G) * 31) + AbstractC167017dG.A0O(this.A0H)) * 31) + AbstractC167017dG.A0O(this.A0I)) * 31) + AbstractC167017dG.A0O(this.A0J)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A0K)) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A0C)) * 31) + AbstractC167017dG.A0M(this.A0D)) * 31) + AbstractC167017dG.A0M(this.A0E)) * 31) + AbstractC167017dG.A0O(this.A0L)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A0F)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC166997dE.A0I(this.A0A);
    }

    public StorySmbSupportStickerObjectImpl(SMBSupportStickerDict sMBSupportStickerDict, StickerTraySurface stickerTraySurface, SubscriptionStickerDict subscriptionStickerDict, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A0G = str;
        this.A0H = str2;
        this.A0I = str3;
        this.A0J = str4;
        this.A03 = f;
        this.A04 = f2;
        this.A0K = str5;
        this.A0B = num;
        this.A0C = num2;
        this.A0D = num3;
        this.A0E = num4;
        this.A0L = str6;
        this.A05 = f3;
        this.A00 = sMBSupportStickerDict;
        this.A06 = f4;
        this.A0F = num5;
        this.A02 = subscriptionStickerDict;
        this.A01 = stickerTraySurface;
        this.A07 = f5;
        this.A08 = f6;
        this.A09 = f7;
        this.A0A = f8;
    }

    @Override // com.instagram.api.schemas.StorySmbSupportStickerObject
    public final StorySmbSupportStickerObject EAl(C1DY c1dy) {
        return this;
    }
}