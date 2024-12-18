package X;

import java.io.IOException;

/* renamed from: X.Hmm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39899Hmm {
    public static H36 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            H2S h2s = null;
            Long l = null;
            C38743H4i c38743H4i = null;
            H51 h51 = null;
            Long l2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("bounding_box".equals(A0s)) {
                    h2s = AbstractC39777Hkn.parseFromJson(c16l);
                } else if (AbstractC43591JPw.A00(38).equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("matched_products".equals(A0s)) {
                    c38743H4i = AbstractC40172Hrk.parseFromJson(c16l);
                } else if ("representative_points".equals(A0s)) {
                    h51 = AbstractC40212Hsb.parseFromJson(c16l);
                } else {
                    l2 = AbstractC37303Gc4.A0O(c16l, l2, A0s, MSV.A00(1617));
                }
                c16l.A0z();
            }
            return new H36(h2s, c38743H4i, h51, l, l2, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
