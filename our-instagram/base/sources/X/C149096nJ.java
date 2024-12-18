package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6nJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149096nJ implements InterfaceC148826mr {
    @Override // X.InterfaceC148826mr
    public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        C143556du c143556du;
        C6e7 c6e7;
        InterfaceC56392iX interfaceC56392iX;
        C14360o3.A0B(interfaceC143576dw, 0);
        if (!(interfaceC143576dw instanceof C143556du) || (c143556du = (C143556du) interfaceC143576dw) == null || (c6e7 = c143556du.A1e) == null || (interfaceC56392iX = c6e7.A1Z) == null) {
            return null;
        }
        return interfaceC56392iX.getView();
    }

    @Override // X.InterfaceC148826mr
    public final C207559Gj C9L(UserSession userSession, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        return null;
    }

    @Override // X.InterfaceC148826mr
    public final C5ST C9O(Context context, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        C14360o3.A0B(context, 1);
        String string = context.getString(2131974573);
        C14360o3.A07(string);
        return new C149686oL(string);
    }

    @Override // X.InterfaceC148826mr
    public final void Dtu(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        C14360o3.A0B(userSession, 0);
        InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
        ARD.E77("has_seen_story_comments_button_tooltip", true);
        ARD.apply();
    }

    @Override // X.InterfaceC148826mr
    public final boolean Ejo(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c41181vS, 1);
        C14360o3.A0B(c41551w4, 2);
        if (!c41551w4.A0H.A1a && c41181vS.A0l() && !AbstractC23021Ah.A00(userSession).A01.getBoolean("has_seen_story_comments_button_tooltip", false)) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36318221980145700L) && C18U.A06(c06090Tz, userSession, 2342161231194757161L)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC148826mr
    public final EnumC58132lV C9M() {
        return EnumC58132lV.A02;
    }
}
