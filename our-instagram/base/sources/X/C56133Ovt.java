package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ovt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56133Ovt implements InterfaceC13000lm {
    public C51740MtP A00;
    public C56138Ovy A01;
    public String A02 = "";
    public boolean A03;
    public final FragmentActivity A04;
    public final C51740MtP A05;
    public final UserSession A06;
    public final String A07;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C56138Ovy c56138Ovy = this.A01;
        if (c56138Ovy != null) {
            c56138Ovy.A01();
        }
    }

    public C56133Ovt(FragmentActivity fragmentActivity, C51740MtP c51740MtP, UserSession userSession, String str) {
        this.A07 = str;
        this.A04 = fragmentActivity;
        this.A06 = userSession;
        this.A05 = c51740MtP;
    }
}
