package X;

import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "Deprecated after UUL migration. To modify Logout upsell please use FxIgLogoutACUpsellImpl instead")
/* renamed from: X.Fzw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36301Fzw implements InterfaceC13000lm, CallerContextable {
    public static final String __redex_internal_original_name = "FxLogoutSsoUpsellHelper";
    public EnumC33353Eom A00;
    public final UserSession A01;

    public C36301Fzw(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = EnumC33353Eom.A05;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.A03(C36301Fzw.class);
    }
}
