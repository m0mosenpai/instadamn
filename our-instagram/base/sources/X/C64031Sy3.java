package X;

import com.facebook.pando.PandoGraphQLRequest;

/* renamed from: X.Sy3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64031Sy3 implements InterfaceC70433Ec {
    public C2JM A00 = AbstractC25225BEi.A0b();
    public C2JM A01 = AbstractC25225BEi.A0b();
    public boolean A02 = false;
    public boolean A06 = false;
    public boolean A05 = false;
    public boolean A04 = false;
    public boolean A03 = false;

    @Override // X.InterfaceC70433Ec
    /* renamed from: build */
    public final /* bridge */ /* synthetic */ C1Dk A00() {
        C18C.A0E(this.A02);
        C18C.A0E(this.A06);
        C18C.A0E(this.A05);
        C18C.A0E(this.A04);
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A03), "FBPayComponentDataQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), R0V.class, false, null, 0, null, "fetch_fbpay_component_data", AbstractC166987dD.A1E());
    }
}
