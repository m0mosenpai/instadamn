package X;

import com.facebook.pando.PandoGraphQLRequest;

/* renamed from: X.Sya, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64064Sya implements InterfaceC70433Ec {
    public C2JM A00 = AbstractC25225BEi.A0b();
    public C2JM A03 = AbstractC25225BEi.A0b();
    public boolean A01 = false;
    public boolean A02 = false;

    @Override // X.InterfaceC70433Ec
    public final PandoGraphQLRequest A00() {
        C18C.A0E(this.A01);
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A02), "ComponentDataMutation", this.A00.getParamsCopy(), this.A03.getParamsCopy(), R0L.class, true, null, 96, null, "fbpay_account_mutation", AbstractC166987dD.A1E());
    }
}
