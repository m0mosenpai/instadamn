package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes6.dex */
public final class G2W implements C7J6 {
    public final int A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final Capabilities A03;
    public final InterfaceC83733oI A04;
    public final boolean A05;

    public G2W(FragmentActivity fragmentActivity, UserSession userSession, Capabilities capabilities, InterfaceC83733oI interfaceC83733oI, int i, boolean z) {
        AbstractC25229BEm.A1I(userSession, 1, capabilities);
        this.A02 = userSession;
        this.A01 = fragmentActivity;
        this.A05 = z;
        this.A04 = interfaceC83733oI;
        this.A00 = i;
        this.A03 = capabilities;
    }

    @Override // X.C7J6
    public final void Coo(View view, View view2, View view3, View view4, View view5, View view6, View view7, View view8, View view9, View view10) {
    }

    @Override // X.C7J6
    public final void CvX() {
    }

    @Override // X.C7J6
    public final void Cw9() {
    }

    @Override // X.C7J6
    public final void CwA() {
    }

    @Override // X.C7J6
    public final void CwF() {
    }

    @Override // X.C7J7
    public final void Cys() {
    }

    @Override // X.C7J6
    public final void Czg() {
    }

    @Override // X.C7J6
    public final void D1n() {
    }

    @Override // X.C7J6
    public final void D5n(View view) {
    }

    @Override // X.C7J6
    public final void DUu(boolean z) {
    }

    @Override // X.C7J6
    public final void DYI() {
    }

    @Override // X.C7J6
    public final void Ddg(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
    }

    @Override // X.C7J6
    public final void DlQ() {
    }

    @Override // X.C7J6
    public final void DlR() {
    }

    @Override // X.C7J6
    public final void Dnq() {
    }

    @Override // X.C7J6
    public final void Dnw(boolean z) {
    }

    @Override // X.C7J6
    public final void DoE(boolean z) {
    }

    @Override // X.C7J6
    public final void DsJ() {
    }

    @Override // X.C7J6
    public final void DsS() {
    }

    @Override // X.C7J6
    public final void Dxt(MessagingUser messagingUser) {
    }

    public static final void A00(Bundle bundle, Fragment fragment, G2W g2w) {
        C189478aR c189478aR;
        C3DO c3do = C3DN.A00;
        FragmentActivity fragmentActivity = g2w.A01;
        C3DN A00 = c3do.A00(fragmentActivity);
        if (g2w.A05) {
            if (A00 != null) {
                c189478aR = F86.A00(A00);
            } else {
                c189478aR = null;
            }
            fragment.setArguments(bundle);
            if (c189478aR != null) {
                C189448aO A002 = AbstractC34055F1i.A00(g2w.A02);
                A002.A0u = true;
                c189478aR.A0F(fragment, A002);
                return;
            }
            return;
        }
        if (A00 != null) {
            A00.A0B();
        }
        AbstractC31175DnJ.A0s(bundle, fragment, AbstractC25225BEi.A0r(fragmentActivity, g2w.A02));
    }

    @Override // X.C7J6
    public final void Dso(String str) {
        A00(C28531Zo.A04.A01.A02(this.A03, this.A04, null, this.A00, false, true, false), new C32314ELd(), this);
    }
}
