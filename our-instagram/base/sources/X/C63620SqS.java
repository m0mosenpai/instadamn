package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;

/* renamed from: X.SqS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63620SqS implements InterfaceC58362lv {
    public final /* synthetic */ C58444PvN A00;
    public final /* synthetic */ C49352Or A01;
    public final /* synthetic */ C64202T3r A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C63620SqS(C58444PvN c58444PvN, C49352Or c49352Or, C64202T3r c64202T3r, String str, String str2) {
        this.A00 = c58444PvN;
        this.A02 = c64202T3r;
        this.A03 = str;
        this.A01 = c49352Or;
        this.A04 = str2;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        String str;
        C63406Sjd c63406Sjd = (C63406Sjd) obj;
        if (C63406Sjd.A0G(c63406Sjd)) {
            this.A00.A03(SSG.A01(new Rk5(this.A02)));
            return;
        }
        if (!C63406Sjd.A0J(c63406Sjd)) {
            return;
        }
        String str2 = (String) C63406Sjd.A08(c63406Sjd);
        C64202T3r c64202T3r = this.A02;
        String str3 = this.A03;
        C58444PvN c58444PvN = this.A00;
        C49352Or c49352Or = this.A01;
        String str4 = this.A04;
        String A00 = c49352Or.A00();
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, str3, "credit_card_id");
        C0CA.A00(A0T, A00, "device_key_pub");
        C2JO c2jo = new C2JO();
        c2jo.A09("$e2ee", "sensitive_string_value");
        A0T.A0E(c2jo.A02(), "partner_api_secret");
        if (str2 != null) {
            C2JO c2jo2 = new C2JO();
            c2jo2.A09(str2, "sensitive_string_value");
            A0T.A0E(c2jo2.A02(), "platform_trust_token");
        }
        C19U A01 = c64202T3r.A00.A01(C19T.A1k);
        if (A01 != null && (str = A01.A01) != null) {
            C0CA.A00(A0T, str, "family_device_id");
        }
        if (str4 != null) {
            C0CA.A00(A0T, str4, "payment_type");
        }
        C2JM A0b = AbstractC25225BEi.A0b();
        C60622REh.A02(null, c64202T3r.A02, new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "input"), "BindCreditCard", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C59853Qpp.class, true, null, 64, null, "add_credit_card_proof_to_autofill", AbstractC166987dD.A1E()), new C64285T7u(c58444PvN, 12), new C23526Abg(1, c58444PvN, c64202T3r));
    }
}
