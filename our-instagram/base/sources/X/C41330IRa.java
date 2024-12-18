package X;

import java.io.IOException;

/* renamed from: X.IRa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41330IRa {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.HKs, X.3Vk] */
    public static C39139HKs parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c74293Vk = new C74293Vk();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("requires_review".equals(A0s)) {
                    c74293Vk.A00 = AbstractC166997dE.A0d(c16l);
                } else if ("total_count".equals(A0s)) {
                    c16l.A1D();
                } else {
                    C74313Vm.A00(c16l, c74293Vk, A0s);
                }
                c16l.A0z();
            }
            return c74293Vk;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
