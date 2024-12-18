package com.shopify.checkout.models;

import X.AbstractC68612VXn;
import X.AnonymousClass001;
import X.C00O;
import X.C14360o3;
import X.C3R9;
import X.C71760X0z;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class InitPayload {
    public static final Companion Companion = new Object();
    public final String A00;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71760X0z.A00;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof InitPayload) && C14360o3.A0K(this.A00, ((InitPayload) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass001.A0S("InitPayload(paymentUrl=", this.A00, ')');
    }

    public /* synthetic */ InitPayload(String str, int i) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(C71760X0z.A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A00 = str;
    }
}
