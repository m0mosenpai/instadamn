package X;

import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Wlx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70987Wlx implements InterfaceC71930XAy {
    public final /* synthetic */ V1E A00;

    public C70987Wlx(V1E v1e) {
        this.A00 = v1e;
    }

    @Override // X.InterfaceC71930XAy
    public final void Ddf(GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        V1E v1e = this.A00;
        if (v1e.A05 == null) {
            v1e.A05 = new C31559Dtj(v1e.getActivity(), gradientSpinnerAvatarView, new Wm5(this, 4));
        }
        C38E c38e = new C38E(v1e, v1e.A01, new C38C(v1e));
        c38e.A05 = v1e.A05;
        c38e.A0C = v1e.A09;
        Reel reel = v1e.A06.A02;
        reel.getClass();
        c38e.A09(reel, C3G2.A0S, gradientSpinnerAvatarView);
    }
}
