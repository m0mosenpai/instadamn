package X;

import com.facebook.pando.PandoGraphQLRequest;

/* renamed from: X.M6j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50020M6j implements Runnable {
    public final /* synthetic */ C91P A00;
    public final /* synthetic */ InterfaceC50470MPy A01;
    public final /* synthetic */ L6Q A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public RunnableC50020M6j(C91P c91p, InterfaceC50470MPy interfaceC50470MPy, L6Q l6q, String str, String str2) {
        this.A02 = l6q;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = c91p;
        this.A01 = interfaceC50470MPy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L6Q l6q = this.A02;
        String str = this.A03;
        String str2 = this.A04;
        C91P c91p = this.A00;
        InterfaceC50470MPy interfaceC50470MPy = this.A01;
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A03("setting_key", 4);
        A0b.A04("new_value", str2);
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IGDirectUpdateSecureConsentFrameworkStringSetting", A0b.getParamsCopy(), A0b2.getParamsCopy(), QlT.class, true, null, 0, null, "update_scf_string_settings", AbstractC166987dD.A1E());
        AbstractC40691uc.A01(l6q.A00).ATV(new C48139LSo(c91p, l6q, str), new LT1(interfaceC50470MPy, 12), pandoGraphQLRequest);
    }
}
