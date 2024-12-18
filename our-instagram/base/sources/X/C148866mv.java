package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6mv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148866mv implements InterfaceC148826mr {
    @Override // X.InterfaceC148826mr
    public final C207559Gj C9L(UserSession userSession, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        return null;
    }

    @Override // X.InterfaceC148826mr
    public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        return ((C143556du) interfaceC143576dw).A1b.A01;
    }

    @Override // X.InterfaceC148826mr
    public final EnumC58132lV C9M() {
        return EnumC58132lV.A03;
    }

    @Override // X.InterfaceC148826mr
    public final C5ST C9O(Context context, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        return new C149686oL(context.getString(2131971249));
    }

    @Override // X.InterfaceC148826mr
    public final void Dtu(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
        int i = interfaceC19630xq.getInt("story_question_tooltip_impression_count", 0) + 1;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7D("story_question_tooltip_impression_count", i);
        ARD.apply();
    }

    @Override // X.InterfaceC148826mr
    public final boolean Ejo(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
        Boolean bool;
        if (C6ZB.A03(c41181vS) != null && (bool = C6ZB.A03(c41181vS).A00.A02) != null && bool.booleanValue() && !AbstractC23021Ah.A00(userSession).A01.getBoolean("has_ever_responded_to_story_question", false) && AbstractC23021Ah.A00(userSession).A01.getInt("story_question_tooltip_impression_count", 0) < 2) {
            return true;
        }
        return false;
    }
}
