package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.SqO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63616SqO implements InterfaceC58362lv {
    public final /* synthetic */ C58444PvN A00;
    public final /* synthetic */ S25 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C63616SqO(C58444PvN c58444PvN, S25 s25, String str, String str2) {
        this.A01 = s25;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = c58444PvN;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C63406Sjd c63406Sjd = (C63406Sjd) obj;
        if (C63406Sjd.A0J(c63406Sjd)) {
            Object A08 = C63406Sjd.A08(c63406Sjd);
            String str = this.A03;
            String str2 = this.A02;
            C58444PvN c58444PvN = this.A00;
            C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, A08, "platform_trust_token");
            C0CA.A00(A0T, str2, "device_key_pub");
            C0CA.A00(A0T, str, "family_device_id");
            C0CA.A00(A0T, "IAB_AUTOFILL_UNBOUND_CARD_TRUSTED_DEVICE_CHAIN", "payment_type");
            C0CA.A00(A0T, C2O0.A00, "session_id_for_logging");
            try {
                Object A0d = AbstractC25234BEr.A0d(C62778SQv.class);
                C14360o3.A0C(A0d, "null cannot be cast to non-null type com.fbpay.w3c.api.AddCreditCardsToAutofillMutation.BuilderForInput");
                C64066Syc c64066Syc = (C64066Syc) A0d;
                C2JM c2jm = c64066Syc.A00;
                AbstractC31173DnH.A1M(A0T, c2jm.A00, "input");
                c64066Syc.A01 = true;
                c2jm.A04("legacy_dev_pub_key", str2);
                c64066Syc.A02 = true;
                c2jm.A04("shared_dev_pub_key", str2);
                c64066Syc.A03 = true;
                PandoGraphQLRequest A00 = c64066Syc.A00();
                C2FP.A06().A00.A00.ATV(new C64006Sxd(c58444PvN, 1), new C58510Pwe(c58444PvN, 1), A00);
                return;
            } catch (Exception e) {
                if (!(e instanceof ClassNotFoundException) && !(e instanceof IllegalAccessException) && !(e instanceof InstantiationException) && !(e instanceof InvocationTargetException) && !(e instanceof NoSuchMethodException)) {
                    throw e;
                }
                throw AbstractC58318PtA.A0f(e);
            }
        }
        this.A00.A03(SSG.A01(c63406Sjd.A02));
    }
}
