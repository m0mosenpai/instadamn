package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FX0 {
    public static C32174EBv parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32174EBv c32174EBv = new C32174EBv();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("quick_conversion_settings".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            FOW parseFromJson = AbstractC34300FAu.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c32174EBv.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, c32174EBv, A0s);
                }
                c16l.A0z();
            }
            return c32174EBv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
