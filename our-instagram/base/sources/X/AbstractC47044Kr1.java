package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Kr1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47044Kr1 {
    public static L0D parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            L0D l0d = new L0D();
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
                    l0d.A00 = arrayList;
                } else if ("secondary_actions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            JQ1.A0h(c16l, arrayList);
                        }
                    }
                    l0d.A01 = arrayList;
                }
                c16l.A0z();
            }
            return l0d;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
