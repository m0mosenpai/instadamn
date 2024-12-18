package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* loaded from: classes8.dex */
public final class JUL implements InterfaceC162837Qu {
    public boolean A00;
    public final C74843Xy A02 = new C74843Xy();
    public final RectF A01 = AbstractC166987dD.A0X();
    public final C47476Ky5 A04 = new C47476Ky5();
    public final C47475Ky4 A03 = new C47475Ky4();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0011. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC162837Qu
    public final void AQS(Canvas canvas, Paint paint) {
        int i;
        if (this.A00) {
            C74843Xy c74843Xy = this.A02;
            switch (c74843Xy.A00.intValue()) {
                case 0:
                case 1:
                    this.A00 = false;
                    break;
                case 2:
                    C47476Ky5 c47476Ky5 = this.A04;
                    RectF rectF = this.A01;
                    C14360o3.A0B(rectF, 0);
                    LEC lec = c47476Ky5.A01;
                    RectF rectF2 = lec.A00;
                    rectF2.set(rectF);
                    RectF rectF3 = lec.A01;
                    rectF3.set(rectF);
                    float centerY = rectF.centerY();
                    float[] fArr = c74843Xy.A01;
                    rectF2.bottom = Math.max(fArr[1], fArr[3]) + centerY;
                    rectF3.top = centerY - Math.max(fArr[7], fArr[5]);
                    LEC lec2 = c47476Ky5.A00;
                    RectF rectF4 = lec2.A00;
                    rectF4.set(rectF);
                    RectF rectF5 = lec2.A01;
                    rectF5.set(rectF);
                    rectF4.bottom = centerY;
                    rectF5.top = centerY;
                    i = centerY;
                    this.A00 = false;
                    break;
                case 3:
                    C47476Ky5 c47476Ky52 = this.A04;
                    RectF rectF6 = this.A01;
                    C14360o3.A0B(rectF6, 0);
                    LEC lec3 = c47476Ky52.A01;
                    RectF rectF7 = lec3.A00;
                    rectF7.set(rectF6);
                    RectF rectF8 = lec3.A01;
                    rectF8.set(rectF6);
                    float centerX = rectF6.centerX();
                    float[] fArr2 = c74843Xy.A01;
                    rectF7.right = Math.max(fArr2[0], fArr2[6]) + centerX;
                    rectF8.left = centerX - Math.max(fArr2[2], fArr2[4]);
                    LEC lec4 = c47476Ky52.A00;
                    RectF rectF9 = lec4.A00;
                    rectF9.set(rectF6);
                    RectF rectF10 = lec4.A01;
                    rectF10.set(rectF6);
                    rectF9.right = centerX;
                    rectF10.left = centerX;
                    i = centerX;
                    this.A00 = false;
                    break;
                case 4:
                case 5:
                    C47475Ky4 c47475Ky4 = this.A03;
                    RectF rectF11 = this.A01;
                    C14360o3.A0B(rectF11, 0);
                    float[] fArr3 = c74843Xy.A01;
                    C14360o3.A07(fArr3);
                    float width = rectF11.width() / 2.0f;
                    float height = rectF11.height() / 2.0f;
                    LEY ley = c47475Ky4.A01;
                    RectF rectF12 = ley.A02;
                    rectF12.set(rectF11);
                    rectF12.right = rectF11.left + width + fArr3[0];
                    rectF12.bottom = rectF11.top + height + fArr3[1];
                    RectF rectF13 = ley.A03;
                    rectF13.set(rectF11);
                    rectF13.left = (rectF11.right - width) - fArr3[2];
                    rectF13.bottom = rectF11.top + height + fArr3[3];
                    RectF rectF14 = ley.A00;
                    rectF14.set(rectF11);
                    rectF14.right = rectF14.left + width + fArr3[6];
                    rectF14.top = (rectF14.bottom - height) - fArr3[7];
                    RectF rectF15 = ley.A01;
                    rectF15.set(rectF11);
                    rectF15.left = (rectF15.right - width) - fArr3[4];
                    rectF15.top = (rectF15.bottom - height) - fArr3[5];
                    LEY ley2 = c47475Ky4.A00;
                    RectF rectF16 = ley2.A02;
                    rectF16.set(rectF12);
                    rectF16.right -= fArr3[0];
                    rectF16.bottom -= fArr3[1];
                    RectF rectF17 = ley2.A03;
                    rectF17.set(rectF13);
                    rectF17.left += fArr3[2];
                    rectF17.bottom -= fArr3[3];
                    RectF rectF18 = ley2.A00;
                    rectF18.set(rectF14);
                    rectF18.right -= fArr3[6];
                    rectF18.top += fArr3[7];
                    RectF rectF19 = ley2.A01;
                    rectF19.set(rectF15);
                    rectF19.left += fArr3[4];
                    rectF19.top += fArr3[5];
                    i = rectF19;
                    this.A00 = false;
                    break;
                default:
                    throw new RuntimeException();
            }
        }
        C74843Xy c74843Xy2 = this.A02;
        float[] fArr4 = c74843Xy2.A01;
        C14360o3.A07(fArr4);
        try {
            switch (c74843Xy2.A00.intValue()) {
                case 0:
                case 1:
                    canvas.drawRoundRect(this.A01, fArr4[0], fArr4[1], paint);
                    return;
                case 2:
                case 3:
                    C47476Ky5 c47476Ky53 = this.A04;
                    LEC lec5 = c47476Ky53.A00;
                    RectF rectF20 = lec5.A00;
                    int save = canvas.save();
                    canvas.clipRect(rectF20);
                    RectF rectF21 = c47476Ky53.A01.A00;
                    canvas.drawRoundRect(rectF21, fArr4[0], fArr4[1], paint);
                    canvas.restoreToCount(save);
                    RectF rectF22 = lec5.A01;
                    int save2 = canvas.save();
                    canvas.clipRect(rectF22);
                    canvas.drawRoundRect(rectF21, fArr4[4], fArr4[5], paint);
                    i = save2;
                    break;
                case 4:
                case 5:
                    C47475Ky4 c47475Ky42 = this.A03;
                    LEY ley3 = c47475Ky42.A00;
                    RectF rectF23 = ley3.A02;
                    int save3 = canvas.save();
                    canvas.clipRect(rectF23);
                    LEY ley4 = c47475Ky42.A01;
                    canvas.drawRoundRect(ley4.A02, fArr4[0], fArr4[1], paint);
                    canvas.restoreToCount(save3);
                    RectF rectF24 = ley3.A03;
                    int save4 = canvas.save();
                    canvas.clipRect(rectF24);
                    canvas.drawRoundRect(ley4.A03, fArr4[2], fArr4[3], paint);
                    canvas.restoreToCount(save4);
                    RectF rectF25 = ley3.A01;
                    int save5 = canvas.save();
                    canvas.clipRect(rectF25);
                    canvas.drawRoundRect(ley4.A01, fArr4[4], fArr4[5], paint);
                    canvas.restoreToCount(save5);
                    RectF rectF26 = ley3.A00;
                    int save6 = canvas.save();
                    canvas.clipRect(rectF26);
                    canvas.drawRoundRect(ley4.A00, fArr4[6], fArr4[7], paint);
                    i = save6;
                    break;
                default:
                    throw new RuntimeException();
            }
        } finally {
            canvas.restoreToCount(i);
        }
    }

    @Override // X.InterfaceC162837Qu
    public final void EQT(RectF rectF) {
        RectF rectF2 = this.A01;
        if (!C14360o3.A0K(rectF2, rectF)) {
            rectF2.set(rectF);
            this.A00 = true;
        }
    }

    @Override // X.InterfaceC162837Qu
    public final void ESC(C74843Xy c74843Xy) {
        C74843Xy c74843Xy2 = this.A02;
        if (!c74843Xy.equals(c74843Xy2)) {
            c74843Xy2.A08(c74843Xy, C05F.A00);
            this.A00 = true;
        }
    }
}
