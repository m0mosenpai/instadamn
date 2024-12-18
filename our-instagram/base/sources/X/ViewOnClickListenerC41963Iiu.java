package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Iiu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41963Iiu implements View.OnClickListener {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ C75113Zb A03;

    public ViewOnClickListenerC41963Iiu(Fragment fragment, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        this.A01 = userSession;
        this.A00 = fragment;
        this.A02 = c38321qM;
        this.A03 = c75113Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(988193402);
        UserSession userSession = this.A01;
        Fragment fragment = this.A00;
        C2Fb c2Fb = C2Fb.A28;
        C60962qK A01 = AbstractC60952qJ.A01("instagram_deeplink", true, true);
        C38321qM c38321qM = this.A02;
        C75113Zb c75113Zb = this.A03;
        C37952Gmu c37952Gmu = new C37952Gmu(fragment, userSession, new C5SE(userSession, c38321qM, c75113Zb.A06()), A01, c2Fb);
        c37952Gmu.A01(c38321qM);
        c37952Gmu.A09 = c75113Zb.A03;
        c37952Gmu.A0B = c75113Zb.getPosition();
        c37952Gmu.A0K = c75113Zb;
        C37953Gmv.A02(c37952Gmu);
        C0f9.A0C(-42711815, A05);
    }
}
