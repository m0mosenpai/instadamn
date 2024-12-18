package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.C14360o3;
import X.C70221WIe;
import X.VG3;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class PuxReceiverHeaderItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = new C70221WIe(14);
    public final VG3 A00;
    public final String A01;
    public final String A02;

    public PuxReceiverHeaderItem(VG3 vg3, String str, String str2) {
        C14360o3.A0B(vg3, 1);
        this.A00 = vg3;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A00;
    }
}
