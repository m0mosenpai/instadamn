package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hyy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40578Hyy {
    public static C40945IBs parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C40945IBs c40945IBs = new C40945IBs();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("gif_tray_saved_gif".equals(AbstractC166997dE.A0s(c16l))) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C45026JwH parseFromJson = AbstractC47868LCo.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c40945IBs.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c40945IBs;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
