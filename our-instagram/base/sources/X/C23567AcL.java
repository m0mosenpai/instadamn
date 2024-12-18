package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;

/* renamed from: X.AcL, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23567AcL implements XCH {
    public final Activity A00;
    public final Fragment A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final ClipsCelebrationReshareViewModel A04;
    public final C38321qM A05;

    @Override // X.XCH
    public final void CKJ() {
        UserSession userSession = this.A03;
        C77453dV.A02(this.A00, this.A01, C22P.A1S, userSession, this.A04, this.A05, null, true);
    }

    public C23567AcL(Activity activity, Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel, C38321qM c38321qM) {
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A01 = fragment;
        this.A00 = activity;
        this.A05 = c38321qM;
        this.A04 = clipsCelebrationReshareViewModel;
    }

    @Override // X.XCH
    public final void CJl() {
        C1ZF A00 = F1A.A00();
        Fragment fragment = this.A01;
        FragmentActivity requireActivity = fragment.requireActivity();
        UserSession userSession = this.A03;
        C38321qM c38321qM = this.A05;
        A00.A03(requireActivity, userSession, c38321qM);
        AbstractC138316On.A03(fragment, fragment.requireActivity(), this.A02, userSession, c38321qM);
    }
}
