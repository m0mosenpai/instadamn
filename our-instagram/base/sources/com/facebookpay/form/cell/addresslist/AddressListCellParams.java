package com.facebookpay.form.cell.addresslist;

import X.C14360o3;
import android.os.Parcel;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.logging.LoggingContext;
import java.util.List;

/* loaded from: classes11.dex */
public final class AddressListCellParams extends CellParams {
    public int A00;
    public BaseCheckoutItem A01;
    public LoggingContext A02;
    public List A03;
    public boolean A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebookpay.form.cell.CellParams, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeList(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A04 ? 1 : 0);
    }
}
