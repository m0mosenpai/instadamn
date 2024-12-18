package X;

import com.facebook.pando.PandoGraphQLRequest;

/* renamed from: X.Cpd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28929Cpd implements InterfaceC70433Ec {
    public C2JM A00 = AbstractC25225BEi.A0b();
    public C2JM A02 = AbstractC25225BEi.A0b();
    public boolean A01 = false;

    @Override // X.InterfaceC70433Ec
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final PandoGraphQLRequest build() {
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A01), "AutofillMigrateCreditCardMutation", this.A00.getParamsCopy(), this.A02.getParamsCopy(), C67557Unv.class, true, null, 64, null, "migrate_autofill_key", AbstractC166987dD.A1E());
    }
}
