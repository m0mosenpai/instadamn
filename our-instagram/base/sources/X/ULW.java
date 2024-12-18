package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.android.maps.model.LatLng;

/* loaded from: classes11.dex */
public final class ULW extends AbstractC66278U6y {
    public double A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public LatLng A06;
    public final Paint A07;
    public final C2TB A08;
    public final float[] A09;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.2TB, java.lang.Object] */
    public ULW(C70394WTw c70394WTw, LatLng latLng, double d, int i, int i2) {
        super(c70394WTw);
        this.A07 = new Paint(1);
        this.A09 = new float[2];
        this.A08 = new Object();
        this.A06 = latLng;
        this.A04 = i;
        this.A00 = d;
        this.A05 = i2;
        super.A02 = -10.0f;
        super.A04 = true;
        A00(this);
    }

    public static void A00(ULW ulw) {
        LatLng latLng = ulw.A06;
        double A01 = WFW.A01(latLng.A01);
        ((AbstractC66278U6y) ulw).A00 = A01;
        double d = latLng.A00;
        double A00 = WFW.A00(d);
        ((AbstractC66278U6y) ulw).A01 = A00;
        C2TB c2tb = ulw.A08;
        double A002 = WFW.A00(d + Math.toDegrees(ulw.A00 / 6371009.0d));
        c2tb.A03 = A002;
        double d2 = A00 - A002;
        c2tb.A00 = A00 + d2;
        c2tb.A01 = A01 - d2;
        c2tb.A02 = A01 + d2;
    }

    @Override // X.AbstractC66278U6y
    public final void A0D(Canvas canvas) {
        float f;
        C2TB c2tb = this.A08;
        float[] fArr = this.A0C;
        WFW wfw = super.A08;
        C2TB c2tb2 = super.A09;
        wfw.A05(c2tb2);
        if (c2tb.A00 >= c2tb2.A03 && c2tb.A03 <= c2tb2.A00) {
            fArr[0] = (int) Math.ceil(c2tb2.A01 - c2tb.A02);
            float floor = (int) Math.floor(c2tb2.A02 - c2tb.A01);
            fArr[1] = floor;
            float f2 = fArr[0];
            if (f2 <= floor) {
                double d = super.A00;
                double d2 = super.A01;
                float[] fArr2 = this.A09;
                wfw.A07(fArr2, d, d2);
                this.A01 = fArr2[0];
                this.A02 = fArr2[1];
                wfw.A07(fArr2, super.A00, c2tb.A03);
                this.A03 = (float) Math.hypot(fArr2[0] - this.A01, fArr2[1] - this.A02);
                C66356UBx c66356UBx = super.A07.A0I;
                canvas.save();
                float f3 = floor - f2;
                for (int i = 0; i <= f3; i++) {
                    if (i == 0) {
                        f = ((float) c66356UBx.A0K) * f2;
                    } else if (i != 1) {
                        canvas.translate(fArr[0], fArr[1]);
                        Paint paint = this.A07;
                        paint.setStyle(Paint.Style.FILL);
                        paint.setColor(this.A04);
                        canvas.drawCircle(this.A01, this.A02, this.A03, paint);
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setColor(this.A05);
                        paint.setStrokeWidth(10.0f);
                        canvas.drawCircle(this.A01, this.A02, this.A03, paint);
                    } else {
                        f = (float) c66356UBx.A0K;
                    }
                    fArr[0] = f;
                    fArr[1] = 0.0f;
                    c66356UBx.A0g.mapVectors(fArr);
                    canvas.translate(fArr[0], fArr[1]);
                    Paint paint2 = this.A07;
                    paint2.setStyle(Paint.Style.FILL);
                    paint2.setColor(this.A04);
                    canvas.drawCircle(this.A01, this.A02, this.A03, paint2);
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setColor(this.A05);
                    paint2.setStrokeWidth(10.0f);
                    canvas.drawCircle(this.A01, this.A02, this.A03, paint2);
                }
                canvas.restore();
            }
        }
    }
}
