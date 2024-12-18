package X;

import com.facebook.pando.PandoGraphQLRequest;

/* loaded from: classes8.dex */
public final class LTH implements InterfaceC70433Ec {
    public C2JM A00 = AbstractC25225BEi.A0b();
    public C2JM A01 = AbstractC25225BEi.A0b();
    public boolean A02 = false;

    @Override // X.InterfaceC70433Ec
    public final /* bridge */ /* synthetic */ C1Dk build() {
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A02), "VestaServerLoginInitQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), QXE.class, false, null, 96, null, "fbid_based_auth_layer_vesta_login_init_v2", AbstractC166987dD.A1E());
    }
}
