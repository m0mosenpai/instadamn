package X;

import com.facebook.pando.PandoGraphQLRequest;

/* renamed from: X.Cpi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28934Cpi implements InterfaceC70433Ec {
    public C2JM A00 = AbstractC25225BEi.A0b();
    public C2JM A06 = AbstractC25225BEi.A0b();
    public boolean A03 = false;
    public boolean A04 = false;
    public boolean A01 = false;
    public boolean A02 = false;
    public boolean A05 = false;

    @Override // X.InterfaceC70433Ec
    public final PandoGraphQLRequest A00() {
        C18C.A0E(this.A03);
        C18C.A0E(this.A04);
        C18C.A0E(this.A01);
        C18C.A0E(this.A02);
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A05), "MetaAIFeedbackMutation", this.A00.getParamsCopy(), this.A06.getParamsCopy(), C59039QUx.class, true, null, 0, null, "xfb_meta_ai_intents_feedback", AbstractC166987dD.A1E());
    }
}
