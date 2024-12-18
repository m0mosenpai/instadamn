package X;

import com.facebook.pando.PandoGraphQLRequest;

/* loaded from: classes8.dex */
public final class LTN implements InterfaceC70433Ec {
    public C2JM A00 = AbstractC25225BEi.A0b();
    public C2JM A01 = AbstractC25225BEi.A0b();
    public boolean A02 = false;
    public boolean A04 = false;
    public boolean A05 = false;
    public boolean A03 = false;

    @Override // X.InterfaceC70433Ec
    /* renamed from: build */
    public final /* bridge */ /* synthetic */ C1Dk A00() {
        C18C.A0E(this.A02);
        C18C.A0E(this.A04);
        C18C.A0E(this.A05);
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A03), "FetchAddressDetailsQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), QU7.class, false, null, 0, null, "fetch_address_details", AbstractC166987dD.A1E());
    }
}
