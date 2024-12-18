package com.shopify.checkout.models;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC68612VXn;
import X.C00O;
import X.C14360o3;
import X.C3R7;
import X.C3R9;
import X.C71754X0t;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class CheckoutOptions {
    public final Authentication A00;
    public final Defaults A01;
    public final ThemeOptions A02;
    public final boolean A03;
    public static final Companion Companion = new Object();
    public static final C3R9[] A04 = {null, null, null, C3R7.A00("com.shopify.checkout.models.ThemeOptions", ThemeOptions.values())};

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71754X0t.A00;
        }
    }

    public CheckoutOptions(Authentication authentication, Defaults defaults, ThemeOptions themeOptions) {
        this.A01 = defaults;
        this.A00 = authentication;
        this.A03 = false;
        this.A02 = themeOptions;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutOptions) {
                CheckoutOptions checkoutOptions = (CheckoutOptions) obj;
                if (!C14360o3.A0K(this.A01, checkoutOptions.A01) || !C14360o3.A0K(this.A00, checkoutOptions.A00) || this.A03 != checkoutOptions.A03 || this.A02 != checkoutOptions.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC167017dG.A0M(this.A01) * 31)) + this.A02.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CheckoutOptions(defaults=");
        sb.append(this.A01);
        sb.append(", auth=");
        sb.append(this.A00);
        sb.append(", shouldInjectJS=");
        sb.append(this.A03);
        sb.append(", theme=");
        return AbstractC167017dG.A0o(this.A02, sb);
    }

    public /* synthetic */ CheckoutOptions(Authentication authentication, Defaults defaults, ThemeOptions themeOptions, int i, boolean z) {
        if (2 != (i & 2)) {
            AbstractC68612VXn.A00(C71754X0t.A01, i, 2);
            throw C00O.createAndThrow();
        }
        this.A01 = (i & 1) == 0 ? null : defaults;
        this.A00 = authentication;
        if ((i & 4) == 0) {
            this.A03 = false;
        } else {
            this.A03 = z;
        }
        if ((i & 8) == 0) {
            this.A02 = ThemeOptions.A03;
        } else {
            this.A02 = themeOptions;
        }
    }
}
