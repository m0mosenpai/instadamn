package com.instagram.business.controller.datamodel;

import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class PageSelectionOverrideData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(35);
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A02);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
    }
}
