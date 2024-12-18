package X;

/* renamed from: X.WVo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70436WVo implements InterfaceC48212Jk {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C65886Tvq A01;
    public final /* synthetic */ String A02;

    public C70436WVo(C65886Tvq c65886Tvq, String str, long j) {
        this.A01 = c65886Tvq;
        this.A02 = str;
        this.A00 = j;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        String localizedMessage = th.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "";
        }
        C65886Tvq c65886Tvq = this.A01;
        String str = this.A02;
        long j = this.A00;
        C18920wW c18920wW = c65886Tvq.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ctd_automated_responses_gql_mutation_error");
        if (A00.isSampled()) {
            C65886Tvq.A01(A00, c65886Tvq, str, j);
            A00.AAP("error_reason", localizedMessage);
            A00.Cht();
        }
    }
}
