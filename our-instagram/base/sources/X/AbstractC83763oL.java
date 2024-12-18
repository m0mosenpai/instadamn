package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3oL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC83763oL {
    public static C9BH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C9BH c9bh = new C9BH(30);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("user_info_list".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C83803oP parseFromJson = AbstractC83793oO.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c9bh.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c9bh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
