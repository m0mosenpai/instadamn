package X;

/* loaded from: classes11.dex */
public abstract class VM4 {
    public static final Boolean A00(C6FQ c6fq, C6FW c6fw) {
        WYB A00;
        Float f;
        String A0E = AbstractC65702TsY.A0P(c6fw, 0).A0E();
        if (A0E != null) {
            C6FG c6fg = c6fq.A03;
            if (c6fg != null && (A00 = AnonymousClass634.A00(c6fg, A0E)) != null) {
                C4RP c4rp = A00.A03;
                if (c4rp != null) {
                    f = Float.valueOf(c4rp.A0I.A0Q);
                } else {
                    f = null;
                }
                return Boolean.valueOf(C14360o3.A0I(f, 0.0f));
            }
            return false;
        }
        throw AbstractC166997dE.A0g();
    }
}
