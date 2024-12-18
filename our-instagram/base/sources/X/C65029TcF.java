package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;

/* renamed from: X.TcF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65029TcF extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ C58444PvN A00;
    public final /* synthetic */ SNN A01;
    public final /* synthetic */ C49352Or A02;
    public final /* synthetic */ C64202T3r A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65029TcF(C58444PvN c58444PvN, SNN snn, C49352Or c49352Or, C64202T3r c64202T3r, String str, String str2, String str3, String str4) {
        super(1);
        this.A04 = str;
        this.A05 = str2;
        this.A02 = c49352Or;
        this.A06 = str3;
        this.A07 = str4;
        this.A03 = c64202T3r;
        this.A00 = c58444PvN;
        this.A01 = snn;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        C2IE c2ie = (C2IE) obj;
        C14360o3.A0B(c2ie, 0);
        C04060Jx c04060Jx = GraphQlCallInput.A02;
        C0CA A0T = AbstractC25227BEk.A0T(c04060Jx, this.A04, "credit_card_id");
        A0T.A0E(AbstractC25227BEk.A0T(c04060Jx, this.A05, "sensitive_string_value"), "csc");
        C0CA.A00(A0T, this.A02.A00(), "device_key_pub");
        C0CA.A00(A0T, c2ie.A00(), "encryption_key_pub");
        C0CA.A00(A0T, this.A06, "encryption_key_signature");
        String str2 = this.A07;
        if (str2 != null) {
            A0T.A0E(AbstractC25227BEk.A0T(c04060Jx, str2, "sensitive_string_value"), "platform_trust_token");
        }
        C64202T3r c64202T3r = this.A03;
        C19U A01 = c64202T3r.A00.A01(C19T.A1k);
        if (A01 != null && (str = A01.A01) != null) {
            C0CA.A00(A0T, str, "family_device_id");
        }
        C2JM A0b = AbstractC25225BEi.A0b();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "input"), "GetEncryptedCardNumber", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C213279co.class, false, null, 0, null, "autofill_encrypted_credit_card", AbstractC166987dD.A1E());
        C40701ud c40701ud = c64202T3r.A02;
        C58444PvN c58444PvN = this.A00;
        SNN snn = this.A01;
        C60622REh.A02(null, c40701ud, pandoGraphQLRequest, new C23527Abh(1, snn, c2ie, c58444PvN), new C23527Abh(2, c64202T3r, c58444PvN, snn));
        return C0eB.A00;
    }
}
