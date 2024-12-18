package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.HKl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39132HKl extends C39135HKo {
    public final FragmentActivity A00;

    public C39132HKl(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM) {
        super(fragmentActivity, userSession, c38321qM, null, false, false, false);
        this.A00 = fragmentActivity;
    }

    @Override // X.C39135HKo, X.HGS, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1812779892);
        super.onFail(abstractC115105If);
        AbstractC37765Gjg.A00.A01(2131957616, null);
        C0f9.A0A(1100747840, A0N);
    }

    @Override // X.C39135HKo, X.HGS, X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        UserSession userSession;
        C38321qM c38321qM;
        String str;
        int A03 = C0f9.A03(89206551);
        H9U h9u = (H9U) obj;
        int A0N = AbstractC167017dG.A0N(h9u, -1322536252);
        super.onSuccess(h9u);
        C38622GyP c38622GyP = h9u.A00;
        if (c38622GyP == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        boolean z = false;
        boolean A1P = AbstractC167007dF.A1P(c38622GyP.A01 ? 1 : 0, 1);
        HashMap hashMap = c38622GyP.A00;
        if (hashMap != null) {
            z = AbstractC166997dE.A1Z(hashMap.get("FB"), true);
        }
        if (z) {
            if (A1P) {
                AbstractC37765Gjg.A00.A01(2131957617, null);
                userSession = ((HGS) this).A01;
                C14360o3.A07(userSession);
                c38321qM = ((HGS) this).A02;
                C14360o3.A07(c38321qM);
                str = "mutation_success_both";
            }
            AbstractC37765Gjg.A00.A01(2131957616, null);
            userSession = ((HGS) this).A01;
            C14360o3.A07(userSession);
            c38321qM = ((HGS) this).A02;
            C14360o3.A07(c38321qM);
            str = "mutation_fail_both";
        } else {
            if (A1P) {
                AbstractC37765Gjg.A00.A01(2131957622, null);
                userSession = ((HGS) this).A01;
                C14360o3.A07(userSession);
                c38321qM = ((HGS) this).A02;
                C14360o3.A07(c38321qM);
                str = "mutation_fail_facebook_only";
            }
            AbstractC37765Gjg.A00.A01(2131957616, null);
            userSession = ((HGS) this).A01;
            C14360o3.A07(userSession);
            c38321qM = ((HGS) this).A02;
            C14360o3.A07(c38321qM);
            str = "mutation_fail_both";
        }
        AbstractC40629Hzn.A00(str, userSession, c38321qM);
        C0f9.A0A(722484599, A0N);
        C0f9.A0A(1475606784, A03);
    }
}
