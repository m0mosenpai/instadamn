package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.OZj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55037OZj {
    public View A00;
    public final Context A01;
    public final AbstractC59962oe A02;
    public final UserSession A03;
    public final InterfaceC58178Pqi A04;
    public final InterfaceC58087PpC A05 = new PIU(this, 3);
    public final boolean A06;
    public final C56362P0x A07;

    public static final void A00(C55037OZj c55037OZj, UpcomingEvent upcomingEvent) {
        if (upcomingEvent != null && AbstractC41774Ieq.A0B(upcomingEvent)) {
            C43204J8b c43204J8b = new C43204J8b(c55037OZj, 13);
            C193328hC A0I = AbstractC31171DnF.A0I(c55037OZj.A01);
            A0I.A0A(2131965528);
            A0I.A09(2131965527);
            A0I.A0F(DialogInterfaceOnClickListenerC55320Ogi.A00(c43204J8b, 43));
            A0I.A0H(null, 2131968687);
            AbstractC166987dD.A1W(A0I);
            return;
        }
        c55037OZj.A04.Dws();
    }

    public static final void A01(C55037OZj c55037OZj, UpcomingEvent upcomingEvent, boolean z) {
        boolean z2 = c55037OZj.A06;
        if (z2) {
            MX1.A00(c55037OZj.A03).A04("UPCOMING_EVENT_TAPPED");
        }
        if (z && !z2) {
            C65782Tu0 c65782Tu0 = new C65782Tu0(2131953913, 2131961910);
            C56362P0x c56362P0x = c55037OZj.A07;
            if (c56362P0x != null) {
                c56362P0x.A03.ElY(c65782Tu0, null);
                return;
            }
            return;
        }
        if (upcomingEvent != null) {
            if (AbstractC41774Ieq.A0B(upcomingEvent)) {
                C37021nz A00 = C4M5.A00();
                AbstractC59962oe abstractC59962oe = c55037OZj.A02;
                A00.A03(abstractC59962oe, c55037OZj.A03, abstractC59962oe.getModuleName());
                return;
            } else if (z2) {
                C50695MZq.A00(c55037OZj.A03, new NL5(c55037OZj.A05, upcomingEvent, false));
                return;
            } else {
                c55037OZj.A04.DWu(c55037OZj.A05, upcomingEvent);
                return;
            }
        }
        C1ON A01 = IT0.A01(c55037OZj.A03);
        AbstractC59962oe abstractC59962oe2 = c55037OZj.A02;
        A01.A00 = new C52688NSu(abstractC59962oe2.getParentFragmentManager(), c55037OZj, 3);
        abstractC59962oe2.schedule(A01);
    }

    public C55037OZj(AbstractC59962oe abstractC59962oe, UserSession userSession, C56362P0x c56362P0x, InterfaceC58178Pqi interfaceC58178Pqi, boolean z) {
        this.A02 = abstractC59962oe;
        this.A03 = userSession;
        this.A06 = z;
        this.A04 = interfaceC58178Pqi;
        this.A07 = c56362P0x;
        this.A01 = abstractC59962oe.requireContext();
    }
}
