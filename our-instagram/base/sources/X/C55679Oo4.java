package X;

import com.facebook.pando.PandoGraphQLRequest;

/* renamed from: X.Oo4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55679Oo4 implements InterfaceC70433Ec {
    public C2JM A00 = AbstractC25225BEi.A0b();
    public C2JM A02 = AbstractC25225BEi.A0b();
    public boolean A01 = false;

    @Override // X.InterfaceC70433Ec
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final PandoGraphQLRequest build() {
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A01), "GenAIImagineEditMutation", this.A00.getParamsCopy(), this.A02.getParamsCopy(), QUS.class, true, null, 96, null, "__typename", AbstractC166987dD.A1E());
    }
}