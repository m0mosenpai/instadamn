package com.facebookpay.expresscheckout.models;

import X.AbstractC166997dE;
import X.AbstractC25233BEq;
import X.AbstractC25234BEr;
import X.AbstractC37302Gc3;
import X.C14360o3;
import X.C70221WIe;
import X.VD7;
import X.VDD;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.logging.LoggingPolicy;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes11.dex */
public final class ECPAvailabilityRequestParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(42);

    @SerializedName("apiVersion")
    public final int A00;

    @SerializedName("paymentConfiguration")
    public final ECPPaymentConfiguration A01;

    @SerializedName("receiverInfo")
    public final PaymentReceiverInfo A02;

    @SerializedName("loggingPolicy")
    public final LoggingPolicy A03;

    @SerializedName("productId")
    public final String A04;

    @SerializedName("requestId")
    public final String A05;

    @SerializedName("securityOrigin")
    public final String A06;

    @SerializedName("sessionId")
    public final String A07;

    @SerializedName("optionalFields")
    public final Set<VDD> A08;

    @SerializedName("returnFields")
    public final Set<VD7> A09;
    public final boolean A0A;

    @SerializedName("getDefaultPaymentMethodFields")
    public final boolean A0B;
    public final boolean A0C;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A00);
        this.A02.writeToParcel(parcel, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        Iterator A0h = AbstractC37302Gc3.A0h(parcel, this.A08);
        while (A0h.hasNext()) {
            AbstractC166997dE.A1I(parcel, (VDD) A0h.next());
        }
        Iterator A0h2 = AbstractC37302Gc3.A0h(parcel, this.A09);
        while (A0h2.hasNext()) {
            AbstractC166997dE.A1I(parcel, (VD7) A0h2.next());
        }
        this.A01.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
    }

    public ECPAvailabilityRequestParams(ECPPaymentConfiguration eCPPaymentConfiguration, PaymentReceiverInfo paymentReceiverInfo, LoggingPolicy loggingPolicy, String str, String str2, String str3, String str4, Set set, Set set2, int i, boolean z, boolean z2, boolean z3) {
        AbstractC25234BEr.A1P(str, str2, paymentReceiverInfo);
        C14360o3.A0B(str3, 5);
        AbstractC25233BEq.A0y(6, str4, set2, eCPPaymentConfiguration);
        C14360o3.A0B(loggingPolicy, 10);
        this.A07 = str;
        this.A05 = str2;
        this.A00 = i;
        this.A02 = paymentReceiverInfo;
        this.A04 = str3;
        this.A06 = str4;
        this.A08 = set;
        this.A09 = set2;
        this.A01 = eCPPaymentConfiguration;
        this.A03 = loggingPolicy;
        this.A0B = z;
        this.A0A = z2;
        this.A0C = z3;
    }
}
