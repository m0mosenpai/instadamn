package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.instagram.maps.ui.IgStaticMapView;

/* loaded from: classes11.dex */
public final class U8I extends Drawable {
    public final /* synthetic */ IgStaticMapView A00;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public U8I(IgStaticMapView igStaticMapView) {
        this.A00 = igStaticMapView;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        IgStaticMapView igStaticMapView = this.A00;
        Drawable drawable = igStaticMapView.A04;
        if (drawable == null) {
            drawable = igStaticMapView.getInfoGlyph();
            igStaticMapView.A04 = drawable;
        }
        if (drawable != null) {
            drawable.setBounds(igStaticMapView.A0H);
            canvas.drawCircle(r1.centerX(), r1.centerY(), r1.width() >> 1, igStaticMapView.A0F);
            igStaticMapView.A04.setAlpha(76);
            igStaticMapView.A04.draw(canvas);
        }
    }
}
