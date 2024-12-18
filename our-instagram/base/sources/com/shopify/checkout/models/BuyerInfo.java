package com.shopify.checkout.models;

import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C3R9;
import X.C71749X0o;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class BuyerInfo {
    public static final Companion Companion = new Object();
    public final Address A00;
    public final PaymentMethod A01;
    public final String A02;
    public final boolean A03;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71749X0o.A00;
        }
    }

    public /* synthetic */ BuyerInfo(Address address, PaymentMethod paymentMethod, String str, int i, boolean z) {
        if ((i & 1) == 0) {
            this.A02 = null;
        } else {
            this.A02 = str;
        }
        if ((i & 2) == 0) {
            this.A03 = false;
        } else {
            this.A03 = z;
        }
        if ((i & 4) == 0) {
            this.A01 = null;
        } else {
            this.A01 = paymentMethod;
        }
        if ((i & 8) == 0) {
            this.A00 = null;
        } else {
            this.A00 = address;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BuyerInfo) {
                BuyerInfo buyerInfo = (BuyerInfo) obj;
                if (!C14360o3.A0K(this.A02, buyerInfo.A02) || this.A03 != buyerInfo.A03 || !C14360o3.A0K(this.A01, buyerInfo.A01) || !C14360o3.A0K(this.A00, buyerInfo.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0D = (AbstractC167007dF.A0D(this.A03, AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0M(this.A01)) * 31;
        Address address = this.A00;
        if (address != null) {
            i = address.hashCode();
        }
        return A0D + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BuyerInfo(email=");
        sb.append(this.A02);
        sb.append(", acceptsMarketing=");
        sb.append(this.A03);
        sb.append(", selectedPaymentMethod=");
        sb.append(this.A01);
        sb.append(", selectedShippingAddress=");
        return AbstractC167017dG.A0o(this.A00, sb);
    }

    public BuyerInfo() {
        this.A02 = null;
        this.A03 = false;
        this.A01 = null;
        this.A00 = null;
    }
}
