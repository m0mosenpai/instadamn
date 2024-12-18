package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.Dne, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31195Dne implements InterfaceC37132GXt {
    public final int A00;
    public final Object A01;

    public C31195Dne(C35277FhC c35277FhC, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
                this.A01 = c35277FhC;
                return;
            default:
                this.A01 = c35277FhC;
                return;
        }
    }

    public static void A00(FragmentActivity fragmentActivity, C31195Dne c31195Dne, UserSession userSession, C141586ab c141586ab, String str, List list) {
        Integer num;
        LinkedHashSet linkedHashSet = new LinkedHashSet(list);
        for (Reel reel : C1OU.A04(userSession).A0U(true)) {
            if (!reel.A16(userSession) && !reel.A0f()) {
                linkedHashSet.add(reel.getId());
            }
        }
        ArrayList A1F = AbstractC166987dD.A1F(linkedHashSet);
        if (AbstractC31171DnF.A0k(Arrays.asList(AbstractC58317Pt9.A00(293), "subscribed_reel_post", AbstractC58317Pt9.A00(373), AbstractC111324zv.A00(3147))).contains(str) && !C18U.A06(C06090Tz.A06, userSession, 36327932901866464L)) {
            HashSet A1H = AbstractC166987dD.A1H();
            Iterator it = A1F.iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                if (C1OU.A04(userSession).A0M(A1B) == null) {
                    A1H.add(A1B);
                }
            }
            if (!A1H.isEmpty()) {
                if (AbstractC82073lT.A05(userSession)) {
                    num = C05F.A00;
                } else {
                    num = null;
                }
                new C82043lQ(userSession, C3G5.A0G, new C33082Eif(fragmentActivity, c31195Dne, userSession, c141586ab, A1F), "AppStartupUtil", null, A1H).A06(fragmentActivity, AbstractC018607g.A00(fragmentActivity), new C1ET(num));
                return;
            }
            A01(fragmentActivity, userSession, c141586ab, A1F);
            return;
        }
        C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
        c141586ab.A09(A1F);
        c141586ab.A0A(A1F);
        A0r.A0E(ITS.A01(c141586ab.A00()));
        A0r.A04();
    }

    public static void A01(FragmentActivity fragmentActivity, UserSession userSession, C141586ab c141586ab, List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel A0M = C1OU.A04(userSession).A0M(AbstractC166987dD.A1B(it));
            if (A0M != null) {
                A1E.add(A0M);
            }
        }
        c141586ab.A0V = false;
        c141586ab.A02(userSession, AbstractC25226BEj.A1I(list, 0), A1E);
        Bundle A00 = c141586ab.A00();
        if (!fragmentActivity.getSupportFragmentManager().A11()) {
            C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
            A0r.A0E(ITS.A01(A00));
            A0r.A04();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x018e  */
    @Override // X.InterfaceC37132GXt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E4C(android.os.Bundle r26, androidx.fragment.app.FragmentActivity r27, com.instagram.common.session.UserSession r28) {
        /*
            Method dump skipped, instructions count: 2086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31195Dne.E4C(android.os.Bundle, androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession):void");
    }
}
