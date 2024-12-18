package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class A0A {
    public static C9BH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C9BH c9bh = new C9BH(6);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("bleeps_list".equals(AbstractC166997dE.A0s(c16l))) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C51737MtK parseFromJson = A09.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c9bh.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c9bh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
