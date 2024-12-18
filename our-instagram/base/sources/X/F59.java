package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class F59 {
    public static C36440G5p parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C36440G5p c36440G5p = new C36440G5p();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("reshared_content_items".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C34512FIy parseFromJson = F58.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c36440G5p.A01 = arrayList;
                } else if ("has_more".equals(A0s)) {
                    c36440G5p.A02 = c16l.A0d();
                } else if ("next_offset".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c36440G5p.A00 = A0m;
                }
                c16l.A0z();
            }
            return c36440G5p;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
