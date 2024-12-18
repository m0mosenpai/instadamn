package X;

import com.instagram.direct.model.DirectMessageEditHistory;
import java.io.IOException;

/* renamed from: X.4xY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC110044xY {
    /* JADX WARN: Type inference failed for: r0v5, types: [com.instagram.direct.model.DirectMessageEditHistory, java.lang.Object] */
    public static DirectMessageEditHistory parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Long l = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("body".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("timestamp".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("body", "DirectMessageEditHistory");
            } else if (l == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("timestamp", "DirectMessageEditHistory");
            } else {
                long longValue = l.longValue();
                C14360o3.A0B(str, 1);
                ?? obj = new Object();
                obj.A01 = str;
                obj.A00 = longValue;
                return obj;
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
