package X;

/* renamed from: X.Eu3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33653Eu3 {
    public static final String A00(C16L c16l) {
        if (c16l.A11() == C16R.A0D) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            while (c16l.A1J() != C16R.A09) {
                if (c16l.A1J() != C16R.A0C) {
                    if (c16l.A11().A03) {
                        A1C.append(c16l.A1P());
                        A1C.append("\n");
                    } else {
                        c16l.A0z();
                    }
                } else {
                    while (c16l.A1J() != C16R.A08) {
                        A1C.append(c16l.A1P());
                        A1C.append("\n");
                    }
                }
            }
            return AbstractC25228BEl.A1A(AbstractC166987dD.A19(A1C));
        }
        c16l.A0z();
        return null;
    }
}
