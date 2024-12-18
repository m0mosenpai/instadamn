package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class F23 {
    public static C34583FLs parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C34583FLs c34583FLs = new C34583FLs();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("ig_thread_igid".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c34583FLs.A01 = A0m;
                } else if ("viewing_actor_igid".equals(A0s)) {
                    c34583FLs.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("viewed_item_ranges".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            FNP parseFromJson = F22.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c34583FLs.A03 = arrayList;
                } else if ("viewed_timestamp_ms".equals(A0s)) {
                    c34583FLs.A00 = c16l.A0y();
                }
                c16l.A0z();
            }
            return c34583FLs;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
