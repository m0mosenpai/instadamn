package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.C14360o3;
import X.C70221WIe;
import X.VG3;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;

/* loaded from: classes11.dex */
public final class PayButtonItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = new C70221WIe(5);
    public final CurrencyAmount A00;
    public final VG3 A01;
    public final String A02;
    public final boolean A03;

    public PayButtonItem(CurrencyAmount currencyAmount, VG3 vg3, String str, boolean z) {
        C14360o3.A0B(vg3, 1);
        this.A01 = vg3;
        this.A00 = currencyAmount;
        this.A03 = z;
        this.A02 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A02);
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A01;
    }
}
