package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hye, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40558Hye {
    public static C41120IIl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C41120IIl c41120IIl = new C41120IIl();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("answers".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C41095IHm parseFromJson = AbstractC40554Hya.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c41120IIl.A04 = arrayList;
                } else if ("qid".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c41120IIl.A01 = A0m;
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c41120IIl.A02 = A0m2;
                } else if ("total_resonders".equals(A0s)) {
                    c41120IIl.A00 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC37300Gc1.A1E(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c41120IIl.A03 = A0m3;
                }
                c16l.A0z();
            }
            return c41120IIl;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
