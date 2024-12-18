package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F70 {
    public static FRM parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            FRM frm = new FRM();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("item_id".equals(A0s)) {
                    frm.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("client_context".equals(A0s)) {
                    frm.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("sender_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    frm.A09 = A0m;
                } else if ("timestamp".equals(A0s)) {
                    frm.A00 = c16l.A0y();
                } else if ("media".equals(A0s)) {
                    frm.A02 = AbstractC31176DnK.A0Y(c16l);
                } else if (AbstractC58317Pt9.A00(137).equals(A0s)) {
                    frm.A0A = AbstractC167017dG.A0m(c16l);
                } else if ("preview_url".equals(A0s)) {
                    frm.A01 = AbstractC222616c.A00(c16l);
                } else if ("is_collection_item".equals(A0s)) {
                    frm.A0B = c16l.A0d();
                } else if ("encrypted".equals(A0s)) {
                    frm.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("ephemeral_lifetime_ms".equals(A0s)) {
                    frm.A05 = AbstractC31173DnH.A0h(c16l);
                } else if ("is_instamadillo".equals(A0s)) {
                    frm.A03 = AbstractC166997dE.A0d(c16l);
                } else if ("is_taken_down".equals(A0s)) {
                    frm.A04 = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            return frm;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
