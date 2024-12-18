package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CwD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29318CwD implements InterfaceC58152PqH {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ InterfaceC31085DlT A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C1ZE A04;
    public final /* synthetic */ C38321qM A05;

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        ProductType A1z;
        C1ZE c1ze;
        String A2u;
        C14360o3.A0B(view, 0);
        C29137Ct4 c29137Ct4 = C29137Ct4.A00;
        UserSession userSession = this.A03;
        c29137Ct4.A01(userSession);
        C28458ChA c28458ChA = C28458ChA.A00;
        C38321qM c38321qM = this.A05;
        ProductType A1z2 = c38321qM.A1z();
        String A2u2 = c38321qM.A2u();
        if (A2u2 != null) {
            List list = ((C26120Bh5) this.A02).A03;
            c28458ChA.A05(userSession, A1z2, null, "post_publish_toast", null, A2u2, list, null, null, null, null, null, AbstractC167007dF.A0n("duration", String.valueOf(this.A00)));
            FragmentActivity fragmentActivity = this.A01;
            if (!fragmentActivity.getSupportFragmentManager().A11() && (A1z = c38321qM.A1z()) != null) {
                int ordinal = A1z.ordinal();
                if (ordinal != 13) {
                    if (ordinal != 1 && ordinal != 16) {
                        if (ordinal == 9) {
                            if (!C18U.A06(C06090Tz.A05, userSession, 36322993690127187L)) {
                                C35227FgK c35227FgK = C35227FgK.A00;
                                String str = userSession.userId;
                                String A2u3 = c38321qM.A2u();
                                if (A2u3 != null) {
                                    c35227FgK.A04(fragmentActivity, userSession, str, A2u3, "achievement_earned_post_publish_toast", list);
                                    return;
                                }
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            return;
                        }
                    } else if (!C18U.A06(C06090Tz.A05, userSession, 36322993690127187L)) {
                        String A2u4 = c38321qM.A2u();
                        if (A2u4 != null) {
                            C35227FgK.A02(fragmentActivity, userSession, A2u4);
                            c1ze = this.A04;
                            A2u = c38321qM.A2u();
                            if (A2u == null) {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                            c1ze.A04(fragmentActivity, userSession, A2u, "achievement_earned_post_publish_toast", list);
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    this.A04.A05(fragmentActivity, userSession, "achievement_earned_post_publish_toast", list);
                    return;
                }
                if (!C18U.A06(C06090Tz.A05, userSession, 36322993690127187L)) {
                    C35227FgK c35227FgK2 = C35227FgK.A00;
                    String A2u5 = c38321qM.A2u();
                    if (A2u5 != null) {
                        c35227FgK2.A03(fragmentActivity, userSession, A2u5);
                        c1ze = this.A04;
                        A2u = c38321qM.A2u();
                        if (A2u == null) {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                        c1ze.A04(fragmentActivity, userSession, A2u, "achievement_earned_post_publish_toast", list);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                this.A04.A05(fragmentActivity, userSession, "achievement_earned_post_publish_toast", list);
                return;
            }
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C29318CwD(FragmentActivity fragmentActivity, InterfaceC31085DlT interfaceC31085DlT, UserSession userSession, C1ZE c1ze, C38321qM c38321qM, int i) {
        this.A03 = userSession;
        this.A05 = c38321qM;
        this.A02 = interfaceC31085DlT;
        this.A00 = i;
        this.A04 = c1ze;
        this.A01 = fragmentActivity;
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        C29137Ct4 c29137Ct4 = C29137Ct4.A00;
        UserSession userSession = this.A03;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c29137Ct4, userSession), "instagram_clips_toast_impression");
        if (A0f.isSampled()) {
            A0f.A8R(BQL.A0T, "action");
            AbstractC25225BEi.A1M(EnumC120795dP.A0r, A0f);
            AbstractC25225BEi.A1O(A0f, "creator_logging_util");
            A0f.AAP("media_compound_key", "");
            A0f.A9K("media_index", AbstractC167007dF.A0d());
            AbstractC25225BEi.A1P(A0f, "");
            A0f.Cht();
        }
        C28458ChA c28458ChA = C28458ChA.A00;
        C38321qM c38321qM = this.A05;
        ProductType A1z = c38321qM.A1z();
        String A2u = c38321qM.A2u();
        if (A2u != null) {
            List list = ((C26120Bh5) this.A02).A03;
            c28458ChA.A04(userSession, A1z, null, "post_publish_toast", null, A2u, list, null, null, null, null, null, AbstractC167007dF.A0n("duration", String.valueOf(this.A00)));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                String A2u2 = c38321qM.A2u();
                if (A2u2 != null) {
                    C14360o3.A0B(A1B, 2);
                    C12210kP c12210kP = new C12210kP(userSession);
                    c12210kP.A01 = "ig_achievements";
                    InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(c12210kP.A00(), "ig_achievements_post_publish_toast_impression");
                    Long A0k = AbstractC003100w.A0k(10, A2u2);
                    Long A0k2 = AbstractC003100w.A0k(10, A1B);
                    if (A0f2.isSampled() && A0k != null && A0k2 != null) {
                        A0f2.A9K("media_igid", A0k);
                        A0f2.A9K("achievement_id", A0k2);
                        A0f2.Cht();
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            String A2u3 = c38321qM.A2u();
            if (A2u3 != null) {
                C1GJ.A03(new C27957CUb(userSession).A01(A2u3, list, null));
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
