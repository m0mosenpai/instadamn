package com.instagram.trust.noncemanager;

import X.AbstractC68612VXn;
import X.C00O;
import X.C0T6;
import X.C106774rb;
import X.C106784rc;
import X.C14360o3;
import X.C3R9;
import X.C3RD;
import X.C3RL;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class NonceTypeMap extends C0T6 {
    public final Map A00;
    public static final Companion Companion = new Object();
    public static final C3R9[] A01 = {new C3RL(C3RD.A01, C106774rb.A00)};

    /* loaded from: classes2.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C106784rc.A00;
        }
    }

    public NonceTypeMap(Map map) {
        C14360o3.A0B(map, 1);
        this.A00 = map;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NonceTypeMap) && C14360o3.A0K(this.A00, ((NonceTypeMap) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NonceTypeMap(nonceTypeMap=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ NonceTypeMap(Map map, int i) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(C106784rc.A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A00 = map;
    }
}
