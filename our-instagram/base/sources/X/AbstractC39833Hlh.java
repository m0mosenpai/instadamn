package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hlh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39833Hlh {
    public static AnonymousClass689 parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(3539);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("collaborators".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38705H2q parseFromJson = AbstractC39832Hlg.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("invitees".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("collaborators", c16l, A00);
            } else if (arrayList2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("invitees", c16l, A00);
            } else {
                return new AnonymousClass689(arrayList, arrayList2);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
