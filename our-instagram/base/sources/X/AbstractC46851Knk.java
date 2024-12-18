package X;

import java.io.IOException;

/* renamed from: X.Knk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46851Knk {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.3jU, java.lang.Object, X.KVa] */
    public static C45949KVa parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                AbstractC81023jW.A01(c16l, obj, AbstractC166997dE.A0s(c16l));
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
