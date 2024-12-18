package X;

import java.io.IOException;

/* renamed from: X.VSh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68476VSh {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.Vhz] */
    public static C69109Vhz parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("creator_igid".equals(A0s)) {
                    obj.A02 = AbstractC31173DnH.A0h(c16l);
                } else if ("is_subscriber".equals(A0s)) {
                    obj.A01 = AbstractC166997dE.A0d(c16l);
                } else if ("is_follower".equals(A0s)) {
                    obj.A00 = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
