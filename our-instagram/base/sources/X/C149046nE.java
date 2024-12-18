package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.6nE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149046nE implements InterfaceC148826mr {
    @Override // X.InterfaceC148826mr
    public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        C143556du c143556du;
        C144336fF c144336fF;
        C14360o3.A0B(interfaceC143576dw, 0);
        if (!(interfaceC143576dw instanceof C143556du) || (c143556du = (C143556du) interfaceC143576dw) == null || (c144336fF = c143556du.A1i) == null) {
            return null;
        }
        return c144336fF.A01.A01();
    }

    @Override // X.InterfaceC148826mr
    public final C207559Gj C9L(UserSession userSession, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        return null;
    }

    @Override // X.InterfaceC148826mr
    public final C5ST C9O(Context context, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        C14360o3.A0B(context, 1);
        String string = context.getString(2131971513);
        C14360o3.A07(string);
        return new C149686oL(string);
    }

    @Override // X.InterfaceC148826mr
    public final void Dtu(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        C14360o3.A0B(userSession, 0);
        InterfaceC19610xo ARD = C1AT.A01(userSession).A03(C1AV.A38).ARD();
        ARD.E77("tappable_reaction_sticker_nux_shown", true);
        ARD.apply();
    }

    @Override // X.InterfaceC148826mr
    public final boolean Ejo(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
        List A3w;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c41181vS, 1);
        if (C1AT.A01(userSession).A04(C1AV.A38, getClass()).getBoolean("tappable_reaction_sticker_nux_shown", false)) {
            return false;
        }
        C38321qM c38321qM = c41181vS.A0b;
        String str = null;
        if (c38321qM == null || (A3w = c38321qM.A3w(EnumC75383a5.A17)) == null || !(!A3w.isEmpty())) {
            return false;
        }
        User user = c41181vS.A0i;
        if (user != null) {
            str = user.getId();
        }
        if (C2TN.A05(userSession, str)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC148826mr
    public final EnumC58132lV C9M() {
        return EnumC58132lV.A03;
    }
}
