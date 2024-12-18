package com.instagram.model.keyword;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25236BEt;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class Keyword extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C55343Oh9.A00(86);
    public long A00;
    public Double A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;

    public Keyword(Double d, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
        C14360o3.A0B(str2, 2);
        this.A03 = null;
        this.A04 = str2;
        this.A00 = 0L;
        this.A05 = null;
        this.A06 = null;
        this.A02 = null;
        this.A01 = null;
        this.A0A = false;
        this.A08 = null;
        this.A07 = str7;
        this.A09 = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Keyword) {
                Keyword keyword = (Keyword) obj;
                if (!C14360o3.A0K(this.A03, keyword.A03) || !C14360o3.A0K(this.A04, keyword.A04) || this.A00 != keyword.A00 || !C14360o3.A0K(this.A05, keyword.A05) || !C14360o3.A0K(this.A06, keyword.A06) || !C14360o3.A0K(this.A02, keyword.A02) || !C14360o3.A0K(this.A01, keyword.A01) || this.A0A != keyword.A0A || !C14360o3.A0K(this.A08, keyword.A08) || !C14360o3.A0K(this.A07, keyword.A07) || this.A09 != keyword.A09) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        double d;
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        Double d2 = this.A01;
        if (d2 != null) {
            d = d2.doubleValue();
        } else {
            d = 0.0d;
        }
        parcel.writeDouble(d);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A09, (((AbstractC167007dF.A0D(this.A0A, (((((((AbstractC25236BEt.A01(this.A00, AbstractC166997dE.A0K(this.A04, AbstractC167017dG.A0O(this.A03) * 31)) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC25227BEk.A07(this.A07)) * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Keyword(id=");
        A1C.append(this.A03);
        A1C.append(", name=");
        A1C.append(this.A04);
        A1C.append(", mediaCount=");
        A1C.append(this.A00);
        A1C.append(", profilePicUrl=");
        A1C.append(this.A05);
        A1C.append(", searchResultSubtitle=");
        A1C.append(this.A06);
        A1C.append(", headerTitle=");
        A1C.append(this.A02);
        A1C.append(", score=");
        A1C.append(this.A01);
        A1C.append(", isPopular=");
        A1C.append(this.A0A);
        A1C.append(", subtitle=");
        A1C.append(this.A08);
        A1C.append(", style=");
        A1C.append(this.A07);
        A1C.append(", isEcho=");
        return AbstractC25236BEt.A0a(A1C, this.A09);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Keyword(String str, String str2) {
        this(null, null, "", null, null, null, null, null, 0L, false, false);
        C14360o3.A0B(str2, 2);
        this.A03 = str;
        this.A04 = str2;
    }

    public Keyword() {
        this(null, null, "", null, null, null, null, null, 0L, false, false);
    }
}
