package X;

import com.facebook.pando.PandoGraphQLRequest;

/* renamed from: X.Oo6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55681Oo6 implements InterfaceC70433Ec {
    public C2JM A00 = AbstractC25225BEi.A0b();
    public C2JM A02 = AbstractC25225BEi.A0b();
    public boolean A01 = false;

    @Override // X.InterfaceC70433Ec
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final PandoGraphQLRequest build() {
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A01), "GenAIImagineGenerateMutation", this.A00.getParamsCopy(), this.A02.getParamsCopy(), QUY.class, true, null, 96, null, "__typename", AbstractC166987dD.A1E());
    }
}
