package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FgI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35225FgI {
    public static final C35225FgI A00 = new Object();

    public static final void A01(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C64842wi c64842wi, String str, String str2, String str3, String str4, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C14360o3.A0B(str3, 7);
        if (str4 != null) {
            LL1.A04(fragmentActivity, interfaceC11380iw, userSession, new C33311Eo6(fragmentActivity, userSession, c64842wi, str4, str3, str2, z, z5), str4, str, i, z2, z3, z4);
            return;
        }
        throw AbstractC166987dD.A12("user id cannot be null");
    }

    public static final void A02(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, boolean z) {
        LL1.A01(fragmentActivity, interfaceC11380iw, userSession, null, EnumC65855TvH.A0T, VG2.A0o, new C33312Eo7(fragmentActivity, 3), str, null, str, str2, null, null, z, false, false);
    }

    public final void A03(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, E70 e70, C32107E9f c32107E9f, C64842wi c64842wi, boolean z) {
        AbstractC167007dF.A1E(userSession, 0, c32107E9f);
        int i = e70.A09;
        boolean z2 = e70.A0n;
        boolean z3 = e70.A08() instanceof MsysThreadId;
        InterfaceC83733oI interfaceC83733oI = e70.A0L;
        String A06 = AbstractC1345466e.A06(interfaceC83733oI);
        String str = e70.A0Q;
        String A07 = AbstractC1345466e.A07(interfaceC83733oI);
        int i2 = e70.A06;
        List A0n = AbstractC31171DnF.A0n(e70.A0c);
        ArrayList A0q = AbstractC167017dG.A0q(A0n);
        Iterator it = A0n.iterator();
        while (it.hasNext()) {
            C32107E9f.A02(A0q, it);
        }
        A00(fragmentActivity, interfaceC11380iw, userSession, c64842wi, c32107E9f.A00, A06, str, A07, E70.A02(e70), A0q, i, i2, z2, z3, z);
    }

    public static final void A00(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C64842wi c64842wi, User user, String str, String str2, String str3, String str4, List list, int i, int i2, boolean z, boolean z2, boolean z3) {
        String str5;
        if (i == 29 && !AbstractC31171DnF.A1V(userSession, str4)) {
            A01(fragmentActivity, interfaceC11380iw, userSession, c64842wi, str, str2, str3, str4, i2, true, z, z2, z3, false);
            return;
        }
        boolean A1P = AbstractC167007dF.A1P(i, 1014);
        User user2 = (User) AbstractC001800i.A0J(list);
        if (user2 != null) {
            str5 = user2.A03.Aab();
        } else {
            str5 = null;
        }
        boolean A1W = AbstractC31171DnF.A1W(userSession, str5);
        if (A1P && !A1W) {
            String id = user.getId();
            LL1.A01(fragmentActivity, interfaceC11380iw, userSession, null, EnumC65855TvH.A0U, VG2.A0P, new C33312Eo7(fragmentActivity, 2), id, null, id, str, null, null, z, false, false);
        } else {
            C14360o3.A0B(user, 1);
            if (user.BJ8() != 1 && !C18U.A06(C06090Tz.A05, userSession, 36311319967695351L)) {
                A02(fragmentActivity, interfaceC11380iw, userSession, user.getId(), str, z);
            } else {
                A01(fragmentActivity, interfaceC11380iw, userSession, c64842wi, str, str2, str3, user.getId(), i2, false, z, z2, z3, false);
            }
        }
    }
}
