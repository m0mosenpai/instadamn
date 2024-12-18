package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.NxO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54187NxO {
    public static O5O parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            O5O o5o = new O5O();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("mapQueries".equals(AbstractC166997dE.A0s(c16l))) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            NUN parseFromJson = AbstractC54188NxP.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    o5o.A00 = arrayList;
                }
                c16l.A0z();
            }
            return o5o;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
