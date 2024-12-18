package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3kN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC81523kN {
    public static C9BW parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C9BW c9bw = new C9BW(14);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("persistent_icebreakers".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C105954q9 parseFromJson = C4q8.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c9bw.A01 = arrayList;
                } else if ("are_default_icebreakers".equals(A0q)) {
                    c9bw.A00 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            return c9bw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
