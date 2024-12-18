package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.WXt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70463WXt implements InterfaceC131865xM {
    public final Paint A00;
    public final Paint A01;
    public final C69370VmG A02;
    public final C69370VmG A03;

    public C70463WXt(C69370VmG c69370VmG, C69370VmG c69370VmG2) {
        int i;
        this.A02 = c69370VmG;
        this.A03 = c69370VmG2;
        Paint paint = new Paint();
        if (c69370VmG != null) {
            i = c69370VmG.A03;
        } else {
            i = 0;
        }
        paint.setColor(i);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.A00 = paint;
        Paint paint2 = new Paint();
        paint2.setColor(c69370VmG2 != null ? c69370VmG2.A03 : 0);
        paint2.setStyle(style);
        this.A01 = paint2;
    }

    public static final void A00(Canvas canvas, Paint paint, C69370VmG c69370VmG) {
        int i;
        int i2;
        int width = canvas.getWidth();
        String str = c69370VmG.A04;
        if (C14360o3.A0K(str, "start")) {
            i = 0;
        } else if (C14360o3.A0K(str, "end")) {
            i = width;
        } else {
            i = width / 2;
        }
        float min = Math.min(Math.max(0.0f, i + c69370VmG.A00), width);
        int height = canvas.getHeight();
        String str2 = c69370VmG.A06;
        if (C14360o3.A0K(str2, "start")) {
            i2 = 0;
        } else if (C14360o3.A0K(str2, "end")) {
            i2 = height;
        } else {
            i2 = height / 2;
        }
        float min2 = Math.min(Math.max(0.0f, i2 + c69370VmG.A02), height);
        if (C14360o3.A0K(c69370VmG.A05, "circle")) {
            canvas.drawCircle(min, min2, c69370VmG.A01, paint);
        }
    }
}
