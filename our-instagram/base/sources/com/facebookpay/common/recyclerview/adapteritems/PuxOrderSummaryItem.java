package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C70221WIe;
import X.MSZ;
import X.VG3;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.models.ItemDetails;
import java.util.List;

/* loaded from: classes11.dex */
public final class PuxOrderSummaryItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = new C70221WIe(11);
    public final int A00;
    public final CurrencyAmount A01;
    public final CurrencyAmount A02;
    public final VG3 A03;
    public final ItemDetails A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeStringList(this.A07);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeParcelable(this.A04, i);
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        return this.A03;
    }

    public PuxOrderSummaryItem(CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2, VG3 vg3, ItemDetails itemDetails, String str, String str2, List list, int i, boolean z, boolean z2, boolean z3) {
        MSZ.A1O(vg3, list);
        AbstractC167017dG.A1U(currencyAmount, currencyAmount2);
        C14360o3.A0B(itemDetails, 11);
        this.A03 = vg3;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = list;
        this.A00 = i;
        this.A02 = currencyAmount;
        this.A01 = currencyAmount2;
        this.A0A = z;
        this.A09 = z2;
        this.A08 = z3;
        this.A04 = itemDetails;
    }
}
