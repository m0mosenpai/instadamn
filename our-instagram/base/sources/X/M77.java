package X;

import com.facebook.pando.PandoGraphQLRequest;

/* loaded from: classes8.dex */
public final class M77 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C91P A02;
    public final /* synthetic */ InterfaceC50470MPy A03;
    public final /* synthetic */ L6Q A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public M77(C91P c91p, InterfaceC50470MPy interfaceC50470MPy, L6Q l6q, int i, int i2, boolean z, boolean z2) {
        this.A04 = l6q;
        this.A05 = z;
        this.A06 = z2;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = c91p;
        this.A03 = interfaceC50470MPy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L6Q l6q = this.A04;
        boolean z = this.A05;
        boolean z2 = this.A06;
        int i = this.A01;
        int i2 = this.A00;
        C91P c91p = this.A02;
        InterfaceC50470MPy interfaceC50470MPy = this.A03;
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        Integer valueOf = Integer.valueOf(i2);
        A0b.A03("setting_key", valueOf);
        boolean A1W = AbstractC167007dF.A1W(valueOf);
        Boolean valueOf2 = Boolean.valueOf(z2);
        A0b.A02("new_value", valueOf2);
        boolean A1W2 = AbstractC167007dF.A1W(valueOf2);
        C18C.A0E(A1W);
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25227BEk.A0U(A1W2), "IGDirectUpdateSecureConsentFrameworkBoolSetting", A0b.getParamsCopy(), A0b2.getParamsCopy(), QlS.class, true, null, 0, null, "update_scf_bool_settings", AbstractC166987dD.A1E());
        AbstractC40691uc.A01(l6q.A00).ATV(new C48141LSq(c91p, l6q, i, i2, z), new LT1(interfaceC50470MPy, 11), pandoGraphQLRequest);
    }
}
