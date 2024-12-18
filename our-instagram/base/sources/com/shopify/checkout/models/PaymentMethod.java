package com.shopify.checkout.models;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC68612VXn;
import X.C00O;
import X.C14360o3;
import X.C3R9;
import X.JQ0;
import X.X15;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class PaymentMethod {
    public static final Companion Companion = new Object();
    public final Address A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X15.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PaymentMethod) {
                PaymentMethod paymentMethod = (PaymentMethod) obj;
                if (!C14360o3.A0K(this.A05, paymentMethod.A05) || !C14360o3.A0K(this.A01, paymentMethod.A01) || !C14360o3.A0K(this.A04, paymentMethod.A04) || !C14360o3.A0K(this.A02, paymentMethod.A02) || !C14360o3.A0K(this.A03, paymentMethod.A03) || !C14360o3.A0K(this.A00, paymentMethod.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ PaymentMethod(Address address, String str, String str2, String str3, String str4, String str5, int i) {
        if (63 != (i & 63)) {
            AbstractC68612VXn.A00(X15.A01, i, 63);
            throw C00O.createAndThrow();
        }
        this.A05 = str;
        this.A01 = str2;
        this.A04 = str3;
        this.A02 = str4;
        this.A03 = str5;
        this.A00 = address;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A01, this.A05.hashCode() * 31)))) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaymentMethod(referenceId=");
        sb.append(this.A05);
        sb.append(", cardType=");
        sb.append(this.A01);
        sb.append(", lastFourDigits=");
        sb.append(this.A04);
        sb.append(", expirationMonth=");
        sb.append(this.A02);
        sb.append(", expirationYear=");
        sb.append(this.A03);
        sb.append(", billingAddress=");
        return AbstractC167017dG.A0o(this.A00, sb);
    }

    public PaymentMethod(Address address, String str, String str2, String str3, String str4, String str5) {
        JQ0.A1O(str, str2, str3, str4, str5);
        this.A05 = str;
        this.A01 = str2;
        this.A04 = str3;
        this.A02 = str4;
        this.A03 = str5;
        this.A00 = address;
    }
}
