package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class IQJ {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.HAM, X.1um, X.1ul] */
    public static HAM parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("earliest_request_position".equals(A0s)) {
                    c40791um.A00 = AbstractC166997dE.A0h(c16l);
                } else if ("ads_pool_threshold_for_next_request".equals(A0s)) {
                    c16l.A1D();
                } else if ("injected_medias".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            IES parseFromJson = AbstractC40598HzI.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c40791um.A01 = arrayList;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
