package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.lockedchat.LockedChatKillSwitch;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;
import java.util.List;

/* loaded from: classes6.dex */
public final class G3L implements InterfaceC37156GYt {
    public C189478aR A00;
    public final Fragment A01;
    public final UserSession A02;
    public final C34432FFw A03;
    public final C58655PzS A04;
    public final C5G2 A05;
    public final E70 A06;
    public final InterfaceC16820sZ A07;

    public G3L(Fragment fragment, UserSession userSession, C58655PzS c58655PzS, E70 e70, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC167007dF.A1F(userSession, 1, c58655PzS);
        this.A02 = userSession;
        this.A06 = e70;
        this.A01 = fragment;
        this.A04 = c58655PzS;
        this.A07 = interfaceC16820sZ;
        this.A03 = new C34432FFw(userSession);
        this.A05 = AbstractC161117Jw.A00(userSession);
    }

    public static final void A00(G3L g3l, boolean z) {
        UserSession userSession = g3l.A02;
        Number number = (Number) AbstractC31237DoK.A00(userSession).A04.getValue();
        long A01 = C18U.A01(C06090Tz.A06, userSession, 36602342656971400L);
        Long valueOf = Long.valueOf(A01);
        if (z && number != null && number.intValue() >= A01) {
            Fragment fragment = g3l.A01;
            C193328hC A0P = AbstractC31180DnO.A0P(fragment);
            A0P.A0A(2131963971);
            AbstractC31177DnL.A1A(fragment, A0P, valueOf, 2131963959);
            AbstractC31176DnK.A1W(A0P);
            String A03 = E70.A03(g3l.A06);
            InterfaceC02590Ai A09 = AbstractC31179DnN.A09(userSession);
            if (A09.isSampled()) {
                AbstractC31181DnP.A0i(A09, "show_locked_chat_full", "thread_details_page", A03);
                return;
            }
            return;
        }
        g3l.A04.A00(g3l.A01, new C36397G3y(g3l, z), z);
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        SpannableStringBuilder A0H;
        UserSession userSession = this.A02;
        E70 e70 = this.A06;
        String A03 = E70.A03(e70);
        InterfaceC02590Ai A09 = AbstractC31179DnN.A09(userSession);
        if (A09.isSampled()) {
            AbstractC31181DnP.A0i(A09, "show_locked_chat_toggle", "thread_details_page", A03);
        }
        C36731GHa A032 = C36731GHa.A03(C35739FqX.A00, this, 20, 2131963968, AbstractC167007dF.A1P(e70.A02, 1));
        Fragment fragment = this.A01;
        String A0v = AbstractC25227BEk.A0v(fragment, 2131963966);
        String A0v2 = AbstractC25227BEk.A0v(fragment, 2131963967);
        Context requireContext = fragment.requireContext();
        if (C18U.A06(C06090Tz.A06, userSession, 36320867680396244L)) {
            A0H = AbstractC25225BEi.A0H(AnonymousClass001.A0T(A0v, A0v2, ' '));
            AnonymousClass773.A05(A0H, new Em0(requireContext, this, AbstractC31174DnI.A02(requireContext)), A0v2);
        } else {
            A0H = AbstractC25225BEi.A0H(A0v);
        }
        C35246Fgf c35246Fgf = new C35246Fgf(A0H);
        c35246Fgf.A01 = R.style.LockedChatDescription;
        return AbstractC16960so.A1Q(A032, c35246Fgf);
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        E70 e70 = this.A06;
        if (((e70.A08() instanceof DirectThreadKey) || (e70.A08() instanceof DirectMsysMixedThreadKey)) && this.A04.A02() && !E70.A05(e70) && LockedChatKillSwitch.isLockedChatEnabled(this.A02, true)) {
            return true;
        }
        return false;
    }
}
