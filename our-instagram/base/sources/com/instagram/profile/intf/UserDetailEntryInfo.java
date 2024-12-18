package com.instagram.profile.intf;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25236BEt;
import X.C0T6;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes6.dex */
public final class UserDetailEntryInfo extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(21);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserDetailEntryInfo) {
                UserDetailEntryInfo userDetailEntryInfo = (UserDetailEntryInfo) obj;
                if (!C14360o3.A0K(this.A02, userDetailEntryInfo.A02) || !C14360o3.A0K(this.A03, userDetailEntryInfo.A03) || !C14360o3.A0K(this.A01, userDetailEntryInfo.A01) || !C14360o3.A0K(this.A04, userDetailEntryInfo.A04) || !C14360o3.A0K(this.A05, userDetailEntryInfo.A05) || !C14360o3.A0K(this.A00, userDetailEntryInfo.A00) || !C14360o3.A0K(this.A08, userDetailEntryInfo.A08) || !C14360o3.A0K(this.A0B, userDetailEntryInfo.A0B) || !C14360o3.A0K(this.A09, userDetailEntryInfo.A09) || !C14360o3.A0K(this.A07, userDetailEntryInfo.A07) || !C14360o3.A0K(this.A06, userDetailEntryInfo.A06) || !C14360o3.A0K(this.A0A, userDetailEntryInfo.A0A)) {
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
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A00);
        parcel.writeString(this.A08);
        parcel.writeStringList(this.A0B);
        parcel.writeString(this.A09);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0A);
    }

    public final int hashCode() {
        return (((((((((((((((((((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC25227BEk.A07(this.A0A);
    }

    public UserDetailEntryInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A00 = str6;
        this.A08 = str7;
        this.A0B = list;
        this.A09 = str8;
        this.A07 = str9;
        this.A06 = str10;
        this.A0A = str11;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("UserDetailEntryInfo(entityId=");
        A1C.append(this.A02);
        A1C.append(", entityName=");
        A1C.append(this.A03);
        A1C.append(", entityFollowStatus=");
        A1C.append(this.A01);
        A1C.append(", entityType=");
        A1C.append(this.A04);
        A1C.append(", insertionContext=");
        A1C.append(this.A05);
        A1C.append(", displayFormat=");
        A1C.append(this.A00);
        A1C.append(", netegoUnitId=");
        A1C.append(this.A08);
        A1C.append(", mediaList=");
        A1C.append(this.A0B);
        A1C.append(", rankingAlgorithm=");
        A1C.append(this.A09);
        A1C.append(", classificationAlgorithm=");
        A1C.append(this.A07);
        A1C.append(", algorithm=");
        A1C.append(this.A06);
        A1C.append(", unitAlgorithm=");
        return AbstractC25236BEt.A0Y(this.A0A, A1C);
    }
}
