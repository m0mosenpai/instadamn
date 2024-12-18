package X;

/* loaded from: classes11.dex */
public abstract class U3D {
    public static void A00(C16L c16l, U3C u3c, String str) {
        String str2 = null;
        if ("page_token".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str2 = c16l.A1P();
            }
            u3c.A02 = str2;
            return;
        }
        if ("has_more".equals(str)) {
            u3c.A04 = c16l.A0d();
            return;
        }
        if ("rank_token".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str2 = c16l.A1P();
            }
            u3c.A03 = str2;
            return;
        }
        if ("clear_client_cache".equals(str)) {
            u3c.A07 = c16l.A0d();
            return;
        }
        if ("inform_module".equals(str)) {
            u3c.A00 = AbstractC40607HzR.parseFromJson(c16l);
            return;
        }
        if ("see_more".equals(str)) {
            u3c.A01 = VWW.parseFromJson(c16l);
            return;
        }
        if ("is_meta_ai_heuristic_enabled".equals(str)) {
            u3c.A05 = c16l.A0d();
        } else if ("is_meta_ai_prompt_echo_enabled".equals(str)) {
            u3c.A06 = c16l.A0d();
        } else {
            C55702hA.A01(c16l, u3c, str);
        }
    }
}
