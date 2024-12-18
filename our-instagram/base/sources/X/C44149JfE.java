package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.JfE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44149JfE {
    public static C44147JfC parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C44147JfC c44147JfC = new C44147JfC();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("quick_replies".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C44178Jfh parseFromJson = AbstractC44177Jfg.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c44147JfC.A01 = arrayList;
                } else if ("count".equals(A0q)) {
                    c44147JfC.A00 = c16l.A1D();
                } else {
                    LH8.A00(c16l, c44147JfC, A0q);
                }
                c16l.A0z();
            }
            return c44147JfC;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
