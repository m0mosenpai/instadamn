package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class U8V extends Drawable {
    public long A00;
    public InterfaceC71851X7j A01;
    public final Context A02;
    public final List A06;
    public final List A07 = new ArrayList();
    public final Choreographer A04 = Choreographer.getInstance();
    public final List A05 = W6T.A02(255);
    public final Choreographer.FrameCallback A03 = new WKp(this, 3);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Iterator it = this.A07.iterator();
        while (it.hasNext()) {
            ((C69606Vs9) it.next()).A00(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public static final float A00(float f, float f2) {
        C50722Ut c50722Ut = AbstractC50712Us.A00;
        C14360o3.A0B(c50722Ut, 0);
        float nextGaussian = (((((float) new X26(c50722Ut).nextGaussian()) - (-2.8f)) / (2.8f - (-2.8f))) * (f2 - f)) + f;
        float min = Math.min(f, f2);
        float max = Math.max(f, f2);
        return Math.min(Math.max(min, max), Math.max(Math.min(min, max), nextGaussian));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            ((Paint) it.next()).setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("ConfettiDrawable doesn't support ColorFilters.");
    }

    public U8V(Context context) {
        this.A02 = context;
        this.A06 = W6T.A01(context);
    }
}
