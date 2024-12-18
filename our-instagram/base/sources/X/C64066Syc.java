package X;

import com.facebook.pando.PandoGraphQLRequest;

/* renamed from: X.Syc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64066Syc implements InterfaceC70433Ec {
    public C2JM A00 = AbstractC25225BEi.A0b();
    public C2JM A04 = AbstractC25225BEi.A0b();
    public boolean A01 = false;
    public boolean A02 = false;
    public boolean A03 = false;

    @Override // X.InterfaceC70433Ec
    public final PandoGraphQLRequest A00() {
        C18C.A0E(this.A01);
        C18C.A0E(this.A02);
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A03), "AddCreditCardsToAutofillMutation", this.A00.getParamsCopy(), this.A04.getParamsCopy(), C60503R1d.class, true, null, 64, null, "add_multiple_credit_cards_proof_to_autofill", AbstractC166987dD.A1E());
    }
}
