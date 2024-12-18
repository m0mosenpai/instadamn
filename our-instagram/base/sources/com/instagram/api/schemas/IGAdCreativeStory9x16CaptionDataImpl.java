package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC31179DnN;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import X.Ho1;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class IGAdCreativeStory9x16CaptionDataImpl extends C0T6 implements IGAdCreativeStory9x16CaptionData, Parcelable {
    public static final Parcelable.Creator CREATOR = C41858IgC.A00(16);
    public final CaptionTextFontStyle A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Float A03;
    public final Float A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final IGAdCreativeStory9x16CaptionDataImpl EuG() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGAdCreativeStory9x16CaptionDataImpl) {
                IGAdCreativeStory9x16CaptionDataImpl iGAdCreativeStory9x16CaptionDataImpl = (IGAdCreativeStory9x16CaptionDataImpl) obj;
                if (!C14360o3.A0K(this.A08, iGAdCreativeStory9x16CaptionDataImpl.A08) || !C14360o3.A0K(this.A09, iGAdCreativeStory9x16CaptionDataImpl.A09) || !C14360o3.A0K(this.A05, iGAdCreativeStory9x16CaptionDataImpl.A05) || !C14360o3.A0K(this.A03, iGAdCreativeStory9x16CaptionDataImpl.A03) || !C14360o3.A0K(this.A04, iGAdCreativeStory9x16CaptionDataImpl.A04) || !C14360o3.A0K(this.A0A, iGAdCreativeStory9x16CaptionDataImpl.A0A) || !C14360o3.A0K(this.A06, iGAdCreativeStory9x16CaptionDataImpl.A06) || this.A00 != iGAdCreativeStory9x16CaptionDataImpl.A00 || !C14360o3.A0K(this.A07, iGAdCreativeStory9x16CaptionDataImpl.A07) || !C14360o3.A0K(this.A01, iGAdCreativeStory9x16CaptionDataImpl.A01) || !C14360o3.A0K(this.A02, iGAdCreativeStory9x16CaptionDataImpl.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        AbstractC167027dH.A0o(parcel, this.A05, 0, 1);
        AbstractC167027dH.A0m(parcel, this.A03);
        AbstractC167027dH.A0m(parcel, this.A04);
        parcel.writeString(this.A0A);
        AbstractC167027dH.A0o(parcel, this.A06, 0, 1);
        parcel.writeParcelable(this.A00, i);
        AbstractC167027dH.A0o(parcel, this.A07, 0, 1);
        AbstractC31179DnN.A0p(parcel, this.A01);
        AbstractC31179DnN.A0p(parcel, this.A02);
    }

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final String Alf() {
        return this.A08;
    }

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final String Alg() {
        return this.A09;
    }

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final Integer Alh() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final Float Ali() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final Float Alj() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final String Alk() {
        return this.A0A;
    }

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final Integer All() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final CaptionTextFontStyle Alm() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final Integer Alp() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final Boolean Alq() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final Boolean Alr() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.IGAdCreativeStory9x16CaptionData
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGAdCreativeStory9x16CaptionData", Ho1.A00(this));
    }

    public final int hashCode() {
        return (((((((((((((((((((AbstractC167017dG.A0O(this.A08) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public IGAdCreativeStory9x16CaptionDataImpl(CaptionTextFontStyle captionTextFontStyle, Boolean bool, Boolean bool2, Float f, Float f2, Integer num, Integer num2, Integer num3, String str, String str2, String str3) {
        this.A08 = str;
        this.A09 = str2;
        this.A05 = num;
        this.A03 = f;
        this.A04 = f2;
        this.A0A = str3;
        this.A06 = num2;
        this.A00 = captionTextFontStyle;
        this.A07 = num3;
        this.A01 = bool;
        this.A02 = bool2;
    }
}
