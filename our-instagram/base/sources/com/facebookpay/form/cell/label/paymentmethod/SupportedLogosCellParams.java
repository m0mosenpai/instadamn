package com.facebookpay.form.cell.label.paymentmethod;

import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import com.facebookpay.form.cell.CellParams;
import java.util.List;

/* loaded from: classes11.dex */
public final class SupportedLogosCellParams extends CellParams {
    public static final C70221WIe CREATOR = new C70221WIe(78);
    public List A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebookpay.form.cell.CellParams, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeList(this.A00);
    }
}
