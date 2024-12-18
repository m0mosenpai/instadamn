package X;

import java.io.IOException;

/* renamed from: X.FVo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34812FVo {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.EfT, X.EDW, X.1um] */
    public static EfT parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                C35073Fck.A00(c16l, c40791um, AbstractC166997dE.A0s(c16l));
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
