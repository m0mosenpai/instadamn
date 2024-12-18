package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4q6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4q6 {
    public final Map A00;
    public final Map A01;

    public C4q6() {
        EnumC105944q5[] values = EnumC105944q5.values();
        C14360o3.A0B(values, 1);
        int A0L = AbstractC16850sd.A0L(values.length);
        A0L = A0L < 16 ? 16 : A0L;
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (EnumC105944q5 enumC105944q5 : values) {
            linkedHashMap.put(enumC105944q5.A01, enumC105944q5);
        }
        this.A00 = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(A0L);
        for (EnumC105944q5 enumC105944q52 : values) {
            linkedHashMap2.put(Integer.valueOf(enumC105944q52.A00), enumC105944q52);
        }
        this.A01 = linkedHashMap2;
    }
}
