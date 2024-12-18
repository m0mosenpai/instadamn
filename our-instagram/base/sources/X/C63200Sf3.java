package X;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.Sf3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63200Sf3 {
    public final String A00;
    public final Map A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63200Sf3)) {
            return false;
        }
        C63200Sf3 c63200Sf3 = (C63200Sf3) obj;
        return this.A00.equals(c63200Sf3.A00) && this.A01.equals(c63200Sf3.A01);
    }

    public static Annotation A01(C63200Sf3 c63200Sf3, Object obj) {
        return (Annotation) c63200Sf3.A01.get(obj);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A00) + this.A01.hashCode();
    }

    public C63200Sf3(String str, Map map) {
        this.A00 = str;
        this.A01 = map;
    }

    public static C63200Sf3 A00(String str) {
        return new C63200Sf3(str, Collections.emptyMap());
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FieldDescriptor{name=");
        A1C.append(this.A00);
        A1C.append(AbstractC111324zv.A00(3429));
        return JQ0.A0l(this.A01.values(), A1C);
    }
}
