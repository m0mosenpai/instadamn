package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class F57 {
    public static C36439G5o parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C36439G5o c36439G5o = new C36439G5o();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("message_search_result_items".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C34511FIx parseFromJson = F56.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c36439G5o.A01 = arrayList;
                } else if ("has_more".equals(A0s)) {
                    c36439G5o.A02 = c16l.A0d();
                } else if ("next_offset".equals(A0s)) {
                    c36439G5o.A00 = c16l.A1D();
                }
                c16l.A0z();
            }
            return c36439G5o;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
