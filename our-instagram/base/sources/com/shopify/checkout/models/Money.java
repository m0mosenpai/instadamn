package com.shopify.checkout.models;

import X.AbstractC25236BEt;
import X.AbstractC68612VXn;
import X.C00O;
import X.C14360o3;
import X.C3R9;
import X.X11;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class Money {
    public static final Companion Companion = new Object();
    public final float A00;
    public final String A01;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X11.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Money) {
                Money money = (Money) obj;
                if (Float.compare(this.A00, money.A00) != 0 || !C14360o3.A0K(this.A01, money.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.A00) * 31) + this.A01.hashCode();
    }

    public /* synthetic */ Money(String str, int i, float f) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(X11.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A00 = f;
        this.A01 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Money(amount=");
        sb.append(this.A00);
        sb.append(", currencyCode=");
        return AbstractC25236BEt.A0Y(this.A01, sb);
    }
}
