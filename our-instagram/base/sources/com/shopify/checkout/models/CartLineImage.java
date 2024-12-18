package com.shopify.checkout.models;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC68612VXn;
import X.AnonymousClass001;
import X.C00O;
import X.C14360o3;
import X.C3R9;
import X.C71752X0r;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class CartLineImage {
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71752X0r.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CartLineImage) {
                CartLineImage cartLineImage = (CartLineImage) obj;
                if (!C14360o3.A0K(this.A03, cartLineImage.A03) || !C14360o3.A0K(this.A02, cartLineImage.A02) || !C14360o3.A0K(this.A01, cartLineImage.A01) || !C14360o3.A0K(this.A00, cartLineImage.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A17("CartLineImage(sm=", this.A03, ", md=", this.A02, ", lg=", this.A01, ", altText=", this.A00, ')');
    }

    public /* synthetic */ CartLineImage(String str, String str2, String str3, String str4, int i) {
        if (7 != (i & 7)) {
            AbstractC68612VXn.A00(C71752X0r.A01, i, 7);
            throw C00O.createAndThrow();
        }
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        if ((i & 8) != 0) {
            this.A00 = str4;
        }
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A02, this.A03.hashCode() * 31)) + AbstractC167017dG.A0O(this.A00);
    }
}
