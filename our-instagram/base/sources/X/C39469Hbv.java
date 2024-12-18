package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Hbv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39469Hbv extends HG7 {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final C120985dq A02;
    public final C31349DqE A03;
    public final boolean A04;

    public C39469Hbv(FragmentActivity fragmentActivity, C120985dq c120985dq, UserSession userSession, C37540Gfw c37540Gfw) {
        super(fragmentActivity, c120985dq, userSession, c37540Gfw);
        ImageUrl A1S;
        this.A00 = fragmentActivity;
        this.A02 = c120985dq;
        this.A01 = userSession;
        this.A04 = true;
        C146106i8 A0K = AbstractC31171DnF.A0K();
        AbstractC25226BEj.A1N(fragmentActivity.getBaseContext(), A0K, 2131957731);
        A0K.A06();
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && (A1S = c38321qM.A1S()) != null) {
            A0K.A09 = A1S;
            A0K.A03();
        }
        this.A03 = A0K.A00();
    }

    @Override // X.HG7
    public final void A00(H9U h9u) {
        int A03 = C0f9.A03(-1414865409);
        C14360o3.A0B(h9u, 0);
        super.A00(h9u);
        C38622GyP c38622GyP = h9u.A00;
        if (c38622GyP == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        if (c38622GyP.A01) {
            if (this.A04) {
                FragmentActivity fragmentActivity = this.A00;
                UserSession userSession = this.A01;
                C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, userSession);
                A0P.A0B(null, AbstractC54311NzV.A00(null, userSession, false));
                A0P.A04();
            }
        } else {
            C9GR.A01(this.A00.getBaseContext(), "clips_delete_failed_response_did_deleted_not_true", 2131955412, 0);
        }
        C0f9.A0A(439754385, A03);
    }

    @Override // X.HG7, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(488937449);
        C14360o3.A0B(abstractC115105If, 0);
        super.onFail(abstractC115105If);
        C9GR.A01(this.A00.getBaseContext(), "clips_delete_failed", 2131955412, 0);
        C0f9.A0A(-1538873546, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-2143105587);
        C41451vu.A01.E4s(new C3KF(this.A03));
        C0f9.A0A(194662920, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-858047578);
        AbstractC166997dE.A1O(C41451vu.A01, this.A03);
        C0f9.A0A(-1746993380, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1590832933);
        A00((H9U) obj);
        C0f9.A0A(-713853021, A03);
    }
}
