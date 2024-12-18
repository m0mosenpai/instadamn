package X;

import java.io.IOException;

/* renamed from: X.KnR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46832KnR {
    public static L1W parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            L1W l1w = new L1W();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("product_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    EnumC46242KdI enumC46242KdI = (EnumC46242KdI) EnumC46242KdI.A01.get(A1P);
                    if (enumC46242KdI == null) {
                        enumC46242KdI = EnumC46242KdI.A06;
                    }
                    l1w.A00 = enumC46242KdI;
                } else if ("ephemeral_duration_sec".equals(A0s)) {
                    l1w.A01 = AbstractC31173DnH.A0h(c16l);
                } else if ("ephemeral_view_duration_sec".equals(A0s)) {
                    l1w.A02 = AbstractC31173DnH.A0h(c16l);
                }
                c16l.A0z();
            }
            return l1w;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
