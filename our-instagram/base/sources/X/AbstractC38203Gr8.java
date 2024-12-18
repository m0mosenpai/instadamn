package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Gr8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38203Gr8 {
    public static C38204Gr9 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38204Gr9 c38204Gr9 = new C38204Gr9();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("hashtags".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C68090V9z parseFromJson = AbstractC40797I5z.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c38204Gr9.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c38204Gr9;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
