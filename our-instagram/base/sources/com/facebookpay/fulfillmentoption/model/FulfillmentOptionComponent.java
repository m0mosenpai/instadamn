package com.facebookpay.fulfillmentoption.model;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25235BEs;
import X.AbstractC37304Gc5;
import X.C14360o3;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;

/* loaded from: classes11.dex */
public class FulfillmentOptionComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63470SlB(3);
    public final CurrencyAmount A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final CurrencyAmount A00() {
        if (this instanceof ShippingFulfillmentOptionComponent) {
            return ((ShippingFulfillmentOptionComponent) this).A00;
        }
        if (this instanceof PickupFulfillmentOptionComponent) {
            return ((PickupFulfillmentOptionComponent) this).A00;
        }
        return this.A00;
    }

    public final String A01() {
        if (this instanceof ShippingFulfillmentOptionComponent) {
            return ((ShippingFulfillmentOptionComponent) this).A01;
        }
        if (this instanceof PickupFulfillmentOptionComponent) {
            return ((PickupFulfillmentOptionComponent) this).A04;
        }
        return this.A01;
    }

    public final String A02() {
        if (this instanceof ShippingFulfillmentOptionComponent) {
            return ((ShippingFulfillmentOptionComponent) this).A02;
        }
        if (this instanceof PickupFulfillmentOptionComponent) {
            return ((PickupFulfillmentOptionComponent) this).A05;
        }
        return this.A02;
    }

    public final String A03() {
        if (this instanceof ShippingFulfillmentOptionComponent) {
            return ((ShippingFulfillmentOptionComponent) this).A03;
        }
        if (this instanceof PickupFulfillmentOptionComponent) {
            return ((PickupFulfillmentOptionComponent) this).A06;
        }
        return this.A03;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FulfillmentOptionComponent) {
            FulfillmentOptionComponent fulfillmentOptionComponent = (FulfillmentOptionComponent) obj;
            if (C14360o3.A0K(A02(), fulfillmentOptionComponent.A02()) && C14360o3.A0K(A03(), fulfillmentOptionComponent.A03()) && C14360o3.A0K(A00(), fulfillmentOptionComponent.A00()) && C14360o3.A0K(A01(), fulfillmentOptionComponent.A01())) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this instanceof ShippingFulfillmentOptionComponent) {
            ShippingFulfillmentOptionComponent shippingFulfillmentOptionComponent = (ShippingFulfillmentOptionComponent) this;
            C14360o3.A0B(parcel, 0);
            parcel.writeString(shippingFulfillmentOptionComponent.A02);
            parcel.writeString(shippingFulfillmentOptionComponent.A03);
            parcel.writeParcelable(shippingFulfillmentOptionComponent.A00, i);
            parcel.writeString(shippingFulfillmentOptionComponent.A01);
            parcel.writeSerializable(shippingFulfillmentOptionComponent.A05);
            parcel.writeSerializable(shippingFulfillmentOptionComponent.A04);
            return;
        }
        if (this instanceof PickupFulfillmentOptionComponent) {
            PickupFulfillmentOptionComponent pickupFulfillmentOptionComponent = (PickupFulfillmentOptionComponent) this;
            C14360o3.A0B(parcel, 0);
            parcel.writeString(pickupFulfillmentOptionComponent.A05);
            parcel.writeString(pickupFulfillmentOptionComponent.A06);
            parcel.writeParcelable(pickupFulfillmentOptionComponent.A00, i);
            parcel.writeString(pickupFulfillmentOptionComponent.A04);
            parcel.writeSerializable(pickupFulfillmentOptionComponent.A08);
            parcel.writeSerializable(pickupFulfillmentOptionComponent.A07);
            parcel.writeInt(AbstractC37304Gc5.A1Y(parcel, pickupFulfillmentOptionComponent.A03) ? 1 : 0);
            parcel.writeParcelable(pickupFulfillmentOptionComponent.A02, i);
            parcel.writeParcelable(pickupFulfillmentOptionComponent.A01, i);
            parcel.writeInt(pickupFulfillmentOptionComponent.A09 ? 1 : 0);
            return;
        }
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    public FulfillmentOptionComponent(CurrencyAmount currencyAmount, String str, String str2, String str3) {
        AbstractC167017dG.A1P(str, str2);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = currencyAmount;
        this.A01 = str3;
    }

    public final int hashCode() {
        int i = 0;
        int A0K = (AbstractC166997dE.A0K(A03(), A02().hashCode() * 31) + AbstractC25235BEs.A06(A00())) * 31;
        String A01 = A01();
        if (A01 != null) {
            i = A01.hashCode();
        }
        return A0K + i;
    }
}
