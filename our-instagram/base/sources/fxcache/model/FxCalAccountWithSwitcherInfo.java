package fxcache.model;

import X.C14360o3;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class FxCalAccountWithSwitcherInfo implements Parcelable {
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FxCalAccountWithSwitcherInfo) {
                FxCalAccountWithSwitcherInfo fxCalAccountWithSwitcherInfo = (FxCalAccountWithSwitcherInfo) obj;
                if (!C14360o3.A0K(this.A03, fxCalAccountWithSwitcherInfo.A03) || !C14360o3.A0K(this.A05, fxCalAccountWithSwitcherInfo.A05) || !C14360o3.A0K(this.A04, fxCalAccountWithSwitcherInfo.A04) || !C14360o3.A0K(this.A06, fxCalAccountWithSwitcherInfo.A06) || !C14360o3.A0K(this.A08, fxCalAccountWithSwitcherInfo.A08) || !C14360o3.A0K(this.A0B, fxCalAccountWithSwitcherInfo.A0B) || !C14360o3.A0K(this.A07, fxCalAccountWithSwitcherInfo.A07) || this.A00 != fxCalAccountWithSwitcherInfo.A00 || this.A02 != fxCalAccountWithSwitcherInfo.A02 || this.A01 != fxCalAccountWithSwitcherInfo.A01 || !C14360o3.A0K(this.A0A, fxCalAccountWithSwitcherInfo.A0A) || this.A0C != fxCalAccountWithSwitcherInfo.A0C || !C14360o3.A0K(this.A09, fxCalAccountWithSwitcherInfo.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FxCalAccountWithSwitcherInfo(accountId=");
        sb.append(this.A03);
        sb.append(", instagramId=");
        sb.append(this.A05);
        sb.append(", accountType=");
        sb.append(this.A04);
        sb.append(", name=");
        sb.append(this.A06);
        sb.append(", profilePictureUrl=");
        sb.append(this.A08);
        sb.append(", username=");
        sb.append(this.A0B);
        sb.append(", obfuscatedId=");
        sb.append(this.A07);
        sb.append(", badgeCount=");
        sb.append(this.A00);
        sb.append(", unfilteredBadgeCount=");
        sb.append(this.A02);
        sb.append(", igL28=");
        sb.append(this.A01);
        sb.append(", unpackedNotifications=");
        sb.append(this.A0A);
        sb.append(", hasThreadsAccount=");
        sb.append(this.A0C);
        sb.append(", threadsProfilePictureUrl=");
        sb.append(this.A09);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeString(this.A09);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7 = this.A03.hashCode() * 31;
        String str = this.A05;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode8 = (((hashCode7 + hashCode) * 31) + this.A04.hashCode()) * 31;
        String str2 = this.A06;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (hashCode8 + hashCode2) * 31;
        String str3 = this.A08;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        String str4 = this.A0B;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str5 = this.A07;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i5 = (((((((i4 + hashCode5) * 31) + this.A00) * 31) + this.A02) * 31) + this.A01) * 31;
        String str6 = this.A0A;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        int i7 = 1237;
        if (this.A0C) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        String str7 = this.A09;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return i8 + i;
    }

    public FxCalAccountWithSwitcherInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, int i2, int i3, boolean z) {
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A06 = str4;
        this.A08 = str5;
        this.A0B = str6;
        this.A07 = str7;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A0A = str8;
        this.A0C = z;
        this.A09 = str9;
    }

    public FxCalAccountWithSwitcherInfo() {
        this("", "", "", "", "", "", "", "", "", 0, 0, 0, false);
    }
}
