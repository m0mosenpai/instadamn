package X;

/* renamed from: X.NxL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54184NxL {
    public static void A00(C16L c16l, N3P n3p, String str) {
        if ("page_token".equals(str)) {
            n3p.A06 = AbstractC167017dG.A0m(c16l);
            return;
        }
        if ("has_more".equals(str)) {
            n3p.A0B = c16l.A0d();
            return;
        }
        if ("more_results_header".equals(str)) {
            n3p.A08 = AbstractC167017dG.A0m(c16l);
            return;
        }
        if ("entity_results_header".equals(str)) {
            n3p.A05 = AbstractC167017dG.A0m(c16l);
            return;
        }
        if ("rank_token".equals(str)) {
            n3p.A07 = AbstractC167017dG.A0m(c16l);
            return;
        }
        if ("inform_module".equals(str)) {
            n3p.A01 = AbstractC40607HzR.parseFromJson(c16l);
            return;
        }
        if ("see_more".equals(str)) {
            n3p.A04 = VWW.parseFromJson(c16l);
            return;
        }
        if ("media_grid".equals(str)) {
            n3p.A02 = AbstractC40794I5w.parseFromJson(c16l);
            return;
        }
        if ("high_confidence_module".equals(str)) {
            n3p.A00 = AbstractC68484VSp.parseFromJson(c16l);
        } else if ("other_results".equals(str)) {
            n3p.A03 = AbstractC54183NxK.parseFromJson(c16l);
        } else {
            C55702hA.A01(c16l, n3p, str);
        }
    }
}
