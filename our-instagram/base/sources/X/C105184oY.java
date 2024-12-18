package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.MediaActionsView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.4oY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105184oY implements C3Y7, C33R, InterfaceC905841t {
    public C3W4 A00;
    public C75113Zb A01;
    public final View A02;
    public final C86013sY A03;
    public final ReboundViewPager A04;
    public final SimpleZoomableViewContainer A05;
    public final C905641r A06;
    public final C905541q A07;
    public final C41R A08;
    public final C905441p A09;
    public final C3YC A0A;
    public final C86043sb A0B;
    public final C3Y8 A0C;
    public final C86073se A0D;
    public final IgProgressImageView A0E;
    public final C3YD A0F;
    public final C3YD A0G;
    public final C3YJ A0H;
    public final MediaActionsView A0I;
    public final MediaFrameLayout A0J;
    public final InterfaceC80343iO A0K;
    public final InterfaceC56392iX A0L;
    public final C86083sf A0M;

    public C105184oY(View view, C86013sY c86013sY, ReboundViewPager reboundViewPager, InterfaceC56392iX interfaceC56392iX, SimpleZoomableViewContainer simpleZoomableViewContainer, C905641r c905641r, C905541q c905541q, C41R c41r, C905441p c905441p, C3YC c3yc, C86043sb c86043sb, C86083sf c86083sf, C3Y8 c3y8, C86073se c86073se, IgProgressImageView igProgressImageView, C3YD c3yd, C3YD c3yd2, C3YD c3yd3, C3YD c3yd4, C3YD c3yd5, C3YI c3yi, MediaActionsView mediaActionsView, MediaFrameLayout mediaFrameLayout) {
        C14360o3.A0B(simpleZoomableViewContainer, 1);
        C14360o3.A0B(mediaFrameLayout, 2);
        C14360o3.A0B(igProgressImageView, 3);
        C14360o3.A0B(view, 4);
        C14360o3.A0B(mediaActionsView, 5);
        C14360o3.A0B(c86073se, 8);
        this.A05 = simpleZoomableViewContainer;
        this.A0J = mediaFrameLayout;
        this.A0E = igProgressImageView;
        this.A02 = view;
        this.A0I = mediaActionsView;
        this.A03 = c86013sY;
        this.A0A = c3yc;
        this.A0D = c86073se;
        this.A0C = c3y8;
        this.A09 = c905441p;
        this.A0M = c86083sf;
        this.A06 = c905641r;
        this.A07 = c905541q;
        this.A0F = c3yd4;
        this.A0G = c3yd5;
        this.A0B = c86043sb;
        this.A08 = c41r;
        this.A04 = reboundViewPager;
        this.A0L = interfaceC56392iX;
        this.A0K = new C86183sp(c86013sY);
        this.A0H = new C3YJ(null, c3yd, c3yd2, c3yd3, null, c3yi);
        mediaActionsView.A0F = new InterfaceC105204oa() { // from class: X.4oZ
        };
        mediaFrameLayout.setTag(R.id.feed_cta_extra_tappable_target, "carousel_video_view");
    }

    @Override // X.C3Y7
    public final C86033sa BS3() {
        return null;
    }

    @Override // X.InterfaceC905841t
    public final void D7U(UserSession userSession, C38321qM c38321qM, float f, float f2, int i) {
        ReboundViewPager reboundViewPager;
        C14360o3.A0B(c38321qM, 1);
        C3YD c3yd = this.A0H.A01;
        if (c3yd != null) {
            c3yd.A0E(i, f);
        }
        if (C903540u.A00.A01(userSession, c38321qM) && (reboundViewPager = this.A04) != null) {
            W3z.A00.A00(reboundViewPager, this.A0L.getView(), f2);
        }
    }

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c75113Zb, 0);
        int i2 = 4;
        if (i == 4) {
            MediaActionsView mediaActionsView = this.A0I;
            if (!c75113Zb.A36) {
                i2 = 0;
            }
            mediaActionsView.setVisibility(i2);
        }
    }

    @Override // X.C3Y7
    public final void EgX(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, boolean z) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        this.A0E.A09(interfaceC11380iw, imageUrl, z);
    }

    @Override // X.C3Y7
    public final C3W4 Adr() {
        return this.A00;
    }

    @Override // X.C3Y7
    public final C86083sf B61() {
        if (this.A00 != null) {
            return this.A0M;
        }
        return null;
    }

    @Override // X.C3Y7
    public final InterfaceC74323Vo B62() {
        return this.A0I;
    }

    @Override // X.C3Y7
    public final View BGa() {
        return this.A0E;
    }

    @Override // X.C3Y7
    public final View BQt() {
        return this.A0J;
    }

    @Override // X.C3Y7
    public final C75113Zb BRY() {
        return this.A01;
    }

    @Override // X.C3Y7
    public final InterfaceC80343iO BRd() {
        return this.A0K;
    }

    @Override // X.C3Y7
    public final InterfaceC74623Ww C6y() {
        return this.A0J;
    }

    @Override // X.C3Y7
    public final /* synthetic */ int C6z() {
        return -1;
    }

    @Override // X.C3Y7
    public final int CFi() {
        return this.A0I.getWidth();
    }

    @Override // X.C3Y7
    public final void EFy(int i) {
        this.A0E.A06(i);
    }
}
