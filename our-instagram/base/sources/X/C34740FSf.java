package X;

import java.io.IOException;

/* renamed from: X.FSf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34740FSf {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.EAd, X.1um, X.1ul] */
    public static C32130EAd parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC58317Pt9.A00(704).equals(A0s)) {
                    c40791um.A01 = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC58317Pt9.A00(836).equals(A0s)) {
                    c40791um.A02 = AbstractC166997dE.A0d(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            c40791um.A00 = new C32075E7z(AbstractC31172DnG.A1b(c40791um.A01), AbstractC31172DnG.A1b(c40791um.A02));
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
