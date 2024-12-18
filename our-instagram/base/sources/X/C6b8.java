package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.mediaactions.LikeActionView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.6b8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6b8 {
    public final ViewStub A00;
    public final UserSession A01;
    public final InterfaceC56392iX A02;
    public final LikeActionView A03;
    public final IgBouncyUfiButtonImageView A04;
    public final C131325wL A05;
    public final InterfaceC09390do A06 = AbstractC09440dt.A01(new C9E7(this, 35));
    public final InterfaceC09390do A07 = AbstractC09440dt.A01(new C9E7(this, 36));
    public final InterfaceC09390do A08 = AbstractC09440dt.A01(new C9E7(this, 37));
    public final boolean A09;

    public final void A00() {
        IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = this.A04;
        AnonymousClass693 A00 = C68U.A00(igBouncyUfiButtonImageView.getContext(), R.raw.instagram_onboarding_nudges_draw_outline_and_pulse_40x40);
        InterfaceC56392iX interfaceC56392iX = this.A02;
        if (interfaceC56392iX != null) {
            ImageView imageView = (ImageView) interfaceC56392iX.getView();
            if (imageView != null) {
                imageView.setImageDrawable(A00);
            }
            View view = interfaceC56392iX.getView();
            if (view != null) {
                C0fQ.A00(new AR9(this), view);
            }
            View view2 = interfaceC56392iX.getView();
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        igBouncyUfiButtonImageView.setVisibility(8);
        if (A00 != null) {
            A00.E4S();
        }
    }

    public C6b8(ViewStub viewStub, UserSession userSession, InterfaceC56392iX interfaceC56392iX, LikeActionView likeActionView, IgBouncyUfiButtonImageView igBouncyUfiButtonImageView, boolean z) {
        this.A04 = igBouncyUfiButtonImageView;
        this.A03 = likeActionView;
        this.A00 = viewStub;
        this.A09 = z;
        this.A02 = interfaceC56392iX;
        this.A01 = userSession;
        C131325wL c131325wL = new C131325wL();
        this.A05 = c131325wL;
        c131325wL.A01(new WeakReference(igBouncyUfiButtonImageView));
    }
}
