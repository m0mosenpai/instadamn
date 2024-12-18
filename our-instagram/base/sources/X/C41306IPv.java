package X;

import java.io.IOException;

/* renamed from: X.IPv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41306IPv {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.5jh, X.HDe] */
    public static C38952HDe parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c124275jh = new C124275jh();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37304Gc5.A1Z(c16l, A0q)) {
                    c124275jh.A00 = AbstractC39860Hm9.parseFromJson(c16l);
                } else {
                    C37410Gdq.A00(c16l, c124275jh, A0q);
                }
                c16l.A0z();
            }
            return c124275jh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
