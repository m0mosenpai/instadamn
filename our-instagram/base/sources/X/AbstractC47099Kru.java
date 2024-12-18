package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Kru, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47099Kru {
    public static final void A00(MediaFrameLayout mediaFrameLayout) {
        IgProgressImageView igProgressImageView = (IgProgressImageView) mediaFrameLayout.findViewById(R.id.media_card_image_view);
        if (igProgressImageView != null) {
            igProgressImageView.A06 = true;
            igProgressImageView.getIgImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
            Context context = mediaFrameLayout.getContext();
            igProgressImageView.setPlaceHolderColor(context.getColor(R.color.grey_9));
            Drawable drawable = context.getDrawable(R.drawable.video_determinate_progress);
            if (drawable != null) {
                igProgressImageView.setProgressBarDrawable(drawable);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
