package com.instagram.model.fundraiser;

import X.C0T6;
import X.C14360o3;
import X.C16930sl;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes4.dex */
public final class NewFundraiserInfo extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(83);
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public List A08;
    public boolean A09;
    public final String A0A;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NewFundraiserInfo) {
                NewFundraiserInfo newFundraiserInfo = (NewFundraiserInfo) obj;
                if (!C14360o3.A0K(this.A02, newFundraiserInfo.A02) || this.A00 != newFundraiserInfo.A00 || !C14360o3.A0K(this.A05, newFundraiserInfo.A05) || !C14360o3.A0K(this.A07, newFundraiserInfo.A07) || this.A09 != newFundraiserInfo.A09 || !C14360o3.A0K(this.A03, newFundraiserInfo.A03) || !C14360o3.A0K(this.A06, newFundraiserInfo.A06) || !C14360o3.A0K(this.A01, newFundraiserInfo.A01) || !C14360o3.A0K(this.A08, newFundraiserInfo.A08) || !C14360o3.A0K(this.A04, newFundraiserInfo.A04) || !C14360o3.A0K(this.A0A, newFundraiserInfo.A0A)) {
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
        parcel.writeInt(this.A00);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A01);
        parcel.writeStringList(this.A08);
        parcel.writeString(this.A04);
        parcel.writeString(this.A0A);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        String str = this.A02;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = ((hashCode * 31) + this.A00) * 31;
        String str2 = this.A05;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.A07;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        int i5 = 1237;
        if (this.A09) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        String str4 = this.A03;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        String str5 = this.A06;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i8 = (i7 + hashCode5) * 31;
        String str6 = this.A01;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i9 = (i8 + hashCode6) * 31;
        List list = this.A08;
        if (list == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list.hashCode();
        }
        int i10 = (i9 + hashCode7) * 31;
        String str7 = this.A04;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i11 = (i10 + hashCode8) * 31;
        String str8 = this.A0A;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return i11 + i;
    }

    public NewFundraiserInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i, boolean z) {
        this.A02 = str;
        this.A00 = i;
        this.A05 = str2;
        this.A07 = str3;
        this.A09 = z;
        this.A03 = str4;
        this.A06 = str5;
        this.A01 = str6;
        this.A08 = list;
        this.A04 = str7;
        this.A0A = str8;
    }

    public NewFundraiserInfo() {
        this(null, null, null, null, null, null, null, null, C16930sl.A00, -1, false);
    }
}
