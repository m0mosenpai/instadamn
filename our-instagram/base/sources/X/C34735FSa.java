package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.FSa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34735FSa {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.EAx, X.1um, X.1ul] */
    public static C32150EAx parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("anonymous_user_count".equals(A0s)) {
                    c40791um.A03 = AbstractC166997dE.A0h(c16l);
                } else {
                    ArrayList arrayList = null;
                    if ("disclaimer_text".equals(A0s)) {
                        c40791um.A07 = AbstractC167017dG.A0m(c16l);
                    } else if ("media_info".equals(A0s)) {
                        c40791um.A02 = AbstractC31176DnK.A0Y(c16l);
                    } else if (AbstractC111324zv.A00(1175).equals(A0s)) {
                        c40791um.A04 = AbstractC166997dE.A0h(c16l);
                    } else if (AbstractC111324zv.A00(1275).equals(A0s)) {
                        c40791um.A00 = AbstractC33692Eug.parseFromJson(c16l);
                    } else if ("th_like_count".equals(A0s)) {
                        c40791um.A05 = AbstractC166997dE.A0h(c16l);
                    } else if ("user_count".equals(A0s)) {
                        c40791um.A06 = AbstractC166997dE.A0h(c16l);
                    } else if ("users".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167017dG.A1H(c16l, arrayList);
                            }
                        }
                        c40791um.A08 = arrayList;
                    } else {
                        C55702hA.A01(c16l, c40791um, A0s);
                    }
                }
                c16l.A0z();
            }
            Integer num = c40791um.A03;
            String str = c40791um.A07;
            c40791um.A01 = new E7v(c40791um.A00, c40791um.A02, num, c40791um.A04, c40791um.A05, c40791um.A06, str, c40791um.A08);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
