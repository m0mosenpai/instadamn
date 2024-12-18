package com.instagram.model.direct.stickerstore;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC25229BEm;
import X.AbstractC31179DnN;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class DirectStoreStickerResponseItem extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(72);
    public final int A00;
    public final int A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Double A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public DirectStoreStickerResponseItem(Boolean bool, Boolean bool2, Double d, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        AbstractC25229BEm.A1K(str, 1, str6);
        this.A07 = str;
        this.A09 = str2;
        this.A08 = str3;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = d;
        this.A06 = str4;
        this.A05 = str5;
        this.A03 = bool;
        this.A02 = bool2;
        this.A0A = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectStoreStickerResponseItem) {
                DirectStoreStickerResponseItem directStoreStickerResponseItem = (DirectStoreStickerResponseItem) obj;
                if (!C14360o3.A0K(this.A07, directStoreStickerResponseItem.A07) || !C14360o3.A0K(this.A09, directStoreStickerResponseItem.A09) || !C14360o3.A0K(this.A08, directStoreStickerResponseItem.A08) || this.A00 != directStoreStickerResponseItem.A00 || this.A01 != directStoreStickerResponseItem.A01 || !C14360o3.A0K(this.A04, directStoreStickerResponseItem.A04) || !C14360o3.A0K(this.A06, directStoreStickerResponseItem.A06) || !C14360o3.A0K(this.A05, directStoreStickerResponseItem.A05) || !C14360o3.A0K(this.A03, directStoreStickerResponseItem.A03) || !C14360o3.A0K(this.A02, directStoreStickerResponseItem.A02) || !C14360o3.A0K(this.A0A, directStoreStickerResponseItem.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        Double d = this.A04;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        AbstractC31179DnN.A0p(parcel, this.A03);
        AbstractC31179DnN.A0p(parcel, this.A02);
        parcel.writeString(this.A0A);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A0A, (((((((((((((((((AbstractC166987dD.A0J(this.A07) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + this.A00) * 31) + this.A01) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A02)) * 31);
    }
}
