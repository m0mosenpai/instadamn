package com.shopify.checkout.models;

import X.AbstractC167017dG;
import X.AbstractC25236BEt;
import X.C14360o3;
import X.C3R9;
import X.C3SG;
import X.C71747X0m;
import X.C71756X0v;
import X.X15;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class Defaults {
    public final String A00;
    public final String A01;
    public final List A02;
    public final List A03;
    public static final Companion Companion = new Object();
    public static final C3R9[] A04 = {null, new C3SG(C71747X0m.A00), new C3SG(X15.A00), null};

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71756X0v.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Defaults) {
                Defaults defaults = (Defaults) obj;
                if (!C14360o3.A0K(this.A00, defaults.A00) || !C14360o3.A0K(this.A03, defaults.A03) || !C14360o3.A0K(this.A02, defaults.A02) || !C14360o3.A0K(this.A01, defaults.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Defaults(email=");
        sb.append(this.A00);
        sb.append(", shippingAddresses=");
        sb.append(this.A03);
        sb.append(", paymentMethods=");
        sb.append(this.A02);
        sb.append(", levelOfPriorConsentGiven=");
        return AbstractC25236BEt.A0Y(this.A01, sb);
    }

    public /* synthetic */ Defaults(String str, String str2, List list, List list2, int i) {
        if ((i & 1) == 0) {
            this.A00 = null;
        } else {
            this.A00 = str;
        }
        if ((i & 2) == 0) {
            this.A03 = null;
        } else {
            this.A03 = list;
        }
        if ((i & 4) == 0) {
            this.A02 = null;
        } else {
            this.A02 = list2;
        }
        if ((i & 8) == 0) {
            this.A01 = null;
        } else {
            this.A01 = str2;
        }
    }

    public Defaults(String str, String str2, List list, List list2) {
        this.A00 = str;
        this.A03 = list;
        this.A02 = list2;
        this.A01 = str2;
    }

    public Defaults() {
        this(null, null, null, null);
    }
}
