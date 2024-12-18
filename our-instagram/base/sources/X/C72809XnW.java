package X;

import android.app.Activity;
import android.content.Context;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.XnW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72809XnW {
    public final C3Y8 A00;
    public final C86033sa A01;
    public final C3Y1 A02;
    public final IgProgressImageView A03;
    public final C86003sX A04;
    public final C3YD A05;
    public final MediaFrameLayout A06;

    public C72809XnW(Context context, UserSession userSession, SimpleZoomableViewContainer simpleZoomableViewContainer) {
        C14360o3.A0B(userSession, 2);
        this.A03 = (IgProgressImageView) AbstractC166997dE.A0R(simpleZoomableViewContainer, R.id.row_feed_photo_imageview);
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) AbstractC166997dE.A0R(simpleZoomableViewContainer, R.id.media_group);
        this.A06 = mediaFrameLayout;
        this.A00 = new C3Y8((ViewStub) simpleZoomableViewContainer.requireViewById(R.id.zero_rating_video_play_button_stub));
        ViewStub viewStub = (ViewStub) AbstractC166997dE.A0R(simpleZoomableViewContainer, R.id.media_video_scrubber_view_stub);
        C14360o3.A0B(viewStub, 0);
        this.A01 = new C86033sa(viewStub);
        this.A05 = new C3YD(simpleZoomableViewContainer, userSession, R.id.row_feed_media_tag_indicator_stub);
        ViewStub viewStub2 = (ViewStub) AbstractC166997dE.A0R(simpleZoomableViewContainer, R.id.row_feed_interactive_sticker_stub);
        C14360o3.A0B(viewStub2, 0);
        this.A04 = new C86003sX(viewStub2);
        Activity A00 = C51362Xj.A00(context);
        if (A00 != null) {
            this.A02 = new C3Y1(A00, context, mediaFrameLayout, userSession);
            return;
        }
        throw AbstractC166987dD.A14(AbstractC111324zv.A00(337));
    }
}
