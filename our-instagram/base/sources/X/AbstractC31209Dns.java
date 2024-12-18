package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Dns, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31209Dns {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.FEg] */
    public static C34390FEg parseFromJson(C16L c16l) {
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
                if ("account_list".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            FK7 parseFromJson = AbstractC33647Etx.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A00 = arrayList;
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
