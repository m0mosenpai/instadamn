package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.IOm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41271IOm {
    /* JADX WARN: Type inference failed for: r4v0, types: [X.H9J, X.1um, X.1ul] */
    public static H9J parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("has_more".equals(A0s)) {
                    c40791um.A01 = AbstractC166997dE.A0d(c16l);
                } else {
                    ArrayList arrayList = null;
                    if (AbstractC37300Gc1.A1S(A0s)) {
                        c40791um.A02 = AbstractC167017dG.A0m(c16l);
                    } else if ("users".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                C38757H4x parseFromJson = AbstractC40206HsV.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c40791um.A03 = arrayList;
                    } else {
                        C55702hA.A01(c16l, c40791um, A0s);
                    }
                }
                c16l.A0z();
            }
            c40791um.A00 = new C51595Mqn(c40791um.A02, c40791um.A03, AbstractC31172DnG.A1b(c40791um.A01));
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
