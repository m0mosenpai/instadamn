package X;

/* loaded from: classes8.dex */
public final class JYU implements InterfaceC41501vz {
    public final JR2 A00;

    public JYU(JR2 jr2) {
        C14360o3.A0B(jr2, 1);
        this.A00 = jr2;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        C43777JXq c43777JXq;
        int A03 = C0f9.A03(452748147);
        C48022Ip c48022Ip = (C48022Ip) obj;
        int A0N = AbstractC167017dG.A0N(c48022Ip, -1220298400);
        JR2 jr2 = this.A00;
        C44113Jed c44113Jed = jr2.A0d;
        if (c48022Ip.A03 && c44113Jed != null && !jr2.A1B(c44113Jed.A00) && !C2E9.A07(jr2.A0p()) && !AbstractC43593JPy.A1a(jr2)) {
            c44113Jed.A00(jr2.A0s());
        }
        AbstractC46972Dl abstractC46972Dl = c48022Ip.A00;
        if (abstractC46972Dl != null && c44113Jed != null) {
            c44113Jed.A00(abstractC46972Dl);
        }
        if (c48022Ip.A02 && (c43777JXq = jr2.A0m) != null) {
            c43777JXq.A01(true);
        }
        if (AbstractC43593JPy.A1a(jr2)) {
            C51u A0x = jr2.A0x(jr2.A0o());
            InterfaceC50519MRw.A00(jr2).Ecm(AbstractC166987dD.A0H(A0x.A00), AbstractC166987dD.A1a(A0x.A01));
        } else {
            jr2.A17(null);
        }
        C0f9.A0A(553810819, A0N);
        C0f9.A0A(-1786269348, A03);
    }
}
