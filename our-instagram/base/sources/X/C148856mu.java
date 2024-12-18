package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6mu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148856mu implements InterfaceC148826mr {
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
        return new C149686oL(context.getString(2131974206));
    }

    @Override // X.InterfaceC148826mr
    public final void Dtu(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        A00.A5H.Egi(A00, true, C23031Ai.A8c[199]);
    }

    @Override // X.InterfaceC148826mr
    public final boolean Ejo(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
        View CGQ = interfaceC143576dw.CGQ();
        if (CGQ != null && CGQ.getVisibility() == 0) {
            C38321qM c38321qM = c41181vS.A0b;
            if (AbstractC140316Wj.A00(c38321qM) != null && AbstractC140316Wj.A00(c38321qM).A01() != 0) {
                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                if (!((Boolean) A00.A5H.CES(A00, C23031Ai.A8c[199])).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }
}
