package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* loaded from: classes7.dex */
public final class H8P extends MTJ {
    public InterfaceC62602sz A00;
    public String A01;
    public final String A02;

    @Override // X.AbstractC69603Au
    public final void A05() {
        String str = this.A01;
        if (str != null) {
            A0J(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
        }
        A0J("tab_identifier", this.A02);
    }

    public final void A0S() {
        InterfaceC62602sz interfaceC62602sz = this.A00;
        if (interfaceC62602sz != null && interfaceC62602sz.isLoading()) {
            ((MTJ) this).A00.A04();
            return;
        }
        InterfaceC62602sz interfaceC62602sz2 = this.A00;
        if (interfaceC62602sz2 != null && interfaceC62602sz2.CUG()) {
            ((MTJ) this).A00.A01();
        } else {
            ((MTJ) this).A00.A05();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H8P(UserSession userSession, String str) {
        super(userSession, "profile_media_tab", 31798595);
        AbstractC167017dG.A1P(userSession, str);
        this.A02 = str;
    }
}
