package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.AbstractC31181DnP;
import X.C14360o3;
import X.C70221WIe;
import X.VG3;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.paymentmethod.model.PaymentMethod;

/* loaded from: classes11.dex */
public final class PuxPaymentMethodItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = new C70221WIe(12);
    public final VG3 A00;
    public final PaymentMethod A01;
    public final Integer A02;
    public final boolean A03;
    public final boolean A04;

    public PuxPaymentMethodItem(VG3 vg3, PaymentMethod paymentMethod, Integer num, boolean z, boolean z2) {
        C14360o3.A0B(vg3, 1);
        this.A00 = vg3;
        this.A01 = paymentMethod;
        this.A03 = z;
        this.A02 = num;
        this.A04 = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A00);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A02));
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A00;
    }

    public PuxPaymentMethodItem() {
        this(VG3.A0h, null, null, false, true);
    }
}
