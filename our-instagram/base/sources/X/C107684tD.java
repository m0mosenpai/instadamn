package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.MediaActionsView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.4tD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107684tD {
    public final C3W4 A00;
    public final C86183sp A01;
    public final C3Y8 A02;
    public final C86033sa A03;
    public final C3Y1 A04;
    public final IgProgressImageView A05;
    public final C86003sX A06;
    public final C3YD A07;
    public final MediaActionsView A08;
    public final MediaFrameLayout A09;

    public C107684tD(Context context, UserSession userSession, SimpleZoomableViewContainer simpleZoomableViewContainer) {
        C14360o3.A0B(userSession, 3);
        View requireViewById = simpleZoomableViewContainer.requireViewById(R.id.row_feed_photo_imageview);
        C14360o3.A07(requireViewById);
        this.A05 = (IgProgressImageView) requireViewById;
        View requireViewById2 = simpleZoomableViewContainer.requireViewById(R.id.media_group);
        C14360o3.A07(requireViewById2);
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) requireViewById2;
        this.A09 = mediaFrameLayout;
        View requireViewById3 = simpleZoomableViewContainer.requireViewById(R.id.row_feed_media_actions);
        C14360o3.A07(requireViewById3);
        this.A08 = (MediaActionsView) requireViewById3;
        View requireViewById4 = simpleZoomableViewContainer.requireViewById(R.id.audio_icon_button);
        C14360o3.A07(requireViewById4);
        this.A00 = new C3W4(requireViewById4);
        this.A01 = new C86183sp(new C86013sY((ViewStub) simpleZoomableViewContainer.requireViewById(R.id.media_subtitle_view_stub), false));
        this.A02 = new C3Y8((ViewStub) simpleZoomableViewContainer.requireViewById(R.id.zero_rating_video_play_button_stub));
        View requireViewById5 = simpleZoomableViewContainer.requireViewById(R.id.media_video_scrubber_view_stub);
        C14360o3.A07(requireViewById5);
        ViewStub viewStub = (ViewStub) requireViewById5;
        C14360o3.A0B(viewStub, 0);
        this.A03 = new C86033sa(viewStub);
        this.A07 = new C3YD(simpleZoomableViewContainer, userSession, R.id.row_feed_media_tag_indicator_stub);
        View requireViewById6 = simpleZoomableViewContainer.requireViewById(R.id.row_feed_interactive_sticker_stub);
        C14360o3.A07(requireViewById6);
        ViewStub viewStub2 = (ViewStub) requireViewById6;
        C14360o3.A0B(viewStub2, 0);
        this.A06 = new C86003sX(viewStub2);
        Activity A00 = C51362Xj.A00(context);
        if (A00 != null) {
            this.A04 = new C3Y1(A00, context, mediaFrameLayout, userSession);
            return;
        }
        throw new IllegalStateException(AbstractC111324zv.A00(337));
    }
}
