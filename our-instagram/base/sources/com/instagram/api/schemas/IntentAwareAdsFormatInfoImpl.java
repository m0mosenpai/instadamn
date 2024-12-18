package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC37300Gc1;
import X.AbstractC40032HpJ;
import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class IntentAwareAdsFormatInfoImpl extends C0T6 implements Parcelable, IntentAwareAdsFormatInfo {
    public static final Parcelable.Creator CREATOR = C41858IgC.A00(63);
    public final IntentAwareAdsFormatType A00;
    public final String A01;

    @Override // com.instagram.api.schemas.IntentAwareAdsFormatInfo
    public final IntentAwareAdsFormatInfoImpl Evi() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IntentAwareAdsFormatInfoImpl) {
                IntentAwareAdsFormatInfoImpl intentAwareAdsFormatInfoImpl = (IntentAwareAdsFormatInfoImpl) obj;
                if (this.A00 != intentAwareAdsFormatInfoImpl.A00 || !C14360o3.A0K(this.A01, intentAwareAdsFormatInfoImpl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsFormatInfo
    public final IntentAwareAdsFormatType B7y() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsFormatInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIntentAwareAdsFormatInfo", AbstractC40032HpJ.A00(this));
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsFormatInfo
    public final String getTitle() {
        return this.A01;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public IntentAwareAdsFormatInfoImpl(IntentAwareAdsFormatType intentAwareAdsFormatType, String str) {
        this.A00 = intentAwareAdsFormatType;
        this.A01 = str;
    }
}
