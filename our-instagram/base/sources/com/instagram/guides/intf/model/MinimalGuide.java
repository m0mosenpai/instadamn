package com.instagram.guides.intf.model;

import X.AbstractC167007dF;
import X.C2I7;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class MinimalGuide implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNL.A00(95);
    public Integer A00;
    public Long A01;
    public String A02;
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
    public boolean A0D;
    public boolean A0E;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MinimalGuide)) {
            return false;
        }
        MinimalGuide minimalGuide = (MinimalGuide) obj;
        return C2I7.A00(this.A05, minimalGuide.A05) && C2I7.A00(this.A06, minimalGuide.A06) && C2I7.A00(this.A07, minimalGuide.A07) && C2I7.A00(this.A08, minimalGuide.A08) && C2I7.A00(this.A09, minimalGuide.A09) && C2I7.A00(this.A03, minimalGuide.A03) && C2I7.A00(this.A02, minimalGuide.A02) && C2I7.A00(this.A04, minimalGuide.A04) && C2I7.A00(this.A00, minimalGuide.A00) && C2I7.A00(Boolean.valueOf(this.A0C), Boolean.valueOf(minimalGuide.A0C)) && C2I7.A00(this.A01, minimalGuide.A01) && C2I7.A00(this.A0B, minimalGuide.A0B) && C2I7.A00(this.A0A, minimalGuide.A0A) && C2I7.A00(Boolean.valueOf(this.A0D), Boolean.valueOf(minimalGuide.A0D)) && C2I7.A00(Boolean.valueOf(this.A0E), Boolean.valueOf(minimalGuide.A0E));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, this.A06, this.A07, this.A08, this.A09, this.A03, this.A02, this.A04, this.A00, Boolean.valueOf(this.A0C), this.A01, this.A0B, this.A0A, Boolean.valueOf(this.A0D), Boolean.valueOf(this.A0E)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A00.intValue());
        parcel.writeInt(this.A0C ? 1 : 0);
        Long l = this.A01;
        parcel.writeInt(AbstractC167007dF.A1W(l) ? 1 : 0);
        if (l != null) {
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
    }
}
