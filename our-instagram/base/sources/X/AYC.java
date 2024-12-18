package X;

import com.facebook.pando.PandoGraphQLRequest;

/* loaded from: classes4.dex */
public final class AYC implements InterfaceC70433Ec {
    public C2JM A00 = new C2JM();
    public C2JM A01 = new C2JM();
    public boolean A04 = false;
    public boolean A05 = false;
    public boolean A03 = false;
    public boolean A06 = false;
    public boolean A02 = false;

    @Override // X.InterfaceC70433Ec
    /* renamed from: build */
    public final /* bridge */ /* synthetic */ C1Dk A00() {
        C18C.A0E(this.A04);
        C18C.A0E(this.A05);
        C18C.A0E(this.A03);
        C18C.A0E(this.A06);
        C18C.A0E(this.A02);
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        return new PandoGraphQLRequest(AbstractC40511uK.A00(), "OnDeviceFLFeatures", this.A00.getParamsCopy(), this.A01.getParamsCopy(), C213919dq.class, false, null, 0, null, "on_device_fl_features", AbstractC166987dD.A1E());
    }
}
