package X;

import com.facebook.pando.PandoGraphQLRequest;

/* renamed from: X.SyZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64063SyZ implements InterfaceC70433Ec {
    public C2JM A00 = AbstractC25225BEi.A0b();
    public C2JM A03 = AbstractC25225BEi.A0b();
    public boolean A02 = false;
    public boolean A01 = false;

    @Override // X.InterfaceC70433Ec
    public final PandoGraphQLRequest A00() {
        C18C.A0E(this.A02);
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A01), "AcknowledgePushToken", this.A00.getParamsCopy(), this.A03.getParamsCopy(), QQT.class, true, null, 0, null, "xfb_ack_token", AbstractC166987dD.A1E());
    }
}
