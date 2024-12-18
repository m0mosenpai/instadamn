package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.C14360o3;
import X.C70221WIe;
import X.VG3;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class SelectionOfferViewItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = new C70221WIe(23);
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public final VG3 A06;

    public SelectionOfferViewItem(VG3 vg3, String str, String str2, String str3, String str4, String str5, boolean z) {
        C14360o3.A0B(vg3, 1);
        this.A06 = vg3;
        this.A03 = str;
        this.A01 = str2;
        this.A04 = str3;
        this.A00 = str4;
        this.A02 = str5;
        this.A05 = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A06);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A05 ? 1 : 0);
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A06;
    }

    public SelectionOfferViewItem() {
        this(VG3.A0r, null, null, null, null, null, false);
    }
}
