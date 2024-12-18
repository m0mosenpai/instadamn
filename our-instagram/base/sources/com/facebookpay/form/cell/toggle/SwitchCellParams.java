package com.facebookpay.form.cell.toggle;

import X.AbstractC37304Gc5;
import X.C67660Uus;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.CellParams;

/* loaded from: classes11.dex */
public class SwitchCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = new C70221WIe(91);
    public final int A00;
    public final boolean A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public SwitchCellParams(Parcel parcel) {
        super(parcel);
        this.A01 = AbstractC37304Gc5.A1X(parcel);
        this.A00 = parcel.readInt();
    }

    @Override // com.facebookpay.form.cell.CellParams, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A01 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.A00);
    }

    public SwitchCellParams(C67660Uus c67660Uus) {
        super(c67660Uus);
        this.A01 = c67660Uus.A00;
        this.A00 = 2131954915;
    }
}
