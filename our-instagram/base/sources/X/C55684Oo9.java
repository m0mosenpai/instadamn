package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.Oo9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55684Oo9 implements InterfaceC70433Ec {
    public C2JM A00 = AbstractC25225BEi.A0b();
    public C2JM A01 = AbstractC25225BEi.A0b();
    public boolean A02 = false;

    public final void A00(String str) {
        this.A02 = AbstractC43594JPz.A1X(this.A00, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
    }

    @Override // X.InterfaceC70433Ec
    /* renamed from: build */
    public final /* bridge */ /* synthetic */ C1Dk A00() {
        return new PandoGraphQLRequest(AbstractC25227BEk.A0U(this.A02), "ProfileUserInfo", this.A00.getParamsCopy(), this.A01.getParamsCopy(), C60172Qv8.class, false, null, 0, null, "xdt_users__info", AbstractC166987dD.A1E());
    }
}
