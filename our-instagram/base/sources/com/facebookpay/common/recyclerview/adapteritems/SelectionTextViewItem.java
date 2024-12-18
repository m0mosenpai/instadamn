package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.AbstractC31181DnP;
import X.C14360o3;
import X.C70221WIe;
import X.VG3;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class SelectionTextViewItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = new C70221WIe(30);
    public Integer A00;
    public String A01;
    public boolean A02;
    public final VG3 A03;

    public SelectionTextViewItem(VG3 vg3, Integer num, String str, boolean z) {
        C14360o3.A0B(vg3, 1);
        this.A03 = vg3;
        this.A01 = str;
        this.A00 = num;
        this.A02 = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A03);
        parcel.writeString(this.A01);
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A00));
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A03;
    }

    public SelectionTextViewItem() {
        this(VG3.A0u, null, null, false);
    }
}
