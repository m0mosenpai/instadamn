package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.AbstractC25234BEr;
import X.C14360o3;
import X.C63473SlE;
import X.VG3;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class ConfirmationPaymentSectionItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = new C63473SlE(96);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final VG3 A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A04);
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A05;
    }

    public ConfirmationPaymentSectionItem(VG3 vg3, String str, String str2, String str3, String str4, String str5) {
        AbstractC25234BEr.A1P(vg3, str, str3);
        C14360o3.A0B(str4, 5);
        this.A05 = vg3;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = str4;
        this.A04 = str5;
    }
}
