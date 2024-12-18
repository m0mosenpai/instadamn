package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.1IE, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1IE {
    public static C1IF parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C1IF c1if = new C1IF();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("entries".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C1IH parseFromJson = C1IG.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c1if.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c1if;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
