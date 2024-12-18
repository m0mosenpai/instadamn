package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AST implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C166627cY A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C1M1 A03;
    public final /* synthetic */ InterfaceC09390do A04;

    public AST(FragmentActivity fragmentActivity, C166627cY c166627cY, UserSession userSession, C1M1 c1m1, InterfaceC09390do interfaceC09390do) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = c166627cY;
        this.A03 = c1m1;
        this.A04 = interfaceC09390do;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-190118087);
        UserSession userSession = this.A02;
        FragmentActivity fragmentActivity = this.A00;
        String A0g = AbstractC167007dF.A0g(this.A01.A0B);
        String sessionId = this.A03.getSessionId();
        this.A04.getValue();
        C166617cX.A06(fragmentActivity, userSession, null, A0g, sessionId, false);
        C0f9.A0C(1190162038, A05);
    }
}
