package com.shopify.checkout.models;

import X.AbstractC167017dG;
import X.C14360o3;
import X.C3R9;
import X.C3SG;
import X.C71759X0y;
import X.X16;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class Price {
    public final Money A00;
    public final Money A01;
    public final Money A02;
    public final Money A03;
    public final Boolean A04;
    public final List A05;
    public static final Companion Companion = new Object();
    public static final C3R9[] A06 = {null, null, null, null, null, new C3SG(C71759X0y.A00)};

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return X16.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Price) {
                Price price = (Price) obj;
                if (!C14360o3.A0K(this.A03, price.A03) || !C14360o3.A0K(this.A01, price.A01) || !C14360o3.A0K(this.A02, price.A02) || !C14360o3.A0K(this.A04, price.A04) || !C14360o3.A0K(this.A00, price.A00) || !C14360o3.A0K(this.A05, price.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((((((((AbstractC167017dG.A0M(this.A03) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31;
        List list = this.A05;
        if (list != null) {
            i = list.hashCode();
        }
        return A0M + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Price(total=");
        sb.append(this.A03);
        sb.append(", subtotal=");
        sb.append(this.A01);
        sb.append(", taxes=");
        sb.append(this.A02);
        sb.append(", taxesIncluded=");
        sb.append(this.A04);
        sb.append(", shipping=");
        sb.append(this.A00);
        sb.append(", discounts=");
        return AbstractC167017dG.A0o(this.A05, sb);
    }

    public /* synthetic */ Price(Money money, Money money2, Money money3, Money money4, Boolean bool, List list, int i) {
        if ((i & 1) == 0) {
            this.A03 = null;
        } else {
            this.A03 = money;
        }
        if ((i & 2) == 0) {
            this.A01 = null;
        } else {
            this.A01 = money2;
        }
        if ((i & 4) == 0) {
            this.A02 = null;
        } else {
            this.A02 = money3;
        }
        if ((i & 8) == 0) {
            this.A04 = null;
        } else {
            this.A04 = bool;
        }
        if ((i & 16) == 0) {
            this.A00 = null;
        } else {
            this.A00 = money4;
        }
        if ((i & 32) == 0) {
            this.A05 = null;
        } else {
            this.A05 = list;
        }
    }

    public Price() {
        this.A03 = null;
        this.A01 = null;
        this.A02 = null;
        this.A04 = null;
        this.A00 = null;
        this.A05 = null;
    }
}
