package X;

import com.facebook.pando.PandoGraphQLRequest;

/* renamed from: X.Sxy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64026Sxy implements InterfaceC70433Ec {
    public C2JM A00 = AbstractC25225BEi.A0b();
    public C2JM A01 = AbstractC25225BEi.A0b();
    public boolean A02 = false;

    @Override // X.InterfaceC70433Ec
    /* renamed from: build */
    public final /* bridge */ /* synthetic */ C1Dk A00() {
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A02), "CapabilityLatestVersionQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), C58933QQv.class, false, null, 0, null, "latest_versioned_capabilities", AbstractC166987dD.A1E());
    }
}
