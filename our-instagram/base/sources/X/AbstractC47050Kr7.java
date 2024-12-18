package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Kr7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47050Kr7 {
    public static L0F parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            L0F l0f = new L0F();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("primary_actions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            JQ1.A0h(c16l, arrayList);
                        }
                    }
                    l0f.A00 = arrayList;
                } else if ("secondary_actions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            JQ1.A0h(c16l, arrayList);
                        }
                    }
                    l0f.A01 = arrayList;
                }
                c16l.A0z();
            }
            return l0f;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
