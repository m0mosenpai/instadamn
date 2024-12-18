package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5cg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC120375cg {
    public static C120385ch parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C120385ch c120385ch = new C120385ch();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("capabilities".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C120425cl parseFromJson = AbstractC120395ci.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c120385ch.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c120385ch;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
