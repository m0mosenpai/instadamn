package com.facebookpay.form.cell.contactinfo;

import X.C14360o3;
import X.C67524UnO;
import X.C70221WIe;
import android.os.Parcel;
import com.facebookpay.form.cell.CellParams;

/* loaded from: classes11.dex */
public final class ContactInfoCellParams extends CellParams {
    public static final C70221WIe CREATOR = new C70221WIe(72);
    public int A00;
    public C67524UnO A01;
    public C67524UnO A02;
    public C67524UnO A03;
    public boolean A04;
    public boolean A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebookpay.form.cell.CellParams, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
    }
}
