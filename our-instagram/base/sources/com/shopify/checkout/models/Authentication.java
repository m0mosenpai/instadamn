package com.shopify.checkout.models;

import X.AbstractC25236BEt;
import X.AbstractC58317Pt9;
import X.AbstractC68612VXn;
import X.C00O;
import X.C14360o3;
import X.C3R9;
import X.C71748X0n;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class Authentication {
    public static final Companion Companion = new Object();
    public final AuthenticationVersion A00;
    public final String A01;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71748X0n.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Authentication) {
                Authentication authentication = (Authentication) obj;
                if (this.A00 != authentication.A00 || !C14360o3.A0K(this.A01, authentication.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public /* synthetic */ Authentication(AuthenticationVersion authenticationVersion, String str, int i) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(C71748X0n.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A00 = authenticationVersion;
        this.A01 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Authentication(version=");
        sb.append(this.A00);
        sb.append(AbstractC58317Pt9.A00(31));
        return AbstractC25236BEt.A0Y(this.A01, sb);
    }

    public Authentication(AuthenticationVersion authenticationVersion, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = authenticationVersion;
        this.A01 = str;
    }
}
