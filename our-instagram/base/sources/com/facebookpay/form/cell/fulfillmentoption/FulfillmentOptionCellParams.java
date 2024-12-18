package com.facebookpay.form.cell.fulfillmentoption;

import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import com.facebookpay.form.cell.CellParams;

/* loaded from: classes11.dex */
public final class FulfillmentOptionCellParams extends CellParams {
    public static final C70221WIe CREATOR = new C70221WIe(75);
    public int A00;
    public int A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebookpay.form.cell.CellParams, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
