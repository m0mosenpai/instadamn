package com.instagram.model.rtc;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class RtcIgNotification extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C41856IgA(3);
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

    public RtcIgNotification(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        C14360o3.A0B(str2, 2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A08 = str6;
        this.A07 = str7;
        this.A09 = str8;
        this.A05 = str9;
        this.A06 = str10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RtcIgNotification) {
                RtcIgNotification rtcIgNotification = (RtcIgNotification) obj;
                if (!C14360o3.A0K(this.A01, rtcIgNotification.A01) || !C14360o3.A0K(this.A02, rtcIgNotification.A02) || !C14360o3.A0K(this.A00, rtcIgNotification.A00) || !C14360o3.A0K(this.A03, rtcIgNotification.A03) || !C14360o3.A0K(this.A04, rtcIgNotification.A04) || !C14360o3.A0K(this.A08, rtcIgNotification.A08) || !C14360o3.A0K(this.A07, rtcIgNotification.A07) || !C14360o3.A0K(this.A09, rtcIgNotification.A09) || !C14360o3.A0K(this.A05, rtcIgNotification.A05) || !C14360o3.A0K(this.A06, rtcIgNotification.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
    }

    public final int hashCode() {
        return ((((((((((((((AbstractC166997dE.A0K(this.A02, AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC25227BEk.A07(this.A06);
    }
}
