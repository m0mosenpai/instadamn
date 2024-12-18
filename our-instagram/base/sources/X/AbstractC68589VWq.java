package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VWq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68589VWq {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.WiU, java.lang.Object] */
    public static C70864WiU parseFromJson(C16L c16l) {
        Integer num;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("gradient_colors".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC65702TsY.A1L(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    obj.A01 = arrayList;
                } else if ("text_alignment".equals(A0s)) {
                    String A1Q = c16l.A1Q();
                    if (A1Q.equals("LEFT")) {
                        num = C05F.A00;
                    } else if (A1Q.equals("CENTER")) {
                        num = C05F.A01;
                    } else if (A1Q.equals("RIGHT")) {
                        num = C05F.A0C;
                    } else {
                        throw new IllegalArgumentException(A1Q);
                    }
                    C14360o3.A0B(num, 0);
                    obj.A00 = num;
                } else {
                    continue;
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
