package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.C14360o3;
import X.C70221WIe;
import X.VG3;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.shippingaddress.model.ShippingAddress;

/* loaded from: classes11.dex */
public final class PuxShippingAddressItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = new C70221WIe(15);
    public final VG3 A00;
    public final ShippingAddress A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public PuxShippingAddressItem(VG3 vg3, ShippingAddress shippingAddress, String str, String str2, String str3, boolean z) {
        C14360o3.A0B(vg3, 1);
        this.A00 = vg3;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A01 = shippingAddress;
        this.A05 = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A05 ? 1 : 0);
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A00;
    }

    public PuxShippingAddressItem() {
        this(VG3.A0l, null, null, null, null, false);
    }
}
