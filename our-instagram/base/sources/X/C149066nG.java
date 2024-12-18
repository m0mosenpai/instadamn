package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6nG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149066nG implements InterfaceC148826mr {
    @Override // X.InterfaceC148826mr
    public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        C14360o3.A0B(interfaceC143576dw, 0);
        return interfaceC143576dw.C2E();
    }

    @Override // X.InterfaceC148826mr
    public final C207559Gj C9L(UserSession userSession, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        return null;
    }

    @Override // X.InterfaceC148826mr
    public final C5ST C9O(Context context, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        C14360o3.A0B(context, 1);
        String string = context.getResources().getString(2131960450);
        C14360o3.A07(string);
        return new C149686oL(string);
    }

    @Override // X.InterfaceC148826mr
    public final void Dtu(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        String str;
        String str2;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC11380iw, 2);
        C14360o3.A0B(c41181vS, 3);
        String str3 = c41181vS.A0j;
        C14360o3.A07(str3);
        User user = c41181vS.A0i;
        if (user != null) {
            str = user.getId();
        } else {
            str = null;
        }
        if (c41181vS.A1K()) {
            str2 = MSV.A00(1627);
        } else {
            str2 = "location_story_action_sheet";
        }
        AbstractC73317Y7a.A0C(interfaceC11380iw, userSession, str3, str, str2);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        A00.A3G.Egi(A00, false, C23031Ai.A8c[375]);
        AbstractC23021Ah.A00(userSession).A0Q();
    }

    @Override // X.InterfaceC148826mr
    public final boolean Ejo(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
        C14360o3.A0B(userSession, 0);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        return ((Boolean) A00.A3G.CES(A00, C23031Ai.A8c[375])).booleanValue();
    }

    @Override // X.InterfaceC148826mr
    public final EnumC58132lV C9M() {
        return EnumC58132lV.A02;
    }
}
