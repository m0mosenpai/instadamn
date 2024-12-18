package X;

import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: X.65Y, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C65Y {
    public int A00;
    public int A01;
    public int A02;
    public final Paint A04;
    public final Paint A05;
    public static final int[] A0B = new int[3];
    public static final float[] A09 = {0.0f, 0.5f, 1.0f};
    public static final int[] A0A = new int[4];
    public static final float[] A08 = {0.0f, 0.0f, 0.5f, 1.0f};
    public final Path A07 = new Path();
    public Paint A03 = new Paint();
    public final Paint A06 = new Paint();

    public C65Y() {
        A00(-16777216);
        this.A03.setColor(0);
        Paint paint = new Paint(4);
        this.A04 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.A05 = new Paint(paint);
    }

    public final void A00(int i) {
        int A06 = AbstractC56842jH.A06(i, 68);
        this.A02 = A06;
        this.A01 = AbstractC56842jH.A06(i, 20);
        this.A00 = i & 16777215;
        this.A06.setColor(A06);
    }
}
