package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.VuD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C69718VuD {
    public int A00;
    public int A01;
    public int A02;
    public C70174WEw A05 = null;
    public C70174WEw A04 = null;
    public C70174WEw[] A06 = new C70174WEw[4];
    public Paint A07 = new Paint(2);
    public int A03 = 0;
    public final Rect A08 = new Rect();
    public final RectF A09 = new RectF();

    public void A00(Canvas canvas, float f, float f2) {
        Bitmap bitmap;
        Bitmap A02;
        C70174WEw c70174WEw = this.A05;
        Bitmap bitmap2 = null;
        if (c70174WEw != null) {
            bitmap = c70174WEw.A02();
        } else {
            bitmap = null;
        }
        Bitmap bitmap3 = C70174WEw.A0F;
        if (bitmap != bitmap3) {
            if (bitmap != null) {
                Paint paint = this.A07;
                paint.setAlpha(255);
                canvas.drawBitmap(bitmap, f, f2, paint);
                return;
            }
            Paint paint2 = this.A07;
            paint2.setAlpha(255);
            C70174WEw[] c70174WEwArr = this.A06;
            int i = 0;
            int i2 = 0;
            do {
                C70174WEw c70174WEw2 = c70174WEwArr[i];
                if (c70174WEw2 != null && c70174WEw2.A04 == this.A02 + 1 && c70174WEwArr[i].A02() != null) {
                    i2++;
                }
                i++;
            } while (i < 4);
            C70174WEw c70174WEw3 = this.A04;
            if (c70174WEw3 != null) {
                bitmap2 = c70174WEw3.A02();
            }
            if (i2 != 4) {
                if (bitmap2 != null && bitmap2 != bitmap3) {
                    int i3 = this.A02;
                    C70174WEw c70174WEw4 = this.A04;
                    int i4 = i3 - c70174WEw4.A04;
                    int i5 = c70174WEw4.A00 >> i4;
                    int i6 = (1 << i4) - 1;
                    int i7 = (this.A00 & i6) * i5;
                    int i8 = (i6 & this.A01) * i5;
                    Rect rect = this.A08;
                    rect.set(i7, i8, i7 + i5, i5 + i8);
                    RectF rectF = this.A09;
                    C70174WEw c70174WEw5 = this.A04;
                    rectF.set(f, f2, c70174WEw5.A01 + f, c70174WEw5.A00 + f2);
                    canvas.drawBitmap(bitmap2, rect, rectF, paint2);
                }
                if (i2 <= 0) {
                    return;
                }
            }
            int i9 = 0;
            do {
                int i10 = 0;
                do {
                    C70174WEw c70174WEw6 = c70174WEwArr[(i9 << 1) + i10];
                    if (c70174WEw6 != null && c70174WEw6.A04 == this.A02 + 1 && (A02 = c70174WEw6.A02()) != null && A02 != bitmap3) {
                        int i11 = c70174WEw6.A00;
                        int i12 = i11 >> 1;
                        float f3 = (i12 * i9) + f;
                        float f4 = (i12 * i10) + f2;
                        Rect rect2 = this.A08;
                        rect2.set(0, 0, c70174WEw6.A01, i11);
                        RectF rectF2 = this.A09;
                        float f5 = i12;
                        rectF2.set(f3, f4, f3 + f5, f5 + f4);
                        canvas.drawBitmap(A02, rect2, rectF2, paint2);
                    }
                    i10++;
                } while (i10 < 2);
                i9++;
            } while (i9 < 2);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC31173DnH.A0q(this));
        sb.append("{tile=");
        Object obj = this.A05;
        Object obj2 = "{x}";
        if (obj == null) {
            obj = "{x}";
        }
        sb.append(obj);
        sb.append(", mParentTile=");
        C70174WEw c70174WEw = this.A04;
        if (c70174WEw != null) {
            obj2 = c70174WEw;
        }
        sb.append(obj2);
        sb.append(", status=");
        sb.append(this.A03);
        return AbstractC166997dE.A0x("}", sb);
    }
}
