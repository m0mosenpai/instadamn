package com.meta.foa.cds;

import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class CdsOpenScreenConfig$BottomSheetMargins implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C55344OhA(60);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
    }

    public CdsOpenScreenConfig$BottomSheetMargins(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }
}
