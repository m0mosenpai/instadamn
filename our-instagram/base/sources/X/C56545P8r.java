package X;

import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.P8r, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56545P8r implements InterfaceC58059Pok {
    public final /* synthetic */ N7L A00;

    @Override // X.InterfaceC58059Pok
    public final void DF7(String str) {
    }

    @Override // X.InterfaceC58059Pok
    public final void DXl(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        C14360o3.A0B(gradientSpinnerAvatarView, 1);
        N7L n7l = this.A00;
        C38E c38e = (C38E) n7l.A0F.getValue();
        c38e.A05 = (AbstractC140596Xn) n7l.A0B.getValue();
        c38e.A0C = "";
        c38e.A03 = (ReelViewerConfig) AbstractC166987dD.A17(n7l.A0E);
        InterfaceC09390do interfaceC09390do = n7l.A0A;
        c38e.A0A(reel, C3G2.A1Q, gradientSpinnerAvatarView, null, ((C51175MjJ) interfaceC09390do.getValue()).A02, ((C51175MjJ) interfaceC09390do.getValue()).A02);
    }

    public C56545P8r(N7L n7l) {
        this.A00 = n7l;
    }
}
