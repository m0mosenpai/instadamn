package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;

/* loaded from: classes11.dex */
public final class WnM implements C6S0, C6S2 {
    public int A00;
    public int A01;
    public Paint A02;
    public Rect A03;
    public C6S5 A04;
    public boolean A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final Context A09;

    public WnM(Context context, Rect rect, float f, float f2, float f3) {
        C14360o3.A0B(rect, 5);
        this.A09 = context;
        this.A08 = f;
        this.A06 = f2;
        this.A07 = f3;
        this.A03 = rect;
        Paint paint = new Paint(1);
        this.A02 = paint;
        this.A05 = true;
        this.A04 = C6S5.A05;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    public final void A00(Layout layout, float f) {
        float lineLeft = layout.getLineLeft(0);
        float lineRight = layout.getLineRight(0);
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            float lineLeft2 = layout.getLineLeft(i);
            float lineRight2 = layout.getLineRight(i);
            if (lineLeft2 < lineLeft) {
                lineLeft = lineLeft2;
            }
            if (lineRight2 > lineRight) {
                lineRight = lineRight2;
            }
        }
        Float valueOf = Float.valueOf(lineLeft);
        Float valueOf2 = Float.valueOf(lineRight);
        float floatValue = valueOf.floatValue();
        float f2 = this.A07 * f;
        this.A03 = new Rect((int) (floatValue - f2), (int) ((-this.A08) * f), (int) (valueOf2.floatValue() + f2), (int) (layout.getHeight() + (this.A06 * f)));
    }

    @Override // X.C6S0
    public final void AQP(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (this.A05) {
            this.A05 = false;
            Paint paint = this.A02;
            paint.setAlpha(255);
            canvas.drawRect(this.A03, paint);
        }
    }

    @Override // X.C6S0
    public final /* synthetic */ void AQX(Canvas canvas, Paint paint, Spanned spanned, int i, int i2, int i3, int i4, int i5) {
        C14360o3.A0B(canvas, 2);
        AQP(canvas);
    }

    @Override // X.C6S0
    public final void EfY(C6S5 c6s5) {
        C14360o3.A0B(c6s5, 0);
        this.A04 = c6s5;
    }

    @Override // X.C6S0
    public final void FCG(Layout layout, Integer num, float f, int i, int i2) {
        C14360o3.A0B(layout, 0);
        A00(layout, f);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final /* synthetic */ boolean onPreDraw() {
        this.A05 = true;
        return true;
    }

    @Override // X.C6S0
    public final int BgK() {
        return this.A00;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.Wig, X.XCW, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.VkJ, java.lang.Object] */
    @Override // X.C6S2
    public final XCW Bz1() {
        int i = this.A00;
        int i2 = this.A01;
        C6S5 c6s5 = this.A04;
        float f = this.A08;
        float f2 = this.A06;
        float f3 = this.A07;
        Rect rect = this.A03;
        C14360o3.A0B(rect, 1);
        ?? obj = new Object();
        obj.A01 = rect.left;
        obj.A03 = rect.top;
        obj.A02 = rect.right;
        obj.A00 = rect.bottom;
        ?? obj2 = new Object();
        obj2.A03 = i;
        obj2.A04 = i2;
        obj2.A05 = c6s5;
        obj2.A02 = f;
        obj2.A00 = f2;
        obj2.A01 = f3;
        obj2.A06 = obj;
        return obj2;
    }

    @Override // X.C6S1
    public final /* synthetic */ Integer Bz4() {
        return C05F.A00;
    }

    @Override // X.C6S0
    public final C6S5 C6E() {
        return this.A04;
    }

    @Override // X.C6S0
    public final void ERf(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        Paint paint = this.A02;
        if (this.A04 == C6S5.A06) {
            i2 = i;
        }
        paint.setColor(i2);
    }
}
