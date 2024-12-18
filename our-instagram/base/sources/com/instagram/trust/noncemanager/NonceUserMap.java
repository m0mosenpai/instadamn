package com.instagram.trust.noncemanager;

import X.AbstractC68612VXn;
import X.C00O;
import X.C0T6;
import X.C106774rb;
import X.C14360o3;
import X.C3R9;
import X.C3RD;
import X.C3RL;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class NonceUserMap extends C0T6 {
    public static final C3R9[] A01;
    public static final Companion Companion = new Object();
    public final Map A00;

    /* loaded from: classes2.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C106774rb.A00;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NonceUserMap) && C14360o3.A0K(this.A00, ((NonceUserMap) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NonceUserMap(nonceUserMap=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.instagram.trust.noncemanager.NonceUserMap$Companion, java.lang.Object] */
    static {
        C3RD c3rd = C3RD.A01;
        A01 = new C3R9[]{new C3RL(c3rd, c3rd)};
    }

    public NonceUserMap(Map map) {
        this.A00 = map;
    }

    public /* synthetic */ NonceUserMap(Map map, int i) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(C106774rb.A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A00 = map;
    }
}
