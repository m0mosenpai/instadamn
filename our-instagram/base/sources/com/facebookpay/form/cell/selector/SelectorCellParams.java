package com.facebookpay.form.cell.selector;

import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.CellParams;

/* loaded from: classes11.dex */
public final class SelectorCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = new C70221WIe(82);
    public final int A00;
    public final int A01;
    public final String A02;
    public final int[] A03;
    public final int A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebookpay.form.cell.CellParams, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A04);
        parcel.writeIntArray(this.A03);
        parcel.writeInt(this.A01);
    }

    public SelectorCellParams(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
        this.A02 = parcel.readString();
        int readInt = parcel.readInt();
        this.A04 = readInt;
        int[] iArr = new int[readInt];
        this.A03 = iArr;
        parcel.readIntArray(iArr);
        this.A01 = parcel.readInt();
    }
}
