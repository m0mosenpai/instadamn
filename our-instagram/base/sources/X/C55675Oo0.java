package X;

import com.facebook.pando.PandoGraphQLRequest;

/* renamed from: X.Oo0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55675Oo0 implements InterfaceC70433Ec {
    public C2JM A00 = AbstractC25225BEi.A0b();
    public C2JM A02 = AbstractC25225BEi.A0b();
    public boolean A01 = false;

    @Override // X.InterfaceC70433Ec
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final PandoGraphQLRequest build() {
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A01), "AddMEmuProfilePhotos", this.A00.getParamsCopy(), this.A02.getParamsCopy(), QQa.class, true, null, 0, null, "xfb_add_memu_user_photos", AbstractC166987dD.A1E());
    }
}
