package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class G1X implements InterfaceC37153GYq {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    @Override // X.InterfaceC37153GYq
    public final void D8P(String str) {
        C14360o3.A0B(str, 0);
        FragmentActivity fragmentActivity = this.A00;
        AbstractC63248Sg4.A01(fragmentActivity.getSupportFragmentManager());
        C36881nl A01 = C36881nl.A01(fragmentActivity, this.A01, this.A02, this.A03);
        AbstractC31179DnN.A1R(A01, str);
        List A04 = fragmentActivity.getSupportFragmentManager().A0U.A04();
        C14360o3.A07(A04);
        Fragment fragment = (Fragment) AbstractC001800i.A0K(A04);
        A01.A0n = true;
        A01.A01 = fragment;
        A01.A06();
    }

    public G1X(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = str;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC37153GYq
    public final void D8O(Throwable th) {
        FragmentActivity fragmentActivity = this.A00;
        AbstractC63248Sg4.A01(fragmentActivity.getSupportFragmentManager());
        C0w9.A03("PartnershipThreadLauncher", "Unable create BC partnership thread");
        C9GR.A03(fragmentActivity, fragmentActivity.getString(2131968430), "network_error", 0);
    }
}
