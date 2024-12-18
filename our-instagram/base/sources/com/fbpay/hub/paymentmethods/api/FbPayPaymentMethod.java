package com.fbpay.hub.paymentmethods.api;

import X.AbstractC25235BEs;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.AbstractC58323PtF;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C63470SlB;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class FbPayPaymentMethod implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(39);
    public final int A00;
    public final Uri A01;
    public final FbPayBankAccount A02;
    public final FbPayCreditCard A03;
    public final FbPayPayPal A04;
    public final FbPayShopPay A05;
    public final String A06;
    public final String A07;
    public final FbPayNewCreditCardOption A08;
    public final FbPayNewPayPalOption A09;

    public FbPayPaymentMethod(Uri uri, FbPayBankAccount fbPayBankAccount, FbPayCreditCard fbPayCreditCard, FbPayPayPal fbPayPayPal, FbPayShopPay fbPayShopPay, String str, String str2, int i) {
        this.A02 = fbPayBankAccount;
        this.A03 = fbPayCreditCard;
        this.A04 = fbPayPayPal;
        this.A05 = fbPayShopPay;
        this.A01 = uri;
        this.A08 = null;
        this.A09 = null;
        this.A06 = str;
        this.A07 = str2;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayPaymentMethod) {
                FbPayPaymentMethod fbPayPaymentMethod = (FbPayPaymentMethod) obj;
                if (!C14360o3.A0K(this.A02, fbPayPaymentMethod.A02) || !C14360o3.A0K(this.A03, fbPayPaymentMethod.A03) || !C14360o3.A0K(this.A04, fbPayPaymentMethod.A04) || !C14360o3.A0K(this.A05, fbPayPaymentMethod.A05) || !C14360o3.A0K(this.A01, fbPayPaymentMethod.A01) || !C14360o3.A0K(this.A08, fbPayPaymentMethod.A08) || !C14360o3.A0K(this.A09, fbPayPaymentMethod.A09) || !C14360o3.A0K(this.A06, fbPayPaymentMethod.A06) || !C14360o3.A0K(this.A07, fbPayPaymentMethod.A07) || this.A00 != fbPayPaymentMethod.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((AbstractC63311ShH.A02(this.A02) * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + AbstractC25235BEs.A06(this.A04)) * 31) + AbstractC25235BEs.A06(this.A05)) * 31) + AbstractC25235BEs.A06(this.A01)) * 31) + AbstractC25235BEs.A06(this.A08)) * 31) + AbstractC25235BEs.A06(this.A09)) * 31) + AbstractC25235BEs.A06(this.A06)) * 31) + AbstractC25235BEs.A06(this.A07)) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58323PtF.A1A(parcel, this.A02, i);
        AbstractC58323PtF.A1A(parcel, this.A03, i);
        AbstractC58323PtF.A1A(parcel, this.A04, i);
        AbstractC58323PtF.A1A(parcel, this.A05, i);
        AbstractC58323PtF.A1A(parcel, this.A01, i);
        AbstractC58323PtF.A1A(parcel, this.A08, i);
        AbstractC58323PtF.A1A(parcel, this.A09, i);
        AbstractC58322PtE.A1E(parcel, this.A06, 0, 1);
        AbstractC58322PtE.A1E(parcel, this.A07, 0, 1);
        parcel.writeInt(this.A00);
    }

    public FbPayPaymentMethod(Parcel parcel) {
        ClassLoader A0g = AbstractC58319PtB.A0g(this);
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (FbPayBankAccount) parcel.readParcelable(A0g);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (FbPayCreditCard) parcel.readParcelable(A0g);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (FbPayPayPal) parcel.readParcelable(A0g);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (FbPayShopPay) parcel.readParcelable(A0g);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (Uri) parcel.readParcelable(A0g);
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (FbPayNewCreditCardOption) parcel.readParcelable(A0g);
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (FbPayNewPayPalOption) parcel.readParcelable(A0g);
        }
        this.A06 = parcel.readInt() != 0 ? parcel.readString() : null;
        this.A07 = AbstractC58322PtE.A0n(parcel);
        this.A00 = parcel.readInt();
    }
}
