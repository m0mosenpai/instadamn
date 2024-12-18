package X;

import java.io.IOException;

/* renamed from: X.47B, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C47B {
    public static C47I parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            C39561sd c39561sd = null;
            C54M c54m = null;
            C54M c54m2 = null;
            C54M c54m3 = null;
            C54M c54m4 = null;
            C54M c54m5 = null;
            C47G c47g = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("global_position".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("item_client_gap_rules".equals(A0q)) {
                    c39561sd = AbstractC39551sc.parseFromJson(c16l);
                } else if ("upsell_ci_card".equals(A0q)) {
                    c54m = C54L.parseFromJson(c16l);
                } else if ("upsell_complete_profile_card".equals(A0q)) {
                    c54m2 = C54L.parseFromJson(c16l);
                } else if ("upsell_fbc_card".equals(A0q)) {
                    c54m3 = C54L.parseFromJson(c16l);
                } else if ("upsell_invite_card".equals(A0q)) {
                    c54m4 = C54L.parseFromJson(c16l);
                } else if ("upsell_see_all_su_card".equals(A0q)) {
                    c54m5 = C54L.parseFromJson(c16l);
                } else if ("user_card".equals(A0q)) {
                    c47g = C47C.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C47I(c54m, c54m2, c54m3, c54m4, c54m5, c39561sd, c47g, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
