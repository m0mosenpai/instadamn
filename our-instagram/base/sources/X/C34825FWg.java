package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.FWg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34825FWg {
    public static C32181ECc parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32181ECc c32181ECc = new C32181ECc();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("pinned_channels_list".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C44P parseFromJson = C44L.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c32181ECc.A01 = arrayList;
                } else if ("all_channels_list".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C44P parseFromJson2 = C44L.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c32181ECc.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, c32181ECc, A0s);
                }
                c16l.A0z();
            }
            return c32181ECc;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
