package X;

import java.io.IOException;

/* renamed from: X.9yU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226119yU {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.6RO, X.6RN, java.lang.Object] */
    public static C6RN parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                ADU.A01(c16l, obj, AbstractC166997dE.A0s(c16l));
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
