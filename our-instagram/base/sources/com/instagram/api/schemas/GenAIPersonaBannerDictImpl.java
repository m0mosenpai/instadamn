package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC37300Gc1;
import X.AbstractC39937HnS;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class GenAIPersonaBannerDictImpl extends C0T6 implements Parcelable, GenAIPersonaBannerDict {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(93);
    public final GenAIMessagingData A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // com.instagram.api.schemas.GenAIPersonaBannerDict
    public final GenAIPersonaBannerDictImpl Eto() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GenAIPersonaBannerDictImpl) {
                GenAIPersonaBannerDictImpl genAIPersonaBannerDictImpl = (GenAIPersonaBannerDictImpl) obj;
                if (!C14360o3.A0K(this.A00, genAIPersonaBannerDictImpl.A00) || !C14360o3.A0K(this.A01, genAIPersonaBannerDictImpl.A01) || !C14360o3.A0K(this.A02, genAIPersonaBannerDictImpl.A02) || !C14360o3.A0K(this.A03, genAIPersonaBannerDictImpl.A03)) {
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
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    @Override // com.instagram.api.schemas.GenAIPersonaBannerDict
    public final GenAIMessagingData BG4() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.GenAIPersonaBannerDict
    public final String Bcd() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.GenAIPersonaBannerDict
    public final String Bhp() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.GenAIPersonaBannerDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTGenAIPersonaBannerDict", AbstractC39937HnS.A00(this));
    }

    @Override // com.instagram.api.schemas.GenAIPersonaBannerDict
    public final String getName() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0G(this.A00))) + AbstractC167017dG.A0O(this.A03);
    }

    public GenAIPersonaBannerDictImpl(GenAIMessagingData genAIMessagingData, String str, String str2, String str3) {
        AbstractC167027dH.A13(genAIMessagingData, str, str2);
        this.A00 = genAIMessagingData;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }
}
