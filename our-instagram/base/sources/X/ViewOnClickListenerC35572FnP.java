package X;

import android.content.Context;
import android.view.View;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.FnP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35572FnP implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C37211oK A02;

    public ViewOnClickListenerC35572FnP(Context context, UserSession userSession, C37211oK c37211oK) {
        this.A02 = c37211oK;
        this.A01 = userSession;
        this.A00 = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-796795784);
        UserSession userSession = this.A01;
        Context context = this.A00;
        C66277U6x A02 = C66277U6x.A02("com.bloks.www.ig.gen_ai_agent.profile.education", AbstractC166987dD.A1G(), AbstractC166987dD.A1G());
        C34397FEn c34397FEn = new C34397FEn(userSession);
        C35205Ffx c35205Ffx = new C35205Ffx();
        c35205Ffx.A03 = U6H.A06;
        C65981Txa A03 = c35205Ffx.A03();
        IgBloksScreenConfig igBloksScreenConfig = c34397FEn.A00;
        igBloksScreenConfig.A0C = A03;
        A02.A06(context, igBloksScreenConfig);
        C0f9.A0C(1205756285, A05);
    }
}
