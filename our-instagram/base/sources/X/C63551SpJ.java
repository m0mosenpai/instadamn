package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.SpJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63551SpJ implements C1N8 {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C63551SpJ(Object obj, String str, String str2, String str3, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
    }

    @Override // X.C1N8
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        if (this.A00 != 0) {
            C62523SEz c62523SEz = ((SMH) this.A01).A03;
            String str = this.A04;
            String str2 = this.A03;
            String str3 = this.A02;
            C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, AbstractC166997dE.A0n(), "client_mutation_id");
            C0CA.A00(A0T, c62523SEz.A00.userId, "actor_id");
            C0CA.A00(A0T, str, "logging_id");
            C0CA.A00(A0T, "FBPAY_HUB", "payment_type");
            C0CA.A00(A0T, str2, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
            C0CA.A00(A0T, str3, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
            C2JM A0b = AbstractC25225BEi.A0b();
            return C60622REh.A02((C62731SNv) obj, c62523SEz.A01, new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "input"), "IGFBPayCompleteShopPayInitMutation", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C59545QhJ.class, true, null, 12, "input", null, AbstractC166987dD.A1E()), new C64285T7u(c62523SEz, 11), S84.A00);
        }
        C62731SNv c62731SNv = (C62731SNv) obj;
        ((Wat) this.A01).A00.getValue();
        String str4 = this.A03;
        String str5 = this.A02;
        String str6 = this.A04;
        C2FP.A00();
        try {
            WWE wwe = (WWE) AbstractC25234BEr.A0d(C69820Vw6.class);
            C2JM c2jm = wwe.A00;
            c2jm.A04("interface_type", "IG_ANDROID");
            wwe.A02 = true;
            c2jm.A04("fe_id", str5);
            c2jm.A04("page_id", str4);
            c2jm.A04(AbstractC63083Sc6.A00(), str6);
            C2JO c2jo = new C2JO();
            c2jo.A09("d0d0df20f1f4fcc942cd21b5181a6a9f0f554364b0e20671791f50beb40b97bf", "bloks_versioning_id");
            AbstractC58318PtA.A1K(c2jo, c2jm);
            return C60622REh.A00(c62731SNv, C58443PvM.A00(), wwe.A00(), T7a.A00);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw AbstractC58318PtA.A0f(e);
        }
    }
}
