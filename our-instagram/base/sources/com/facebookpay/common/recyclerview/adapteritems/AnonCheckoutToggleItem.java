package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.C14360o3;
import X.C63473SlE;
import X.R0Z;
import X.VG3;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class AnonCheckoutToggleItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = new C63473SlE(93);
    public final R0Z A00;
    public final R0Z A01;
    public final boolean A02;
    public final VG3 A03;

    public AnonCheckoutToggleItem(R0Z r0z, R0Z r0z2, VG3 vg3, boolean z) {
        C14360o3.A0B(vg3, 1);
        this.A03 = vg3;
        this.A02 = z;
        this.A01 = r0z;
        this.A00 = r0z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A03);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeValue(this.A01);
        parcel.writeValue(this.A00);
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A03;
    }

    public AnonCheckoutToggleItem() {
        this(null, null, VG3.A0A, false);
    }
}
