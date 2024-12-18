package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HGW extends C1P1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ C3YU A03;
    public final /* synthetic */ C6WQ A04;
    public final /* synthetic */ EnumC114765Gh A05;

    public HGW(Context context, UserSession userSession, C38321qM c38321qM, C3YU c3yu, C6WQ c6wq, EnumC114765Gh enumC114765Gh) {
        this.A04 = c6wq;
        this.A05 = enumC114765Gh;
        this.A01 = userSession;
        this.A02 = c38321qM;
        this.A03 = c3yu;
        this.A00 = context;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        int A03 = C0f9.A03(-696033769);
        C3YU c3yu = this.A03;
        C3YU c3yu2 = C3YU.A04;
        int i = 2131976100;
        if (c3yu == c3yu2) {
            i = 2131963546;
        }
        Context context = this.A00;
        if (c3yu == c3yu2) {
            str = "hide_post_failed";
        } else {
            str = "unhide_post_failed";
        }
        C9GR.A0F(context, str, i);
        C0f9.A0A(459121736, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        Boolean bool;
        int A03 = C0f9.A03(1808432863);
        C6WQ c6wq = this.A04;
        Activity ownerActivity = c6wq.getOwnerActivity();
        if (ownerActivity != null) {
            bool = Boolean.valueOf(ownerActivity.isDestroyed());
        } else {
            bool = null;
        }
        if (AbstractC166997dE.A1Z(bool, false)) {
            c6wq.dismiss();
        }
        C0f9.A0A(1403478635, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1074129601);
        C0fJ.A00(this.A04);
        C0f9.A0A(-1071931733, A03);
    }

    @Override // X.C1P1
    public final void onSuccess(Object obj) {
        int i;
        int A03 = C0f9.A03(1617031405);
        EnumC114765Gh enumC114765Gh = this.A05;
        if (enumC114765Gh != null) {
            Integer num = C05F.A0C;
            UserSession userSession = this.A01;
            C19270xB A0D = AbstractC31171DnF.A0D("activity_center");
            String A2u = this.A02.A2u();
            if (A2u != null) {
                IT8.A00(A0D, userSession, enumC114765Gh, num, A2u);
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A0A(1244171694, A03);
                throw A0g;
            }
        }
        C38321qM c38321qM = this.A02;
        C3YU c3yu = this.A03;
        c38321qM.A0C.EhC(c3yu.A00);
        UserSession userSession2 = this.A01;
        c38321qM.AEH(userSession2);
        User A2E = c38321qM.A2E(userSession2);
        if (A2E == null) {
            i = -972878707;
        } else {
            if (c3yu == C3YU.A04) {
                A2E.A0W();
            } else if (c3yu == C3YU.A05) {
                A2E.A0X();
            }
            A2E.A0c(userSession2);
            i = 1885071377;
        }
        C0f9.A0A(i, A03);
    }
}
