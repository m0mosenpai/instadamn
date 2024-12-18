package com.facebookpay.expresscheckout.models;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25231BEo;
import X.AbstractC25234BEr;
import X.AbstractC37302Gc3;
import X.AbstractC65703TsZ;
import X.C14360o3;
import X.C70221WIe;
import X.EnumC72407Xcu;
import X.VD7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes11.dex */
public final class ECPPaymentResponseParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(48);

    @SerializedName("externalConfirmationUrl")
    public String A00;

    @SerializedName("fulfillmentOption")
    public final FulfillmentOption A01;

    @SerializedName("shippingOption")
    public final ShippingOption A02;

    @SerializedName("transactionInfo")
    public final TransactionInfo A03;

    @SerializedName("credentialType")
    public final EnumC72407Xcu A04;

    @SerializedName("otcInput")
    public final OtcInput A05;

    @SerializedName("billingAddress")
    public final ShippingAddress A06;

    @SerializedName("shippingAddress")
    public final ShippingAddress A07;

    @SerializedName("credentialId")
    public final Long A08;

    @SerializedName("containerDescription")
    public final String A09;

    @SerializedName("containerExternalId")
    public final String A0A;

    @SerializedName("containerId")
    public final String A0B;

    @SerializedName("containerType")
    public final String A0C;

    @SerializedName("merchantName")
    public final String A0D;

    @SerializedName("orderId")
    public final String A0E;

    @SerializedName("payerEmail")
    public final String A0F;

    @SerializedName("payerName")
    public final String A0G;

    @SerializedName("payerPhone")
    public final String A0H;

    @SerializedName("paymentContainer")
    public final String A0I;

    @SerializedName("paymentMode")
    public final String A0J;

    @SerializedName("pickupEmail")
    public final String A0K;

    @SerializedName("pickupName")
    public final String A0L;

    @SerializedName("pickupNotes")
    public final String A0M;

    @SerializedName("pickupPhone")
    public final String A0N;

    @SerializedName("productId")
    public final String A0O;

    @SerializedName("receiverId")
    public final String A0P;

    @SerializedName("requestId")
    public final String A0Q;

    @SerializedName("sessionId")
    public final String A0R;

    @SerializedName("appliedOffers")
    public final List<ECPOffer> A0S;

    @SerializedName("isEmailOptInToggleOn")
    public final boolean A0T;

    @SerializedName("apiVersion")
    public final int A0U;

    @SerializedName("checkoutConfigReturnFields")
    public final Set<VD7> A0V;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0R);
        parcel.writeInt(this.A0U);
        parcel.writeString(this.A0Q);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0N);
        parcel.writeString(this.A0M);
        parcel.writeParcelable(this.A07, i);
        parcel.writeParcelable(this.A06, i);
        ShippingOption shippingOption = this.A02;
        if (shippingOption == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingOption.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.A01, i);
        Set<VD7> set = this.A0V;
        if (set == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0h = AbstractC37302Gc3.A0h(parcel, set);
            while (A0h.hasNext()) {
                AbstractC166997dE.A1I(parcel, (VD7) A0h.next());
            }
        }
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0O);
        parcel.writeParcelable(this.A05, i);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A0S);
        while (A0u.hasNext()) {
            ((ECPOffer) A0u.next()).writeToParcel(parcel, i);
        }
        this.A03.writeToParcel(parcel, i);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A0T ? 1 : 0);
        AbstractC65703TsZ.A1H(parcel, this.A04);
        Long l = this.A08;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.A00);
    }

    public ECPPaymentResponseParams(FulfillmentOption fulfillmentOption, ShippingOption shippingOption, TransactionInfo transactionInfo, EnumC72407Xcu enumC72407Xcu, OtcInput otcInput, ShippingAddress shippingAddress, ShippingAddress shippingAddress2, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, List list, Set set, int i, boolean z) {
        AbstractC25234BEr.A0j(1, str, str2, str3, str4);
        AbstractC167007dF.A1I(str5, 6, str7);
        C14360o3.A0B(str15, 21);
        C14360o3.A0B(str16, 22);
        C14360o3.A0B(str18, 24);
        C14360o3.A0B(transactionInfo, 27);
        this.A0R = str;
        this.A0U = i;
        this.A0Q = str2;
        this.A0A = str3;
        this.A0B = str4;
        this.A09 = str5;
        this.A0I = str6;
        this.A0J = str7;
        this.A0G = str8;
        this.A0F = str9;
        this.A0H = str10;
        this.A0L = str11;
        this.A0K = str12;
        this.A0N = str13;
        this.A0M = str14;
        this.A07 = shippingAddress;
        this.A06 = shippingAddress2;
        this.A02 = shippingOption;
        this.A01 = fulfillmentOption;
        this.A0V = set;
        this.A0E = str15;
        this.A0P = str16;
        this.A0D = str17;
        this.A0O = str18;
        this.A05 = otcInput;
        this.A0S = list;
        this.A03 = transactionInfo;
        this.A0C = str19;
        this.A0T = z;
        this.A04 = enumC72407Xcu;
        this.A08 = l;
        this.A00 = str20;
    }
}
