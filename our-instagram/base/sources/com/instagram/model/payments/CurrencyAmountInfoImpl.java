package com.instagram.model.payments;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC31181DnP;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C55343Oh9;
import X.I2O;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class CurrencyAmountInfoImpl extends C0T6 implements Parcelable, CurrencyAmountInfo {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(89);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // com.instagram.model.payments.CurrencyAmountInfo
    public final CurrencyAmountInfoImpl F5F() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CurrencyAmountInfoImpl) {
                CurrencyAmountInfoImpl currencyAmountInfoImpl = (CurrencyAmountInfoImpl) obj;
                if (!C14360o3.A0K(this.A01, currencyAmountInfoImpl.A01) || !C14360o3.A0K(this.A02, currencyAmountInfoImpl.A02) || !C14360o3.A0K(this.A03, currencyAmountInfoImpl.A03) || !C14360o3.A0K(this.A00, currencyAmountInfoImpl.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A00));
    }

    @Override // com.instagram.model.payments.CurrencyAmountInfo
    public final Integer BYa() {
        return this.A00;
    }

    @Override // com.instagram.model.payments.CurrencyAmountInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTCurrencyAmountDict", I2O.A00(this));
    }

    @Override // com.instagram.model.payments.CurrencyAmountInfo
    public final String getAmount() {
        return this.A01;
    }

    @Override // com.instagram.model.payments.CurrencyAmountInfo
    public final String getAmountWithOffset() {
        return this.A02;
    }

    @Override // com.instagram.model.payments.CurrencyAmountInfo
    public final String getCurrency() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public CurrencyAmountInfoImpl(Integer num, String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = num;
    }
}
