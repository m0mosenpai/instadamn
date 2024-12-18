package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes10.dex */
public final class Q2K extends Drawable {
    public Paint A00;
    public Paint A01;
    public Drawable A02;
    public Rect A03;
    public final Context A04;
    public final Path A05 = AbstractC166987dD.A0T();
    public final SOX A06;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Paint paint = this.A01;
        if (paint != null) {
            canvas.drawPath(this.A05, paint);
        }
        Drawable drawable = this.A02;
        if (drawable != null) {
            Path path = this.A05;
            int save = canvas.save();
            canvas.clipPath(path);
            try {
                drawable.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
        Paint paint2 = this.A00;
        if (paint2 != null) {
            canvas.drawPath(this.A05, paint2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x01ca, code lost:
    
        if (r5 == r0) goto L28;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBoundsChange(android.graphics.Rect r39) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q2K.onBoundsChange(android.graphics.Rect):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public static C09530e4 A00(Object obj, Object obj2, Object obj3, Object obj4) {
        return new C09530e4(new C09530e4(obj, obj2), new C09530e4(obj3, obj4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (android.graphics.Color.alpha(r4.A02) != 255) goto L10;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getOpacity() {
        /*
            r5 = this;
            X.SOX r0 = r5.A06
            X.SPH r4 = r0.A00
            float r2 = r4.A00
            r1 = 1
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L31
            int r0 = r4.A02
            if (r0 == 0) goto L31
        L10:
            r3 = 1
            if (r1 == 0) goto L1e
            int r0 = r4.A02
            int r1 = android.graphics.Color.alpha(r0)
            r0 = 255(0xff, float:3.57E-43)
            r2 = 1
            if (r1 == r0) goto L1f
        L1e:
            r2 = 0
        L1f:
            android.graphics.drawable.Drawable r0 = r4.A03
            r1 = -1
            if (r0 == 0) goto L2f
            int r0 = r0.getOpacity()
            if (r0 != r1) goto L2f
        L2a:
            if (r2 == 0) goto L33
            if (r3 == 0) goto L33
            return r1
        L2f:
            r3 = 0
            goto L2a
        L31:
            r1 = 0
            goto L10
        L33:
            r1 = -3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q2K.getOpacity():int");
    }

    public Q2K(Context context, SOX sox) {
        int i;
        int i2;
        this.A04 = context;
        this.A06 = sox;
        SPH sph = sox.A00;
        float f = sph.A00;
        if (f != 0.0f && (i2 = sph.A02) != 0) {
            Paint paint = new Paint(5);
            AbstractC43592JPx.A1E(paint);
            paint.setStrokeWidth(f);
            paint.setColor(i2);
            this.A00 = paint;
        }
        SP4 sp4 = sph.A04;
        if (sp4 != null) {
            float f2 = sp4.A02;
            if (f2 != 0.0f && (i = sp4.A03) != 0) {
                Paint paint2 = new Paint(5);
                AbstractC166987dD.A1R(paint2);
                paint2.setColor(i);
                paint2.setShadowLayer(f2, sp4.A00, sp4.A01, i);
                this.A01 = paint2;
            }
        }
    }
}
