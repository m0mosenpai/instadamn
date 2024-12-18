package com.instagram.model.arads;

import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class ArAdsUIModel extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(51);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArAdsUIModel) {
                ArAdsUIModel arAdsUIModel = (ArAdsUIModel) obj;
                if (!C14360o3.A0K(this.A02, arAdsUIModel.A02) || !C14360o3.A0K(this.A03, arAdsUIModel.A03) || !C14360o3.A0K(this.A04, arAdsUIModel.A04) || !C14360o3.A0K(this.A05, arAdsUIModel.A05) || !C14360o3.A0K(this.A01, arAdsUIModel.A01) || !C14360o3.A0K(this.A00, arAdsUIModel.A00) || !C14360o3.A0K(this.A06, arAdsUIModel.A06) || !C14360o3.A0K(this.A07, arAdsUIModel.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((((((((((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31;
        String str = this.A07;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public ArAdsUIModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A01 = str5;
        this.A00 = str6;
        this.A06 = str7;
        this.A07 = str8;
    }
}
