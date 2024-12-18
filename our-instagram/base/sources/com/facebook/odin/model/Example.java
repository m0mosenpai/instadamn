package com.facebook.odin.model;

import X.C0T6;
import X.C14360o3;
import X.C3R9;
import X.C3RD;
import X.C73863Sv;
import java.util.HashMap;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class Example extends C0T6 {
    public final ExampleContext A00;
    public final String A01;
    public final HashMap A02;
    public static final Companion Companion = new Object();
    public static final C3R9[] A04 = {null, null, new C73863Sv(C3RD.A01, FeatureData$$serializer.INSTANCE)};
    public static final Example A03 = new Example(ExampleContext.A05, "identity", new HashMap());

    /* loaded from: classes2.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return Example$$serializer.INSTANCE;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Example) {
                Example example = (Example) obj;
                if (!C14360o3.A0K(this.A01, example.A01) || !C14360o3.A0K(this.A00, example.A00) || !C14360o3.A0K(this.A02, example.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A00.hashCode()) * 31) + this.A02.hashCode();
    }

    public /* synthetic */ Example(ExampleContext exampleContext, String str, HashMap hashMap, int i) {
        this.A01 = (i & 1) == 0 ? "identity" : str;
        if ((i & 2) == 0) {
            this.A00 = ExampleContext.A05;
        } else {
            this.A00 = exampleContext;
        }
        if ((i & 4) == 0) {
            this.A02 = new HashMap();
        } else {
            this.A02 = hashMap;
        }
    }

    public Example(ExampleContext exampleContext, String str, HashMap hashMap) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(exampleContext, 2);
        C14360o3.A0B(hashMap, 3);
        this.A01 = str;
        this.A00 = exampleContext;
        this.A02 = hashMap;
    }

    public Example() {
        this(ExampleContext.A05, "identity", new HashMap());
    }
}
