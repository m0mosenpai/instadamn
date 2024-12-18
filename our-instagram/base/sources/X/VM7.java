package X;

/* loaded from: classes11.dex */
public abstract class VM7 {
    public static final C0eB A00(C6FQ c6fq, C6FW c6fw) {
        C6FG c6fg = c6fq.A03;
        if (c6fg == null) {
            return null;
        }
        int A0D = AbstractC65702TsY.A0D(c6fw);
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        String A0E = ((C102884kP) A02).A0E();
        if (A0E != null) {
            WYB A00 = AnonymousClass634.A00(c6fg, A0E);
            if (A00 == null) {
                return null;
            }
            C4RP c4rp = A00.A03;
            if (c4rp != null) {
                c4rp.A0I.A0C(A0D);
            }
            return C0eB.A00;
        }
        throw AbstractC166997dE.A0g();
    }
}
