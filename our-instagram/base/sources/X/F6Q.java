package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class F6Q {
    public static C30881dr parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C30881dr c30881dr = new C30881dr();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("shop_share".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC31180DnO.A1O(c16l, arrayList);
                        }
                    }
                    c30881dr.A03 = arrayList;
                } else if ("link_id".equals(A0s)) {
                    c30881dr.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("direct_forwarding_params".equals(A0s)) {
                    c30881dr.A00 = FUT.parseFromJson(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c30881dr, A0s);
                }
                c16l.A0z();
            }
            return c30881dr;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
