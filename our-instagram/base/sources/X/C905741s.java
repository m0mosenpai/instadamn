package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.41s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C905741s implements InterfaceC905841t {
    public final View A00;
    public final ReboundViewPager A01;
    public final SimpleZoomableViewContainer A02;
    public final C100944gA A03;
    public final C100954gB A04;
    public final C100934g9 A05;
    public final C100964gC A06;
    public final C905641r A07;
    public final C905541q A08;
    public final C41R A09;
    public final C100974gD A0A;
    public final C905441p A0B;
    public final C3YC A0C;
    public final C86043sb A0D;
    public final C86073se A0E;
    public final IgProgressImageView A0F;
    public final C3YD A0G;
    public final C3YD A0H;
    public final C3YJ A0I;
    public final MediaFrameLayout A0J;
    public final InterfaceC56392iX A0K;

    @Override // X.InterfaceC905841t
    public final void D7U(UserSession userSession, C38321qM c38321qM, float f, float f2, int i) {
        ReboundViewPager reboundViewPager;
        C14360o3.A0B(c38321qM, 1);
        C3YD c3yd = this.A0I.A01;
        if (c3yd != null) {
            c3yd.A0E(i, f);
        }
        if (C903540u.A00.A01(userSession, c38321qM) && (reboundViewPager = this.A01) != null) {
            W3z.A00.A00(reboundViewPager, this.A0K.getView(), f2);
        }
    }

    public C905741s(View view, ReboundViewPager reboundViewPager, InterfaceC56392iX interfaceC56392iX, SimpleZoomableViewContainer simpleZoomableViewContainer, C100944gA c100944gA, C100954gB c100954gB, C100934g9 c100934g9, C100964gC c100964gC, C905641r c905641r, C905541q c905541q, C41R c41r, C100974gD c100974gD, C905441p c905441p, C3YC c3yc, C86043sb c86043sb, C86073se c86073se, IgProgressImageView igProgressImageView, C3YG c3yg, C3YD c3yd, C3YD c3yd2, C3YD c3yd3, C3YD c3yd4, C3YD c3yd5, C3YH c3yh, C3YI c3yi, MediaFrameLayout mediaFrameLayout) {
        C14360o3.A0B(simpleZoomableViewContainer, 1);
        C14360o3.A0B(mediaFrameLayout, 2);
        C14360o3.A0B(igProgressImageView, 3);
        C14360o3.A0B(view, 4);
        C14360o3.A0B(c86073se, 11);
        this.A02 = simpleZoomableViewContainer;
        this.A0J = mediaFrameLayout;
        this.A00 = view;
        this.A0C = c3yc;
        this.A0E = c86073se;
        this.A05 = c100934g9;
        this.A03 = c100944gA;
        this.A08 = c905541q;
        this.A04 = c100954gB;
        this.A07 = c905641r;
        this.A0G = c3yd4;
        this.A0H = c3yd5;
        this.A0D = c86043sb;
        this.A06 = c100964gC;
        this.A0A = c100974gD;
        this.A09 = c41r;
        this.A01 = reboundViewPager;
        this.A0K = interfaceC56392iX;
        this.A0I = new C3YJ(c3yg, c3yd, c3yd2, c3yd3, c3yh, c3yi);
        this.A0B = c905441p;
        this.A0F = igProgressImageView;
        mediaFrameLayout.setTag(R.id.feed_cta_extra_tappable_target, "carousel_image_view");
    }
}
