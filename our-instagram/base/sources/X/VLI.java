package X;

/* loaded from: classes11.dex */
public abstract class VLI {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String A00 = C6AN.A00(c6fw.A01());
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            AnonymousClass630 A02 = AnonymousClass634.A02(c6fg);
            C131845xK c131845xK = new C131845xK(c6fq);
            if (AbstractC79383gk.A03()) {
                C1LN.A01("Bloks Reflow");
                C102884kP A07 = A02.A07();
                if (A07 == C6AU.A00(null, new C139986Vc(c131845xK, A00), A07)) {
                    C1LN.A00();
                    return null;
                }
                throw new IllegalStateException("Reflow traversal produced an updated component");
            }
            throw new RuntimeException("Accessing state is only supported from the UI Thread");
        }
        throw AbstractC166997dE.A0g();
    }
}
