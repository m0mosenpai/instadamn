package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Vxu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69929Vxu {
    public static C67836Uz9 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C67836Uz9 c67836Uz9 = new C67836Uz9();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("do_base_hashes_match".equals(A0s)) {
                    c67836Uz9.A03 = c16l.A0d();
                } else {
                    ArrayList arrayList = null;
                    if ("server_contact_hashes".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C68966Vf4 parseFromJson = VSO.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c67836Uz9.A02 = arrayList;
                    } else if (AbstractC37315GcH.A00(9, 10, 32).equals(A0s)) {
                        c67836Uz9.A01 = AbstractC167017dG.A0m(c16l);
                    } else if ("setting".equals(A0s)) {
                        c67836Uz9.A00 = VSQ.parseFromJson(c16l);
                    } else {
                        C55702hA.A01(c16l, c67836Uz9, A0s);
                    }
                }
                c16l.A0z();
            }
            return c67836Uz9;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
