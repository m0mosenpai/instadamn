package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.textureview.ScalingTextureView;

/* renamed from: X.6QC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6QC extends FrameLayout {
    public final IgProgressImageView A00;
    public final MediaFrameLayout A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6QC(Context context) {
        super(context, null, 0);
        C14360o3.A0B(context, 1);
        LayoutInflater.from(context).inflate(R.layout.showreel_video_view, (ViewGroup) this, true);
        View requireViewById = requireViewById(R.id.showreel_video_media_frame_layout);
        C14360o3.A07(requireViewById);
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) requireViewById;
        this.A01 = mediaFrameLayout;
        View requireViewById2 = mediaFrameLayout.requireViewById(R.id.showreel_ig_progress_image_view);
        C14360o3.A07(requireViewById2);
        this.A00 = (IgProgressImageView) requireViewById2;
    }

    public final IgProgressImageView getIgProgressImageView() {
        return this.A00;
    }

    public final MediaFrameLayout getMediaFrameLayout() {
        return this.A01;
    }

    public final ScalingTextureView getScalingTextureView() {
        View requireViewById = this.A01.requireViewById(R.id.showreel_video_scaling_texture_view);
        C14360o3.A07(requireViewById);
        return (ScalingTextureView) requireViewById;
    }

    public final SimpleVideoLayout getSimpleVideoLayout() {
        View requireViewById = this.A01.requireViewById(R.id.showreel_video_simple_video_view);
        C14360o3.A07(requireViewById);
        return (SimpleVideoLayout) requireViewById;
    }
}
