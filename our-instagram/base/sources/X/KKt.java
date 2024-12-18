package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* loaded from: classes8.dex */
public final class KKt extends AbstractC54808OKe {
    @Override // X.AbstractC54808OKe
    public final void A01(Context context, RoundedCornerImageView roundedCornerImageView) {
        roundedCornerImageView.setRadius(AbstractC167017dG.A04(context));
        roundedCornerImageView.setAlpha(204);
        Object obj = A00().get();
        obj.getClass();
        View view = (View) obj;
        view.setDrawingCacheEnabled(true);
        Bitmap drawingCache = view.getDrawingCache();
        drawingCache.getClass();
        C0fK.A03(drawingCache);
        roundedCornerImageView.setImageBitmap(Bitmap.createBitmap(drawingCache));
        view.setDrawingCacheEnabled(false);
        Drawable drawable = roundedCornerImageView.getDrawable();
        drawable.getClass();
        roundedCornerImageView.setLayoutParams(new FrameLayout.LayoutParams(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), 51));
    }
}
