package X;

import com.facebook.pando.PandoGraphQLRequest;

/* loaded from: classes4.dex */
public final class AYB implements InterfaceC70433Ec {
    public C2JM A00 = new C2JM();
    public C2JM A01 = new C2JM();
    public boolean A02 = false;

    @Override // X.InterfaceC70433Ec
    /* renamed from: build */
    public final /* bridge */ /* synthetic */ C1Dk A00() {
        C18C.A0E(this.A02);
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        return new PandoGraphQLRequest(AbstractC40511uK.A00(), "ArEffectsFlmCapabilityQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), C212719bu.class, false, null, 0, null, "fetch_ar_effects", AbstractC166987dD.A1E());
    }
}
