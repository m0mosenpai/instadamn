package X;

import com.facebook.pando.PandoGraphQLRequest;

/* renamed from: X.Cpa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28926Cpa implements InterfaceC70433Ec {
    public C2JM A00 = AbstractC25225BEi.A0b();
    public C2JM A01 = AbstractC25225BEi.A0b();
    public boolean A03 = false;
    public boolean A04 = false;
    public boolean A02 = false;

    @Override // X.InterfaceC70433Ec
    /* renamed from: build */
    public final /* bridge */ /* synthetic */ C1Dk A00() {
        C18C.A0E(this.A03);
        C18C.A0E(this.A04);
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A02), "GenAIImagineGenerateSuggestionsQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), C59020QUe.class, false, null, 0, null, "__typename", AbstractC166987dD.A1E());
    }
}
