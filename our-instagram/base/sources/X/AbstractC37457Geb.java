package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Geb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37457Geb {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.IEa, java.lang.Object] */
    public static C41005IEa parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("preview_comments".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C38891rO parseFromJson = AbstractC38841rG.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A01 = arrayList;
                } else if ("comment_count".equals(A0q)) {
                    obj.A00 = Integer.valueOf(c16l.A1D());
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
