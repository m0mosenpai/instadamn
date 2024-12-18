package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class S4W {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        String str = (String) c6fw.A01();
        Map map = (Map) c6fw.A02();
        AbstractC27401Ut.getInstance();
        C64501TGn c64501TGn = new C64501TGn(C6BQ.A0B(c6fq));
        Bundle A0b = AbstractC166987dD.A0b();
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            String A17 = AbstractC31172DnG.A17(A1K);
            Object value = A1K.getValue();
            if (value instanceof Integer) {
                A0b.putInt(A17, AbstractC166987dD.A0H(value));
            } else if (value instanceof Long) {
                A0b.putLong(A17, AbstractC166987dD.A0N(value));
            } else if (value instanceof Short) {
                A0b.putShort(A17, ((Number) value).shortValue());
            } else if (value instanceof String) {
                A0b.putString(A17, (String) value);
            } else if (value instanceof Boolean) {
                A0b.putBoolean(A17, AbstractC166987dD.A1a(value));
            } else if (value instanceof Double) {
                A0b.putDouble(A17, MSW.A00(value));
            }
        }
        C64501TGn A00 = c64501TGn.A00(A0b);
        A00.A01(str);
        A00.A02(C6BQ.A04(c6fq));
        return null;
    }
}
