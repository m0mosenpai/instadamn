package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class F5W {
    public static C34811kM parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C34811kM c34811kM = new C34811kM();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c34811kM.A00 = AbstractC31172DnG.A0o(c16l);
                } else {
                    ArrayList arrayList = null;
                    if ("item_ids".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c34811kM.A02 = arrayList;
                    } else if (AbstractC111324zv.A00(2842).equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c34811kM.A01 = arrayList;
                    } else {
                        AbstractC43669JTd.A01(c16l, c34811kM, A0q);
                    }
                }
                c16l.A0z();
            }
            return c34811kM;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
