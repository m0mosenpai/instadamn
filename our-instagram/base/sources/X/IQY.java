package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class IQY {
    public static HAN parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            HAN han = new HAN();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("translation".equals(A0s)) {
                    han.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("comment_translations".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            L0A parseFromJson = AbstractC40643I0b.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    han.A01 = arrayList;
                } else {
                    C55702hA.A01(c16l, han, A0s);
                }
                c16l.A0z();
            }
            return han;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
