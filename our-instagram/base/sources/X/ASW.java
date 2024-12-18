package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class ASW implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C166627cY A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C148286ly A03;
    public final /* synthetic */ C1M1 A04;
    public final /* synthetic */ InterfaceC09390do A05;

    public ASW(FragmentActivity fragmentActivity, C166627cY c166627cY, UserSession userSession, C148286ly c148286ly, C1M1 c1m1, InterfaceC09390do interfaceC09390do) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = c166627cY;
        this.A04 = c1m1;
        this.A03 = c148286ly;
        this.A05 = interfaceC09390do;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-987625725);
        UserSession userSession = this.A02;
        FragmentActivity fragmentActivity = this.A00;
        String A0g = AbstractC167007dF.A0g(this.A01.A0B);
        String sessionId = this.A04.getSessionId();
        this.A05.getValue();
        C166617cX.A06(fragmentActivity, userSession, this.A03, A0g, sessionId, true);
        C0f9.A0C(195187165, A05);
    }
}
