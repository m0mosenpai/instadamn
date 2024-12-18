package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.SpE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63546SpE implements C1N8 {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C63546SpE(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // X.C1N8
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C62731SNv c62731SNv;
        C1Dk A00;
        InterfaceC40711ue A002;
        C2n2 c2n2;
        switch (this.A00) {
            case 0:
                c62731SNv = (C62731SNv) obj;
                ((Waw) this.A01).A00.getValue();
                String str = this.A02;
                try {
                    C64029Sy1 c64029Sy1 = (C64029Sy1) AbstractC58323PtF.A0l(null, SRK.class, "create");
                    C2JM c2jm = c64029Sy1.A00;
                    c2jm.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
                    c64029Sy1.A02 = true;
                    c2jm.A03("first", 10);
                    A00 = c64029Sy1.A00();
                    C14360o3.A07(A00);
                    A002 = C58443PvM.A00();
                    c2n2 = C64272T7b.A00;
                    break;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw AbstractC58318PtA.A0f(e);
                }
            case 1:
                c62731SNv = (C62731SNv) obj;
                IGPaymentMethodsAPI iGPaymentMethodsAPI = ((SMF) this.A01).A01;
                String str2 = this.A02;
                C2JM A0b = AbstractC25225BEi.A0b();
                C2JM A0b2 = AbstractC25225BEi.A0b();
                C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, "FBPAY_HUB", "payment_type");
                C0CA.A00(A0T, str2, "ba_token");
                C0CA.A00(A0T, RealtimeSubscription.GRAPHQL_MQTT_VERSION, "client_mutation_id");
                C0CA.A00(A0T, RealtimeSubscription.GRAPHQL_MQTT_VERSION, AbstractC63083Sc6.A00());
                A00 = new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "data"), "IGFBPayCompletePaypalLinkingMutation", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59869QqF.class, true, null, 96, null, "complete_paypal_linking", AbstractC166987dD.A1E());
                A002 = iGPaymentMethodsAPI.A04;
                c2n2 = AbstractC62382S9h.A01;
                break;
            case 2:
                c62731SNv = (C62731SNv) obj;
                IGPaymentMethodsAPI iGPaymentMethodsAPI2 = ((SMF) this.A01).A01;
                String str3 = this.A02;
                C14360o3.A0B(str3, 0);
                C2JM A0b3 = AbstractC25225BEi.A0b();
                C2JM A0b4 = AbstractC25225BEi.A0b();
                C0CA A0T2 = AbstractC25227BEk.A0T(GraphQlCallInput.A02, "FBPAY_HUB", "payment_type");
                C0CA.A00(A0T2, str3, "billing_agreement_id");
                C0CA.A00(A0T2, RealtimeSubscription.GRAPHQL_MQTT_VERSION, "client_mutation_id");
                A00 = new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T2, A0b3, "data"), "IGFBPayCancelPayPalMutation", A0b3.getParamsCopy(), A0b4.getParamsCopy(), C59866QqC.class, true, null, 40, "data", "cancel_paypal_ba", AbstractC166987dD.A1E());
                A002 = iGPaymentMethodsAPI2.A04;
                c2n2 = AbstractC62382S9h.A00;
                break;
            default:
                C62523SEz c62523SEz = ((SMH) this.A01).A03;
                String str4 = this.A02;
                C0CA A0T3 = AbstractC25227BEk.A0T(GraphQlCallInput.A02, AbstractC166997dE.A0n(), "client_mutation_id");
                C0CA.A00(A0T3, c62523SEz.A00.userId, "actor_id");
                C0CA.A00(A0T3, str4, "logging_id");
                C0CA.A00(A0T3, str4, AbstractC63083Sc6.A00());
                C0CA.A00(A0T3, "instagram://shop_pay_did_finish", "app_url");
                C0CA.A00(A0T3, "FBPAY_HUB", "payment_type");
                C2JM A0b5 = AbstractC25225BEi.A0b();
                return C60622REh.A02((C62731SNv) obj, c62523SEz.A01, new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T3, A0b5, "input"), "IGFBPayShopPayInitLinkMutation", A0b5.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C59546QhK.class, true, null, 12, "input", null, AbstractC166987dD.A1E()), new C64285T7u(c62523SEz, 10), S84.A00);
        }
        return C60622REh.A00(c62731SNv, A002, A00, c2n2);
    }
}
