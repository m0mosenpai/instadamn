package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6mx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148886mx implements InterfaceC148826mr {
    @Override // X.InterfaceC148826mr
    public final C207559Gj C9L(UserSession userSession, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        return null;
    }

    @Override // X.InterfaceC148826mr
    public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        return ((C143556du) interfaceC143576dw).A1U.A01;
    }

    @Override // X.InterfaceC148826mr
    public final EnumC58132lV C9M() {
        return EnumC58132lV.A03;
    }

    @Override // X.InterfaceC148826mr
    public final C5ST C9O(Context context, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        String string = context.getString(2131971438);
        User user = c41181vS.A0i;
        user.getClass();
        return new C23964Ajy(string, context.getString(2131971437, user.getUsername()));
    }

    @Override // X.InterfaceC148826mr
    public final void Dtu(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
        int i = interfaceC19630xq.getInt("story_quiz_tooltip_impression_count", 0) + 1;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7D("story_quiz_tooltip_impression_count", i);
        ARD.apply();
    }

    @Override // X.InterfaceC148826mr
    public final boolean Ejo(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
        if (AbstractC97594Zu.A01(c41181vS) != null && Boolean.TRUE.equals(AbstractC97594Zu.A01(c41181vS).A02.A01) && !AbstractC23021Ah.A00(userSession).A01.getBoolean("has_ever_answered_story_quiz", false) && AbstractC23021Ah.A00(userSession).A01.getInt("story_quiz_tooltip_impression_count", 0) < 2) {
            return true;
        }
        return false;
    }
}
