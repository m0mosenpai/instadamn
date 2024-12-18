package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class BYL extends Drawable {
    public float A00;
    public boolean A01;
    public boolean A02;
    public float A03;
    public final Paint A04;
    public final RectF A05 = AbstractC166987dD.A0X();
    public final float[] A06;
    public final int[] A07;

    public BYL(Context context) {
        Paint A0R = AbstractC166987dD.A0R();
        AbstractC166987dD.A1N(context, A0R, R.color.grey_2);
        this.A04 = A0R;
        int[] iArr = new int[5];
        C50L.A03(context, null, iArr, R.style.GradientPatternStyle);
        this.A07 = iArr;
        this.A06 = new float[]{0.0f, 0.27f, 0.51f, 0.75f, 1.0f};
        this.A00 = 1.0f;
        this.A01 = true;
        this.A02 = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        RectF rectF = this.A05;
        float f = this.A03;
        canvas.drawRoundRect(rectF, f, f, this.A04);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A04.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006f, code lost:
    
        if (r11.A02 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.BYL r11) {
        /*
            android.graphics.Rect r0 = r11.getBounds()
            int r0 = r0.height()
            float r4 = (float) r0
            float r0 = r11.A00
            float r4 = r4 * r0
            boolean r1 = r11.A01
            r0 = 1059816735(0x3f2b851f, float:0.67)
            if (r1 == 0) goto L15
            r0 = 1065353216(0x3f800000, float:1.0)
        L15:
            float r4 = r4 * r0
            android.graphics.Rect r0 = r11.getBounds()
            int r0 = r0.left
            float r3 = (float) r0
            android.graphics.Rect r0 = r11.getBounds()
            int r0 = r0.right
            float r2 = (float) r0
            android.graphics.Rect r0 = r11.getBounds()
            float r7 = r0.exactCenterY()
            r1 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r1
            float r7 = r7 - r4
            android.graphics.Rect r0 = r11.getBounds()
            float r5 = r0.exactCenterY()
            float r5 = r5 + r4
            float r0 = r2 - r3
            float r0 = r0 / r1
            r11.A03 = r0
            android.graphics.RectF r0 = r11.A05
            r0.set(r3, r7, r2, r5)
            android.graphics.Paint r2 = r11.A04
            boolean r0 = r11.A02
            if (r0 == 0) goto L7a
            android.graphics.Rect r0 = r11.getBounds()
            float r4 = r0.exactCenterX()
            android.graphics.Rect r0 = r11.getBounds()
            float r6 = r0.exactCenterX()
            int[] r8 = r11.A07
            float[] r9 = r11.A06
            android.graphics.Shader$TileMode r10 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
        L64:
            r2.setShader(r3)
            boolean r0 = r11.A01
            if (r0 != 0) goto L71
            boolean r1 = r11.A02
            r0 = 76
            if (r1 == 0) goto L73
        L71:
            r0 = 255(0xff, float:3.57E-43)
        L73:
            r2.setAlpha(r0)
            r11.invalidateSelf()
            return
        L7a:
            r3 = 0
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BYL.A00(X.BYL):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        A00(this);
    }
}
