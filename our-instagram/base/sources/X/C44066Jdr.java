package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Jdr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44066Jdr {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.K7v, X.1um, X.1ul] */
    public static K7v parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("scheduled_media".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C38321qM A00 = C38321qM.A00(c16l);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    }
                    c40791um.A01 = arrayList;
                } else {
                    C55702hA.A01(c16l, c40791um, A0q);
                }
                c16l.A0z();
            }
            List list = c40791um.A01;
            C14360o3.A0A(list);
            c40791um.A00 = new C44067Jds(list);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
