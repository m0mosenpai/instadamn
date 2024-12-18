package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC25234BEr;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class PaymentMethodImpl extends C0T6 implements Parcelable, PaymentMethod {
    public static final Parcelable.Creator CREATOR = C41855Ig9.A00(32);
    public final CreditCardAssociation A00;
    public final FundingSourceType A01;
    public final String A02;
    public final String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PaymentMethodImpl) {
                PaymentMethodImpl paymentMethodImpl = (PaymentMethodImpl) obj;
                if (this.A00 != paymentMethodImpl.A00 || this.A01 != paymentMethodImpl.A01 || !C14360o3.A0K(this.A02, paymentMethodImpl.A02) || !C14360o3.A0K(this.A03, paymentMethodImpl.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    @Override // com.instagram.api.schemas.PaymentMethod
    public final FundingSourceType Bbq() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A03, (AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00)) + AbstractC167017dG.A0O(this.A02)) * 31);
    }

    public PaymentMethodImpl(CreditCardAssociation creditCardAssociation, FundingSourceType fundingSourceType, String str, String str2) {
        AbstractC25234BEr.A1P(creditCardAssociation, fundingSourceType, str2);
        this.A00 = creditCardAssociation;
        this.A01 = fundingSourceType;
        this.A02 = str;
        this.A03 = str2;
    }
}
