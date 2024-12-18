package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;

/* renamed from: X.FXp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34855FXp {
    public static EDT parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            EDT edt = new EDT();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC31171DnF.A1a(A0s)) {
                    edt.A07 = AbstractC167017dG.A0m(c16l);
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0s)) {
                    edt.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("media_igid".equals(A0s)) {
                    edt.A04 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC31198Dnh.A00().equals(A0s)) {
                    edt.A06 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC58317Pt9.A00(19).equals(A0s)) {
                    edt.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("media_id".equals(A0s)) {
                    edt.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("reel_id".equals(A0s)) {
                    edt.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("author_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    edt.A00 = A0m;
                } else if ("can_view".equals(A0s)) {
                    edt.A08 = c16l.A0d();
                } else {
                    C55702hA.A01(c16l, edt, A0s);
                }
                c16l.A0z();
            }
            return edt;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
