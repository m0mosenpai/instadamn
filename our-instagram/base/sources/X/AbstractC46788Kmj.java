package X;

import java.io.IOException;

/* renamed from: X.Kmj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46788Kmj {
    public static C45113Jxi parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C45113Jxi c45113Jxi = new C45113Jxi();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("draft_id".equals(A0s)) {
                    c45113Jxi.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("media_edits".equals(A0s)) {
                    c45113Jxi.A01 = AbstractC203258yi.parseFromJson(c16l);
                } else if ("persisted_media_info".equals(A0s)) {
                    c45113Jxi.A02 = AbstractC196968nR.parseFromJson(c16l);
                } else if ("date_created".equals(A0s)) {
                    c45113Jxi.A00 = c16l.A0y();
                } else if ("cover_file_path".equals(A0s)) {
                    c45113Jxi.A03 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c45113Jxi;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
