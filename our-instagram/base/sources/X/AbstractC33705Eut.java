package X;

import java.io.IOException;

/* renamed from: X.Eut, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33705Eut {
    /* JADX WARN: Type inference failed for: r0v6, types: [X.Eus, java.lang.Object] */
    public static C33704Eus parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                c16l.A1J();
                c16l.A0z();
            }
            return new Object();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
