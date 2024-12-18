package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P3L implements InterfaceC58152PqH {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public P3L(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM) {
        this.A02 = userSession;
        this.A03 = c38321qM;
        this.A00 = fragment;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        C70399WUb A00 = C70399WUb.A00(this.A02);
        VG4 vg4 = VG4.A1J;
        A00.A01 = "home_screen";
        A00.A0I(vg4, "reel_uploaded_toast");
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        C1Y6 A00 = AbstractC69888VxF.A00();
        UserSession userSession = this.A02;
        A00.A07(this.A00, null, null, this.A01, userSession, this.A03, "reel_uploaded_toast", null, false);
        C70399WUb A002 = C70399WUb.A00(userSession);
        VG4 vg4 = VG4.A1J;
        A002.A01 = "home_screen";
        A002.A0G(vg4, "reel_uploaded_toast");
    }
}
