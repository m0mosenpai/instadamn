package com.instagram.model.business;

import X.AbstractC002300n;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class ProfileAddressData extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(54);
    public Float A00;
    public Float A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfileAddressData) {
                ProfileAddressData profileAddressData = (ProfileAddressData) obj;
                if (!C14360o3.A0K(this.A06, profileAddressData.A06) || !C14360o3.A0K(this.A03, profileAddressData.A03) || !C14360o3.A0K(this.A04, profileAddressData.A04) || !C14360o3.A0K(this.A05, profileAddressData.A05) || !C14360o3.A0K(this.A08, profileAddressData.A08) || !C14360o3.A0K(this.A00, profileAddressData.A00) || !C14360o3.A0K(this.A01, profileAddressData.A01) || !C14360o3.A0K(this.A07, profileAddressData.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A08);
        AbstractC167027dH.A0m(parcel, this.A00);
        AbstractC167027dH.A0m(parcel, this.A01);
        parcel.writeString(this.A07);
    }

    public final int hashCode() {
        return (((((((((((((AbstractC167017dG.A0O(this.A06) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC25227BEk.A07(this.A07);
    }

    public ProfileAddressData(Float f, Float f2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A06 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A08 = str5;
        this.A00 = f;
        this.A01 = f2;
        this.A07 = str6;
        this.A02 = (str == null || !AbstractC002300n.A0h(str, "new:", false)) ? this.A06 : null;
    }

    public ProfileAddressData() {
        this(null, null, null, null, null, null, null, null);
    }
}
