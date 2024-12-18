package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;

/* loaded from: classes9.dex */
public final class P3N implements InterfaceC58152PqH {
    public final /* synthetic */ VG4 A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ InstagramMainActivity A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public P3N(VG4 vg4, UserSession userSession, C38321qM c38321qM, InstagramMainActivity instagramMainActivity, String str, String str2) {
        this.A01 = userSession;
        this.A00 = vg4;
        this.A04 = str;
        this.A02 = c38321qM;
        this.A05 = str2;
        this.A03 = instagramMainActivity;
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        C70399WUb A00 = C70399WUb.A00(this.A01);
        VG4 vg4 = this.A00;
        String str = this.A04;
        A00.A01 = "home_screen";
        A00.A0I(vg4, str);
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        C1Y6 A00 = AbstractC69888VxF.A00();
        UserSession userSession = this.A01;
        C38321qM c38321qM = this.A02;
        String str = this.A05;
        InstagramMainActivity instagramMainActivity = this.A03;
        Fragment A01 = InstagramMainActivity.A01(instagramMainActivity);
        A01.getClass();
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.mainactivity.maintab.IgTabHostFragment");
        Fragment A0O = A01.getChildFragmentManager().A0O(R.id.layout_container_main);
        if (A0O != null) {
            A00.A07(A0O, null, null, instagramMainActivity.A0n(), userSession, c38321qM, str, null, false);
            C70399WUb A002 = C70399WUb.A00(userSession);
            VG4 vg4 = this.A00;
            String str2 = this.A04;
            A002.A01 = "home_screen";
            A002.A0G(vg4, str2);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
