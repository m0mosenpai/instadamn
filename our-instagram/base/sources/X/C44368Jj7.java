package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jj7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44368Jj7 extends Drawable implements Drawable.Callback, C1NJ {
    public int A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Context A04;
    public final Interpolator A05;
    public final Interpolator A06;
    public final List A07;
    public final List A08;
    public final double A09;
    public final int A0A;
    public final Drawable A0B;

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C14360o3.A0B(c73033Pe, 1);
        Bitmap bitmap = c73033Pe.A01;
        if (bitmap != null) {
            int i = this.A03;
            Bitmap A09 = C1NC.A09(bitmap, i, i, 0, false);
            C14360o3.A07(A09);
            this.A08.add(new ScaleDrawable(AbstractC43593JPy.A0A(this.A04, A09), 80, 1.0f, 1.0f));
            int i2 = this.A00 + 1;
            this.A00 = i2;
            if (i2 == this.A07.size()) {
                this.A01 = true;
                invalidateSelf();
            }
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
        if (this.A01) {
            long currentTimeMillis = System.currentTimeMillis() / 1500;
            List list = this.A08;
            int size = (int) (currentTimeMillis % list.size());
            Drawable drawable = (Drawable) list.get(size);
            if (size == 0) {
                size = list.size();
            }
            Drawable drawable2 = (Drawable) list.get(size - 1);
            int i = this.A02;
            int i2 = this.A03;
            int i3 = i2 + i;
            drawable.setBounds(i, 0, i3, i2);
            drawable2.setBounds(i, 0, i3, i2);
            long currentTimeMillis2 = System.currentTimeMillis() % 1500;
            if (0 <= currentTimeMillis2 && currentTimeMillis2 < 280) {
                if (currentTimeMillis2 < 200) {
                    float f = 200.0f - 0.0f;
                    float f2 = 0.0f - 1.0f;
                    float A00 = (AbstractC43592JPx.A00((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)), (float) currentTimeMillis2, 0.0f, f) * f2) + 1.0f;
                    Interpolator interpolator = this.A05;
                    drawable2.setLevel((int) ((AbstractC43592JPx.A00((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)), interpolator.getInterpolation(A00), 1.0f, f2) * (0.0f - 10000.0f)) + 10000.0f));
                    drawable2.setAlpha((int) ((AbstractC43592JPx.A00((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)), interpolator.getInterpolation(A00), 1.0f, f2) * (0.0f - 255.0f)) + 255.0f));
                    drawable2.draw(canvas);
                } else {
                    drawable2.setAlpha(0);
                }
                float f3 = 280.0f - 0.0f;
                float f4 = 1.0f - 0.0f;
                float A002 = (AbstractC43592JPx.A00((f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1)), (float) currentTimeMillis2, 0.0f, f3) * f4) + 0.0f;
                Interpolator interpolator2 = this.A06;
                drawable.setLevel((int) ((AbstractC43592JPx.A00((f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1)), interpolator2.getInterpolation(A002), 0.0f, f4) * (10000.0f - 0.0f)) + 0.0f));
                drawable.setAlpha((int) ((AbstractC43592JPx.A00((f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1)), interpolator2.getInterpolation(A002), 0.0f, f4) * (255.0f - 0.0f)) + 0.0f));
            } else {
                drawable.setAlpha(255);
                drawable.setLevel(10000);
            }
            drawable.draw(canvas);
            invalidateSelf();
            return;
        }
        double A03 = AbstractC167017dG.A03(this.A04);
        double d = this.A09;
        int i4 = (int) (A03 * d);
        int dimensionPixelSize = (int) (r5.getResources().getDimensionPixelSize(R.dimen.achievements_only_you_bottom_margin) * d);
        Drawable drawable3 = this.A0B;
        int i5 = this.A0A;
        drawable3.setBounds(i4, dimensionPixelSize, i4 + i5, i5 + dimensionPixelSize);
        drawable3.draw(canvas);
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
        return this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A03 + (this.A02 * 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0B.setAlpha(i);
        Iterator it = this.A08.iterator();
        while (it.hasNext()) {
            ((Drawable) it.next()).setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0B.setColorFilter(colorFilter);
        Iterator it = this.A08.iterator();
        while (it.hasNext()) {
            ((Drawable) it.next()).setColorFilter(colorFilter);
        }
    }

    public C44368Jj7(Context context, UserSession userSession, List list, int i) {
        this.A04 = context;
        this.A07 = list;
        double A00 = AbstractC172687md.A00(userSession);
        this.A09 = A00;
        this.A03 = (int) (context.getResources().getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height) * A00);
        this.A02 = (int) (AbstractC167017dG.A05(context) * A00);
        this.A0A = (int) (AbstractC167017dG.A08(context) * A00);
        int A0H = AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_orange);
        Paint paint = C3LQ.A00;
        this.A0B = C3LQ.A05(context, i, context.getColor(A0H));
        this.A08 = AbstractC166987dD.A1E();
        this.A05 = new AccelerateInterpolator(1.0f);
        this.A06 = new DecelerateInterpolator(1.0f);
        this.A08.clear();
        this.A00 = 0;
        C14120nc.A00().ATO(new C45710KLn(this, list));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
