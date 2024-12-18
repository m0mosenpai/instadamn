package com.shopify.checkout.models;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC43591JPw;
import X.AbstractC68612VXn;
import X.C00O;
import X.C14360o3;
import X.C3R9;
import X.C3SG;
import X.C71751X0q;
import X.C71759X0y;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class CartLine {
    public final int A00;
    public final CartLineImage A01;
    public final Money A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public static final Companion Companion = new Object();
    public static final C3R9[] A07 = {null, null, null, null, null, null, new C3SG(C71759X0y.A00)};

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71751X0q.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CartLine) {
                CartLine cartLine = (CartLine) obj;
                if (!C14360o3.A0K(this.A03, cartLine.A03) || !C14360o3.A0K(this.A04, cartLine.A04) || !C14360o3.A0K(this.A01, cartLine.A01) || this.A00 != cartLine.A00 || !C14360o3.A0K(this.A05, cartLine.A05) || !C14360o3.A0K(this.A02, cartLine.A02) || !C14360o3.A0K(this.A06, cartLine.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ CartLine(CartLineImage cartLineImage, Money money, String str, String str2, String str3, List list, int i, int i2) {
        if (56 != (i & 56)) {
            AbstractC68612VXn.A00(C71751X0q.A01, i, 56);
            throw C00O.createAndThrow();
        }
        if ((i & 1) != 0) {
            this.A03 = str;
        }
        if ((i & 2) != 0) {
            this.A04 = str2;
        }
        if ((i & 4) != 0) {
            this.A01 = cartLineImage;
        }
        this.A00 = i2;
        this.A05 = str3;
        this.A02 = money;
        if ((i & 64) != 0) {
            this.A06 = list;
        }
    }

    public final int hashCode() {
        int i = 0;
        int A0J = AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0K(this.A05, ((((((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + this.A00) * 31));
        List list = this.A06;
        if (list != null) {
            i = list.hashCode();
        }
        return A0J + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CartLine(merchandiseId=");
        sb.append(this.A03);
        sb.append(AbstractC43591JPw.A00(59));
        sb.append(this.A04);
        sb.append(", image=");
        sb.append(this.A01);
        sb.append(", quantity=");
        sb.append(this.A00);
        sb.append(", title=");
        sb.append(this.A05);
        sb.append(", price=");
        sb.append(this.A02);
        sb.append(", discounts=");
        return AbstractC167017dG.A0o(this.A06, sb);
    }
}
