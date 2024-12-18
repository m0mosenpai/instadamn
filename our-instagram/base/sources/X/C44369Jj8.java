package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;

/* renamed from: X.Jj8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44369Jj8 extends Drawable implements Drawable.Callback, C1NJ {
    public static ScaleDrawable A02;
    public final int A00;
    public final Context A01;

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C14360o3.A0B(c73033Pe, 1);
        Bitmap bitmap = c73033Pe.A01;
        if (bitmap != null) {
            int i = this.A00;
            Bitmap A09 = C1NC.A09(bitmap, i, i, 0, false);
            C14360o3.A07(A09);
            A02 = new ScaleDrawable(AbstractC43593JPy.A0A(this.A01, A09), 80, 1.0f, 1.0f);
            invalidateSelf();
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        ScaleDrawable scaleDrawable = A02;
        if (scaleDrawable != null) {
            int i = this.A00;
            scaleDrawable.setBounds(0, 0, i, i);
            scaleDrawable.setAlpha(255);
            scaleDrawable.setLevel(10000);
            scaleDrawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        ScaleDrawable scaleDrawable = A02;
        if (scaleDrawable != null) {
            scaleDrawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        ScaleDrawable scaleDrawable = A02;
        if (scaleDrawable != null) {
            scaleDrawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        ScaleDrawable scaleDrawable = A02;
        if (scaleDrawable != null) {
            scaleDrawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public C44369Jj8(Context context, String str, int i) {
        this.A01 = context;
        this.A00 = AbstractC166997dE.A04(context, i);
        if (A02 == null) {
            C14120nc.A00().ATO(new C45713KLq(this, str));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
