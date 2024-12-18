package com.shopify.checkout.models.errors;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC68612VXn;
import X.C00O;
import X.C14360o3;
import X.C3R9;
import X.InterfaceC71868X8b;
import X.X18;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class CheckoutErrorPayload implements InterfaceC71868X8b {
    public static final Companion Companion = new Object();
    public final CheckoutErrorType A00;
    public final ErrorGroup A01;
    public final String A02;
    public final String A03;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X18.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutErrorPayload) {
                CheckoutErrorPayload checkoutErrorPayload = (CheckoutErrorPayload) obj;
                if (!C14360o3.A0K(this.A02, checkoutErrorPayload.A02) || this.A00 != checkoutErrorPayload.A00 || !C14360o3.A0K(this.A03, checkoutErrorPayload.A03) || this.A01 != checkoutErrorPayload.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ CheckoutErrorPayload(CheckoutErrorType checkoutErrorType, ErrorGroup errorGroup, String str, String str2, int i) {
        if (15 != (i & 15)) {
            AbstractC68612VXn.A00(X18.A01, i, 15);
            throw C00O.createAndThrow();
        }
        this.A02 = str;
        this.A00 = checkoutErrorType;
        this.A03 = str2;
        this.A01 = errorGroup;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A00, this.A02.hashCode() * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n            Group: ");
        sb.append(this.A01);
        sb.append("\n            Type: ");
        sb.append(this.A00);
        sb.append("\n            Reason: ");
        sb.append(this.A03);
        return AbstractC166997dE.A0x("\n        ", sb);
    }
}
