package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6n0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148916n0 implements InterfaceC148826mr {
    @Override // X.InterfaceC148826mr
    public final C207559Gj C9L(UserSession userSession, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        return null;
    }

    @Override // X.InterfaceC148826mr
    public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        return ((C143556du) interfaceC143576dw).A14.A06;
    }

    @Override // X.InterfaceC148826mr
    public final EnumC58132lV C9M() {
        return EnumC58132lV.A03;
    }

    @Override // X.InterfaceC148826mr
    public final boolean Ejo(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
        Boolean bool;
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null && !AbstractC50102Ry.A00(c38321qM.A2E(userSession), C17060sy.A01.A01(userSession)) && AbstractC140316Wj.A00(c38321qM) != null && (bool = AbstractC140316Wj.A00(c38321qM).A00.A01) != null && bool.booleanValue() && !AbstractC140316Wj.A00(c38321qM).A03() && !AbstractC23021Ah.A00(userSession).A01.getBoolean("has_ever_voted_on_story_slider", false) && AbstractC23021Ah.A00(userSession).A01.getInt("story_slider_tooltip_impression_count", 0) < 2) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC148826mr
    public final C5ST C9O(Context context, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        String string = context.getString(2131974208);
        User user = c41181vS.A0i;
        user.getClass();
        return new C23964Ajy(string, context.getString(2131974207, user.getUsername()));
    }

    @Override // X.InterfaceC148826mr
    public final void Dtu(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
        int i = interfaceC19630xq.getInt("story_slider_tooltip_impression_count", 0) + 1;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7D("story_slider_tooltip_impression_count", i);
        ARD.apply();
    }
}
