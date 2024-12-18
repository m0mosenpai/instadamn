package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.DpN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31301DpN extends AbstractC46524KiP implements GZA {
    public C2EC A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final C2056398n A03;

    @Override // X.AbstractC46524KiP
    public final View A06(Context context) {
        C14360o3.A0B(context, 0);
        AbstractC167017dG.A1R(this.A02, this.A03);
        IgdsBanner igdsBanner = new IgdsBanner(context, null, 0);
        igdsBanner.setIcon(R.drawable.instagram_alert_pano_outline_24);
        AbstractC31172DnG.A1U(igdsBanner, context.getString(2131963988), false);
        AbstractC31174DnI.A1Q(this, igdsBanner, 2131963989, false);
        return igdsBanner;
    }

    @Override // X.AbstractC46524KiP
    public final void A07(InterfaceC50428MOi interfaceC50428MOi, InterfaceC37159GYw interfaceC37159GYw, C2EC c2ec, String str, boolean z) {
        C14360o3.A0B(interfaceC37159GYw, 1);
        this.A00 = c2ec;
        if (c2ec != null) {
            C2056398n c2056398n = this.A03;
            C14360o3.A0B(c2056398n, 1);
            if (AbstractC167017dG.A1b(c2056398n, c2056398n.A0F, C2056398n.A0d, 22) || AbstractC166997dE.A1Z(((C81663kb) c2ec).A01.A1g, true)) {
                interfaceC37159GYw.Dpu(this);
                return;
            }
        }
        interfaceC37159GYw.onFailure();
    }

    @Override // X.GZA
    public final void onBannerDismissed() {
    }

    @Override // X.GZA
    public final void onActionClicked() {
        C63397SjR A0y = AbstractC25228BEl.A0y(this.A01, this.A02, C2Fb.A1W, "https://help.instagram.com/654906392080948");
        A0y.A0S = "igd_xac_thread_will_be_read_only_banner";
        A0y.A0A();
    }

    public C31301DpN(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = AbstractC2056298m.A00(userSession);
    }
}
