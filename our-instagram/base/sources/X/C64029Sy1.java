package X;

import com.facebook.pando.PandoGraphQLRequest;

/* renamed from: X.Sy1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64029Sy1 implements InterfaceC70433Ec {
    public C2JM A00 = AbstractC25225BEi.A0b();
    public C2JM A01 = AbstractC25225BEi.A0b();
    public boolean A02 = false;

    @Override // X.InterfaceC70433Ec
    /* renamed from: build */
    public final /* bridge */ /* synthetic */ C1Dk A00() {
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A02), "FBPayMerchantServicesPayoutsQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), UY2.class, false, null, 0, null, "pay_financial_entity_wrapper", AbstractC166987dD.A1E());
    }
}
