package X;

import android.util.SparseArray;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public final class T3O implements InterfaceC65509Tle {
    public final C40701ud A00;

    @Override // X.InterfaceC65509Tle
    public final InterfaceC65512Tlh EFp(SparseArray sparseArray, C62731SNv c62731SNv) {
        throw AbstractC166987dD.A1D("removeMutation not supported for Full Name on Instagram");
    }

    @Override // X.InterfaceC65509Tle
    public final InterfaceC65512Tlh ENp(SparseArray sparseArray, C62731SNv c62731SNv) {
        boolean A1a = AbstractC167017dG.A1a(sparseArray, c62731SNv);
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, "FBPAY_HUB", "payment_type");
        Object obj = sparseArray.get(2);
        AbstractC25225BEi.A1S(obj);
        C0CA.A00(A0T, obj, "payer_name");
        C2JM A0b = AbstractC25225BEi.A0b();
        return C60622REh.A00(c62731SNv, this.A00, new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "input"), "IgPaymentsUpdatePaymentAccountNameMutation", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C59924Qr8.class, A1a, null, 8, "input", "payment_account_update_payer_name", AbstractC166987dD.A1E()), S83.A00);
    }

    public T3O(UserSession userSession) {
        this.A00 = AbstractC40691uc.A01(userSession);
    }
}
