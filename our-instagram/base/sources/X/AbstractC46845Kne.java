package X;

import java.io.IOException;

/* renamed from: X.Kne, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46845Kne {
    /* JADX WARN: Type inference failed for: r1v2, types: [X.L7G, java.lang.Object] */
    public static L7G parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("style".equals(AbstractC166997dE.A0s(c16l))) {
                    num = AbstractC166997dE.A0h(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (num != null) {
                obj.A00 = num.intValue();
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
