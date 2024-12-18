package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.C14360o3;
import X.C63473SlE;
import X.R0Z;
import X.VG3;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class EmailOptInItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = new C63473SlE(99);
    public boolean A00;
    public final R0Z A01;
    public final VG3 A02;
    public final String A03;
    public final boolean A04;

    public EmailOptInItem(R0Z r0z, VG3 vg3, String str, boolean z, boolean z2) {
        C14360o3.A0B(vg3, 1);
        this.A02 = vg3;
        this.A00 = z;
        this.A01 = r0z;
        this.A03 = str;
        this.A04 = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A02);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeValue(this.A01);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A02;
    }

    public EmailOptInItem() {
        this(null, VG3.A0H, null, false, false);
    }
}
