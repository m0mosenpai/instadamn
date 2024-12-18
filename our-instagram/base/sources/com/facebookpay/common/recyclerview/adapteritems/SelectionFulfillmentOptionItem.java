package com.facebookpay.common.recyclerview.adapteritems;

import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC37304Gc5;
import X.AbstractC69837VwN;
import X.C14360o3;
import X.C70221WIe;
import X.VG3;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;

/* loaded from: classes11.dex */
public class SelectionFulfillmentOptionItem implements BaseSelectionCheckoutItem {
    public static final Parcelable.Creator CREATOR = new C70221WIe(19);
    public Integer A00;
    public final CurrencyAmount A01;
    public final VG3 A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public SelectionFulfillmentOptionItem(CurrencyAmount currencyAmount, VG3 vg3, Integer num, String str, String str2, String str3) {
        AbstractC167027dH.A0a(1, vg3, num, str, str2);
        this.A02 = vg3;
        this.A00 = num;
        this.A04 = str;
        this.A05 = str2;
        this.A01 = currencyAmount;
        this.A03 = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final CurrencyAmount A00() {
        if (this instanceof SelectionShippingFulfillmentOptionItem) {
            return ((SelectionShippingFulfillmentOptionItem) this).A01;
        }
        if (this instanceof SelectionPickupFulfillmentOptionItem) {
            return ((SelectionPickupFulfillmentOptionItem) this).A01;
        }
        return this.A01;
    }

    public final String A01() {
        if (this instanceof SelectionShippingFulfillmentOptionItem) {
            return ((SelectionShippingFulfillmentOptionItem) this).A03;
        }
        if (this instanceof SelectionPickupFulfillmentOptionItem) {
            return ((SelectionPickupFulfillmentOptionItem) this).A06;
        }
        return this.A03;
    }

    public final String A02() {
        if (this instanceof SelectionShippingFulfillmentOptionItem) {
            return ((SelectionShippingFulfillmentOptionItem) this).A05;
        }
        if (this instanceof SelectionPickupFulfillmentOptionItem) {
            return ((SelectionPickupFulfillmentOptionItem) this).A08;
        }
        return this.A05;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public final VG3 BKB() {
        if (this instanceof SelectionShippingFulfillmentOptionItem) {
            return ((SelectionShippingFulfillmentOptionItem) this).A02;
        }
        if (this instanceof SelectionPickupFulfillmentOptionItem) {
            return ((SelectionPickupFulfillmentOptionItem) this).A03;
        }
        return this.A02;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem
    public final Integer Bsx() {
        if (this instanceof SelectionShippingFulfillmentOptionItem) {
            return ((SelectionShippingFulfillmentOptionItem) this).A00;
        }
        if (this instanceof SelectionPickupFulfillmentOptionItem) {
            return ((SelectionPickupFulfillmentOptionItem) this).A00;
        }
        return this.A00;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem
    public final void Eda(Integer num) {
        if (this instanceof SelectionShippingFulfillmentOptionItem) {
            C14360o3.A0B(num, 0);
            ((SelectionShippingFulfillmentOptionItem) this).A00 = num;
        } else if (this instanceof SelectionPickupFulfillmentOptionItem) {
            C14360o3.A0B(num, 0);
            ((SelectionPickupFulfillmentOptionItem) this).A00 = num;
        } else {
            C14360o3.A0B(num, 0);
            this.A00 = num;
        }
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem
    public final String getId() {
        if (this instanceof SelectionShippingFulfillmentOptionItem) {
            return ((SelectionShippingFulfillmentOptionItem) this).A04;
        }
        if (this instanceof SelectionPickupFulfillmentOptionItem) {
            return ((SelectionPickupFulfillmentOptionItem) this).A07;
        }
        return this.A04;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this instanceof SelectionShippingFulfillmentOptionItem) {
            SelectionShippingFulfillmentOptionItem selectionShippingFulfillmentOptionItem = (SelectionShippingFulfillmentOptionItem) this;
            C14360o3.A0B(parcel, 0);
            AbstractC166997dE.A1I(parcel, selectionShippingFulfillmentOptionItem.A02);
            parcel.writeString(AbstractC69837VwN.A01(selectionShippingFulfillmentOptionItem.A00));
            parcel.writeString(selectionShippingFulfillmentOptionItem.A04);
            parcel.writeString(selectionShippingFulfillmentOptionItem.A05);
            parcel.writeParcelable(selectionShippingFulfillmentOptionItem.A01, i);
            parcel.writeString(selectionShippingFulfillmentOptionItem.A03);
            parcel.writeSerializable(selectionShippingFulfillmentOptionItem.A07);
            parcel.writeSerializable(selectionShippingFulfillmentOptionItem.A06);
            return;
        }
        if (this instanceof SelectionPickupFulfillmentOptionItem) {
            SelectionPickupFulfillmentOptionItem selectionPickupFulfillmentOptionItem = (SelectionPickupFulfillmentOptionItem) this;
            C14360o3.A0B(parcel, 0);
            AbstractC166997dE.A1I(parcel, selectionPickupFulfillmentOptionItem.A03);
            parcel.writeString(AbstractC69837VwN.A01(selectionPickupFulfillmentOptionItem.A00));
            parcel.writeString(selectionPickupFulfillmentOptionItem.A07);
            parcel.writeString(selectionPickupFulfillmentOptionItem.A08);
            parcel.writeParcelable(selectionPickupFulfillmentOptionItem.A01, i);
            parcel.writeString(selectionPickupFulfillmentOptionItem.A06);
            parcel.writeSerializable(selectionPickupFulfillmentOptionItem.A0A);
            parcel.writeSerializable(selectionPickupFulfillmentOptionItem.A09);
            parcel.writeParcelable(selectionPickupFulfillmentOptionItem.A04, i);
            parcel.writeInt(AbstractC37304Gc5.A1Y(parcel, selectionPickupFulfillmentOptionItem.A05) ? 1 : 0);
            parcel.writeParcelable(selectionPickupFulfillmentOptionItem.A02, i);
            parcel.writeInt(selectionPickupFulfillmentOptionItem.A0B ? 1 : 0);
            return;
        }
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A02);
        parcel.writeString(AbstractC69837VwN.A01(this.A00));
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A03);
    }
}
