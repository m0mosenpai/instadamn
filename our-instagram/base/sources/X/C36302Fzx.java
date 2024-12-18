package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fzx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36302Fzx implements InterfaceC13000lm, CallerContextable {
    public static final String __redex_internal_original_name = "FxAvatarsEditorUpsellHelper";
    public final UserSession A00;

    public C36302Fzx(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final boolean A00() {
        UserSession userSession = this.A00;
        if (!C18U.A06(C06090Tz.A06, userSession, 2342157546111896241L) && AbstractC49092Nc.A00(userSession).A00(CallerContext.A00(C36302Fzx.class), "ig_avatar_editor_upsell")) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.A03(C36302Fzx.class);
    }
}
