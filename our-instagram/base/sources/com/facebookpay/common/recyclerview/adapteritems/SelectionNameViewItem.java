package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC69837VwN;
import X.C14360o3;
import X.C70221WIe;
import X.VG3;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class SelectionNameViewItem implements BaseSelectionCheckoutItem {
    public static final Parcelable.Creator CREATOR = new C70221WIe(22);
    public Integer A00;
    public String A01;
    public String A02;
    public final VG3 A03;
    public final String A04;

    public SelectionNameViewItem(VG3 vg3, Integer num, String str, String str2, String str3) {
        AbstractC167027dH.A0a(1, vg3, num, str, str2);
        this.A03 = vg3;
        this.A00 = num;
        this.A04 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem
    public final void Eda(Integer num) {
        C14360o3.A0B(num, 0);
        this.A00 = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A03);
        parcel.writeString(AbstractC69837VwN.A01(this.A00));
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A03;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem
    public final Integer Bsx() {
        return this.A00;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem
    public final String getId() {
        return this.A04;
    }
}
