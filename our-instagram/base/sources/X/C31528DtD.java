package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.DtD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31528DtD implements C73R {
    public final C73S A00 = C73S.A0G;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C70O A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ C152586tl A05;

    @Override // X.C73R
    public final String AjD() {
        return "generic";
    }

    @Override // X.C73R
    public final /* synthetic */ Integer BEt() {
        return null;
    }

    @Override // X.C73R
    public final /* synthetic */ boolean DQZ() {
        return false;
    }

    public C31528DtD(Context context, UserSession userSession, C70O c70o, User user, C152586tl c152586tl) {
        this.A01 = context;
        this.A04 = user;
        this.A02 = userSession;
        this.A03 = c70o;
        this.A05 = c152586tl;
    }

    @Override // X.C73R
    public final String Aj7() {
        Context context = this.A01;
        int i = 2131973209;
        if (AbstractC31171DnF.A1W(this.A02, this.A04.getId())) {
            i = 2131960982;
        }
        return AbstractC25227BEk.A0u(context, i);
    }

    @Override // X.C73R
    public final void onClick() {
        String str;
        if (AbstractC31171DnF.A1W(this.A02, this.A04.getId())) {
            str = "tap_dropdown_discover_people";
        } else {
            str = "tap_dropdown_suggested_accounts";
        }
        this.A03.BiC().D3z(str, "user_profile_header");
        this.A05.A0G(true, "overflow_menu_see_similar_accounts");
    }

    @Override // X.C73R
    public final C73S AjB() {
        return this.A00;
    }
}
