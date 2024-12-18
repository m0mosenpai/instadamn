package X;

import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Wly, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70988Wly implements InterfaceC71930XAy {
    public final /* synthetic */ V1D A00;

    public C70988Wly(V1D v1d) {
        this.A00 = v1d;
    }

    @Override // X.InterfaceC71930XAy
    public final void Ddf(GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        V1D v1d = this.A00;
        if (v1d.A02 == null) {
            v1d.A02 = new C31559Dtj(v1d.getActivity(), gradientSpinnerAvatarView, new Wm5(this, 5));
        }
        C38E c38e = new C38E(v1d, v1d.A00, new C38C(v1d));
        c38e.A05 = v1d.A02;
        c38e.A0C = v1d.A05;
        Reel reel = v1d.A04.A01;
        reel.getClass();
        c38e.A09(reel, C3G2.A0T, gradientSpinnerAvatarView);
    }
}
