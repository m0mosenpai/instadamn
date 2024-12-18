package X;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import java.util.Random;

/* loaded from: classes11.dex */
public final class WjN implements XAY {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final Bitmap A05;
    public final C7S5 A07;
    public final Rect A06 = new Rect();
    public final Random A08 = new Random();

    @Override // X.XAY
    public final void AJG(C69461Vnk c69461Vnk, int i, int i2, long j) {
        C7S5 c7s5 = this.A07;
        Rect rect = this.A06;
        c7s5.CET(rect);
        if (rect.left == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == 0) {
            return;
        }
        Random random = this.A08;
        float nextFloat = 0.65f + ((1.0f - 0.65f) * random.nextFloat());
        PointF pointF = c69461Vnk.A0A;
        float A00 = MSZ.A00(rect.right, rect.left, random.nextFloat());
        pointF.x = A00;
        int i3 = rect.top;
        pointF.y = i3;
        PointF pointF2 = c69461Vnk.A0C;
        pointF2.x = A00;
        float A002 = MSZ.A00(rect.bottom, i3, 0.75f);
        float f = this.A04;
        pointF2.y = A002 + f + ((this.A01 - f) * random.nextFloat());
        PointF pointF3 = c69461Vnk.A0D;
        float f2 = this.A02;
        float f3 = -f2;
        pointF3.x = f3 + ((f2 - f3) * random.nextFloat());
        pointF3.y = 500.0f;
        float f4 = this.A03;
        c69461Vnk.A04 = f4 + ((this.A00 - f4) * c69461Vnk.A06);
        c69461Vnk.A06 = nextFloat * 3.0f;
        c69461Vnk.A05 = (float) ((-0.3141592700403172d) + ((0.3141592700403172d - (-0.3141592700403172d)) * random.nextFloat()));
        c69461Vnk.A07 = 1.0f;
        c69461Vnk.A03 = 1.0f;
        c69461Vnk.A09 = this.A05;
    }

    public WjN(Bitmap bitmap, C7S5 c7s5, float f, float f2, float f3, float f4, float f5) {
        this.A07 = c7s5;
        this.A05 = bitmap;
        this.A02 = f;
        this.A03 = f2;
        this.A00 = f3;
        this.A04 = f4;
        this.A01 = f5;
    }
}
