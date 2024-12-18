package com.google.android.flexbox;

import X.AbstractC58323PtF;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

/* loaded from: classes10.dex */
public class FlexboxLayout$LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(85);
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public boolean A09;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final int Aaq() {
        return this.A03;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final float B6z() {
        return this.A00;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final float B70() {
        return this.A01;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final float B71() {
        return this.A02;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final int BPo() {
        return this.A04;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final int BQB() {
        return this.A05;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final int BTr() {
        return this.A06;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final int BU3() {
        return this.A07;
    }

    @Override // com.google.android.flexbox.FlexItem
    public final boolean CgA() {
        return this.A09;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A08);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A04);
        AbstractC58323PtF.A1B(parcel, this, this.A09 ? (byte) 1 : (byte) 0);
    }
}
