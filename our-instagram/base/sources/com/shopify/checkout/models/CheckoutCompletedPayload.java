package com.shopify.checkout.models;

import X.AbstractC166997dE;
import X.AbstractC25236BEt;
import X.AbstractC68612VXn;
import X.C00O;
import X.C14360o3;
import X.C3R9;
import X.C71753X0s;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class CheckoutCompletedPayload {
    public static final Companion Companion = new Object();
    public final CartInfo A00;
    public final OrderDetails A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71753X0s.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutCompletedPayload) {
                CheckoutCompletedPayload checkoutCompletedPayload = (CheckoutCompletedPayload) obj;
                if (!C14360o3.A0K(this.A03, checkoutCompletedPayload.A03) || !C14360o3.A0K(this.A01, checkoutCompletedPayload.A01) || !C14360o3.A0K(this.A02, checkoutCompletedPayload.A02) || !C14360o3.A0K(this.A04, checkoutCompletedPayload.A04) || !C14360o3.A0K(this.A00, checkoutCompletedPayload.A00) || !C14360o3.A0K(this.A05, checkoutCompletedPayload.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ CheckoutCompletedPayload(CartInfo cartInfo, OrderDetails orderDetails, String str, String str2, String str3, String str4, int i) {
        if (63 != (i & 63)) {
            AbstractC68612VXn.A00(C71753X0s.A01, i, 63);
            throw C00O.createAndThrow();
        }
        this.A03 = str;
        this.A01 = orderDetails;
        this.A02 = str2;
        this.A04 = str3;
        this.A00 = cartInfo;
        this.A05 = str4;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0J(this.A01, this.A03.hashCode() * 31)))) + this.A05.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CheckoutCompletedPayload(flowType=");
        sb.append(this.A03);
        sb.append(", orderDetails=");
        sb.append(this.A01);
        sb.append(", confirmationURL=");
        sb.append(this.A02);
        sb.append(", orderId=");
        sb.append(this.A04);
        sb.append(", cart=");
        sb.append(this.A00);
        sb.append(", thankYouPageUrl=");
        return AbstractC25236BEt.A0Y(this.A05, sb);
    }
}
