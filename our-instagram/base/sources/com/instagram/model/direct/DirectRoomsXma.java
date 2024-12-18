package com.instagram.model.direct;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25236BEt;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class DirectRoomsXma extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(65);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public DirectRoomsXma(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A02 = str4;
        this.A06 = z;
        this.A01 = str5;
        this.A05 = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectRoomsXma) {
                DirectRoomsXma directRoomsXma = (DirectRoomsXma) obj;
                if (!C14360o3.A0K(this.A00, directRoomsXma.A00) || !C14360o3.A0K(this.A04, directRoomsXma.A04) || !C14360o3.A0K(this.A03, directRoomsXma.A03) || !C14360o3.A0K(this.A02, directRoomsXma.A02) || this.A06 != directRoomsXma.A06 || !C14360o3.A0K(this.A01, directRoomsXma.A01) || !C14360o3.A0K(this.A05, directRoomsXma.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A05);
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A06, (((((AbstractC166987dD.A0J(this.A00) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A05);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DirectRoomsXma(roomsLink=");
        A1C.append(this.A00);
        A1C.append(", roomsTitle=");
        A1C.append(this.A04);
        A1C.append(", roomsSubtitle=");
        A1C.append(this.A03);
        A1C.append(", roomsName=");
        A1C.append(this.A02);
        A1C.append(", isAudioOnly=");
        A1C.append(this.A06);
        A1C.append(", roomsLinkHash=");
        A1C.append(this.A01);
        A1C.append(", roomsXmaType=");
        return AbstractC25236BEt.A0Y(this.A05, A1C);
    }
}
