package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5fx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122055fx {
    public static C122045fw parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C122045fw c122045fw = new C122045fw();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                ArrayList arrayList = null;
                if (AbstractC43591JPw.A00(194).equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C121395ef parseFromJson = AbstractC121385ee.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c122045fw.A03 = arrayList;
                } else if ("entities".equals(A0q)) {
                    c122045fw.A00 = AbstractC126265nN.parseFromJson(c16l);
                } else if (AbstractC43591JPw.A00(159).equals(A0q)) {
                    c122045fw.A01 = Boolean.valueOf(c16l.A0d());
                } else if ("page_max_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c122045fw.A02 = str;
                } else {
                    C55702hA.A01(c16l, c122045fw, A0q);
                }
                c16l.A0z();
            }
            return c122045fw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
