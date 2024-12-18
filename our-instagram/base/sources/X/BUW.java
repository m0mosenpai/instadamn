package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.google.common.collect.ImmutableList;

/* loaded from: classes5.dex */
public final class BUW implements InterfaceC70433Ec {
    public C2JM A00 = AbstractC25225BEi.A0b();
    public C2JM A01 = AbstractC25225BEi.A0b();
    public boolean A02 = false;

    public final void A00(ImmutableList immutableList) {
        this.A00.A05("model_request_metadatas", immutableList);
        this.A02 = AbstractC167007dF.A1W(immutableList);
    }

    @Override // X.InterfaceC70433Ec
    /* renamed from: build */
    public final /* bridge */ /* synthetic */ C1Dk A00() {
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A02), "NativeMLModelBatchedQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), C209469Og.class, false, null, 0, null, "aim_model_batched_manifest", AbstractC166987dD.A1E());
    }
}
