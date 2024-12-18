package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class HG7 extends C1P1 {
    public final long A00 = 658062002;
    public final FragmentActivity A01;
    public final UserFlowLogger A02;
    public final C120985dq A03;
    public final UserSession A04;
    public final C147066ji A05;
    public final C37540Gfw A06;

    public HG7(FragmentActivity fragmentActivity, C120985dq c120985dq, UserSession userSession, C37540Gfw c37540Gfw) {
        this.A01 = fragmentActivity;
        this.A03 = c120985dq;
        this.A06 = c37540Gfw;
        this.A04 = userSession;
        this.A05 = new C147066ji(userSession, fragmentActivity);
        this.A02 = C1QS.A00(userSession);
    }

    public void A00(H9U h9u) {
        int A03 = C0f9.A03(-738386105);
        C38622GyP c38622GyP = h9u.A00;
        if (c38622GyP == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        if (c38622GyP.A01) {
            C120985dq c120985dq = this.A03;
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null) {
                c38321qM.A00 = 1;
                c38321qM.A4L(C05F.A0C);
                c38321qM.AEH(this.A04);
            }
            this.A06.A0K(c120985dq, this.A05);
            this.A02.flowEndSuccess(this.A00);
        } else {
            this.A02.flowEndFail(this.A00, "delete_reel_deletion_failure", h9u.getErrorMessage());
        }
        AbstractC40913IAl.A00(this.A04, this.A01, "profile");
        C0f9.A0A(645912745, A03);
    }

    @Override // X.C1P1
    public void onFail(AbstractC115105If abstractC115105If) {
        String str;
        C40781ul c40781ul;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1798259161);
        String str2 = null;
        if (!(abstractC115105If instanceof C115115Ig) || (c40781ul = (C40781ul) ((C115115Ig) abstractC115105If).A00) == null || (str = c40781ul.getErrorMessage()) == null) {
            Throwable A01 = abstractC115105If.A01();
            if (A01 != null) {
                str2 = A01.getMessage();
            }
            str = str2;
        }
        this.A02.flowEndFail(this.A00, "delete_reel_response_failure", str);
        C0f9.A0A(810640542, A0N);
    }
}
