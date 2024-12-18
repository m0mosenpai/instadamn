package X;

import android.content.Context;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6ms, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148836ms implements InterfaceC148826mr, CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C148836ms.class);
    public static final String __redex_internal_original_name = "OneTapFBShareTooltipDelegate";

    @Override // X.InterfaceC148826mr
    public final C207559Gj C9L(UserSession userSession, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        return null;
    }

    @Override // X.InterfaceC148826mr
    public final EnumC58132lV C9M() {
        return EnumC58132lV.A02;
    }

    @Override // X.InterfaceC148826mr
    public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        return interfaceC143576dw.B43();
    }

    @Override // X.InterfaceC148826mr
    public final C5ST C9O(Context context, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        return new C149686oL(context.getString(2131973762));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.82I, X.0Zx] */
    @Override // X.InterfaceC148826mr
    public final void Dtu(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        A002.A0j(System.currentTimeMillis());
        InterfaceC19630xq interfaceC19630xq = A002.A01;
        int i = interfaceC19630xq.getInt("reel_one_tap_fbshare_tooltip_count", 0) + 1;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7D("reel_one_tap_fbshare_tooltip_count", i);
        ARD.apply();
        boolean A03 = C196068lw.A03(C196068lw.A00(userSession).A00(A00));
        C82G c82g = C82G.A0h;
        C82H c82h = C82H.A0y;
        EnumC201098ur enumC201098ur = EnumC201098ur.VIEW;
        ?? c0Zx = new C0Zx();
        c0Zx.A09(Boolean.valueOf(A03));
        c0Zx.A05("impression_count", Long.valueOf(AbstractC23021Ah.A00(userSession).A01.getInt("reel_one_tap_fbshare_tooltip_count", 0)));
        AbstractC201108us.A00(c82g, enumC201098ur, c82h, c0Zx, userSession);
    }

    @Override // X.InterfaceC148826mr
    public final boolean Ejo(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        View B43 = interfaceC143576dw.B43();
        if (B43 != null && !B43.isSelected()) {
            InterfaceC19630xq interfaceC19630xq = A002.A01;
            if (interfaceC19630xq.getInt("reel_one_tap_fbshare_tooltip_count", 0) < 3) {
                long j = interfaceC19630xq.getLong("reel_one_tap_fbshare_tooltip_last_seen_sec", 0L);
                if (j == 0 || TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - j > 604800) {
                    if (C197838ou.A03(C82G.A0h, C82H.A0y, userSession)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
