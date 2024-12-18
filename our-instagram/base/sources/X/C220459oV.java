package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.9oV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220459oV extends C33H {
    public final int A00;
    public final Object A01;

    public C220459oV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.82I, X.0Zx] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.82I, X.0Zx] */
    @Override // X.C33H, X.C33I
    public final void Dtt(C5SW c5sw) {
        InterfaceC19630xq interfaceC19630xq;
        InterfaceC19610xo ARD;
        String str;
        C206209Bd c206209Bd;
        InterfaceC16820sZ interfaceC16820sZ;
        UserSession userSession;
        C82G c82g;
        C82H c82h;
        EnumC201098ur enumC201098ur;
        int i;
        C82I c82i;
        switch (this.A00) {
            case 0:
                C23031Ai A00 = AbstractC23021Ah.A00((UserSession) this.A01);
                AbstractC167007dF.A1L(A00, A00.A7R, C23031Ai.A8c, 277, true);
                return;
            case 1:
                ((C194818jh) this.A01).A03 = true;
                interfaceC19630xq = AbstractC19730y1.A00(AbstractC12960li.A00).A00;
                ARD = interfaceC19630xq.ARD();
                str = "text_animation_button_tooltip_impressions";
                AbstractC167017dG.A1L(ARD, interfaceC19630xq, str, 0);
                return;
            case 2:
                ((C80S) this.A01).A02 = true;
                interfaceC19630xq = AbstractC19730y1.A00(AbstractC12960li.A00).A00;
                ARD = interfaceC19630xq.ARD();
                str = "text_animation_button_tooltip_impressions";
                AbstractC167017dG.A1L(ARD, interfaceC19630xq, str, 0);
                return;
            case 3:
                C8LD.A0e = true;
                interfaceC19630xq = AbstractC19730y1.A00(AbstractC12960li.A00).A00;
                ARD = interfaceC19630xq.ARD();
                str = "create_mode_colour_wheel_tooltip_impressions";
                AbstractC167017dG.A1L(ARD, interfaceC19630xq, str, 0);
                return;
            case 4:
                C9C3 c9c3 = ((C3W8) this.A01).A04;
                if (c9c3 == null || (c206209Bd = (C206209Bd) c9c3.A00) == null || (interfaceC16820sZ = (InterfaceC16820sZ) c206209Bd.A02) == null) {
                    return;
                }
                interfaceC16820sZ.invoke();
                return;
            case 5:
                userSession = (UserSession) this.A01;
                InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
                InterfaceC19610xo ARD2 = A0x.ARD();
                ARD2.E7D("feed_last_server_xposting_turn_on_time_in_second", A0x.getInt("xpost_to_facebook_feed_server_mtime_in_second", 0));
                ARD2.apply();
                InterfaceC19630xq A0x2 = AbstractC166987dD.A0x(userSession);
                AbstractC167017dG.A1L(A0x2.ARD(), A0x2, "fb_currently_sharing_feed_tooltip_show_times", 0);
                boolean A03 = C196068lw.A03(C196068lw.A00(userSession).A00(CallerContext.A01("CrossPostToFacebookTooltipHelper")));
                c82g = C82G.A0D;
                c82h = C82H.A0x;
                enumC201098ur = EnumC201098ur.VIEW;
                ?? c0Zx = new C0Zx();
                c0Zx.A09(Boolean.valueOf(A03));
                i = AbstractC166987dD.A0x(userSession).getInt("fb_currently_sharing_feed_tooltip_show_times", 0);
                c82i = c0Zx;
                c82i.A05("impression_count", Long.valueOf(i));
                AbstractC201108us.A00(c82g, enumC201098ur, c82h, c82i, userSession);
                return;
            default:
                userSession = (UserSession) this.A01;
                InterfaceC19630xq A0x3 = AbstractC166987dD.A0x(userSession);
                AbstractC167017dG.A1L(A0x3.ARD(), A0x3, "fb_feed_crossposting_toggle_tooltip_show_times", 0);
                AbstractC23021Ah.A00(userSession).A0g(System.currentTimeMillis());
                boolean A032 = C196068lw.A03(C196068lw.A00(userSession).A00(CallerContext.A01("CrossPostToFacebookTooltipHelper")));
                c82g = C82G.A0D;
                c82h = C82H.A0w;
                enumC201098ur = EnumC201098ur.VIEW;
                ?? c0Zx2 = new C0Zx();
                c0Zx2.A09(Boolean.valueOf(A032));
                i = AbstractC166987dD.A0x(userSession).getInt("fb_feed_crossposting_toggle_tooltip_show_times", 0);
                c82i = c0Zx2;
                c82i.A05("impression_count", Long.valueOf(i));
                AbstractC201108us.A00(c82g, enumC201098ur, c82h, c82i, userSession);
                return;
        }
    }
}
