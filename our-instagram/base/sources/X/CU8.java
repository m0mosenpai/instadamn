package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class CU8 {
    public final int A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C38321qM A03;

    public final void A00(FragmentActivity fragmentActivity, String str, String str2, String str3) {
        C14360o3.A0B(str, 1);
        AbstractC37834Gko.A03(fragmentActivity, this.A01, this.A02, str, str2, str3, null);
        fragmentActivity.onBackPressed();
    }

    public CU8(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, int i) {
        AbstractC167017dG.A1Q(userSession, c38321qM);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = c38321qM;
        this.A00 = i;
    }
}
