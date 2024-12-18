package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I0Y {
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.47L] */
    public static C47L parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C47M c47m = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C54M c54m = null;
            C54M c54m2 = null;
            C54M c54m3 = null;
            C54M c54m4 = null;
            C54M c54m5 = null;
            C39561sd c39561sd = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("user_card".equals(A0s)) {
                    c47m = AbstractC38042GoV.parseFromJson(c16l);
                } else if ("upsell_fbc_card".equals(A0s)) {
                    c54m = C54L.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(550).equals(A0s)) {
                    c54m2 = C54L.parseFromJson(c16l);
                } else if ("upsell_invite_card".equals(A0s)) {
                    c54m3 = C54L.parseFromJson(c16l);
                } else if ("upsell_see_all_su_card".equals(A0s)) {
                    c54m4 = C54L.parseFromJson(c16l);
                } else if ("upsell_complete_profile_card".equals(A0s)) {
                    c54m5 = C54L.parseFromJson(c16l);
                } else if ("global_position".equals(A0s)) {
                    c16l.A1D();
                } else if ("item_client_gap_rules".equals(A0s)) {
                    c39561sd = AbstractC39551sc.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (c47m != null) {
                obj.A08 = c47m;
            }
            if (c54m != null) {
                obj.A02 = c54m;
            }
            if (c54m2 != null) {
                obj.A00 = c54m2;
            }
            if (c54m3 != null) {
                obj.A03 = c54m3;
            }
            if (c54m4 != null) {
                obj.A04 = c54m4;
            }
            if (c54m5 != null) {
                obj.A01 = c54m5;
            }
            if (c39561sd != null) {
                obj.A05 = c39561sd;
            }
            obj.A01();
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
