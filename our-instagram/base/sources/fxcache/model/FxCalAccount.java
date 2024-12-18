package fxcache.model;

import X.AbstractC111324zv;
import X.C14360o3;
import X.MSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class FxCalAccount implements Parcelable {
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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FxCalAccount) {
                FxCalAccount fxCalAccount = (FxCalAccount) obj;
                if (!C14360o3.A0K(this.A03, fxCalAccount.A03) || !C14360o3.A0K(this.A05, fxCalAccount.A05) || !C14360o3.A0K(this.A04, fxCalAccount.A04) || !C14360o3.A0K(this.A06, fxCalAccount.A06) || !C14360o3.A0K(this.A08, fxCalAccount.A08) || !C14360o3.A0K(this.A0A, fxCalAccount.A0A) || !C14360o3.A0K(this.A07, fxCalAccount.A07) || this.A00 != fxCalAccount.A00 || this.A02 != fxCalAccount.A02 || this.A01 != fxCalAccount.A01 || !C14360o3.A0K(this.A09, fxCalAccount.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A03.hashCode() * 31;
        String str = this.A05;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.A04.hashCode()) * 31;
        String str2 = this.A06;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A08;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A0A;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A07;
        int hashCode6 = (((((((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.A00) * 31) + this.A02) * 31) + this.A01) * 31;
        String str6 = this.A09;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FxCalAccount(accountId=");
        sb.append(this.A03);
        sb.append(", instagramId=");
        sb.append(this.A05);
        sb.append(AbstractC111324zv.A00(52));
        sb.append(this.A04);
        sb.append(AbstractC111324zv.A00(1438));
        sb.append(this.A06);
        sb.append(MSV.A00(293));
        sb.append(this.A08);
        sb.append(MSV.A00(299));
        sb.append(this.A0A);
        sb.append(AbstractC111324zv.A00(573));
        sb.append(this.A07);
        sb.append(AbstractC111324zv.A00(1400));
        sb.append(this.A00);
        sb.append(", unfilteredBadgeCount=");
        sb.append(this.A02);
        sb.append(", igL28=");
        sb.append(this.A01);
        sb.append(", unpackedNotifications=");
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
        parcel.writeString(this.A0A);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A09);
    }

    public FxCalAccount(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3) {
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A06 = str4;
        this.A08 = str5;
        this.A0A = str6;
        this.A07 = str7;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A09 = str8;
    }

    public FxCalAccount() {
        this("", "", "", "", "", "", "", "", 0, 0, 0);
    }
}
