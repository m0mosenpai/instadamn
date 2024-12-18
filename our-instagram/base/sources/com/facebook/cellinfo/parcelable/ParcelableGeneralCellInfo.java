package com.facebook.cellinfo.parcelable;

import X.C202078wn;
import X.C202088wo;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class ParcelableGeneralCellInfo extends C202078wn implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63475SlG(70);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [X.8wn, com.facebook.cellinfo.parcelable.ParcelableGeneralCellInfo] */
    public static ParcelableGeneralCellInfo A00(C202078wn c202078wn) {
        C202088wo c202088wo;
        if (c202078wn == null) {
            return null;
        }
        String str = c202078wn.A05;
        String str2 = c202078wn.A06;
        String str3 = c202078wn.A07;
        String str4 = c202078wn.A08;
        boolean z = c202078wn.A09;
        String str5 = c202078wn.A04;
        String str6 = c202078wn.A01;
        String str7 = c202078wn.A02;
        String str8 = c202078wn.A03;
        boolean z2 = c202078wn.A0A;
        C202088wo c202088wo2 = c202078wn.A00;
        if (c202088wo2 == null) {
            c202088wo = null;
        } else {
            c202088wo = new C202088wo(c202088wo2.A03, c202088wo2.A04, c202088wo2.A01, c202088wo2.A02, c202088wo2.A00);
        }
        return new C202078wn(c202088wo, str, str2, str3, str4, str5, str6, str7, str8, z, z2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeParcelable((ParcelableCdmaCellInfo) this.A00, i);
    }
}
