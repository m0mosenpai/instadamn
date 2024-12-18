package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import com.instagram.model.direct.DirectShareTarget;

/* loaded from: classes6.dex */
public final class EZ4 extends C2AH {
    public final /* synthetic */ long A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public EZ4(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, long j) {
        this.A01 = fragmentActivity;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A05 = str;
        this.A04 = str2;
        this.A00 = j;
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        C65911TwI c65911TwI = (C65911TwI) obj;
        C14360o3.A0B(c65911TwI, 0);
        C3DO c3do = C3DN.A00;
        FragmentActivity fragmentActivity = this.A01;
        AbstractC167017dG.A0y(fragmentActivity, c3do);
        UserSession userSession = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        String str = this.A05;
        if (str != null) {
            i = 2332;
        } else {
            i = 2331;
        }
        String A00 = AbstractC111324zv.A00(i);
        String A0b = AbstractC31178DnM.A0b();
        AiAgentThreadLauncher aiAgentThreadLauncher = new AiAgentThreadLauncher(userSession);
        DirectShareTarget A002 = c65911TwI.A00();
        String str2 = this.A04;
        int length = str2.length();
        if (length == 0) {
            str2 = A00;
        }
        if (!aiAgentThreadLauncher.A0B(fragmentActivity, null, interfaceC11380iw, new C36394G3v(A01, A0b, str2, A00, this.A00), A002, null, str2, str, true, false, false, false, false)) {
            if (length != 0) {
                A00 = str2;
            }
            String stackTraceString = android.util.Log.getStackTraceString(new Exception());
            C14360o3.A07(stackTraceString);
            String A0q = AbstractC31173DnH.A0q(this);
            DirectShareTarget A003 = c65911TwI.A00();
            C14360o3.A0B(userSession, 0);
            F1W.A00(A01, A003, A0b, A00, stackTraceString, A0q, AbstractC31271Dot.A00(userSession), "", "");
        }
    }
}
