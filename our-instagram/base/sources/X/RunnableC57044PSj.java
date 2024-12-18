package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import java.util.Random;

/* renamed from: X.PSj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57044PSj implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C56515P7n A01;
    public final /* synthetic */ C54992OUb A02;

    public RunnableC57044PSj(C56515P7n c56515P7n, C54992OUb c54992OUb, int i) {
        this.A01 = c56515P7n;
        this.A00 = i;
        this.A02 = c54992OUb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C56515P7n c56515P7n = this.A01;
        View view = c56515P7n.A06;
        Rect rect = c56515P7n.A05;
        view.getGlobalVisibleRect(rect);
        if (rect.left == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == 0) {
            return;
        }
        float f = this.A00 * 0.65f;
        Random random = c56515P7n.A07;
        float nextFloat = 0.3f + ((1.0f - 0.3f) * random.nextFloat());
        C54992OUb c54992OUb = this.A02;
        PointF pointF = c54992OUb.A0A;
        pointF.x = MSZ.A00(rect.right, rect.left, 0.5f);
        pointF.y = MSZ.A00(rect.bottom, rect.top, 0.5f);
        PointF pointF2 = c54992OUb.A0C;
        pointF2.x = (rect.exactCenterX() - (f / 2.0f)) + (f * random.nextFloat());
        float A00 = MSZ.A00(rect.bottom, rect.top, 0.55f);
        float f2 = c56515P7n.A03;
        pointF2.y = A00 + f2 + ((c56515P7n.A01 - f2) * random.nextFloat());
        PointF pointF3 = c54992OUb.A0D;
        pointF3.x = 0.0f;
        pointF3.y = 0.0f;
        float f3 = c56515P7n.A02;
        c54992OUb.A04 = f3 + ((c56515P7n.A00 - f3) * c54992OUb.A06);
        C54992OUb.A00(c54992OUb, random, nextFloat * 1.2f);
        c54992OUb.A07 = 1.0f;
        c54992OUb.A03 = 1.0f;
        c54992OUb.A09 = c56515P7n.A04;
    }
}
