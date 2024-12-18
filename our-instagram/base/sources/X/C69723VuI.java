package X;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.VuI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69723VuI {
    public int A00;
    public int A01;
    public final Paint A02;
    public final int A03;
    public final boolean A05;
    public final boolean A06;
    public final float[] A07;
    public final float[] A08;
    public final float[] A0A;
    public final float[] A09 = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    public final Rect A04 = new Rect();

    public C69723VuI(Paint paint, float f, int i, int i2, int i3, boolean z, boolean z2) {
        this.A02 = paint;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = i3;
        this.A05 = z;
        this.A06 = z2;
        this.A08 = new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
        this.A0A = new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f};
        this.A07 = new float[]{f, f, f, f, f, f, f, f};
    }

    public final Path A00() {
        float[] fArr;
        this.A04.set(this.A01, 0, this.A00, this.A03);
        Path path = new Path();
        RectF rectF = new RectF(r6.left, r6.top, r6.right, r6.bottom);
        boolean z = this.A05;
        boolean z2 = this.A06;
        if (z) {
            if (z2) {
                fArr = this.A07;
            } else {
                fArr = this.A08;
            }
        } else if (z2) {
            fArr = this.A0A;
        } else {
            fArr = this.A09;
        }
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        return path;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DrawableSegment(startPos=");
        sb.append(this.A01);
        sb.append(", endPos=");
        sb.append(this.A00);
        sb.append(", height=");
        sb.append(this.A03);
        sb.append(", isFirst=");
        sb.append(this.A05);
        sb.append(", isLast=");
        return AbstractC25236BEt.A0a(sb, this.A06);
    }
}
