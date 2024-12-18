package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.9Pb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209659Pb extends Drawable implements InterfaceC202708xo {
    public int A00;
    public int A01;
    public Bitmap A02;
    public Canvas A03;
    public String A04;
    public String A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final Paint A0L;
    public final PorterDuffXfermode A0M;
    public final PorterDuffXfermode A0N;
    public final RectF A0O;
    public final String A0P;
    public final String A0Q;
    public final boolean A0R;

    @Override // X.InterfaceC202708xo
    public final void EVu(String str) {
        C14360o3.A0B(str, 0);
        this.A05 = str;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        canvas.save();
        canvas.translate(this.A00, this.A01);
        Bitmap bitmap = this.A02;
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        Canvas canvas2 = this.A03;
        if (canvas2 != null) {
            float f = this.A0D;
            float f2 = this.A06;
            float f3 = this.A08;
            int i = this.A0H;
            int i2 = (int) ((((f - f2) - (f3 * 2.0f)) - (i * 4)) / 2.0f);
            int i3 = (this.A0C - this.A0F) / 2;
            String str = this.A04;
            if (str == null || (!this.A0R && str.charAt(0) != '1')) {
                str = null;
            }
            A00(canvas2, str, i2, i3, 0);
            if (!this.A0R) {
                Paint paint = this.A0L;
                paint.setTextAlign(Paint.Align.LEFT);
                paint.setTextSize(this.A09);
                canvas2.drawText(this.A0Q, i2 + this.A0A, (r9 / 2) + (this.A0J / 2), paint);
                paint.setTextAlign(Paint.Align.CENTER);
                paint.setTextSize(this.A0B);
            }
            float f4 = i;
            int i4 = (int) (f4 + f3);
            int i5 = i2 + i4;
            A00(canvas2, str, i5, i3, 1);
            int i6 = i5 + ((int) (f4 + f2));
            String str2 = this.A0P;
            A00(canvas2, str2, i6, i3, 0);
            A00(canvas2, str2, i6 + i4, i3, 1);
            Paint paint2 = this.A0L;
            paint2.setXfermode(this.A0M);
            float f5 = f3 / 2.0f;
            canvas2.drawRect(0.0f, (r9 / 2) - f5, f, (r9 / 2) + f5, paint2);
        }
        this.A0L.setXfermode(null);
        Bitmap bitmap2 = this.A02;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Bitmap bitmap;
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A00 = rect.left;
        this.A01 = rect.top;
        Bitmap bitmap2 = this.A02;
        if (bitmap2 != null && bitmap2.getWidth() == rect.width() && (bitmap = this.A02) != null && bitmap.getHeight() == rect.height()) {
            return;
        }
        Bitmap A0F = AbstractC167007dF.A0F(rect.width(), rect.height());
        this.A03 = new Canvas(A0F);
        this.A02 = A0F;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C209659Pb(android.content.Context r11, android.content.res.Resources r12, long r13) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209659Pb.<init>(android.content.Context, android.content.res.Resources, long):void");
    }

    private final void A00(Canvas canvas, String str, int i, int i2, int i3) {
        RectF rectF = this.A0O;
        float f = i;
        float f2 = i2;
        int i4 = this.A0H;
        float f3 = i4 + i;
        int i5 = this.A0F;
        rectF.set(f, f2, f3, i5 + i2);
        Paint paint = this.A0L;
        paint.setColor(this.A0E);
        float f4 = this.A07;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        paint.setColor(this.A0G);
        paint.setXfermode(this.A0N);
        canvas.drawRect(f, f2, f3, i2 + (i5 / 2), paint);
        paint.setXfermode(null);
        paint.setColor(-1);
        if (str != null) {
            int i6 = i + (i4 / 2);
            if (str.charAt(i3) == '1') {
                i6 = (i6 + (this.A0K / 2)) - (this.A0I / 2);
            }
            canvas.drawText(str, i3, i3 + 1, i6, (this.A0C / 2) + (this.A0J / 2), paint);
        }
    }

    @Override // X.InterfaceC202708xo
    public final String getId() {
        return this.A05;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A0C;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0D;
    }
}
