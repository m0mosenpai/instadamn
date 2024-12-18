package X;

import android.graphics.Matrix;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.instagram.api.schemas.MediaCroppingCoordinatesIntf;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;

/* loaded from: classes8.dex */
public final class LR1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ MediaCroppingCoordinatesIntf A00;
    public final /* synthetic */ ImageUrl A01;
    public final /* synthetic */ IgProgressImageView A02;

    public LR1(MediaCroppingCoordinatesIntf mediaCroppingCoordinatesIntf, ImageUrl imageUrl, IgProgressImageView igProgressImageView) {
        this.A02 = igProgressImageView;
        this.A01 = imageUrl;
        this.A00 = mediaCroppingCoordinatesIntf;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        IgProgressImageView igProgressImageView = this.A02;
        if (igProgressImageView.getWidth() > 0) {
            igProgressImageView.setScaleType(ImageView.ScaleType.MATRIX);
            float A07 = AbstractC166987dD.A07(igProgressImageView);
            ImageUrl imageUrl = this.A01;
            float width = A07 / imageUrl.getWidth();
            float AtJ = this.A00.AtJ();
            Matrix matrix = igProgressImageView.getMatrix();
            matrix.setScale(width, width);
            matrix.postTranslate(0.0f, imageUrl.getHeight() * width * AtJ * (-1.0f));
            igProgressImageView.getIgImageView().setImageMatrix(matrix);
            igProgressImageView.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
        return true;
    }
}
