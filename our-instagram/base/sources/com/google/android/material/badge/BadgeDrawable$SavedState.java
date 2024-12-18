package com.google.android.material.badge;

import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class BadgeDrawable$SavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(3);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public CharSequence A0C;
    public boolean A0D;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A09);
        parcel.writeString(this.A0C.toString());
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A0B);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A0D ? 1 : 0);
    }
}
