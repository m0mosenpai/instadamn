package com.shopify.checkout.models.errors;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC68612VXn;
import X.C00O;
import X.C14360o3;
import X.C3R9;
import X.EnumC68139VDb;
import X.InterfaceC71868X8b;
import X.X1C;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class VaultedPaymentErrorPayload implements InterfaceC71868X8b {
    public static final Companion Companion = new Object();
    public final ErrorGroup A00;
    public final EnumC68139VDb A01;
    public final String A02;
    public final String A03;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X1C.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VaultedPaymentErrorPayload) {
                VaultedPaymentErrorPayload vaultedPaymentErrorPayload = (VaultedPaymentErrorPayload) obj;
                if (!C14360o3.A0K(this.A02, vaultedPaymentErrorPayload.A02) || this.A01 != vaultedPaymentErrorPayload.A01 || !C14360o3.A0K(this.A03, vaultedPaymentErrorPayload.A03) || this.A00 != vaultedPaymentErrorPayload.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ VaultedPaymentErrorPayload(ErrorGroup errorGroup, EnumC68139VDb enumC68139VDb, String str, String str2, int i) {
        if (11 != (i & 11)) {
            AbstractC68612VXn.A00(X1C.A01, i, 11);
            throw C00O.createAndThrow();
        }
        this.A02 = str;
        this.A01 = enumC68139VDb;
        if ((i & 4) != 0) {
            this.A03 = str2;
        }
        this.A00 = errorGroup;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A01, this.A02.hashCode() * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n            Group: ");
        sb.append(this.A00);
        sb.append("\n            Reason: ");
        sb.append(this.A03);
        sb.append("\n            Code: ");
        sb.append(this.A01);
        return AbstractC166997dE.A0x("\n        ", sb);
    }
}
