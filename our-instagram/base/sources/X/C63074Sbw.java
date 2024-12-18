package X;

import com.google.protobuf.CodedOutputStream;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Sbw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63074Sbw {
    public static int A00(int i, Object obj, Object obj2) {
        AbstractMap abstractMap = (AbstractMap) obj;
        C62553SGe c62553SGe = (C62553SGe) obj2;
        int i2 = 0;
        if (!abstractMap.isEmpty()) {
            Iterator A14 = AbstractC166997dE.A14(abstractMap);
            while (A14.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                Object key = A1K.getKey();
                Object value = A1K.getValue();
                int A05 = AbstractC63073Sbv.A05(i);
                C62589SHp c62589SHp = c62553SGe.A00;
                int A00 = C63341Shv.A00(c62589SHp.A00, key, 1) + C63341Shv.A00(c62589SHp.A01, value, 2);
                boolean z = CodedOutputStream.A02;
                i2 += A05 + AbstractC58321PtD.A06(A00) + A00;
            }
        }
        return i2;
    }

    public static C64915TZq A01(Object obj, Object obj2) {
        C64915TZq c64915TZq = (C64915TZq) obj;
        AbstractMap abstractMap = (AbstractMap) obj2;
        if (!abstractMap.isEmpty()) {
            if (!c64915TZq.A00) {
                c64915TZq = c64915TZq.A01();
            }
            if (c64915TZq.A00) {
                if (!abstractMap.isEmpty()) {
                    c64915TZq.putAll(abstractMap);
                }
            } else {
                throw AbstractC43592JPx.A11();
            }
        }
        return c64915TZq;
    }
}
