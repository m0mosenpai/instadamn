package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.user.model.User;

/* renamed from: X.Dpm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31324Dpm extends AbstractC46524KiP implements GZA {
    public final UserSession A00;
    public final C2056398n A01;

    @Override // X.AbstractC46524KiP
    public final View A06(Context context) {
        C14360o3.A0B(context, 0);
        IgdsBanner igdsBanner = new IgdsBanner(context, null, 0);
        igdsBanner.setDismissible(true);
        igdsBanner.setIcon(R.drawable.instagram_lock_pano_outline_24);
        AbstractC31172DnG.A1U(igdsBanner, context.getString(2131952797), false);
        igdsBanner.setAction(context.getString(2131952796));
        igdsBanner.A00 = new C36498G7w(1, context, this);
        return igdsBanner;
    }

    @Override // X.AbstractC46524KiP
    public final void A07(InterfaceC50428MOi interfaceC50428MOi, InterfaceC37159GYw interfaceC37159GYw, C2EC c2ec, String str, boolean z) {
        String str2;
        C14360o3.A0B(interfaceC37159GYw, 1);
        if (c2ec != null) {
            int C7g = c2ec.C7g();
            if (Integer.valueOf(C7g) != null && C7g == 1014) {
                UserSession userSession = this.A00;
                if (C18U.A06(C06090Tz.A05, userSession, 36325081046332121L)) {
                    User Ba5 = c2ec.Ba5();
                    if (Ba5 != null) {
                        str2 = Ba5.A03.Aab();
                    } else {
                        str2 = null;
                    }
                    if (!AbstractC31171DnF.A1W(userSession, str2)) {
                        InterfaceC19630xq interfaceC19630xq = this.A01.A00;
                        if (!interfaceC19630xq.getBoolean("ai_studio_privacy_banner_dismiss", false) && interfaceC19630xq.getInt("ai_studio_privacy_banner_impression_count", 0) < 3) {
                            AbstractC167017dG.A1L(interfaceC19630xq.ARD(), interfaceC19630xq, "ai_studio_privacy_banner_impression_count", 0);
                            interfaceC37159GYw.Dpu(this);
                            return;
                        }
                    }
                }
            }
            interfaceC37159GYw.onFailure();
        }
    }

    @Override // X.GZA
    public final /* synthetic */ void onActionClicked() {
    }

    @Override // X.GZA
    public final /* synthetic */ void onBannerDismissed() {
    }

    public C31324Dpm(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC2056298m.A00(userSession);
    }
}
