package X;

import com.instagram.clips.animatedthumbnail.AnimatedThumbnailView;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.SpritesheetInfo;

/* renamed from: X.G0k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36315G0k implements InterfaceC43071ya {
    public final int A00;
    public final int A01;
    public final AnimatedThumbnailView A02;
    public final InterfaceC11380iw A03;
    public final IgImageView A04;
    public final C38321qM A05;
    public final C32260EIu A06;
    public final String A07;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        Integer num;
        C14360o3.A0B(c59062n7, 0);
        if (interfaceC57162jr != null) {
            num = interfaceC57162jr.CFq(c59062n7);
        } else {
            num = null;
        }
        SpritesheetInfo spritesheetInfo = (SpritesheetInfo) c59062n7.A03;
        if ((num == C05F.A00 || num == C05F.A01) && interfaceC57162jr.B0m(c59062n7) > 1000) {
            if (spritesheetInfo != null) {
                AnimatedThumbnailView animatedThumbnailView = this.A02;
                animatedThumbnailView.getLayoutParams().width = this.A01;
                animatedThumbnailView.getLayoutParams().height = this.A00;
                ((ConstrainedImageView) animatedThumbnailView).A00 = 0.5f;
                animatedThumbnailView.A0I(this.A03, spritesheetInfo, 1.5d, 0L, false);
                ViewOnClickListenerC35667Fp2.A00(animatedThumbnailView, 15, this);
                ((IgImageView) animatedThumbnailView).A0E = new C70823Whg(1, this, animatedThumbnailView);
                return;
            }
            this.A02.setVisibility(8);
            this.A04.setVisibility(0);
        }
    }

    public C36315G0k(AnimatedThumbnailView animatedThumbnailView, InterfaceC11380iw interfaceC11380iw, IgImageView igImageView, C38321qM c38321qM, C32260EIu c32260EIu, String str, int i, int i2) {
        this.A04 = igImageView;
        this.A02 = animatedThumbnailView;
        this.A01 = i;
        this.A00 = i2;
        this.A06 = c32260EIu;
        this.A03 = interfaceC11380iw;
        this.A05 = c38321qM;
        this.A07 = str;
    }
}
