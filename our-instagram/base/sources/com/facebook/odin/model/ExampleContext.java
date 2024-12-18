package com.facebook.odin.model;

import X.C0T6;
import X.C14360o3;
import X.C3R7;
import X.C3R8;
import X.C3R9;
import X.C3RD;
import X.C3RJ;
import X.C3RL;
import X.C3RQ;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ExampleContext extends C0T6 {
    public static final ExampleContext A05;
    public static final C3R9[] A06;
    public static final Companion Companion = new Object();
    public final Type A00;
    public final String A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;

    /* loaded from: classes2.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return ExampleContext$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.odin.model.ExampleContext$Companion, java.lang.Object] */
    static {
        C3R8 A00 = C3R7.A00("com.facebook.odin.model.Type", Type.values());
        C3RD c3rd = C3RD.A01;
        A06 = new C3R9[]{null, A00, new C3RL(c3rd, C3RJ.A00), new C3RL(c3rd, C3RQ.A00), new C3RL(c3rd, c3rd)};
        A05 = new ExampleContext(Type.A05, "identity", 28);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExampleContext() {
        this(null, 0 == true ? 1 : 0, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExampleContext(id=");
        sb.append(this.A01);
        sb.append(", type=");
        sb.append(this.A00);
        sb.append(", longMap=");
        sb.append(this.A03);
        sb.append(", doubleMap=");
        sb.append(this.A02);
        sb.append(", stringMap=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C14360o3.A0K(cls, getClass())) {
            return false;
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.odin.model.ExampleContext");
        return C14360o3.A0K(this.A01, ((ExampleContext) obj).A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public /* synthetic */ ExampleContext(Type type, String str, Map map, Map map2, Map map3, int i) {
        this.A01 = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.A00 = Type.A0C;
        } else {
            this.A00 = type;
        }
        if ((i & 4) == 0) {
            this.A03 = new LinkedHashMap();
        } else {
            this.A03 = map;
        }
        if ((i & 8) == 0) {
            this.A02 = new LinkedHashMap();
        } else {
            this.A02 = map2;
        }
        if ((i & 16) == 0) {
            this.A04 = new LinkedHashMap();
        } else {
            this.A04 = map3;
        }
    }

    public /* synthetic */ ExampleContext(Type type, String str, int i) {
        str = (i & 1) != 0 ? "" : str;
        type = (i & 2) != 0 ? Type.A0C : type;
        LinkedHashMap linkedHashMap = (i & 4) != 0 ? new LinkedHashMap() : null;
        LinkedHashMap linkedHashMap2 = (i & 8) != 0 ? new LinkedHashMap() : null;
        LinkedHashMap linkedHashMap3 = (i & 16) != 0 ? new LinkedHashMap() : null;
        C14360o3.A0B(str, 1);
        C14360o3.A0B(type, 2);
        C14360o3.A0B(linkedHashMap, 3);
        C14360o3.A0B(linkedHashMap2, 4);
        C14360o3.A0B(linkedHashMap3, 5);
        this.A01 = str;
        this.A00 = type;
        this.A03 = linkedHashMap;
        this.A02 = linkedHashMap2;
        this.A04 = linkedHashMap3;
    }
}
