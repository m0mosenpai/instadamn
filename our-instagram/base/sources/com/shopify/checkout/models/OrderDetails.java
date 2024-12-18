package com.shopify.checkout.models;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC68612VXn;
import X.C00O;
import X.C14360o3;
import X.C3R9;
import X.C3SG;
import X.C71758X0x;
import X.X13;
import X.X14;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class OrderDetails {
    public final Address A00;
    public final Address A01;
    public final CartInfo A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public static final Companion Companion = new Object();
    public static final C3R9[] A08 = {null, null, null, null, null, new C3SG(X14.A00), new C3SG(C71758X0x.A00), null};

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X13.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OrderDetails) {
                OrderDetails orderDetails = (OrderDetails) obj;
                if (!C14360o3.A0K(this.A04, orderDetails.A04) || !C14360o3.A0K(this.A03, orderDetails.A03) || !C14360o3.A0K(this.A05, orderDetails.A05) || !C14360o3.A0K(this.A02, orderDetails.A02) || !C14360o3.A0K(this.A00, orderDetails.A00) || !C14360o3.A0K(this.A07, orderDetails.A07) || !C14360o3.A0K(this.A06, orderDetails.A06) || !C14360o3.A0K(this.A01, orderDetails.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ OrderDetails(Address address, Address address2, CartInfo cartInfo, String str, String str2, String str3, List list, List list2, int i) {
        if (41 != (i & 41)) {
            AbstractC68612VXn.A00(X13.A01, i, 41);
            throw C00O.createAndThrow();
        }
        this.A04 = str;
        if ((i & 2) != 0) {
            this.A03 = str2;
        }
        if ((i & 4) != 0) {
            this.A05 = str3;
        }
        this.A02 = cartInfo;
        if ((i & 16) != 0) {
            this.A00 = address;
        }
        this.A07 = list;
        if ((i & 64) != 0) {
            this.A06 = list2;
        }
        if ((i & 128) != 0) {
            this.A01 = address2;
        }
    }

    public final int hashCode() {
        int i = 0;
        int A0J = (AbstractC166997dE.A0J(this.A07, (AbstractC166997dE.A0J(this.A02, ((((this.A04.hashCode() * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31;
        Address address = this.A01;
        if (address != null) {
            i = address.hashCode();
        }
        return A0J + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OrderDetails(id=");
        sb.append(this.A04);
        sb.append(", email=");
        sb.append(this.A03);
        sb.append(", phone=");
        sb.append(this.A05);
        sb.append(", cart=");
        sb.append(this.A02);
        sb.append(", billingAddress=");
        sb.append(this.A00);
        sb.append(", paymentMethods=");
        sb.append(this.A07);
        sb.append(", deliveries=");
        sb.append(this.A06);
        sb.append(", shippingAddress=");
        return AbstractC167017dG.A0o(this.A01, sb);
    }
}
