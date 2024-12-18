package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HyZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40553HyZ {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.IEH, java.lang.Object] */
    public static IEH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("threads".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38634Gyb parseFromJson = AbstractC40471Hx4.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A01 = arrayList;
                } else if ("quick_promotion_id".equals(A0s)) {
                    obj.A00 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
