package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6s2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151566s2 implements C73R {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass742 A02;
    public final C73S A03;
    public final User A04;
    public final boolean A05;

    public C151566s2(Context context, UserSession userSession, AnonymousClass742 anonymousClass742, User user, boolean z) {
        C14360o3.A0B(anonymousClass742, 6);
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = user;
        this.A05 = z;
        this.A02 = anonymousClass742;
        anonymousClass742.DT3(z);
        this.A03 = C73S.A0E;
    }

    @Override // X.C73R
    public final String AjD() {
        return "generic";
    }

    @Override // X.C73R
    public final C73S AjB() {
        return this.A03;
    }

    @Override // X.C73R
    public final Integer BEt() {
        if (this.A05) {
            return Integer.valueOf(R.drawable.instagram_gen_ai_pano_filled_16);
        }
        return null;
    }

    @Override // X.C73R
    public final /* synthetic */ boolean DQZ() {
        return false;
    }

    @Override // X.C73R
    public final void onClick() {
        if (this.A05) {
            BP5.A00(new BP5(this.A01, null), AbstractC003100w.A0k(10, this.A04.getId()), "profile_stardust_message_icon_click");
        }
        this.A02.DSz("message_button", false);
    }

    @Override // X.C73R
    public final String Aj7() {
        String string = this.A00.getString(2131970214);
        C14360o3.A07(string);
        return string;
    }
}
