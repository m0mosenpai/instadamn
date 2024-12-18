package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.AbstractC69840VwQ;
import X.AbstractC69841VwR;
import X.C05F;
import X.C14360o3;
import X.C70221WIe;
import X.VG3;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent;

/* loaded from: classes11.dex */
public final class PuxFulfillmentOptionItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = new C70221WIe(10);
    public final VG3 A00;
    public final FulfillmentOptionComponent A01;
    public final Integer A02;
    public final Integer A03;
    public final boolean A04;
    public final boolean A05;

    public PuxFulfillmentOptionItem(VG3 vg3, FulfillmentOptionComponent fulfillmentOptionComponent, Integer num, Integer num2, boolean z, boolean z2) {
        C14360o3.A0B(vg3, 1);
        this.A00 = vg3;
        this.A01 = fulfillmentOptionComponent;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = num;
        this.A02 = num2;
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
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        Integer num = this.A03;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(AbstractC69841VwR.A01(num));
        }
        Integer num2 = this.A02;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(AbstractC69840VwQ.A01(num2));
        }
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A00;
    }

    public PuxFulfillmentOptionItem() {
        this(VG3.A0e, null, C05F.A00, null, false, false);
    }
}
