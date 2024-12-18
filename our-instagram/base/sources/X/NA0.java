package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class NA0 extends C1P1 {
    public final C38321qM A00;
    public final C52770NXa A01;
    public final /* synthetic */ InstagramMainActivity A02;

    public NA0(C38321qM c38321qM, InstagramMainActivity instagramMainActivity) {
        this.A02 = instagramMainActivity;
        this.A00 = c38321qM;
        C52770NXa c52770NXa = new C52770NXa();
        this.A01 = c52770NXa;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("isDeleting", true);
        c52770NXa.setArguments(A0b);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(2067066528);
        C9GR.A0F(this.A02, "delete_media_post_failed", 2131957680);
        C0f9.A0A(-960104064, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1963033277);
        this.A01.A08();
        C0f9.A0A(827693065, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1403345726);
        InstagramMainActivity instagramMainActivity = this.A02;
        Fragment A01 = InstagramMainActivity.A01(instagramMainActivity);
        if (A01 != null) {
            AbstractC10360h2 childFragmentManager = A01.getChildFragmentManager();
            C14360o3.A07(childFragmentManager);
            if (childFragmentManager.A0Q("ProgressDialog") == null) {
                C52770NXa c52770NXa = this.A01;
                if (!c52770NXa.isAdded()) {
                    c52770NXa.A0B(childFragmentManager, "ProgressDialog");
                }
            }
        }
        InstagramMainActivity.A0P(this.A00, instagramMainActivity, EnumC53333Nij.valueOf("USER_SELECTED_POST_FRICTION_DIALOG").ordinal());
        C0f9.A0A(753660360, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1515121205);
        int A032 = C0f9.A03(1976363912);
        C38321qM c38321qM = this.A00;
        c38321qM.A00 = 1;
        c38321qM.A4L(C05F.A0C);
        UserSession userSession = this.A02.A05;
        userSession.getClass();
        c38321qM.AEH(userSession);
        User A2E = c38321qM.A2E(userSession);
        A2E.getClass();
        A2E.A0c(userSession);
        C0f9.A0A(1999853456, A032);
        C0f9.A0A(-647738913, A03);
    }
}
