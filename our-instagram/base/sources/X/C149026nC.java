package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.6nC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149026nC implements InterfaceC148826mr {
    @Override // X.InterfaceC148826mr
    public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        C14360o3.A0B(interfaceC143576dw, 0);
        return interfaceC143576dw.C9J();
    }

    @Override // X.InterfaceC148826mr
    public final C207559Gj C9L(UserSession userSession, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        return null;
    }

    @Override // X.InterfaceC148826mr
    public final C5ST C9O(Context context, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        C14360o3.A0B(context, 1);
        String string = context.getString(2131952317);
        C14360o3.A07(string);
        return new C149686oL(string);
    }

    @Override // X.InterfaceC148826mr
    public final void Dtu(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        C14360o3.A0B(userSession, 0);
        InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
        int i = interfaceC19630xq.getInt("story_add_mentions_tooltip_impression_count", 0) + 1;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7D("story_add_mentions_tooltip_impression_count", i);
        ARD.apply();
    }

    @Override // X.InterfaceC148826mr
    public final boolean Ejo(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c41181vS, 1);
        C14360o3.A0B(c41551w4, 2);
        C14360o3.A0B(interfaceC143576dw, 3);
        if (c41181vS.CY4()) {
            Reel reel = c41551w4.A0H;
            if (!reel.A0b() && !reel.A0i() && !c41181vS.A1f() && interfaceC143576dw.C9J() != null && C141446aN.A02(userSession, c41181vS, c41551w4)) {
                C38321qM c38321qM = c41181vS.A0b;
                if (c38321qM != null) {
                    List A3l = c38321qM.A3l();
                    if ((A3l != null && A3l.size() >= 20) || AbstractC23021Ah.A00(userSession).A01.getBoolean("has_added_anytime_story_mentions", false) || AbstractC23021Ah.A00(userSession).A01.getInt("story_add_mentions_tooltip_impression_count", 0) > 2) {
                        return false;
                    }
                    return true;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
        return false;
    }

    @Override // X.InterfaceC148826mr
    public final EnumC58132lV C9M() {
        return EnumC58132lV.A02;
    }
}
