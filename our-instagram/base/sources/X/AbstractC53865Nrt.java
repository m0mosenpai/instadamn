package X;

import java.io.IOException;

/* renamed from: X.Nrt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53865Nrt {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.Nrs, java.lang.Object] */
    public static C53864Nrs parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("follower".equals(A0s) || "following".equals(A0s) || "following_and_follower".equals(A0s) || "reciprocal_follower".equals(A0s)) {
                    c16l.A1D();
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
