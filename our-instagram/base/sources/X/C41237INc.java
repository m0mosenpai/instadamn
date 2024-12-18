package X;

import java.io.IOException;

/* renamed from: X.INc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41237INc {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.1um, X.H8v, X.1ul] */
    public static C38847H8v parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("blocked_accounts".equals(A0s)) {
                    c40791um.A02 = AbstractC39734Hk4.parseFromJson(c16l);
                } else if ("blocked_categories".equals(A0s)) {
                    c40791um.A01 = AbstractC39727Hjx.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            C51774Mue c51774Mue = c40791um.A02;
            C14360o3.A0A(c51774Mue);
            C51773Mud c51773Mud = c40791um.A01;
            C14360o3.A0A(c51773Mud);
            c40791um.A00 = new C51771Mub(c51773Mud, c51774Mue);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
