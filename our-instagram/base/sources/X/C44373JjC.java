package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.Deprecated;

/* renamed from: X.JjC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44373JjC extends Drawable implements InterfaceC85603rp {
    public boolean A00;
    public final L9D A04;
    public static final RectF A07 = AbstractC166987dD.A0X();
    public static final RectF A05 = AbstractC166987dD.A0X();
    public static final RectF A06 = AbstractC166987dD.A0X();
    public final Paint A01 = AbstractC166987dD.A0R();
    public final Path A03 = AbstractC166987dD.A0T();
    public final Path A02 = AbstractC166987dD.A0T();

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r3 != r0.A04) goto L8;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r21) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44373JjC.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "This method is no longer used in graphics optimizations")
    public final int getOpacity() {
        return -1;
    }

    private final void A01(Canvas canvas, float f, float f2, float f3, float f4, float f5, int i, boolean z) {
        Path path;
        Paint paint = this.A01;
        paint.setStrokeWidth(f);
        paint.setColor(i);
        RectF rectF = A07;
        rectF.set(f2, f3, f4, f5);
        RectF rectF2 = A05;
        rectF2.set(getBounds());
        if (z) {
            rectF2.inset(rectF.centerX() - rectF.left, 0.0f);
        } else {
            rectF2.inset(0.0f, rectF.centerY() - rectF.top);
        }
        int save = canvas.save();
        canvas.clipRect(rectF);
        if (this.A00) {
            path = this.A03;
        } else {
            path = null;
        }
        AbstractC46557Kiw.A00(canvas, paint, path, rectF2, this.A04.A09);
        canvas.restoreToCount(save);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44373JjC)) {
            return false;
        }
        return C14360o3.A0K(this.A04, ((C44373JjC) obj).A04);
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.A01.getColorFilter();
    }

    public final int hashCode() {
        return this.A04.hashCode();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }

    public C44373JjC(L9D l9d) {
        boolean z;
        this.A04 = l9d;
        float[] fArr = l9d.A09;
        if (fArr != null) {
            int length = fArr.length;
            int i = 0;
            float f = 0.0f;
            z = false;
            while (true) {
                if (i >= length) {
                    break;
                }
                float f2 = fArr[i];
                z = f2 > 0.0f ? true : z;
                if (i == 0) {
                    f = f2;
                } else if (f != f2) {
                    this.A00 = true;
                    break;
                }
                i++;
            }
            if (this.A00 && length != 8) {
                float[] fArr2 = new float[8];
                int i2 = 0;
                do {
                    int i3 = i2 * 2;
                    fArr2[i3] = fArr[i2];
                    fArr2[i3 + 1] = fArr[i2];
                    i2++;
                } while (i2 < 4);
                this.A04.A09 = fArr2;
            }
        } else {
            z = false;
        }
        this.A01.setPathEffect(this.A04.A08);
        this.A01.setAntiAlias(this.A04.A08 != null || z);
        AbstractC43592JPx.A1E(this.A01);
    }

    public static Path A00(Canvas canvas, Path path, C44373JjC c44373JjC, float f, float f2) {
        path.lineTo(f, f2);
        path.close();
        canvas.clipPath(path);
        if (c44373JjC.A00) {
            return c44373JjC.A03;
        }
        return null;
    }

    @Override // X.InterfaceC85603rp
    /* renamed from: CTy */
    public final boolean CTz(InterfaceC85603rp interfaceC85603rp) {
        return AbstractC31180DnO.A1X(interfaceC85603rp, this);
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
