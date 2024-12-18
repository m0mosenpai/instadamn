package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.NsU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53898NsU {
    public static JWd parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            JWd jWd = new JWd();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("shortwaveId".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    jWd.A01 = A0m;
                } else if ("characterBased".equals(A0s)) {
                    jWd.A02 = c16l.A0d();
                } else if ("detailedTranscriptions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C25547BRj parseFromJson = VSY.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    jWd.A00 = arrayList;
                }
                c16l.A0z();
            }
            return jWd;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
