package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import java.util.Random;

/* renamed from: X.P7m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56514P7m implements InterfaceC57973PnJ {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final Bitmap A04;
    public final Rect A05;
    public final View A06;
    public final Random A07;

    public C56514P7m(Bitmap bitmap, View view) {
        C14360o3.A0B(view, 1);
        this.A06 = view;
        this.A04 = bitmap;
        Context A0L = AbstractC166997dE.A0L(view);
        this.A02 = AbstractC13690mv.A01(A0L, -250);
        this.A00 = AbstractC13690mv.A01(A0L, -450);
        this.A03 = AbstractC13690mv.A01(A0L, 100);
        this.A01 = AbstractC13690mv.A01(A0L, -200);
        this.A07 = new Random();
        this.A05 = AbstractC166987dD.A0U();
    }

    @Override // X.InterfaceC57973PnJ
    public final void AJH(C54992OUb c54992OUb, int i, int i2, long j) {
        View view = this.A06;
        Rect rect = this.A05;
        view.getGlobalVisibleRect(rect);
        if (rect.left == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == 0) {
            return;
        }
        Random random = this.A07;
        float nextFloat = 0.3f + ((1.0f - 0.3f) * random.nextFloat());
        PointF pointF = c54992OUb.A0A;
        pointF.x = MSZ.A00(rect.right, rect.left, (random.nextFloat() * 0.7f) + 0.15f);
        pointF.y = MSZ.A00(rect.bottom, rect.top, (random.nextFloat() * 0.6f) + 0.33f);
        PointF pointF2 = c54992OUb.A0C;
        pointF2.x = i * random.nextFloat();
        float A00 = MSZ.A00(rect.bottom, rect.top, 0.75f);
        float f = this.A03;
        pointF2.y = A00 + f + ((this.A01 - f) * random.nextFloat());
        PointF pointF3 = c54992OUb.A0D;
        pointF3.x = 0.0f;
        pointF3.y = 0.0f;
        float f2 = this.A02;
        c54992OUb.A04 = f2 + ((this.A00 - f2) * c54992OUb.A06);
        C54992OUb.A00(c54992OUb, random, nextFloat * 1.2f);
        c54992OUb.A07 = 1.0f;
        c54992OUb.A03 = 1.0f;
        c54992OUb.A09 = this.A04;
    }
}
