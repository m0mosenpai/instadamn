package com.instagram.api.schemas;

import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class DEPProgramLevelContentResponse extends C0T6 implements Parcelable, DEPProgramLevelContentResponseIntf {
    public static final Parcelable.Creator CREATOR = new C41854Ig8(58);
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DEPProgramLevelContentResponse) {
                DEPProgramLevelContentResponse dEPProgramLevelContentResponse = (DEPProgramLevelContentResponse) obj;
                if (!C14360o3.A0K(this.A04, dEPProgramLevelContentResponse.A04) || !C14360o3.A0K(this.A05, dEPProgramLevelContentResponse.A05) || !C14360o3.A0K(this.A00, dEPProgramLevelContentResponse.A00) || !C14360o3.A0K(this.A06, dEPProgramLevelContentResponse.A06) || this.A03 != dEPProgramLevelContentResponse.A03 || !C14360o3.A0K(this.A07, dEPProgramLevelContentResponse.A07) || !C14360o3.A0K(this.A08, dEPProgramLevelContentResponse.A08) || !C14360o3.A0K(this.A01, dEPProgramLevelContentResponse.A01) || !C14360o3.A0K(this.A02, dEPProgramLevelContentResponse.A02) || !C14360o3.A0K(this.A09, dEPProgramLevelContentResponse.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A00);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A09);
    }

    public final int hashCode() {
        int i = 0;
        int A0D = (((((((AbstractC167007dF.A0D(this.A03, ((((((AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31;
        String str = this.A09;
        if (str != null) {
            i = str.hashCode();
        }
        return A0D + i;
    }

    public DEPProgramLevelContentResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        this.A04 = str;
        this.A05 = str2;
        this.A00 = str3;
        this.A06 = str4;
        this.A03 = z;
        this.A07 = str5;
        this.A08 = str6;
        this.A01 = str7;
        this.A02 = str8;
        this.A09 = str9;
    }
}
