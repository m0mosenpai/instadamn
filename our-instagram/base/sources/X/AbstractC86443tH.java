package X;

import com.instagram.common.session.UserSession;
import com.instagram.tagging.widget.TagsLayout;

/* renamed from: X.3tH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC86443tH {
    public static final void A00(UserSession userSession, InterfaceC86433tG interfaceC86433tG, C80243iD c80243iD, C3YH c3yh, boolean z, boolean z2) {
        C14360o3.A0B(c80243iD, 1);
        C14360o3.A0B(interfaceC86433tG, 5);
        if (!c80243iD.A06) {
            c3yh.A08.setVisibility(8);
            return;
        }
        if (z2) {
            AbstractC56932jR.A04(c3yh.A08, 4);
        }
        C75113Zb c75113Zb = c80243iD.A04;
        TagsLayout tagsLayout = c3yh.A08;
        tagsLayout.setVisibility(0);
        tagsLayout.removeAllViews();
        c3yh.A05 = ((Boolean) ((InterfaceC16660sJ) c80243iD.A02.A04).invoke(Boolean.valueOf(z))).booleanValue();
        if (c75113Zb.A1z) {
            c3yh.A02(userSession, c80243iD, false);
        }
        if (c75113Zb != c3yh.A01 || c80243iD.A01 != c3yh.A00) {
            c3yh.A01(userSession, c75113Zb, interfaceC86433tG, c80243iD);
        }
        int i = c80243iD.A00;
        C75113Zb c75113Zb2 = c3yh.A01;
        if (c75113Zb2 != null) {
            c75113Zb2.A0M(c3yh, Integer.valueOf(i), true);
        }
        c3yh.A00 = i;
        c3yh.A01 = c75113Zb;
        c75113Zb.A0L(c3yh, Integer.valueOf(i), true);
        boolean A06 = C18U.A06(C06090Tz.A06, userSession, 36325785417889132L);
        c3yh.A06 = A06;
        if (!C903540u.A00.A01(userSession, c80243iD.A03) && !A06) {
            return;
        }
        c3yh.A04 = new C207279Fg(12, c80243iD, userSession, c75113Zb, c3yh, interfaceC86433tG);
    }
}
