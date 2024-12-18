package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.Pair;
import android.view.View;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UAa extends View {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C69474Vnx A05;
    public C69474Vnx A06;
    public C69474Vnx A07;
    public boolean A08;
    public float[] A09;
    public float[] A0A;
    public float[] A0B;
    public float[] A0C;
    public float[] A0D;
    public float[] A0E;
    public float[] A0F;
    public float[] A0G;
    public float[] A0H;
    public float[] A0I;
    public float[] A0J;
    public float[] A0K;
    public int A0L;
    public final Paint A0M;
    public final Paint A0N;
    public final Paint A0O;
    public final Paint A0P;
    public final Path A0Q;
    public final Path A0R;
    public final Path A0S;
    public final Path A0T;
    public final Path A0U;
    public final int A0V;
    public final int A0W;
    public final int A0X;
    public final Paint A0Y;

    private final float[] A01(float[] fArr, float f, float f2) {
        float f3;
        int i = 0;
        int length = fArr.length;
        if (length == 0) {
            return new float[0];
        }
        float[] fArr2 = new float[length];
        do {
            int i2 = this.A01;
            float f4 = fArr[i];
            if (f2 < f) {
                f3 = 0.0f;
            } else {
                f3 = i2 * (((f4 - f) * 1.0f) / (f2 - f));
            }
            fArr2[i] = f3;
            i++;
        } while (i < length);
        return fArr2;
    }

    private final float[] A02(float[] fArr, float f, float f2) {
        float f3;
        int i = 0;
        int length = fArr.length;
        if (length == 0) {
            return new float[0];
        }
        float[] fArr2 = new float[length];
        do {
            float f4 = this.A0W;
            int i2 = this.A0L;
            float f5 = fArr[i];
            if (f2 < f) {
                f3 = 0.0f;
            } else {
                f3 = i2 * (((f2 - f5) * 1.0f) / (f2 - f));
            }
            fArr2[i] = f4 + f3;
            i++;
        } while (i < length);
        return fArr2;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        C69474Vnx c69474Vnx = this.A07;
        if (c69474Vnx != null && this.A06 != null) {
            Paint paint = this.A0Y;
            paint.setColor(c69474Vnx.A05);
            canvas.drawPath(this.A0U, paint);
        }
        if (this.A08) {
            canvas.drawPath(this.A0S, this.A0O);
            canvas.drawPath(this.A0Q, this.A0M);
        }
        canvas.drawPath(this.A0T, this.A0P);
        canvas.drawPath(this.A0R, this.A0N);
    }

    public static void A00(Path path, Pair pair) {
        Object obj = pair.first;
        C14360o3.A06(obj);
        float floatValue = ((Number) obj).floatValue();
        Object obj2 = pair.second;
        C14360o3.A06(obj2);
        path.lineTo(floatValue, ((Number) obj2).floatValue());
    }

    public final float[] getLowerXPositions() {
        float[] fArr = this.A09;
        if (fArr != null) {
            return fArr;
        }
        C14360o3.A0F("lowerXPositions");
        throw C00O.createAndThrow();
    }

    public final float[] getUpperXPositions() {
        float[] fArr = this.A0D;
        if (fArr != null) {
            return fArr;
        }
        C14360o3.A0F("upperXPositions");
        throw C00O.createAndThrow();
    }

    public final float[] getXPositions() {
        float[] fArr = this.A0H;
        if (fArr != null) {
            return fArr;
        }
        C14360o3.A0F("xPositions");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0244  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r15, int r16) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UAa.onMeasure(int, int):void");
    }

    public UAa(Context context) {
        super(context);
        Paint paint = new Paint();
        this.A0P = paint;
        Paint paint2 = new Paint();
        this.A0O = paint2;
        this.A0T = new Path();
        this.A0S = new Path();
        Paint paint3 = new Paint();
        this.A0N = paint3;
        this.A0M = new Paint();
        this.A0R = new Path();
        this.A0Q = new Path();
        this.A0U = new Path();
        Paint paint4 = new Paint();
        this.A0Y = paint4;
        paint.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material));
        AbstractC166987dD.A1N(context, paint, R.color.badge_color);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        AbstractC166987dD.A1N(context, paint2, R.color.badge_color);
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        AbstractC166987dD.A1N(context, paint4, R.color.grey_1);
        paint4.setStyle(style2);
        paint3.setStrokeWidth(AbstractC166997dE.A04(context, R.dimen.abc_control_corner_material));
        AbstractC166987dD.A1N(context, paint3, R.color.blue_3);
        paint3.setStyle(style);
        this.A0W = AbstractC167017dG.A0E(context);
        this.A0V = AbstractC167017dG.A0B(getContext());
        this.A0X = AbstractC167017dG.A0E(context);
    }
}
