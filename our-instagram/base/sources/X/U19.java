package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes11.dex */
public final class U19 extends AbstractC84813qV {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public EnumC38183Gqo A09;
    public final float A0A;
    public final Paint A0B;
    public final RectF A0C;

    public U19(Context context) {
        super(context, null);
        this.A09 = EnumC38183Gqo.A0B;
        Paint paint = new Paint();
        this.A0B = paint;
        this.A0C = new RectF();
        this.A0A = context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
        AbstractC166987dD.A1N(context, paint, AbstractC53242c7.A04(context));
    }

    private final void A02(Canvas canvas) {
        float f = 0.0f;
        int i = 0;
        do {
            A04(canvas, f);
            f += this.A02 + this.A0A;
            i++;
        } while (i < 3);
        A00();
    }

    private final void setSquareSizes(int i) {
        float f = i;
        float f2 = this.A0A;
        float f3 = (f - (f2 * 2.0f)) / 3.0f;
        this.A02 = f3;
        this.A01 = f3;
        this.A00 = 1.7777778f * f3;
        this.A06 = (2.0f * f3) + f2;
        this.A04 = f3;
        this.A03 = (4.0f * f3) / 3.0f;
        this.A08 = f - f2;
        this.A07 = f3 * 3.5f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0016. Please report as an issue. */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        C14360o3.A0B(canvas, 0);
        this.A05 = 0.0f;
        setSquareSizes(getWidth());
        int i = 0;
        switch (this.A09.ordinal()) {
            case 0:
                do {
                    A02(canvas);
                    i++;
                } while (i < 6);
                return;
            case 1:
                A01(canvas);
                A02(canvas);
                A02(canvas);
                float f3 = this.A05;
                float f4 = this.A06;
                RectF rectF = this.A0C;
                rectF.set(0.0f, f3, 0.0f + f4, f4 + f3);
                canvas.drawRect(rectF, this.A0B);
                float f5 = this.A06 + this.A0A;
                A04(canvas, f5);
                A00();
                A04(canvas, f5);
                A00();
                return;
            case 2:
                A03(canvas);
                A02(canvas);
                A02(canvas);
                return;
            case 3:
                A05(canvas, 2.0f * (this.A02 + this.A0A));
                A06(canvas, 0.0f);
                A06(canvas, 0.0f);
                A02(canvas);
                A02(canvas);
                A05(canvas, 0.0f);
                float f6 = this.A02;
                float f7 = this.A0A;
                A06(canvas, f6 + f7);
                A06(canvas, this.A02 + f7);
                return;
            case 4:
                do {
                    int i2 = 0;
                    do {
                        float f8 = this.A01;
                        f = this.A0A;
                        float f9 = i2 * (f8 + f);
                        float f10 = this.A05;
                        float f11 = f9 + f8;
                        float f12 = this.A00 + f10;
                        RectF rectF2 = this.A0C;
                        rectF2.set(f9, f10, f11, f12);
                        canvas.drawRect(rectF2, this.A0B);
                        i2++;
                    } while (i2 < 3);
                    this.A05 += this.A00 + f;
                    i++;
                } while (i < 4);
                return;
            case 5:
                do {
                    float f13 = 0.0f;
                    int i3 = 0;
                    do {
                        float f14 = this.A05;
                        float f15 = f13 + this.A04;
                        float f16 = this.A03 + f14;
                        RectF rectF3 = this.A0C;
                        rectF3.set(f13, f14, f15, f16);
                        canvas.drawRect(rectF3, this.A0B);
                        float f17 = this.A04;
                        f2 = this.A0A;
                        f13 += f17 + f2;
                        i3++;
                    } while (i3 < 3);
                    this.A05 += this.A03 + f2;
                    i++;
                } while (i < 6);
                return;
            case 6:
                A02(canvas);
                return;
            case 7:
                A05(canvas, 0.0f);
                float f62 = this.A02;
                float f72 = this.A0A;
                A06(canvas, f62 + f72);
                A06(canvas, this.A02 + f72);
                return;
            case 8:
                A05(canvas, 2.0f * (this.A02 + this.A0A));
                A06(canvas, 0.0f);
                A06(canvas, 0.0f);
                return;
            case 9:
                float f18 = this.A02 + this.A0A;
                A05(canvas, 0.0f);
                A05(canvas, f18);
                A05(canvas, f18 * 2.0f);
                return;
            case 10:
                float f19 = this.A02 + this.A0A;
                A05(canvas, 0.0f);
                A05(canvas, 2.0f * f19);
                A04(canvas, f19);
                A00();
                A04(canvas, f19);
                return;
            case 11:
                A01(canvas);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                float f32 = this.A05;
                float f42 = this.A06;
                RectF rectF4 = this.A0C;
                rectF4.set(0.0f, f32, 0.0f + f42, f42 + f32);
                canvas.drawRect(rectF4, this.A0B);
                float f52 = this.A06 + this.A0A;
                A04(canvas, f52);
                A00();
                A04(canvas, f52);
                A00();
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A03(canvas);
                return;
            default:
                do {
                    A02(canvas);
                    i++;
                } while (i < 6);
                return;
        }
    }

    public final void setLayoutType(EnumC38183Gqo enumC38183Gqo) {
        C14360o3.A0B(enumC38183Gqo, 0);
        this.A09 = enumC38183Gqo;
        invalidate();
        requestLayout();
    }

    private final void A00() {
        this.A05 += this.A02 + this.A0A;
    }

    private final void A01(Canvas canvas) {
        float f = this.A02 + this.A0A;
        float f2 = this.A05;
        float f3 = this.A06;
        RectF rectF = this.A0C;
        rectF.set(f, f2, f + f3, f3 + f2);
        canvas.drawRect(rectF, this.A0B);
        A04(canvas, 0.0f);
        A00();
        A04(canvas, 0.0f);
        A00();
    }

    private final void A03(Canvas canvas) {
        float f = this.A05;
        float f2 = this.A08;
        float f3 = f + this.A07;
        RectF rectF = this.A0C;
        rectF.set(0.0f, f, f2, f3);
        canvas.drawRect(rectF, this.A0B);
        this.A05 += this.A07 + this.A0A;
    }

    private final void A04(Canvas canvas, float f) {
        float f2 = this.A05;
        float f3 = this.A02;
        RectF rectF = this.A0C;
        rectF.set(f, f2, f + f3, f3 + f2);
        canvas.drawRect(rectF, this.A0B);
    }

    private final void A05(Canvas canvas, float f) {
        float f2 = this.A05;
        float f3 = f + this.A02;
        float f4 = this.A06 + f2;
        RectF rectF = this.A0C;
        rectF.set(f, f2, f3, f4);
        canvas.drawRect(rectF, this.A0B);
    }

    private final void A06(Canvas canvas, float f) {
        A04(canvas, f);
        A04(canvas, f + this.A02 + this.A0A);
        A00();
    }
}
