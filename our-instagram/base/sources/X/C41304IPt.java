package X;

import java.io.IOException;

/* renamed from: X.IPt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41304IPt {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.5jh, X.HDm] */
    public static C38960HDm parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c124275jh = new C124275jh();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                C37410Gdq.A00(c16l, c124275jh, AbstractC166997dE.A0s(c16l));
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
