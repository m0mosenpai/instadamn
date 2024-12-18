package com.shopify.checkout.models;

import X.AbstractC167017dG;
import X.AbstractC25236BEt;
import X.C14360o3;
import X.C3R9;
import X.C71757X0w;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class DeliveryDetails {
    public static final Companion Companion = new Object();
    public final Address A00;
    public final String A01;
    public final String A02;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71757X0w.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryDetails) {
                DeliveryDetails deliveryDetails = (DeliveryDetails) obj;
                if (!C14360o3.A0K(this.A02, deliveryDetails.A02) || !C14360o3.A0K(this.A00, deliveryDetails.A00) || !C14360o3.A0K(this.A01, deliveryDetails.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0M(this.A00)) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeliveryDetails(name=");
        sb.append(this.A02);
        sb.append(", location=");
        sb.append(this.A00);
        sb.append(", additionalInfo=");
        return AbstractC25236BEt.A0Y(this.A01, sb);
    }

    public /* synthetic */ DeliveryDetails(Address address, String str, String str2, int i) {
        if ((i & 1) == 0) {
            this.A02 = null;
        } else {
            this.A02 = str;
        }
        if ((i & 2) == 0) {
            this.A00 = null;
        } else {
            this.A00 = address;
        }
        if ((i & 4) == 0) {
            this.A01 = null;
        } else {
            this.A01 = str2;
        }
    }

    public DeliveryDetails() {
        this.A02 = null;
        this.A00 = null;
        this.A01 = null;
    }
}
