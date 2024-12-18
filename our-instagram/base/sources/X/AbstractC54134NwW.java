package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.NwW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54134NwW {
    public static O49 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            O49 o49 = new O49();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("participations".equals(AbstractC166997dE.A0s(c16l))) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C51802Mv6 parseFromJson = AbstractC53789Nqf.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    o49.A00 = arrayList;
                }
                c16l.A0z();
            }
            return o49;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
