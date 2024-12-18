package X;

import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.GEw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36676GEw implements InterfaceC71930XAy {
    public final /* synthetic */ EMO A00;

    public C36676GEw(EMO emo) {
        this.A00 = emo;
    }

    @Override // X.InterfaceC71930XAy
    public final void Ddf(GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        EMO emo = this.A00;
        if (emo.A03 == null) {
            emo.A03 = new C31559Dtj(emo.getActivity(), gradientSpinnerAvatarView, new GF3(this, 18));
        }
        C38E c38e = new C38E(emo, emo.A01, new C38C(emo));
        c38e.A05 = emo.A03;
        c38e.A0C = emo.A07;
        Reel reel = emo.A02;
        reel.getClass();
        c38e.A09(reel, C3G2.A0W, gradientSpinnerAvatarView);
    }
}
