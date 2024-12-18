package X;

/* loaded from: classes9.dex */
public abstract class MYc extends AbstractC154286wd {
    public int A00 = hashCode();
    public final Object A01;
    public final /* synthetic */ C50668MYm A02;

    public MYc(C50668MYm c50668MYm, Object obj) {
        this.A02 = c50668MYm;
        this.A01 = obj;
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        Throwable A01;
        String str;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -1654507659);
        InterfaceC58197Pr3 interfaceC58197Pr3 = this.A02.A03;
        Object obj = this.A01;
        int i = this.A00;
        InterfaceC74303Vl interfaceC74303Vl = (InterfaceC74303Vl) abstractC115105If.A00();
        if ((interfaceC74303Vl == null || (str = ((InterfaceC40821up) interfaceC74303Vl).getErrorMessage()) == null) && ((A01 = abstractC115105If.A01()) == null || (str = A01.getMessage()) == null)) {
            str = "null_response";
        }
        interfaceC58197Pr3.DVK(str, obj, i);
        C0f9.A0A(-2129168281, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1395896285);
        this.A02.A03.Dg2(this.A01, this.A00);
        C0f9.A0A(-471316677, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(588008764);
        this.A02.A03.DgI(this.A01, this.A00);
        C0f9.A0A(-734480273, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(491710892);
        InterfaceC74303Vl interfaceC74303Vl = (InterfaceC74303Vl) obj;
        int A0N = AbstractC167017dG.A0N(interfaceC74303Vl, -1136066491);
        this.A02.A03.DVL(this.A00, this.A01, ((InterfaceC55612h1) interfaceC74303Vl).CR4());
        C0f9.A0A(-1709567310, A0N);
        C0f9.A0A(1945203860, A03);
    }
}
