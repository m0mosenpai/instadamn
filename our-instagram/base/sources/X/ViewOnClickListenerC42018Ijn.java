package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ijn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC42018Ijn implements View.OnClickListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ Fragment A02;
    public final /* synthetic */ C120985dq A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C5SE A05;
    public final /* synthetic */ InterfaceC60442pS A06;
    public final /* synthetic */ C75113Zb A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public ViewOnClickListenerC42018Ijn(Fragment fragment, C120985dq c120985dq, UserSession userSession, C5SE c5se, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, String str, float f, float f2, boolean z, boolean z2) {
        this.A04 = userSession;
        this.A02 = fragment;
        this.A06 = interfaceC60442pS;
        this.A05 = c5se;
        this.A03 = c120985dq;
        this.A07 = c75113Zb;
        this.A08 = str;
        this.A00 = f;
        this.A01 = f2;
        this.A09 = z;
        this.A0A = z2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(277385413);
        UserSession userSession = this.A04;
        Fragment fragment = this.A02;
        C2Fb c2Fb = C2Fb.A28;
        C37952Gmu c37952Gmu = new C37952Gmu(fragment, userSession, this.A05, this.A06, c2Fb);
        C120985dq c120985dq = this.A03;
        c37952Gmu.A0O = c120985dq.A06();
        C75113Zb c75113Zb = this.A07;
        c37952Gmu.A0B = c75113Zb.getPosition();
        c37952Gmu.A0K = c75113Zb;
        c37952Gmu.A0i = this.A08;
        c37952Gmu.A06 = this.A00;
        c37952Gmu.A07 = this.A01;
        c37952Gmu.A0o = this.A09;
        c37952Gmu.A0p = this.A0A;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            c37952Gmu.A0J = c38321qM;
        }
        C37953Gmv.A02(c37952Gmu);
        C0f9.A0C(-1672440331, A05);
    }
}
