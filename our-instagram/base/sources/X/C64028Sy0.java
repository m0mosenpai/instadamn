package X;

import com.facebook.pando.PandoGraphQLRequest;

/* renamed from: X.Sy0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64028Sy0 implements InterfaceC70433Ec {
    public C2JM A00 = AbstractC25225BEi.A0b();
    public C2JM A01 = AbstractC25225BEi.A0b();
    public boolean A02 = false;

    @Override // X.InterfaceC70433Ec
    public final /* bridge */ /* synthetic */ C1Dk build() {
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A02), "FBPayAuthTicketQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), QSH.class, false, null, 0, null, null, AbstractC166987dD.A1E());
    }
}
