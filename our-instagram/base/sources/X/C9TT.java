package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.9TT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9TT extends ViewGroup {
    public int A00;
    public int A01;
    public int A02;
    public Bitmap A03;
    public final int A04;
    public final Paint A05;
    public final View A06;

    public C9TT(Context context, View view) {
        super(context);
        this.A06 = view;
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A05 = A0S;
        addView(view);
        AbstractC166997dE.A1D(A0S, PorterDuff.Mode.CLEAR);
        this.A04 = AbstractC47994LKy.A01(context, R.attr.sc_surface_background);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        Bitmap bitmap = this.A03;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f = i3 - i;
        float f2 = i4 - i2;
        int i5 = this.A02;
        float f3 = i5;
        if (i5 == 0) {
            f3 = f;
        }
        int i6 = this.A01;
        float f4 = i6;
        if (i6 == 0) {
            f4 = f2;
        }
        int i7 = this.A00;
        if (i7 == 90 || i7 == 270) {
            float f5 = f4;
            f4 = f3;
            f3 = f5;
        }
        float f6 = f / f3;
        float f7 = f2 / f4;
        float f8 = f / 2.0f;
        float f9 = (f3 * f6) / 2.0f;
        float f10 = f2 / 2.0f;
        float f11 = (f4 * f7) / 2.0f;
        this.A06.layout((int) (f8 - f9), (int) (f10 - f11), (int) (f8 + f9), (int) (f10 + f11));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(1764765391);
        if (i > 0 && i2 > 0 && (i != i3 || i2 != i4)) {
            Bitmap A0F = AbstractC167007dF.A0F(i, i2);
            Canvas canvas = new Canvas(A0F);
            A0F.eraseColor(0);
            canvas.drawColor(this.A04);
            canvas.drawCircle(i * 0.5f, i2 * 0.5f, Math.min(i, i2) * 0.5f, this.A05);
            this.A03 = A0F;
        }
        super.onSizeChanged(i, i2, i3, i4);
        C0f9.A0D(-1106023430, A06);
    }
}
