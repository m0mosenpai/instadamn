package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class IOD {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.H91, X.1um, X.1ul] */
    public static H91 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("section_content".equals(A0s)) {
                    c40791um.A00 = AbstractC40387Hva.parseFromJson(c16l);
                } else if ("sections".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            MUW parseFromJson = AbstractC40388Hvb.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A02 = arrayList;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            c40791um.A01 = new C54522O6z(c40791um.A00, c40791um.A02);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
