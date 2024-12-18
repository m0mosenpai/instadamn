package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CwC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29317CwC implements InterfaceC58152PqH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    public C29317CwC(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A05 = obj2;
        this.A02 = obj;
        this.A01 = obj5;
        this.A04 = obj3;
        this.A03 = obj4;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        String str;
        if (this.A00 != 0) {
            C14360o3.A0B(view, 0);
            C29137Ct4 c29137Ct4 = C29137Ct4.A00;
            UserSession userSession = (UserSession) this.A04;
            c29137Ct4.A01(userSession);
            C28458ChA c28458ChA = C28458ChA.A00;
            C38321qM c38321qM = (C38321qM) this.A02;
            ProductType A1z = c38321qM.A1z();
            String A2u = c38321qM.A2u();
            if (A2u != null) {
                C26124BhA c26124BhA = (C26124BhA) ((InterfaceC31087DlV) this.A03);
                List list = c26124BhA.A04;
                C09530e4 A1L = AbstractC166987dD.A1L("challenges_toast", "true");
                String str2 = c26124BhA.A01;
                c28458ChA.A05(userSession, A1z, null, "post_publish_toast", null, A2u, null, null, list, null, null, null, AbstractC25233BEq.A0p(MSV.A00(91), str2, A1L));
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                if (!fragmentActivity.getSupportFragmentManager().A11()) {
                    AbstractC41776Ies.A03(AbstractC166987dD.A0O(fragmentActivity), str2);
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        C37734Gj9 c37734Gj9 = (C37734Gj9) this.A05;
        Context context = (Context) this.A02;
        if (AbstractC166987dD.A0H(this.A01) != 0) {
            str = AbstractC111324zv.A00(3054);
        } else {
            str = "see_more";
        }
        if (this.A04 != MediaControlEventSourceEnum.A08) {
            C41451vu c41451vu = C41451vu.A01;
            C146106i8 c146106i8 = new C146106i8();
            c146106i8.A01 = AbstractC31372Dqc.A00();
            AbstractC25226BEj.A1N(context, c146106i8, 2131976067);
            c146106i8.A0R = true;
            AbstractC166997dE.A1O(c41451vu, c146106i8.A00());
            c37734Gj9.A00.CmG(str);
        }
        CSJ csj = (CSJ) this.A03;
        if (csj == null) {
            return;
        }
        C37675GiC c37675GiC = csj.A02;
        C120985dq c120985dq = csj.A01;
        c37675GiC.D5B(c120985dq, AbstractC40627Hzl.A00(csj.A03), false);
        Integer num = c37675GiC.A03;
        if (num == null) {
            return;
        }
        int intValue = num.intValue();
        c37675GiC.A0O.A0A.A0c(c120985dq, intValue);
        c37675GiC.A0e.A0F(intValue, true);
        c37675GiC.A0d.A0H();
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        if (this.A00 != 0) {
            C28458ChA c28458ChA = C28458ChA.A00;
            UserSession userSession = (UserSession) this.A04;
            C38321qM c38321qM = (C38321qM) this.A02;
            ProductType A1z = c38321qM.A1z();
            String A2u = c38321qM.A2u();
            if (A2u != null) {
                C26124BhA c26124BhA = (C26124BhA) ((InterfaceC31087DlV) this.A03);
                List list = c26124BhA.A04;
                C09530e4 A1L = AbstractC166987dD.A1L("challenges_toast", "true");
                c28458ChA.A04(userSession, A1z, null, "post_publish_toast", null, A2u, null, null, list, null, null, null, AbstractC25233BEq.A0p(MSV.A00(91), c26124BhA.A01, A1L));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    long A0N = AbstractC166987dD.A0N(it.next());
                    String A2u2 = c38321qM.A2u();
                    if (A2u2 != null) {
                        C12210kP c12210kP = new C12210kP(userSession);
                        c12210kP.A01 = "ig_achievements";
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c12210kP.A00(), "ig_achievements_post_publish_toast_impression");
                        Long A0j = AbstractC166997dE.A0j(A2u2);
                        if (A0f.isSampled() && A0j != null) {
                            A0f.A9K("media_igid", A0j);
                            A0f.A9K("challenge_id", Long.valueOf(A0N));
                            A0f.A7v("is_challenge_earned", null);
                            A0f.Cht();
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                String A2u3 = c38321qM.A2u();
                if (A2u3 != null) {
                    C1GJ.A03(new C27957CUb(userSession).A01(A2u3, null, list));
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        CSJ csj = (CSJ) this.A03;
        if (csj != null) {
            C37675GiC c37675GiC = csj.A02;
            C37540Gfw c37540Gfw = c37675GiC.A0M;
            C120985dq c120985dq = csj.A01;
            String A00 = AbstractC40627Hzl.A00(csj.A03);
            c37540Gfw.A0M(c120985dq, A00, true, false);
            C37675GiC.A0F(c120985dq, c37675GiC, A00, csj.A00, false);
        }
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }
}
