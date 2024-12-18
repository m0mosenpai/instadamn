package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6nA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149006nA implements InterfaceC148826mr {
    public static final Rect A00 = new Rect();

    @Override // X.InterfaceC148826mr
    public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        return null;
    }

    @Override // X.InterfaceC148826mr
    public final EnumC58132lV C9M() {
        return EnumC58132lV.A03;
    }

    @Override // X.InterfaceC148826mr
    public final C207559Gj C9L(UserSession userSession, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        C84823qW A002 = AbstractC120715dH.A00(EnumC75383a5.A0n, c41181vS.A0c());
        FrameLayout Blf = interfaceC143576dw.Blf();
        if (A002 != null && Blf != null) {
            int width = Blf.getWidth();
            int height = Blf.getHeight();
            float A003 = c41181vS.A00();
            Rect rect = A00;
            AbstractC138846Qp.A00(rect, A002, A003, width, height);
            return new C207559Gj(Blf, rect.centerX(), rect.bottom + Blf.getContext().getResources().getDimensionPixelOffset(R.dimen.accent_edge_thickness), false);
        }
        return null;
    }

    @Override // X.InterfaceC148826mr
    public final C5ST C9O(Context context, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        return new C149686oL(context.getText(2131975215));
    }

    @Override // X.InterfaceC148826mr
    public final void Dtu(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
        ARD.E77("has_ever_seen_share_professional_sticker", true);
        ARD.apply();
    }

    @Override // X.InterfaceC148826mr
    public final boolean Ejo(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
        C84823qW A002 = AbstractC120715dH.A00(EnumC75383a5.A0n, c41181vS.A0c());
        if (A002 != null && "mention_professional_username".equals(A002.A1h)) {
            User user = c41181vS.A0i;
            user.getClass();
            if (!C2TN.A05(userSession, user.getId()) && !AbstractC23021Ah.A00(userSession).A01.getBoolean("has_ever_seen_share_professional_sticker", false)) {
                return true;
            }
        }
        return false;
    }
}
