package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Kph, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46962Kph {
    public static C30541dF parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C30541dF c30541dF = new C30541dF();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("info_center_share".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C910143t parseFromJson = AbstractC910043s.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c30541dF.A02 = arrayList;
                } else if ("info_center_type".equals(A0s)) {
                    c30541dF.A01 = AbstractC47054KrB.A00(c16l.A1Q());
                } else {
                    AbstractC47856LCb.A01(c16l, c30541dF, A0s);
                }
                c16l.A0z();
            }
            return c30541dF;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
