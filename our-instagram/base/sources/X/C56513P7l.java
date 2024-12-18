package X;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import java.util.Random;

/* renamed from: X.P7l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56513P7l implements InterfaceC57973PnJ {
    public final Bitmap A00;
    public final Rect A01;
    public final Random A02;

    public C56513P7l(Bitmap bitmap, Rect rect) {
        C14360o3.A0B(rect, 1);
        this.A01 = rect;
        this.A00 = bitmap;
        this.A02 = new Random();
    }

    @Override // X.InterfaceC57973PnJ
    public final void AJH(C54992OUb c54992OUb, int i, int i2, long j) {
        Rect rect = this.A01;
        if (rect.left == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == 0) {
            return;
        }
        Random random = this.A02;
        float nextFloat = 0.2f + ((0.5f - 0.2f) * random.nextFloat());
        PointF pointF = c54992OUb.A0A;
        pointF.x = MSZ.A00(rect.right, rect.left, random.nextFloat());
        pointF.y = MSZ.A00(rect.bottom, rect.top, random.nextFloat());
        PointF pointF2 = c54992OUb.A0C;
        pointF2.x = MSZ.A00(rect.right, rect.left, random.nextFloat());
        pointF2.y = MSZ.A00(rect.bottom, rect.top, random.nextFloat());
        PointF pointF3 = c54992OUb.A0D;
        pointF3.x = 0.0f;
        pointF3.y = 0.0f;
        c54992OUb.A04 = ((0.0f - 0.0f) * c54992OUb.A06) + 0.0f;
        C54992OUb.A00(c54992OUb, random, nextFloat);
        c54992OUb.A07 = 1.0f;
        c54992OUb.A03 = 0.0f;
        c54992OUb.A09 = this.A00;
    }
}
