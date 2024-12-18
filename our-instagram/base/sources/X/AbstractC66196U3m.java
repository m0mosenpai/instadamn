package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.U3m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66196U3m {
    public static C66197U3n parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C66197U3n c66197U3n = new C66197U3n();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("visible_layers".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69235Vk3 parseFromJson = AbstractC68545VUy.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c66197U3n.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c66197U3n;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
