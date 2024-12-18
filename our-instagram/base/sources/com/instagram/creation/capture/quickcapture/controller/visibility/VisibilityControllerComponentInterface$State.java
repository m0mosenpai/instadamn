package com.instagram.creation.capture.quickcapture.controller.visibility;

import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.gallery.Medium;

/* loaded from: classes4.dex */
public final class VisibilityControllerComponentInterface$State implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(49);
    public final int A00;
    public final int A01;
    public final int A02;
    public final Medium A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
    }

    public VisibilityControllerComponentInterface$State(Medium medium, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A08 = z;
        this.A03 = medium;
        this.A05 = z2;
        this.A04 = z3;
        this.A09 = z4;
        this.A06 = z5;
        this.A07 = z6;
    }
}
