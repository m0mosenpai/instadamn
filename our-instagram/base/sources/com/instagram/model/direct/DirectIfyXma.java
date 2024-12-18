package com.instagram.model.direct;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25235BEs;
import X.AbstractC25236BEt;
import X.AbstractC31179DnN;
import X.AbstractC58317Pt9;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import X.EnumC33381EpE;
import X.MSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class DirectIfyXma extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(60);
    public final long A00;
    public final EnumC33381EpE A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectIfyXma) {
                DirectIfyXma directIfyXma = (DirectIfyXma) obj;
                if (this.A00 != directIfyXma.A00 || !C14360o3.A0K(this.A02, directIfyXma.A02) || !C14360o3.A0K(this.A03, directIfyXma.A03) || this.A01 != directIfyXma.A01 || !C14360o3.A0K(this.A06, directIfyXma.A06) || !C14360o3.A0K(this.A07, directIfyXma.A07) || !C14360o3.A0K(this.A04, directIfyXma.A04) || !C14360o3.A0K(this.A05, directIfyXma.A05) || !C14360o3.A0K(this.A08, directIfyXma.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeLong(this.A00);
        AbstractC31179DnN.A0q(parcel, this.A02);
        parcel.writeString(this.A03);
        EnumC33381EpE enumC33381EpE = this.A01;
        if (enumC33381EpE == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AbstractC166997dE.A1I(parcel, enumC33381EpE);
        }
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A08);
    }

    public final int hashCode() {
        return ((((((((((((((AbstractC25235BEs.A03(this.A00) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC25227BEk.A07(this.A08);
    }

    public DirectIfyXma(EnumC33381EpE enumC33381EpE, Long l, String str, String str2, String str3, String str4, String str5, String str6, long j) {
        this.A00 = j;
        this.A02 = l;
        this.A03 = str;
        this.A01 = enumC33381EpE;
        this.A06 = str2;
        this.A07 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A08 = str6;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DirectIfyXma(generationId=");
        A1C.append(this.A00);
        A1C.append(", mediaId=");
        A1C.append(this.A02);
        A1C.append(AbstractC111324zv.A00(1442));
        A1C.append(this.A03);
        A1C.append(AbstractC58317Pt9.A00(153));
        A1C.append(this.A01);
        A1C.append(MSV.A00(69));
        A1C.append(this.A06);
        A1C.append(MSV.A00(296));
        A1C.append(this.A07);
        A1C.append(MSV.A00(294));
        A1C.append(this.A04);
        A1C.append(", recipeMimicryCaption=");
        A1C.append(this.A05);
        A1C.append(", stickerTopic=");
        return AbstractC25236BEt.A0Y(this.A08, A1C);
    }
}
