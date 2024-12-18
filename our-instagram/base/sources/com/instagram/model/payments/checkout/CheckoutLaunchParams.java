package com.instagram.model.payments.checkout;

import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes7.dex */
public final class CheckoutLaunchParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(91);
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public ArrayList A09;
    public Set A0A;
    public boolean A0B;
    public boolean A0C;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeList(this.A09);
        parcel.writeString(this.A00);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
    }
}
