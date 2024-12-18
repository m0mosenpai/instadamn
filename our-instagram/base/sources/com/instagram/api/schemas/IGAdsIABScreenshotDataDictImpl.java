package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25227BEk;
import X.AbstractC31179DnN;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import X.Ho6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class IGAdsIABScreenshotDataDictImpl extends C0T6 implements IGAdsIABScreenshotDataDict, Parcelable {
    public static final Parcelable.Creator CREATOR = C41858IgC.A00(20);
    public final IABScreenshotEffectOnUserAction A00;
    public final IABScreenshotTransitionTime A01;
    public final IGAdsIABScreenshotVariant A02;
    public final Boolean A03;
    public final Float A04;
    public final Float A05;
    public final Float A06;
    public final Float A07;
    public final String A08;
    public final String A09;

    @Override // com.instagram.api.schemas.IGAdsIABScreenshotDataDict
    public final IGAdsIABScreenshotDataDictImpl EuP() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGAdsIABScreenshotDataDictImpl) {
                IGAdsIABScreenshotDataDictImpl iGAdsIABScreenshotDataDictImpl = (IGAdsIABScreenshotDataDictImpl) obj;
                if (!C14360o3.A0K(this.A04, iGAdsIABScreenshotDataDictImpl.A04) || !C14360o3.A0K(this.A05, iGAdsIABScreenshotDataDictImpl.A05) || this.A00 != iGAdsIABScreenshotDataDictImpl.A00 || !C14360o3.A0K(this.A06, iGAdsIABScreenshotDataDictImpl.A06) || !C14360o3.A0K(this.A07, iGAdsIABScreenshotDataDictImpl.A07) || this.A01 != iGAdsIABScreenshotDataDictImpl.A01 || !C14360o3.A0K(this.A08, iGAdsIABScreenshotDataDictImpl.A08) || this.A02 != iGAdsIABScreenshotDataDictImpl.A02 || !C14360o3.A0K(this.A03, iGAdsIABScreenshotDataDictImpl.A03) || !C14360o3.A0K(this.A09, iGAdsIABScreenshotDataDictImpl.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC167027dH.A0m(parcel, this.A04);
        AbstractC167027dH.A0m(parcel, this.A05);
        parcel.writeParcelable(this.A00, i);
        AbstractC167027dH.A0m(parcel, this.A06);
        AbstractC167027dH.A0m(parcel, this.A07);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A02, i);
        AbstractC31179DnN.A0p(parcel, this.A03);
        parcel.writeString(this.A09);
    }

    @Override // com.instagram.api.schemas.IGAdsIABScreenshotDataDict
    public final Float BQ3() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.IGAdsIABScreenshotDataDict
    public final Float BTx() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.IGAdsIABScreenshotDataDict
    public final IABScreenshotEffectOnUserAction Bqq() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.IGAdsIABScreenshotDataDict
    public final Float Bqr() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.IGAdsIABScreenshotDataDict
    public final Float Bqs() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.IGAdsIABScreenshotDataDict
    public final IABScreenshotTransitionTime Bqt() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.IGAdsIABScreenshotDataDict
    public final String Bqu() {
        return this.A08;
    }

    @Override // com.instagram.api.schemas.IGAdsIABScreenshotDataDict
    public final IGAdsIABScreenshotVariant Bqv() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.IGAdsIABScreenshotDataDict
    public final Boolean Bwb() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.IGAdsIABScreenshotDataDict
    public final String C6H() {
        return this.A09;
    }

    @Override // com.instagram.api.schemas.IGAdsIABScreenshotDataDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGAdsIABScreenshotDataDict", Ho6.A00(this));
    }

    public final int hashCode() {
        return (((((((((((((((((AbstractC167017dG.A0M(this.A04) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC25227BEk.A07(this.A09);
    }

    public IGAdsIABScreenshotDataDictImpl(IABScreenshotEffectOnUserAction iABScreenshotEffectOnUserAction, IABScreenshotTransitionTime iABScreenshotTransitionTime, IGAdsIABScreenshotVariant iGAdsIABScreenshotVariant, Boolean bool, Float f, Float f2, Float f3, Float f4, String str, String str2) {
        this.A04 = f;
        this.A05 = f2;
        this.A00 = iABScreenshotEffectOnUserAction;
        this.A06 = f3;
        this.A07 = f4;
        this.A01 = iABScreenshotTransitionTime;
        this.A08 = str;
        this.A02 = iGAdsIABScreenshotVariant;
        this.A03 = bool;
        this.A09 = str2;
    }
}
