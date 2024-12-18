package com.facebookpay.form.cell.apm;

import X.C14360o3;
import X.C67659Uur;
import X.C70221WIe;
import android.os.Parcel;
import com.facebookpay.form.cell.CellParams;

/* loaded from: classes11.dex */
public final class APMLinkCellParams extends CellParams {
    public static final C70221WIe CREATOR = new C70221WIe(70);
    public final int A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebookpay.form.cell.CellParams, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
    }

    public APMLinkCellParams(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readString();
    }

    public APMLinkCellParams(C67659Uur c67659Uur) {
        super(c67659Uur);
        this.A00 = 2131961503;
        this.A01 = c67659Uur.A00;
    }
}
