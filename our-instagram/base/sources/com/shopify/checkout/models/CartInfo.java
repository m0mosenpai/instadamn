package com.shopify.checkout.models;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC68612VXn;
import X.C00O;
import X.C14360o3;
import X.C3R9;
import X.C3SG;
import X.C71750X0p;
import X.C71751X0q;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class CartInfo {
    public final Price A00;
    public final String A01;
    public final List A02;
    public static final Companion Companion = new Object();
    public static final C3R9[] A03 = {null, new C3SG(C71751X0q.A00), null};

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71750X0p.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CartInfo) {
                CartInfo cartInfo = (CartInfo) obj;
                if (!C14360o3.A0K(this.A01, cartInfo.A01) || !C14360o3.A0K(this.A02, cartInfo.A02) || !C14360o3.A0K(this.A00, cartInfo.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ CartInfo(Price price, String str, List list, int i) {
        if (7 != (i & 7)) {
            AbstractC68612VXn.A00(C71750X0p.A01, i, 7);
            throw C00O.createAndThrow();
        }
        this.A01 = str;
        this.A02 = list;
        this.A00 = price;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CartInfo(token=");
        sb.append(this.A01);
        sb.append(", lines=");
        sb.append(this.A02);
        sb.append(", price=");
        return AbstractC167017dG.A0o(this.A00, sb);
    }
}
