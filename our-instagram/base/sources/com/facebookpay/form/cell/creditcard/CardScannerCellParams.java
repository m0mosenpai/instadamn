package com.facebookpay.form.cell.creditcard;

import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.CellParams;

/* loaded from: classes11.dex */
public final class CardScannerCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = new C70221WIe(73);
    public final boolean A00;
    public final int A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebookpay.form.cell.CellParams, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public CardScannerCellParams(int i, boolean z) {
        super(i);
        this.A01 = i;
        this.A00 = z;
    }

    public CardScannerCellParams() {
        this(0, false);
    }
}
