package X;

import com.facebook.pando.PandoGraphQLRequest;

/* renamed from: X.Cph, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28933Cph implements InterfaceC70433Ec {
    public C2JM A00 = AbstractC25225BEi.A0b();
    public C2JM A04 = AbstractC25225BEi.A0b();
    public boolean A03 = false;
    public boolean A02 = false;
    public boolean A01 = false;

    @Override // X.InterfaceC70433Ec
    public final PandoGraphQLRequest A00() {
        C18C.A0E(this.A03);
        C18C.A0E(this.A02);
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A01), "MetaAIIntentCardNuxImpresionMutation", this.A00.getParamsCopy(), this.A04.getParamsCopy(), QV0.class, true, null, 0, null, "xfb_create_genai_meta_ai_intent_card_user_status", AbstractC166987dD.A1E());
    }
}
