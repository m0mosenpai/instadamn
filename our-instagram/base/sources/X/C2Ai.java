package X;

/* renamed from: X.2Ai, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2Ai {
    public static C2Ai A00;
    public static C2Ai A01;
    public static final C2Ai A02;

    public abstract InterfaceC92344Bp A00(C92304Bk c92304Bk, InterfaceC92334Bn interfaceC92334Bn, C2BC c2bc, String str, int i, int i2);

    public abstract String A01();

    static {
        C2Ai c2Ai = new C2Ai() { // from class: X.2Aj
            @Override // X.C2Ai
            public final String A01() {
                return "Apache";
            }

            @Override // X.C2Ai
            public final InterfaceC92344Bp A00(C92304Bk c92304Bk, InterfaceC92334Bn interfaceC92334Bn, C2BC c2bc, String str, int i, int i2) {
                C4CB c4cb = new C4CB(new C4CC(), str, i, i2);
                if (c2bc != null) {
                    c4cb.addTransferListener(c2bc);
                }
                return c4cb;
            }
        };
        A02 = c2Ai;
        A00 = c2Ai;
        A01 = c2Ai;
    }
}
