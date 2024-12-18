package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;

/* loaded from: classes11.dex */
public final class WEQ {
    public final C68672Va8 A00;
    public final C70163WEd A01;
    public final boolean A02;
    public final Paint A03;

    public static boolean A02(WEQ weq, int i) {
        if (i != 0) {
            C69323VlV[] c69323VlVArr = weq.A01.A0B;
            C69323VlV c69323VlV = c69323VlVArr[i];
            C69323VlV c69323VlV2 = c69323VlVArr[i - 1];
            if (c69323VlV.A05 != C05F.A01 || !A01(c69323VlV, weq)) {
                return c69323VlV2.A04 == VCZ.DISPOSE_TO_BACKGROUND && A01(c69323VlV2, weq);
            }
        }
        return true;
    }

    public static void A00(Canvas canvas, C69323VlV c69323VlV, WEQ weq) {
        canvas.drawRect(c69323VlV.A02, c69323VlV.A03, r2 + c69323VlV.A01, r1 + c69323VlV.A00, weq.A03);
    }

    public static boolean A01(C69323VlV c69323VlV, WEQ weq) {
        if (c69323VlV.A02 == 0 && c69323VlV.A03 == 0) {
            int i = c69323VlV.A01;
            Rect rect = weq.A01.A05;
            if (i == rect.width() && c69323VlV.A00 == rect.height()) {
                return true;
            }
        }
        return false;
    }

    public WEQ(C68672Va8 c68672Va8, C70163WEd c70163WEd, boolean z) {
        this.A01 = c70163WEd;
        this.A00 = c68672Va8;
        this.A02 = z;
        Paint paint = new Paint();
        this.A03 = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        AbstractC166997dE.A1D(paint, PorterDuff.Mode.SRC);
    }
}
