package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import java.util.Random;

/* loaded from: classes11.dex */
public final class WjO implements XAY {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final Context A04;
    public final Bitmap A05;
    public final Rect A06;
    public final C7S5 A07;
    public final Random A08;

    @Override // X.XAY
    public final void AJG(C69461Vnk c69461Vnk, int i, int i2, long j) {
        Rect rect = this.A06;
        if (rect.left == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == 0) {
            return;
        }
        Random random = this.A08;
        float nextFloat = 0.3f + ((1.0f - 0.3f) * random.nextFloat());
        PointF pointF = c69461Vnk.A0A;
        pointF.x = MSZ.A00(rect.right, rect.left, (random.nextFloat() * 0.7f) + 0.15f);
        pointF.y = MSZ.A00(rect.bottom, rect.top, (random.nextFloat() * 0.6f) + 0.33f);
        PointF pointF2 = c69461Vnk.A0C;
        pointF2.x = AbstractC13880nE.A07(this.A04) * random.nextFloat();
        float A00 = MSZ.A00(rect.bottom, rect.top, 0.75f);
        float f = this.A03;
        pointF2.y = A00 + f + ((this.A01 - f) * random.nextFloat());
        PointF pointF3 = c69461Vnk.A0D;
        pointF3.x = 0.0f;
        pointF3.y = 0.0f;
        float f2 = this.A02;
        c69461Vnk.A04 = f2 + ((this.A00 - f2) * c69461Vnk.A06);
        c69461Vnk.A06 = nextFloat * 1.2f;
        c69461Vnk.A05 = (float) ((-0.6283185307179586d) + ((0.6283185307179586d - (-0.6283185307179586d)) * random.nextFloat()));
        c69461Vnk.A07 = 1.0f;
        c69461Vnk.A03 = 1.0f;
        c69461Vnk.A09 = this.A05;
    }

    public WjO(Context context, Bitmap bitmap, C7S5 c7s5, float f, float f2, float f3, float f4) {
        this.A04 = context;
        this.A07 = c7s5;
        this.A05 = bitmap;
        this.A02 = f;
        this.A00 = f2;
        this.A03 = f3;
        this.A01 = f4;
        Rect rect = new Rect();
        this.A06 = rect;
        this.A08 = new Random();
        c7s5.CET(rect);
    }
}
