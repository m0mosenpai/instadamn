package X;

import com.facebook.pando.PandoGraphQLRequest;

/* renamed from: X.Cpf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28931Cpf implements InterfaceC70433Ec {
    public C2JM A00 = AbstractC25225BEi.A0b();
    public C2JM A02 = AbstractC25225BEi.A0b();
    public boolean A01 = false;

    @Override // X.InterfaceC70433Ec
    public final PandoGraphQLRequest A00() {
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A01), "MetaAIWriteWithAISuggestionsWithTentativeResultsStreamMutation", this.A00.getParamsCopy(), this.A02.getParamsCopy(), QVS.class, true, null, 0, null, "xfb_genai_wwai_suggestion_stream_mutation", AbstractC166987dD.A1E());
    }
}
