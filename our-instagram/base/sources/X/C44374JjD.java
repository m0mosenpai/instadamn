package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JjD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44374JjD extends Drawable implements C1NJ {
    public int A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final GradientDrawable A07;
    public final Interpolator A08;
    public final Interpolator A09;
    public final List A0A;
    public final List A0B;
    public final InterfaceC16820sZ A0C;

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C14360o3.A0B(c73033Pe, 1);
        Bitmap bitmap = c73033Pe.A01;
        if (bitmap != null) {
            int i = this.A04;
            Bitmap A09 = C1NC.A09(bitmap, i, i, 0, false);
            C14360o3.A07(A09);
            int i2 = this.A03;
            int i3 = i2 + this.A02;
            int i4 = ((i - i2) / 2) - this.A05;
            C0fK.A03(A09);
            Bitmap createBitmap = Bitmap.createBitmap(A09, (i - i3) / 2, i4, i3, i3);
            C14360o3.A07(createBitmap);
            Bitmap A07 = C1NC.A07(createBitmap, i3, i3);
            if (A07 != null) {
                createBitmap.recycle();
                this.A0B.add(new ScaleDrawable(AbstractC43593JPy.A0A(this.A06, A07), 17, 1.0f, 1.0f));
                int i5 = this.A00 + 1;
                this.A00 = i5;
                if (i5 == this.A0A.size()) {
                    this.A01 = true;
                    invalidateSelf();
                    InterfaceC16820sZ interfaceC16820sZ = this.A0C;
                    if (interfaceC16820sZ != null) {
                        interfaceC16820sZ.invoke();
                        return;
                    }
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
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
            GradientDrawable gradientDrawable = this.A07;
            int i = this.A02 / 2;
            int i2 = i + this.A03;
            gradientDrawable.setBounds(i, i, i2, i2);
            gradientDrawable.draw(canvas);
            long currentTimeMillis = System.currentTimeMillis() / 1500;
            List list = this.A0B;
            int size = (int) (currentTimeMillis % list.size());
            Drawable drawable = (Drawable) list.get(size);
            if (size == 0) {
                size = list.size();
            }
            Drawable drawable2 = (Drawable) list.get(size - 1);
            drawable.setBounds(i, i, i2, i2);
            drawable2.setBounds(i, i, i2, i2);
            long currentTimeMillis2 = System.currentTimeMillis() % 1500;
            if (0 <= currentTimeMillis2 && currentTimeMillis2 < 280) {
                if (currentTimeMillis2 < 200) {
                    float f = 200.0f - 0.0f;
                    float f2 = 0.0f - 1.0f;
                    float A00 = (AbstractC43592JPx.A00((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)), (float) currentTimeMillis2, 0.0f, f) * f2) + 1.0f;
                    Interpolator interpolator = this.A08;
                    drawable2.setLevel((int) ((AbstractC43592JPx.A00((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)), interpolator.getInterpolation(A00), 1.0f, f2) * (0.0f - 10000.0f)) + 10000.0f));
                    drawable2.setAlpha((int) ((AbstractC43592JPx.A00((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)), interpolator.getInterpolation(A00), 1.0f, f2) * (0.0f - 255.0f)) + 255.0f));
                    drawable2.draw(canvas);
                } else {
                    drawable2.setAlpha(0);
                }
                float f3 = 280.0f - 0.0f;
                float f4 = 1.0f - 0.0f;
                float A002 = (AbstractC43592JPx.A00((f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1)), (float) currentTimeMillis2, 0.0f, f3) * f4) + 0.0f;
                Interpolator interpolator2 = this.A09;
                drawable.setLevel((int) ((AbstractC43592JPx.A00((f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1)), interpolator2.getInterpolation(A002), 0.0f, f4) * (10000.0f - 0.0f)) + 0.0f));
                drawable.setAlpha((int) ((AbstractC43592JPx.A00((f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1)), interpolator2.getInterpolation(A002), 0.0f, f4) * (255.0f - 0.0f)) + 0.0f));
            } else {
                drawable.setAlpha(255);
                drawable.setLevel(10000);
            }
            drawable.draw(canvas);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A03 + this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A03 + this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            ((Drawable) it.next()).setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            ((Drawable) it.next()).setColorFilter(colorFilter);
        }
    }

    public C44374JjD(Context context, List list, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3, int i4) {
        this.A06 = context;
        this.A03 = i;
        this.A02 = i2;
        this.A05 = i3;
        this.A04 = i4;
        this.A0A = list;
        this.A0C = interfaceC16820sZ;
        GradientDrawable A0D = AbstractC43594JPz.A0D();
        A0D.setCornerRadius(AbstractC166987dD.A02(i));
        this.A07 = A0D;
        this.A0B = AbstractC166987dD.A1E();
        this.A08 = new AccelerateInterpolator(1.0f);
        this.A09 = new DecelerateInterpolator(1.0f);
        this.A0B.clear();
        this.A00 = 0;
        C14120nc.A00().ATO(new C45709KLm(this, list));
    }
}
