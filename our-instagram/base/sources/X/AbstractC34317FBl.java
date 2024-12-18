package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.FBl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34317FBl {
    public static FO4 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            FO4 fo4 = new FO4();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("creation_time".equals(A0s)) {
                    fo4.A00 = c16l.A0y();
                } else {
                    ArrayList arrayList = null;
                    if ("media_id".equals(A0s)) {
                        fo4.A03 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC111324zv.A00(2662).equals(A0s)) {
                        fo4.A02 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC111324zv.A00(2604).equals(A0s)) {
                        fo4.A07 = c16l.A0d();
                    } else if ("analytics_module_name".equals(A0s)) {
                        fo4.A01 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC111324zv.A00(2726).equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        fo4.A05 = arrayList;
                    } else if ("radio_type".equals(A0s)) {
                        fo4.A04 = AbstractC167017dG.A0m(c16l);
                    }
                }
                c16l.A0z();
            }
            return fo4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
