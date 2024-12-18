package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.6nF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149056nF implements InterfaceC148826mr {
    @Override // X.InterfaceC148826mr
    public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        C14360o3.A0B(interfaceC143576dw, 0);
        return interfaceC143576dw.CGQ();
    }

    @Override // X.InterfaceC148826mr
    public final C207559Gj C9L(UserSession userSession, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        return null;
    }

    @Override // X.InterfaceC148826mr
    public final C5ST C9O(Context context, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        C14360o3.A0B(context, 1);
        String string = context.getResources().getString(2131971512);
        C14360o3.A07(string);
        return new C149686oL(string);
    }

    @Override // X.InterfaceC148826mr
    public final void Dtu(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        C14360o3.A0B(userSession, 0);
        InterfaceC19610xo ARD = C1AT.A01(userSession).A03(C1AV.A38).ARD();
        ARD.E77("reaction_sticker_facepile_nux_shown", true);
        ARD.apply();
    }

    @Override // X.InterfaceC148826mr
    public final boolean Ejo(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c41181vS, 1);
        C14360o3.A0B(c41551w4, 2);
        if (C1AT.A01(userSession).A03(C1AV.A38).getBoolean("reaction_sticker_facepile_nux_shown", false) || !C141446aN.A02(userSession, c41181vS, c41551w4) || !c41181vS.CY4()) {
            return false;
        }
        C38321qM c38321qM = c41181vS.A0b;
        c38321qM.getClass();
        List C26 = c38321qM.A0C.C26();
        if (C26 == null || C26.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC148826mr
    public final EnumC58132lV C9M() {
        return EnumC58132lV.A02;
    }
}
