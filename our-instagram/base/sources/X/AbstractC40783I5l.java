package X;

import android.graphics.Rect;
import android.view.View;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.I5l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40783I5l {
    public static final Rect A00(View view, IgImageView igImageView, int i, int i2) {
        double width = view.getWidth() / 2.8d;
        int bottom = (((igImageView.getBottom() - igImageView.getTop()) - igImageView.getDrawable().getIntrinsicHeight()) / 2) + igImageView.getTop() + i2;
        return new Rect((int) width, bottom, (int) (i + width), igImageView.getDrawable().getIntrinsicHeight() + bottom);
    }
}
