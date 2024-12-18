package X;

import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.MlZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51312MlZ extends C3OO {
    public C9KJ A00;
    public final IgSimpleImageView A01;
    public final ConstrainedTextureView A02;
    public final MediaFrameLayout A03;

    public C51312MlZ(MediaFrameLayout mediaFrameLayout) {
        super(mediaFrameLayout);
        this.A03 = mediaFrameLayout;
        this.A00 = null;
        this.A02 = (ConstrainedTextureView) AbstractC166997dE.A0R(mediaFrameLayout, R.id.video_texture_view);
        this.A01 = AbstractC31176DnK.A0T(mediaFrameLayout, R.id.photo_media_preview_image_view);
    }
}
