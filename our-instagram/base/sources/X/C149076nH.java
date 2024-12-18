package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* renamed from: X.6nH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149076nH implements InterfaceC148826mr {
    public boolean A00;

    @Override // X.InterfaceC148826mr
    public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        return null;
    }

    @Override // X.InterfaceC148826mr
    public final C207559Gj C9L(UserSession userSession, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        C143556du c143556du;
        C97674a2 c97674a2;
        C14360o3.A0B(interfaceC143576dw, 2);
        if (!(interfaceC143576dw instanceof C143556du) || (c143556du = (C143556du) interfaceC143576dw) == null || (c97674a2 = c143556du.A1T) == null || c97674a2.A01 == null) {
            return null;
        }
        c97674a2.A05();
        View A05 = c97674a2.A05();
        return new C207559Gj(A05, 0, -((A05.getHeight() / 2) + A05.getContext().getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material)), true);
    }

    @Override // X.InterfaceC148826mr
    public final C5ST C9O(Context context, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        C14360o3.A0B(context, 1);
        String string = context.getString(2131974770);
        C14360o3.A07(string);
        return new C149686oL(string);
    }

    @Override // X.InterfaceC148826mr
    public final void Dtu(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        C14360o3.A0B(userSession, 0);
        if (!this.A00) {
            this.A00 = true;
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            int i = AbstractC23021Ah.A00(userSession).A01.getInt("stories_template_new_sticker_impression_count", 0) + 1;
            InterfaceC19610xo ARD = A00.A01.ARD();
            ARD.E7D("stories_template_new_sticker_impression_count", i);
            ARD.apply();
        }
    }

    @Override // X.InterfaceC148826mr
    public final boolean Ejo(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
        PromptStickerModel A0E;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c41181vS, 1);
        C14360o3.A0B(c41551w4, 2);
        C84823qW A00 = AbstractC120715dH.A00(EnumC75383a5.A11, c41181vS.A0c());
        if (c41551w4.A0H.A1a || A00 == null || A00.A0E() == null || (A0E = A00.A0E()) == null || !A0E.A0M() || this.A00 || AbstractC23021Ah.A00(userSession).A01.getInt("stories_template_new_sticker_impression_count", 0) >= 3 || AbstractC23021Ah.A00(userSession).A01.getBoolean("stories_template_add_yours_clicked", false)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC148826mr
    public final EnumC58132lV C9M() {
        return EnumC58132lV.A02;
    }
}
