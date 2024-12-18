package com.shopify.checkout.models.errors.violations;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC68612VXn;
import X.C00O;
import X.C14360o3;
import X.C3R9;
import X.InterfaceC71868X8b;
import X.X1D;
import com.shopify.checkout.models.errors.ErrorGroup;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class DeliveryErrorPayload implements InterfaceC71868X8b {
    public static final Companion Companion = new Object();
    public final ErrorGroup A00;
    public final DeliveryErrorCode A01;
    public final ViolationErrorType A02;
    public final String A03;
    public final String A04;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X1D.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryErrorPayload) {
                DeliveryErrorPayload deliveryErrorPayload = (DeliveryErrorPayload) obj;
                if (!C14360o3.A0K(this.A03, deliveryErrorPayload.A03) || this.A01 != deliveryErrorPayload.A01 || !C14360o3.A0K(this.A04, deliveryErrorPayload.A04) || this.A00 != deliveryErrorPayload.A00 || this.A02 != deliveryErrorPayload.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ DeliveryErrorPayload(ErrorGroup errorGroup, DeliveryErrorCode deliveryErrorCode, ViolationErrorType violationErrorType, String str, String str2, int i) {
        if (27 != (i & 27)) {
            AbstractC68612VXn.A00(X1D.A01, i, 27);
            throw C00O.createAndThrow();
        }
        this.A03 = str;
        this.A01 = deliveryErrorCode;
        if ((i & 4) != 0) {
            this.A04 = str2;
        }
        this.A00 = errorGroup;
        this.A02 = violationErrorType;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, (AbstractC166997dE.A0J(this.A01, this.A03.hashCode() * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + this.A02.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n            Group: ");
        sb.append(this.A00);
        sb.append("\n            Reason: ");
        sb.append(this.A04);
        sb.append("\n            Code: ");
        sb.append(this.A01);
        return AbstractC166997dE.A0x("\n        ", sb);
    }
}
