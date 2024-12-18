package com.shopify.checkout.models;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC68612VXn;
import X.C00O;
import X.C14360o3;
import X.C3R9;
import X.C71759X0y;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class Discount {
    public static final Companion Companion = new Object();
    public final Money A00;
    public final Float A01;
    public final String A02;
    public final String A03;
    public final String A04;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71759X0y.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Discount) {
                Discount discount = (Discount) obj;
                if (!C14360o3.A0K(this.A03, discount.A03) || !C14360o3.A0K(this.A00, discount.A00) || !C14360o3.A0K(this.A02, discount.A02) || !C14360o3.A0K(this.A04, discount.A04) || !C14360o3.A0K(this.A01, discount.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ Discount(Money money, Float f, String str, String str2, String str3, int i) {
        if (7 != (i & 7)) {
            AbstractC68612VXn.A00(C71759X0y.A01, i, 7);
            throw C00O.createAndThrow();
        }
        this.A03 = str;
        this.A00 = money;
        this.A02 = str2;
        if ((i & 8) != 0) {
            this.A04 = str3;
        }
        if ((i & 16) != 0) {
            this.A01 = f;
        }
    }

    public final int hashCode() {
        int i = 0;
        int A0K = (AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0J(this.A00, this.A03.hashCode() * 31)) + AbstractC167017dG.A0O(this.A04)) * 31;
        Float f = this.A01;
        if (f != null) {
            i = f.hashCode();
        }
        return A0K + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Discount(title=");
        sb.append(this.A03);
        sb.append(", amount=");
        sb.append(this.A00);
        sb.append(", applicationType=");
        sb.append(this.A02);
        sb.append(", valueType=");
        sb.append(this.A04);
        sb.append(", value=");
        return AbstractC167017dG.A0o(this.A01, sb);
    }
}
