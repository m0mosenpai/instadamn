package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Kpn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46968Kpn {
    public static C33151hd parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C33151hd c33151hd = new C33151hd();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("optimistic_data".equals(A0s)) {
                    c33151hd.A00 = AbstractC46843Knc.parseFromJson(c16l);
                } else {
                    ArrayList arrayList = null;
                    if (AbstractC111324zv.A00(5145).equals(A0s)) {
                        c33151hd.A01 = AbstractC167017dG.A0m(c16l);
                    } else if ("options".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        c33151hd.A02 = arrayList;
                    } else if ("is_xac_thread".equals(A0s)) {
                        c33151hd.A03 = c16l.A0d();
                    } else {
                        AbstractC47856LCb.A01(c16l, c33151hd, A0s);
                    }
                }
                c16l.A0z();
            }
            return c33151hd;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
