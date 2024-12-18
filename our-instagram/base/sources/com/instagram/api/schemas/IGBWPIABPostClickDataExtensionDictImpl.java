package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25227BEk;
import X.AbstractC37300Gc1;
import X.AbstractC39973Ho8;
import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class IGBWPIABPostClickDataExtensionDictImpl extends C0T6 implements Parcelable, IGBWPIABPostClickDataExtensionDict {
    public static final Parcelable.Creator CREATOR = C41858IgC.A00(25);
    public final IGBWPExperienceTypes A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    @Override // com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict
    public final IGBWPIABPostClickDataExtensionDictImpl EuT() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGBWPIABPostClickDataExtensionDictImpl) {
                IGBWPIABPostClickDataExtensionDictImpl iGBWPIABPostClickDataExtensionDictImpl = (IGBWPIABPostClickDataExtensionDictImpl) obj;
                if (!C14360o3.A0K(this.A03, iGBWPIABPostClickDataExtensionDictImpl.A03) || !C14360o3.A0K(this.A01, iGBWPIABPostClickDataExtensionDictImpl.A01) || !C14360o3.A0K(this.A02, iGBWPIABPostClickDataExtensionDictImpl.A02) || !C14360o3.A0K(this.A04, iGBWPIABPostClickDataExtensionDictImpl.A04) || !C14360o3.A0K(this.A05, iGBWPIABPostClickDataExtensionDictImpl.A05) || this.A00 != iGBWPIABPostClickDataExtensionDictImpl.A00 || !C14360o3.A0K(this.A06, iGBWPIABPostClickDataExtensionDictImpl.A06) || !C14360o3.A0K(this.A07, iGBWPIABPostClickDataExtensionDictImpl.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        AbstractC167027dH.A0o(parcel, this.A01, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
    }

    @Override // com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict
    public final Integer AXu() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict
    public final Integer AXv() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict
    public final String AcA() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict
    public final String Afl() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict
    public final IGBWPExperienceTypes AjK() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict
    public final String Anw() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict
    public final String Bb3() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGBWPIABPostClickDataExtensionDict", AbstractC39973Ho8.A00(this));
    }

    @Override // com.instagram.api.schemas.IGBWPIABPostClickDataExtensionDict
    public final String getAccessToken() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((((((((((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC25227BEk.A07(this.A07);
    }

    public IGBWPIABPostClickDataExtensionDictImpl(IGBWPExperienceTypes iGBWPExperienceTypes, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5) {
        this.A03 = str;
        this.A01 = num;
        this.A02 = num2;
        this.A04 = str2;
        this.A05 = str3;
        this.A00 = iGBWPExperienceTypes;
        this.A06 = str4;
        this.A07 = str5;
    }
}
