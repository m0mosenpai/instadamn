package X;

import java.io.IOException;

/* renamed from: X.Ibh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41649Ibh {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.5jh, X.HDf] */
    public static C38953HDf parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c124275jh = new C124275jh();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                A00(c16l, c124275jh, AbstractC166997dE.A0s(c16l));
                c16l.A0z();
            }
            return c124275jh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(C16L c16l, C38953HDf c38953HDf, String str) {
        String A1P;
        if ("formatted_media_count".equals(str)) {
            if (c16l.A11() == C16R.A0G) {
                A1P = null;
            } else {
                A1P = c16l.A1P();
            }
            c38953HDf.A02 = A1P;
            return;
        }
        if ("is_effect_page_restricted".equals(str)) {
            c38953HDf.A03 = c16l.A0d();
            return;
        }
        if ("effect_page_restricted_context".equals(str)) {
            c38953HDf.A00 = AbstractC40132Hqz.parseFromJson(c16l);
            return;
        }
        if ("is_trending_for_clips".equals(str)) {
            c16l.A0d();
        } else if ("metadata".equals(str)) {
            c38953HDf.A01 = AbstractC40464Hwt.parseFromJson(c16l);
        } else {
            C37410Gdq.A00(c16l, c38953HDf, str);
        }
    }
}
