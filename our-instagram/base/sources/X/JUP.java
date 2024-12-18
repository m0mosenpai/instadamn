package X;

/* loaded from: classes8.dex */
public final class JUP implements C2KV {
    public final JR2 A00;

    public JUP(JR2 jr2) {
        C14360o3.A0B(jr2, 1);
        this.A00 = jr2;
    }

    @Override // X.C2KV
    public final void Cz5(C4JH c4jh) {
        JR2 jr2 = this.A00;
        if (AbstractC43593JPy.A1a(jr2)) {
            InterfaceC50519MRw.A00(jr2).AX3();
            return;
        }
        boolean A05 = C2E9.A05(jr2.A0p());
        int A0o = jr2.A0o();
        if (A05) {
            jr2.A14(A0o);
        } else {
            if (AbstractC43593JPy.A1a(jr2)) {
                return;
            }
            JR2.A0a(jr2, JR2.A06(jr2), A0o, true);
        }
    }
}
