package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.GpE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38085GpE extends AbstractC60592pi {
    public C130535uy A00;
    public boolean A01;
    public boolean A02;
    public final FragmentActivity A03;
    public final UserSession A04;
    public final String A05;
    public final Fragment A06;
    public final InterfaceC62852tO A07;
    public final IC1 A08;
    public final C62832tM A09;

    public final void A00(C116875Qr c116875Qr, C127935qM c127935qM, boolean z, boolean z2) {
        C130535uy c130535uy = c127935qM.A01;
        this.A00 = c130535uy;
        C38321qM BQN = c127935qM.BQN();
        if (BQN.A4Z()) {
            String A38 = BQN.A38();
            if (A38 != null) {
                C1GJ.A03(AbstractC2044893h.A05(this.A04, A38, "explore_1x2", null));
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C62832tM c62832tM = this.A09;
        String str = this.A05;
        InterfaceC62852tO interfaceC62852tO = this.A07;
        c62832tM.A05(interfaceC62852tO, str);
        UserSession userSession = this.A04;
        c62832tM.A03(c130535uy.A03, EnumC125615m7.A03, str, c130535uy.A03(userSession), true, false);
        if (z) {
            c62832tM.A04(interfaceC62852tO, str);
        }
        FragmentActivity fragmentActivity = this.A03;
        c116875Qr.A1G = str;
        ClipsViewerConfig A00 = c116875Qr.A00();
        if (z2) {
            AbstractC86593tX.A0Y(fragmentActivity, A00, userSession);
        } else {
            AbstractC86593tX.A0X(fragmentActivity, A00, userSession);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        this.A09.A07(this.A05);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        Bundle bundle;
        C130535uy c130535uy = this.A00;
        IC1 ic1 = this.A08;
        if (ic1 != null && c130535uy != null && this.A01) {
            this.A01 = false;
            C65823Tug c65823Tug = ic1.A00.A06;
            if (c65823Tug == null) {
                AbstractC37300Gc1.A0a();
                throw C00O.createAndThrow();
            }
            c65823Tug.A08(c130535uy.A0A);
        }
        this.A09.A05(this.A07, this.A05);
        if (!this.A02) {
            Fragment fragment = this.A06;
            if (fragment.isResumed() && (bundle = fragment.mArguments) != null && bundle.getBoolean("ClipsConstants.ARG_AUTO_LAUNCH_EXPLORE_CLIPS_VIEWER", false)) {
                C11T.A04(new J4R(bundle, this), 750L);
                this.A02 = true;
            }
        }
    }

    public C38085GpE(Fragment fragment, FragmentActivity fragmentActivity, UserSession userSession, IC1 ic1, String str) {
        AbstractC167027dH.A13(str, userSession, fragmentActivity);
        this.A05 = str;
        this.A04 = userSession;
        this.A03 = fragmentActivity;
        this.A06 = fragment;
        this.A08 = ic1;
        C62832tM A00 = AbstractC62822tL.A00(userSession);
        C14360o3.A07(A00);
        this.A09 = A00;
        this.A07 = new C37856GlA(this, 0);
    }
}
