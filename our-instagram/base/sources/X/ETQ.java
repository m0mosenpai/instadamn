package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ETQ extends C1P1 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    public ETQ(Object obj, Object obj2, Object obj3, int i, int i2, boolean z) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A05 = z;
        this.A03 = obj3;
        this.A04 = obj;
        this.A01 = i;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        String str;
        if (this.A00 != 0) {
            A03 = C0f9.A03(2112935907);
            boolean z = this.A05;
            C31338Dq3 c31338Dq3 = (C31338Dq3) this.A02;
            C5HW c5hw = (C5HW) this.A04;
            int i2 = this.A01;
            if (z) {
                str = "remove_from_profile_failed";
            } else {
                str = "show_on_profile_failed";
            }
            C31338Dq3.A04(c31338Dq3, c5hw, str, i2);
            i = -2139496223;
        } else {
            A03 = C0f9.A03(-450835575);
            super.onFail(abstractC115105If);
            ((C34710FQv) this.A04).A00 = !this.A05;
            C35210Fg2 c35210Fg2 = (C35210Fg2) this.A02;
            C35210Fg2.A02(c35210Fg2, this.A01);
            AbstractC34042F0v.A00((Context) c35210Fg2.A05.get(), abstractC115105If, "create_feed_favorites_status_request_failure");
            i = 1758941560;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.1vN] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        C38321qM c38321qM;
        boolean z;
        if (this.A00 != 0) {
            A03 = C0f9.A03(-1863950024);
            int A032 = C0f9.A03(238192666);
            boolean z2 = this.A05;
            C31338Dq3 c31338Dq3 = (C31338Dq3) this.A02;
            C5HW c5hw = (C5HW) this.A04;
            int i2 = this.A01;
            if (z2) {
                C31338Dq3.A04(c31338Dq3, c5hw, "remove_from_profile_success", i2);
                c38321qM = (C38321qM) this.A03;
                z = false;
            } else {
                C31338Dq3.A04(c31338Dq3, c5hw, "show_on_profile_success", i2);
                c38321qM = (C38321qM) this.A03;
                z = true;
            }
            c38321qM.A0C.Eak(Boolean.valueOf(z));
            C0f9.A0A(1802343781, A032);
            i = 816287579;
        } else {
            A03 = C0f9.A03(-957456286);
            int A033 = C0f9.A03(1725757848);
            super.onSuccess(obj);
            boolean z3 = this.A05;
            C35210Fg2 c35210Fg2 = (C35210Fg2) this.A02;
            C34720FRh c34720FRh = c35210Fg2.A02;
            User user = (User) this.A03;
            if (z3) {
                c34720FRh.A02(user);
            } else {
                c34720FRh.A03(user);
            }
            user.A0y(z3);
            C35210Fg2.A01(c35210Fg2);
            C35132FeZ c35132FeZ = C34932FaI.A01;
            UserSession userSession = c35210Fg2.A04;
            c35132FeZ.A02(userSession);
            if (C18U.A06(C06090Tz.A05, userSession, 36318286404655190L)) {
                AbstractC25651Mw.A00(userSession).E4s(new Object());
            }
            C0f9.A0A(721550663, A033);
            i = 1364155995;
        }
        C0f9.A0A(i, A03);
    }
}
