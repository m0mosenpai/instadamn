package X;

/* loaded from: classes6.dex */
public final class EUL extends C1P1 {
    public final String A00;
    public final String A01;

    public EUL(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-2031911770);
        C41451vu.A01.E4s(new C36049Fvl(this.A01, C05F.A15, AbstractC31180DnO.A0h(abstractC115105If)));
        C0f9.A0A(-2108915216, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.1vw, java.lang.Object] */
    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(950062563);
        C41451vu.A01.E4s(new Object());
        C0f9.A0A(277773874, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1832178710);
        C41451vu.A01.E4s(new C36042Fve(this.A00));
        C0f9.A0A(-1587972338, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C41451vu c41451vu;
        InterfaceC41471vw c36050Fvm;
        int A03 = C0f9.A03(-937154622);
        EDX edx = (EDX) obj;
        int A032 = C0f9.A03(566002071);
        if (!(edx instanceof EfW) && !edx.A04) {
            c41451vu = C41451vu.A01;
            c36050Fvm = new C36049Fvl(this.A01, C05F.A15, edx.getErrorMessage());
        } else {
            c41451vu = C41451vu.A01;
            c36050Fvm = new C36050Fvm(null, this.A01, this.A00);
        }
        c41451vu.E4s(c36050Fvm);
        C0f9.A0A(-506244053, A032);
        C0f9.A0A(885593177, A03);
    }
}
