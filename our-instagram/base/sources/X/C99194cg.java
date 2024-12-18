package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.4cg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99194cg {
    public final C3Y1 A00;
    public final IgProgressImageView A01;
    public final C3YD A02;
    public final MediaFrameLayout A03;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.2jc, java.lang.Object] */
    public C99194cg(Context context, UserSession userSession, SimpleZoomableViewContainer simpleZoomableViewContainer) {
        C14360o3.A0B(userSession, 3);
        View requireViewById = simpleZoomableViewContainer.requireViewById(R.id.row_feed_photo_imageview);
        C14360o3.A07(requireViewById);
        this.A01 = (IgProgressImageView) requireViewById;
        View requireViewById2 = simpleZoomableViewContainer.requireViewById(R.id.media_group);
        C14360o3.A07(requireViewById2);
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) requireViewById2;
        this.A03 = mediaFrameLayout;
        View requireViewById3 = simpleZoomableViewContainer.requireViewById(R.id.row_feed_media_tag_indicator);
        C14360o3.A07(requireViewById3);
        Context context2 = requireViewById3.getContext();
        C14360o3.A07(context2);
        ?? obj = new Object();
        obj.A00 = requireViewById3;
        this.A02 = new C3YD(context2, null, userSession, obj);
        Activity A00 = C51362Xj.A00(context);
        if (A00 != null) {
            this.A00 = new C3Y1(A00, context, mediaFrameLayout, userSession);
            return;
        }
        throw new IllegalStateException(AbstractC111324zv.A00(337));
    }
}
