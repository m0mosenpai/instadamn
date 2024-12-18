package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C70221WIe;
import X.VG3;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.models.ItemDetails;

/* loaded from: classes11.dex */
public final class PuxEntityItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = new C70221WIe(9);
    public final CurrencyAmount A00;
    public final ItemDetails A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final VG3 A06;
    public final String A07;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A06;
    }

    public PuxEntityItem(CurrencyAmount currencyAmount, VG3 vg3, ItemDetails itemDetails, String str, String str2, String str3, String str4, String str5) {
        AbstractC167017dG.A1Q(vg3, str2);
        C14360o3.A0B(itemDetails, 5);
        C14360o3.A0B(currencyAmount, 7);
        this.A06 = vg3;
        this.A07 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A01 = itemDetails;
        this.A05 = str4;
        this.A00 = currencyAmount;
        this.A03 = str5;
    }
}
