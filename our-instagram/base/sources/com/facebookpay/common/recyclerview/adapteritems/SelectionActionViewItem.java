package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.C14360o3;
import X.C70221WIe;
import X.InterfaceC71897X9e;
import X.VG3;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class SelectionActionViewItem implements BaseCheckoutItem, InterfaceC71897X9e {
    public static final Parcelable.Creator CREATOR = new C70221WIe(17);
    public Integer A00;
    public String A01;
    public final Integer A02;
    public final VG3 A03;
    public final String A04;

    public SelectionActionViewItem(VG3 vg3, Integer num, Integer num2, String str, String str2) {
        C14360o3.A0B(vg3, 1);
        this.A03 = vg3;
        this.A02 = num;
        this.A04 = str;
        this.A01 = str2;
        this.A00 = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A03);
        AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        AbstractC167027dH.A0o(parcel, this.A00, 0, 1);
    }

    @Override // X.InterfaceC71897X9e
    public final Integer B7v() {
        return this.A02;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A03;
    }

    public SelectionActionViewItem() {
        this(VG3.A0n, null, null, null, null);
    }
}
