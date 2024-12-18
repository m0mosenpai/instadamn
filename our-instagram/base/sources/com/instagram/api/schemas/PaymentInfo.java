package com.instagram.api.schemas;

import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C0T6;
import X.C14360o3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class PaymentInfo extends C0T6 implements Parcelable, PaymentInfoIntf {
    public static final Parcelable.Creator CREATOR = new C41855Ig9(31);
    public final PaymentMethod A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final boolean A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PaymentInfo) {
                PaymentInfo paymentInfo = (PaymentInfo) obj;
                if (!C14360o3.A0K(this.A01, paymentInfo.A01) || !C14360o3.A0K(this.A02, paymentInfo.A02) || !C14360o3.A0K(this.A03, paymentInfo.A03) || this.A04 != paymentInfo.A04 || !C14360o3.A0K(this.A00, paymentInfo.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC167027dH.A0o(parcel, this.A01, 0, 1);
        AbstractC167027dH.A0o(parcel, this.A02, 0, 1);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        int i = 0;
        int A0D = AbstractC167007dF.A0D(this.A04, ((((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31);
        PaymentMethod paymentMethod = this.A00;
        if (paymentMethod != null) {
            i = paymentMethod.hashCode();
        }
        return A0D + i;
    }

    public PaymentInfo(PaymentMethod paymentMethod, Integer num, Integer num2, String str, boolean z) {
        this.A01 = num;
        this.A02 = num2;
        this.A03 = str;
        this.A04 = z;
        this.A00 = paymentMethod;
    }
}
