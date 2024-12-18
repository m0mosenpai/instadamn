package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Ny6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54227Ny6 {
    public static C95114Pw parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C95114Pw c95114Pw = new C95114Pw();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("pending_story_likes".equals(AbstractC166997dE.A0s(c16l))) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C54785OJb parseFromJson = AbstractC54228Ny7.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c95114Pw.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c95114Pw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
