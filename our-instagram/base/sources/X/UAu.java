package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes11.dex */
public final class UAu extends ViewOutlineProvider {
    public final Rect A00 = new Rect();
    public final /* synthetic */ ShapeableImageView A01;

    public UAu(ShapeableImageView shapeableImageView) {
        this.A01 = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.A01;
        C65Q c65q = shapeableImageView.A07;
        if (c65q != null) {
            if (shapeableImageView.A06 == null) {
                shapeableImageView.A06 = new C65O(c65q);
            }
            RectF rectF = shapeableImageView.A0E;
            Rect rect = this.A00;
            rectF.round(rect);
            shapeableImageView.A06.setBounds(rect);
            shapeableImageView.A06.getOutline(outline);
        }
    }
}
