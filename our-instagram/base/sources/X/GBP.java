package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GBP implements C73R {
    public GXI A00;
    public final Context A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C73S A04;
    public final String A05;

    @Override // X.C73R
    public final String AjD() {
        return "ai_message";
    }

    @Override // X.C73R
    public final /* synthetic */ boolean DQZ() {
        return false;
    }

    @Override // X.C73R
    public final String Aj7() {
        return AbstractC166997dE.A0p(this.A01, 2131970072);
    }

    @Override // X.C73R
    public final void onClick() {
        Activity activity;
        GXI gxi = this.A00;
        if (gxi != null && (activity = (Activity) AbstractC13320mI.A00(this.A01, Activity.class)) != null) {
            C37321oV.A00();
            new FR2(activity, this.A03).A00(this.A02, gxi, this.A05);
        }
    }

    public GBP(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, boolean z) {
        C73S c73s;
        this.A01 = context;
        this.A05 = str;
        this.A02 = interfaceC11380iw;
        this.A03 = userSession;
        if (!AbstractC31172DnG.A1Z(userSession, str) && z) {
            c73s = C73S.A0G;
        } else {
            c73s = C73S.A03;
        }
        this.A04 = c73s;
    }

    @Override // X.C73R
    public final C73S AjB() {
        return this.A04;
    }

    @Override // X.C73R
    public final Integer BEt() {
        return Integer.valueOf(R.drawable.instagram_gen_ai_pano_filled_16);
    }
}
