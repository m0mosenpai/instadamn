package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI;

/* renamed from: X.SpH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63549SpH implements C1N8 {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public C63549SpH(Object obj, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // X.C1N8
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        if (this.A00 != 0) {
            C62523SEz c62523SEz = ((SMH) this.A01).A03;
            String str = this.A03;
            String str2 = this.A02;
            C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, AbstractC166997dE.A0n(), "client_mutation_id");
            C0CA.A00(A0T, str, "logging_id");
            C0CA.A00(A0T, str2, "payment_type");
            C2JM A0b = AbstractC25225BEi.A0b();
            return C60622REh.A02((C62731SNv) obj, c62523SEz.A01, new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "input"), "IGFBPayAddShopPayQuery", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C59544QhI.class, false, null, 64, null, null, AbstractC166987dD.A1E()), new C64285T7u(c62523SEz, 9), S84.A00);
        }
        IGPaymentMethodsAPI iGPaymentMethodsAPI = ((SMF) this.A01).A01;
        String str3 = this.A02;
        String str4 = this.A03;
        C14360o3.A0B(str3, 0);
        C2JM A0b2 = AbstractC25225BEi.A0b();
        C2JM A0b3 = AbstractC25225BEi.A0b();
        C0CA A0T2 = AbstractC25227BEk.A0T(GraphQlCallInput.A02, "FBPAY_HUB", "payment_type");
        C0CA.A00(A0T2, AbstractC166997dE.A0n(), "client_mutation_id");
        C0CA.A00(A0T2, iGPaymentMethodsAPI.A03.userId, "actor_id");
        C0CA.A00(A0T2, str4, "logging_id");
        C0CA.A00(A0T2, str3, "shop_pay_account_id");
        return C60622REh.A00((C62731SNv) obj, iGPaymentMethodsAPI.A04, new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T2, A0b2, "data"), "IGFBPayRemoveShopPayMutation", A0b2.getParamsCopy(), A0b3.getParamsCopy(), C59877QqN.class, true, null, 12, "data", "remove_shop_pay_account", AbstractC166987dD.A1E()), AbstractC62382S9h.A02);
    }
}
