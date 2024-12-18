package com.shopify.checkout.models;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC68612VXn;
import X.C00O;
import X.C14360o3;
import X.C3R9;
import X.C3SG;
import X.C71755X0u;
import X.C71758X0x;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class CheckoutStatePayload {
    public final BuyerInfo A00;
    public final CartInfo A01;
    public final String A02;
    public final List A03;
    public static final Companion Companion = new Object();
    public static final C3R9[] A04 = {null, null, null, new C3SG(C71758X0x.A00)};

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71755X0u.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutStatePayload) {
                CheckoutStatePayload checkoutStatePayload = (CheckoutStatePayload) obj;
                if (!C14360o3.A0K(this.A02, checkoutStatePayload.A02) || !C14360o3.A0K(this.A01, checkoutStatePayload.A01) || !C14360o3.A0K(this.A00, checkoutStatePayload.A00) || !C14360o3.A0K(this.A03, checkoutStatePayload.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ CheckoutStatePayload(BuyerInfo buyerInfo, CartInfo cartInfo, String str, List list, int i) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(C71755X0u.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A02 = str;
        this.A01 = cartInfo;
        if ((i & 4) != 0) {
            this.A00 = buyerInfo;
        }
        if ((i & 8) != 0) {
            this.A03 = list;
        }
    }

    public final int hashCode() {
        int i = 0;
        int A0J = (AbstractC166997dE.A0J(this.A01, this.A02.hashCode() * 31) + AbstractC167017dG.A0M(this.A00)) * 31;
        List list = this.A03;
        if (list != null) {
            i = list.hashCode();
        }
        return A0J + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CheckoutStatePayload(flowType=");
        sb.append(this.A02);
        sb.append(", cart=");
        sb.append(this.A01);
        sb.append(", buyer=");
        sb.append(this.A00);
        sb.append(", deliveries=");
        return AbstractC167017dG.A0o(this.A03, sb);
    }
}
