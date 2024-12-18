package X;

import com.facebook.pando.PandoGraphQLRequest;

/* loaded from: classes8.dex */
public final class LTR implements InterfaceC70433Ec {
    public C2JM A00 = AbstractC25225BEi.A0b();
    public C2JM A02 = AbstractC25225BEi.A0b();
    public boolean A01 = false;

    @Override // X.InterfaceC70433Ec
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final PandoGraphQLRequest build() {
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A01), "VestaServerRegisterFinishMutation", this.A00.getParamsCopy(), this.A02.getParamsCopy(), QXM.class, true, null, 96, null, "fbid_based_auth_layer_vesta_finish_register_v2", AbstractC166987dD.A1E());
    }
}
