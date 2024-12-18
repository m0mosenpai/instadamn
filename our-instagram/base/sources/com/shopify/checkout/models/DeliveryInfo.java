package com.shopify.checkout.models;

import X.AbstractC167017dG;
import X.AbstractC68612VXn;
import X.C00O;
import X.C14360o3;
import X.C3R9;
import X.C71758X0x;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class DeliveryInfo {
    public static final Companion Companion = new Object();
    public final DeliveryDetails A00;
    public final DeliveryMethod A01;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71758X0x.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryInfo) {
                DeliveryInfo deliveryInfo = (DeliveryInfo) obj;
                if (this.A01 != deliveryInfo.A01 || !C14360o3.A0K(this.A00, deliveryInfo.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public /* synthetic */ DeliveryInfo(DeliveryDetails deliveryDetails, DeliveryMethod deliveryMethod, int i) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(C71758X0x.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A01 = deliveryMethod;
        this.A00 = deliveryDetails;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeliveryInfo(method=");
        sb.append(this.A01);
        sb.append(", details=");
        return AbstractC167017dG.A0o(this.A00, sb);
    }
}
