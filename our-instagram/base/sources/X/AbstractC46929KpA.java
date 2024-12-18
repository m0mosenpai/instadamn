package X;

import java.io.IOException;

/* renamed from: X.KpA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46929KpA {
    public static C34051j5 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C34051j5 c34051j5 = new C34051j5();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c34051j5.A00 = AbstractC31172DnG.A0o(c16l);
                } else if ("collection_type".equals(A0q)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c34051j5.A02 = A0m;
                } else if ("reaction_status".equals(A0q)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c34051j5.A05 = A0m2;
                } else if ("collection_item_id".equals(A0q)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c34051j5.A01 = A0m3;
                } else if ("reaction_emoji".equals(A0q)) {
                    c34051j5.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("message_id".equals(A0q)) {
                    c34051j5.A03 = AbstractC167017dG.A0m(c16l);
                } else {
                    AbstractC43669JTd.A01(c16l, c34051j5, A0q);
                }
                c16l.A0z();
            }
            return c34051j5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
