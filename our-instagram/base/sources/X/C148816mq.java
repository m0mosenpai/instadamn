package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6mq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148816mq implements InterfaceC148826mr {
    @Override // X.InterfaceC148826mr
    public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        C14360o3.A0B(interfaceC143576dw, 0);
        return interfaceC143576dw.AsV();
    }

    @Override // X.InterfaceC148826mr
    public final C207559Gj C9L(UserSession userSession, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        return null;
    }

    @Override // X.InterfaceC148826mr
    public final C5ST C9O(Context context, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        C14360o3.A0B(context, 1);
        String string = context.getString(2131956948);
        C14360o3.A07(string);
        return new C149686oL(string);
    }

    @Override // X.InterfaceC148826mr
    public final void Dtu(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        C14360o3.A0B(userSession, 0);
        InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
        ARD.E77("create_from_story_has_seen_tooltip", true);
        ARD.apply();
    }

    @Override // X.InterfaceC148826mr
    public final boolean Ejo(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC143576dw, 3);
        if (interfaceC143576dw.AsV() != null && !AbstractC23021Ah.A00(userSession).A01.getBoolean("create_from_story_has_seen_tooltip", false)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC148826mr
    public final EnumC58132lV C9M() {
        return EnumC58132lV.A02;
    }
}
