package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VUC {
    public static C69356Vm2 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69356Vm2 c69356Vm2 = new C69356Vm2();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("story_exits_count".equals(A0s)) {
                    c69356Vm2.A00 = c16l.A1D();
                } else if ("story_link_navigation_count".equals(A0s)) {
                    c69356Vm2.A01 = c16l.A1D();
                } else if ("attributed_follows".equals(A0s)) {
                    c69356Vm2.A02 = VU3.parseFromJson(c16l);
                } else if ("attributed_profile_visits".equals(A0s)) {
                    c69356Vm2.A03 = VU5.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(1188).equals(A0s)) {
                    c69356Vm2.A04 = VU9.parseFromJson(c16l);
                } else if ("share_count".equals(A0s)) {
                    c69356Vm2.A05 = VUB.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c69356Vm2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
