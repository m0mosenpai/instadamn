package X;

import java.io.IOException;

/* renamed from: X.I8m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40862I8m {
    public static C51751Mta parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C51751Mta c51751Mta = new C51751Mta();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("is_preselected".equals(A0s)) {
                    c51751Mta.A03 = c16l.A0d();
                } else if ("selection_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c51751Mta.A02 = A1P;
                } else if ("collection_info_meta".equals(A0s)) {
                    c51751Mta.A00 = AbstractC40866I8q.parseFromJson(c16l);
                } else if ("disabled_info".equals(A0s)) {
                    c51751Mta.A01 = AbstractC40863I8n.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c51751Mta;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
