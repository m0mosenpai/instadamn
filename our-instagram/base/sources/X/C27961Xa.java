package X;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Xa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27961Xa {
    public static C27961Xa A00;

    public final MTZ A01(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC55002fz interfaceC55002fz, QuickPromotionSlot quickPromotionSlot) {
        C14360o3.A0B(fragmentActivity, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(quickPromotionSlot, 3);
        C31212Dnv A002 = AbstractC31211Dnu.A00(userSession);
        C14360o3.A0B(A002, 1);
        C31213Dnw c31213Dnw = new C31213Dnw(fragmentActivity, A002, userSession);
        SparseIntArray sparseIntArray = C55312gW.A02;
        return new MTZ(fragmentActivity, interfaceC11380iw, userSession, interfaceC55002fz, new C55312gW(C1QS.A00(userSession)), quickPromotionSlot, c31213Dnw);
    }

    public final C64842wi A02(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC55002fz interfaceC55002fz, QuickPromotionSlot quickPromotionSlot) {
        C14360o3.A0B(abstractC59962oe, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        C14360o3.A0B(userSession, 2);
        C64832wh c64832wh = new C64832wh(abstractC59962oe, interfaceC11380iw, userSession);
        SparseIntArray sparseIntArray = C55312gW.A02;
        return new C64842wi(abstractC59962oe, null, interfaceC11380iw, userSession, interfaceC55002fz, new C55312gW(C1QS.A00(userSession)), quickPromotionSlot, c64832wh);
    }

    public final C64842wi A03(C38K c38k, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC55002fz interfaceC55002fz, QuickPromotionSlot quickPromotionSlot) {
        C14360o3.A0B(userSession, 2);
        C64832wh c64832wh = new C64832wh(c38k, interfaceC11380iw, userSession);
        SparseIntArray sparseIntArray = C55312gW.A02;
        return new C64842wi(c38k, null, interfaceC11380iw, userSession, interfaceC55002fz, new C55312gW(C1QS.A00(userSession)), quickPromotionSlot, c64832wh);
    }

    public final C66132yp A04(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC55362gb interfaceC55362gb) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC55362gb, 2);
        C14360o3.A0B(interfaceC11380iw, 3);
        return new C66132yp(userSession, interfaceC55362gb, new C66072yj(interfaceC11380iw, userSession), null);
    }

    public final C64742wY A05(UserSession userSession, Map map) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(map, 1);
        return new C64742wY(userSession, map);
    }

    public final List A06(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC55362gb interfaceC55362gb) {
        C14360o3.A0B(userSession, 0);
        return AbstractC16960so.A1Q(new MYD(interfaceC11380iw, userSession, interfaceC55362gb), new C50678MYw(interfaceC55362gb), new MYE(interfaceC11380iw, interfaceC55362gb), new C31597DuP(userSession, interfaceC55362gb), new MYF(interfaceC55362gb));
    }

    public final void A07(Context context, InterfaceC11380iw interfaceC11380iw, C4NL c4nl, InterfaceC55362gb interfaceC55362gb) {
        C14360o3.A0B(interfaceC55362gb, 0);
        C14360o3.A0B(c4nl, 1);
        AbstractC54119NwH.A00(context, interfaceC11380iw, c4nl, interfaceC55362gb);
    }

    public final boolean A08(UserSession userSession, QuickPromotionSlot quickPromotionSlot, C55372gc c55372gc) {
        long j;
        Number number;
        Number number2;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c55372gc, 2);
        C55572gx c55572gx = (C55572gx) userSession.A01(C55572gx.class, new C57519Pft(userSession, 5));
        if (c55572gx.A00 == null) {
            UserSession userSession2 = c55572gx.A01;
            C55682h8 c55682h8 = C55692h9.A02;
            C14360o3.A0B(userSession2, 0);
            if (C55682h8.A00(userSession2).getLong("qp_cooldown_response_expiration_time", 0L) > System.currentTimeMillis()) {
                if (c55682h8.A01(userSession2) != null) {
                    c55572gx.A00 = C55662h6.A04.A00(userSession2, c55682h8.A01(userSession2));
                } else {
                    AbstractC31546DtW.A00(userSession2, C05F.A0j, "QP cooldown response listed as unexpired but is null.", null);
                }
            }
        }
        C55662h6 c55662h6 = c55572gx.A00;
        if (c55662h6 != null) {
            Map map = c55662h6.A01;
            long j2 = c55662h6.A00;
            if (map != null && (number2 = (Number) map.get(quickPromotionSlot)) != null) {
                j2 = number2.longValue();
            }
            QuickPromotionSurface quickPromotionSurface = c55372gc.A00;
            if (quickPromotionSurface != null && (number = (Number) c55372gc.A01.get(quickPromotionSurface)) != null) {
                j = number.longValue();
            } else {
                j = -1;
            }
            if (j + j2 <= System.currentTimeMillis()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C4F4 A00(com.instagram.common.session.UserSession r4, X.C4NL r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L58
            X.4NJ r5 = (X.C4NJ) r5
            X.4NP r0 = r5.A09
            java.lang.String r1 = r0.A00
            int r0 = r1.hashCode()
            switch(r0) {
                case -1285049338: goto L22;
                case 453021476: goto L31;
                case 897282998: goto L34;
                case 1219174331: goto L43;
                default: goto Lf;
            }
        Lf:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36331295860606186(0x81131f000044ea, double:3.039396024408823E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L52
            X.NEx r0 = new X.NEx
            r0.<init>(r5)
            return r0
        L22:
            java.lang.String r0 = "fixed_banner_ig"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lf
            X.NEw r0 = new X.NEw
            r0.<init>(r5)
            return r0
        L31:
            java.lang.String r0 = "condensed_megaphone"
            goto L46
        L34:
            java.lang.String r0 = "inline_editing_standard_megaphone_ig"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lf
            X.EXs r0 = new X.EXs
            r0.<init>(r5)
            return r0
        L43:
            java.lang.String r0 = "social_context_condensed_megaphone_ig"
        L46:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lf
            X.NEv r0 = new X.NEv
            r0.<init>(r5)
            return r0
        L52:
            X.NEy r0 = new X.NEy
            r0.<init>(r5)
            return r0
        L58:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27961Xa.A00(com.instagram.common.session.UserSession, X.4NL):X.4F4");
    }
}
