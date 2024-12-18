package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6my, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148896my implements InterfaceC148826mr {
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
        return interfaceC143576dw.CGQ();
    }

    @Override // X.InterfaceC148826mr
    public final C5ST C9O(Context context, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        return new C149686oL(context.getString(2131971436));
    }

    @Override // X.InterfaceC148826mr
    public final void Dtu(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        A00.A5G.Egi(A00, true, C23031Ai.A8c[198]);
    }

    @Override // X.InterfaceC148826mr
    public final boolean Ejo(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
        C38321qM c38321qM;
        View CGQ = interfaceC143576dw.CGQ();
        if (CGQ == null || CGQ.getVisibility() != 0 || c41181vS == null || (c38321qM = c41181vS.A0b) == null || c38321qM.A0C.C23() == null || c38321qM.A0C.C23().isEmpty() || ((JMB) c38321qM.A0C.C23().get(0)).BbX() == null || ((JMB) c38321qM.A0C.C23().get(0)).BbX().isEmpty()) {
            return false;
        }
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        if (((Boolean) A00.A5G.CES(A00, C23031Ai.A8c[198])).booleanValue()) {
            return false;
        }
        return true;
    }
}
