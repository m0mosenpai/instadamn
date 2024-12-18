package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.showreel.composition.ui.IgShowreelCompositionView;
import com.instagram.showreelnative.ui.common.ShowreelNativeMediaView;
import com.instagram.tagging.widget.MediaTagHintsLayout;
import com.instagram.tagging.widget.TagsLayout;
import com.instagram.ui.mediaactions.LikeActionView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.3kH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81473kH implements C3Y7 {
    public C75113Zb A00;
    public final View A01;
    public final SimpleZoomableViewContainer A02;
    public final C86043sb A03;
    public final IgProgressImageView A04;
    public final IgShowreelCompositionView A05;
    public final ShowreelNativeMediaView A06;
    public final C3YJ A07;
    public final LikeActionView A08;
    public final MediaFrameLayout A09;
    public final InterfaceC11380iw A0A;
    public final UserSession A0B;
    public final C3YG A0C;
    public final C3YD A0D;
    public final MediaTagHintsLayout A0E;
    public final TagsLayout A0F;
    public final InterfaceC74323Vo A0G;

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.3Vo] */
    public C81473kH(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, SimpleZoomableViewContainer simpleZoomableViewContainer, C86043sb c86043sb, IgProgressImageView igProgressImageView, IgShowreelCompositionView igShowreelCompositionView, ShowreelNativeMediaView showreelNativeMediaView, MediaTagHintsLayout mediaTagHintsLayout, TagsLayout tagsLayout, LikeActionView likeActionView, MediaFrameLayout mediaFrameLayout) {
        C14360o3.A0B(view, 2);
        C14360o3.A0B(mediaFrameLayout, 3);
        C14360o3.A0B(igProgressImageView, 4);
        C14360o3.A0B(showreelNativeMediaView, 5);
        C14360o3.A0B(igShowreelCompositionView, 6);
        C14360o3.A0B(likeActionView, 7);
        C14360o3.A0B(simpleZoomableViewContainer, 8);
        C14360o3.A0B(tagsLayout, 9);
        C14360o3.A0B(mediaTagHintsLayout, 10);
        this.A0B = userSession;
        this.A01 = view;
        this.A09 = mediaFrameLayout;
        this.A04 = igProgressImageView;
        this.A06 = showreelNativeMediaView;
        this.A05 = igShowreelCompositionView;
        this.A08 = likeActionView;
        this.A02 = simpleZoomableViewContainer;
        this.A0F = tagsLayout;
        this.A0E = mediaTagHintsLayout;
        this.A03 = c86043sb;
        this.A0A = interfaceC11380iw;
        mediaFrameLayout.setTag(R.id.feed_cta_extra_tappable_target, "showreel_view");
        this.A0G = new Object();
        C3YD c3yd = new C3YD(view, userSession, R.id.row_feed_media_tag_indicator_stub);
        this.A0D = c3yd;
        C3YG c3yg = new C3YG(userSession, mediaTagHintsLayout);
        this.A0C = c3yg;
        this.A07 = new C3YJ(c3yg, c3yd, null, null, new C3YH(tagsLayout), null);
    }

    @Override // X.C3Y7
    public final C3W4 Adr() {
        return null;
    }

    @Override // X.C3Y7
    public final C86083sf B61() {
        return null;
    }

    @Override // X.C3Y7
    public final InterfaceC80343iO BRd() {
        return null;
    }

    @Override // X.C3Y7
    public final C86033sa BS3() {
        return null;
    }

    @Override // X.C3Y7
    public final int C6z() {
        return 0;
    }

    @Override // X.C3Y7
    public final void EgX(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, boolean z) {
        IgProgressImageView igProgressImageView;
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        C6QC videoView = this.A05.getVideoView();
        if (videoView != null && (igProgressImageView = videoView.A00) != null) {
            igProgressImageView.A08(interfaceC11380iw, null, imageUrl, z);
        }
    }

    @Override // X.C3Y7
    public final InterfaceC74323Vo B62() {
        return this.A0G;
    }

    @Override // X.C3Y7
    public final /* bridge */ /* synthetic */ View BGa() {
        C6QC videoView = this.A05.getVideoView();
        if (videoView != null) {
            return videoView.A00;
        }
        return null;
    }

    @Override // X.C3Y7
    public final View BQt() {
        return this.A09;
    }

    @Override // X.C3Y7
    public final C75113Zb BRY() {
        return this.A00;
    }

    @Override // X.C3Y7
    public final InterfaceC74623Ww C6y() {
        C6QC videoView = this.A05.getVideoView();
        if (videoView != null) {
            return videoView.A01;
        }
        return null;
    }

    @Override // X.C3Y7
    public final int CFi() {
        C6QC videoView = this.A05.getVideoView();
        if (videoView != null) {
            return videoView.getWidth();
        }
        return 0;
    }

    @Override // X.C3Y7
    public final void EFy(int i) {
        IgProgressImageView igProgressImageView;
        C6QC videoView = this.A05.getVideoView();
        if (videoView != null && (igProgressImageView = videoView.A00) != null) {
            igProgressImageView.A06(i);
        }
    }
}
