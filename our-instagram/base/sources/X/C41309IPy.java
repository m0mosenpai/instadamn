package X;

import java.io.IOException;

/* renamed from: X.IPy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41309IPy {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.5jh, X.HDi] */
    public static C38956HDi parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c124275jh = new C124275jh();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("original_media_id".equals(A0s)) {
                    C14360o3.A0B(AbstractC167017dG.A0m(c16l), 0);
                } else if ("formatted_mashups_count".equals(A0s)) {
                    c124275jh.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("should_show_see_insights_cta".equals(A0s)) {
                    c124275jh.A02 = c16l.A0d();
                } else if ("insights_tip".equals(A0s)) {
                    c124275jh.A00 = AbstractC40143HrC.parseFromJson(c16l);
                } else {
                    C37410Gdq.A00(c16l, c124275jh, A0s);
                }
                c16l.A0z();
            }
            c124275jh.A01();
            return c124275jh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
