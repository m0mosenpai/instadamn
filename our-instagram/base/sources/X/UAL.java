package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UAL extends View {
    public float A00;
    public float A01;
    public int A02;
    public C69214Vjh A03;
    public float[] A04;
    public float[] A05;
    public float A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final Paint A0F;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C69214Vjh c69214Vjh;
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        Paint paint = this.A0F;
        paint.setColor(this.A0C);
        float f = this.A06;
        canvas.drawLine(f, this.A07, f, r1 + this.A02, paint);
        float[] fArr = this.A04;
        if (fArr != null && (c69214Vjh = this.A03) != null) {
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                paint.setColor(this.A0D);
                canvas.drawCircle(this.A06, fArr[i], this.A0B, paint);
                paint.setColor(((C68944Vei) AbstractC31173DnH.A0L(c69214Vjh.A03).get(i)).A01);
                canvas.drawCircle(this.A06, fArr[i], this.A0A, paint);
            }
        }
    }

    public UAL(Context context) {
        super(context);
        Paint paint = new Paint();
        this.A0F = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(AbstractC43594JPz.A04(context));
        this.A07 = AbstractC167017dG.A0E(context);
        this.A08 = AbstractC167017dG.A0B(getContext());
        this.A0B = AbstractC167017dG.A06(context);
        this.A0A = AbstractC167017dG.A05(context);
        this.A0C = context.getColor(AbstractC53242c7.A09(context));
        this.A0D = AbstractC167007dF.A09(context, R.attr.igds_color_primary_button_icon);
        this.A09 = AbstractC167017dG.A0E(context);
        this.A0E = AbstractC167017dG.A04(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int i3 = this.A07;
        this.A02 = (measuredHeight - i3) - this.A08;
        float[] fArr = this.A05;
        if (fArr != null) {
            int length = fArr.length;
            int i4 = 0;
            if (length != 0) {
                float[] fArr2 = new float[length];
                do {
                    int measuredWidth = getMeasuredWidth() - this.A09;
                    float f3 = fArr[i4];
                    float f4 = this.A01;
                    float f5 = this.A00;
                    if (f5 < f4) {
                        f = 0.0f;
                    } else {
                        f = measuredWidth * (((f3 - f4) * 1.0f) / (f5 - f4));
                    }
                    fArr2[i4] = f;
                    i4++;
                } while (i4 < length);
                C69214Vjh c69214Vjh = this.A03;
                if (c69214Vjh != null) {
                    this.A06 = fArr2[c69214Vjh.A02] + this.A0E;
                }
                float[] fArr3 = this.A04;
                if (fArr3 != null && c69214Vjh != null) {
                    int length2 = fArr3.length;
                    for (int i5 = 0; i5 < length2; i5++) {
                        float f6 = i3;
                        int i6 = this.A02;
                        float f7 = ((C68944Vei) AbstractC31173DnH.A0L(c69214Vjh.A03).get(i5)).A00;
                        float f8 = c69214Vjh.A01;
                        float f9 = c69214Vjh.A00;
                        if (f9 < f8) {
                            f2 = 0.0f;
                        } else {
                            f2 = i6 * (((f9 - f7) * 1.0f) / (f9 - f8));
                        }
                        fArr3[i5] = f6 + f2;
                    }
                }
            }
        }
    }
}
