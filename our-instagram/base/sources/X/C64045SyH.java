package X;

import com.facebook.pando.PandoGraphQLRequest;

/* renamed from: X.SyH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64045SyH implements InterfaceC70433Ec {
    public C2JM A00 = AbstractC25225BEi.A0b();
    public C2JM A02 = AbstractC25225BEi.A0b();
    public boolean A01 = false;

    @Override // X.InterfaceC70433Ec
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final PandoGraphQLRequest build() {
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A01), "FBPayDisablePINMutation", this.A00.getParamsCopy(), this.A02.getParamsCopy(), QT0.class, true, null, 12, "input", null, AbstractC166987dD.A1E());
    }
}