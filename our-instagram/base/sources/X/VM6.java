package X;

/* loaded from: classes11.dex */
public abstract class VM6 {
    public static final Integer A00(C6FQ c6fq, C6FW c6fw) {
        C4RP c4rp;
        Integer valueOf;
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            String A0E = AbstractC65702TsY.A0P(c6fw, 0).A0E();
            if (A0E != null) {
                WYB A00 = AnonymousClass634.A00(c6fg, A0E);
                if (A00 != null && (c4rp = A00.A03) != null && (valueOf = Integer.valueOf((int) c4rp.A0I.A08())) != null) {
                    return valueOf;
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return 0;
    }
}
