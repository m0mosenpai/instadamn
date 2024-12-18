package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public final class BYM extends Drawable {
    public Path A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final Bitmap A04;
    public final Bitmap A05;
    public final RectF A06;
    public final Integer A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final Paint[] A0D;
    public final Paint[] A0E;
    public final Path[] A0F;
    public final float A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final RectF A0J;
    public final boolean A0K;
    public static final int[] A0M = {-15173646, -14298266, -668109, -37796, -6278145, -15173646};
    public static final float[] A0L = {0.0f, 0.317f, 0.453f, 0.542f, 0.85f, 1.0f};

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0125, code lost:
    
        if (r19.A09 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012a, code lost:
    
        if (r19.A0A != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0224, code lost:
    
        if (r19.A09 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0229, code lost:
    
        if (r19.A0A != false) goto L49;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BYM.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = 0.0f;
        if (this.A09) {
            f = this.A02;
        } else {
            f = 0.0f;
        }
        if (this.A0A) {
            f2 = this.A02;
        } else {
            f2 = 0.0f;
        }
        boolean z = this.A0B;
        if (z) {
            float f6 = this.A02;
            if (this.A0K) {
                f4 = 0.0f;
            } else {
                f4 = this.A01;
            }
            f3 = f6 + f4;
        } else {
            f3 = 0.0f;
        }
        if (this.A08) {
            float f7 = this.A02;
            if (!this.A0K) {
                f5 = this.A01;
            }
            f5 += f7;
            if (z) {
                float f8 = this.A0G;
                f3 -= f8;
                f5 += f8;
            }
        }
        rect.set((int) f, (int) f3, (int) f2, (int) f5);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0118, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L36;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBoundsChange(android.graphics.Rect r44) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BYM.onBoundsChange(android.graphics.Rect):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        for (Paint paint : this.A0D) {
            paint.setAlpha(i);
        }
        for (Paint paint2 : this.A0E) {
            paint2.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        for (Paint paint : this.A0D) {
            paint.setColorFilter(colorFilter);
        }
        for (Paint paint2 : this.A0E) {
            paint2.setColorFilter(colorFilter);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (r1 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BYM(android.content.Context r11, X.C6FH r12, java.lang.Integer r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BYM.<init>(android.content.Context, X.6FH, java.lang.Integer, int, int):void");
    }

    public static void A00(int[] iArr) {
        int A00 = AbstractC25689BWz.A00(-14931149, 0.2f);
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            int alpha = Color.alpha(i2);
            int alpha2 = Color.alpha(A00);
            int i3 = (255 - alpha2) * alpha;
            int i4 = i3 + alpha2;
            iArr[i] = Color.argb(Math.min(255, i4), ((Color.red(i2) * i3) + (Color.red(A00) * alpha2)) / i4, ((Color.green(i2) * i3) + (Color.green(A00) * alpha2)) / i4, ((i3 * Color.blue(i2)) + (Color.blue(A00) * alpha2)) / i4);
        }
    }
}
