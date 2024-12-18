package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class I83 {
    public static C38614GyH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38614GyH c38614GyH = new C38614GyH();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("sectional_items".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C51757Mtg parseFromJson = I85.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c38614GyH.A01 = arrayList;
                } else if ("pagination_token".equals(A0s)) {
                    c38614GyH.A00 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC37300Gc1.A1W(A0s)) {
                    c38614GyH.A02 = c16l.A0d();
                }
                c16l.A0z();
            }
            return c38614GyH;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
