package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class Hx0 {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.HAK, X.1um, X.1ul] */
    public static HAK parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                ArrayList arrayList = null;
                if (AbstractC37301Gc2.A1W(c16l, A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            IBd parseFromJson = AbstractC40468Hwx.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A01 = arrayList;
                } else if (AbstractC50529MSi.A01().equals(A0q)) {
                    c40791um.A00 = AbstractC167017dG.A0m(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0q);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}