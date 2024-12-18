package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* renamed from: X.Vs9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69606Vs9 {
    public long A00;
    public final Paint A01;
    public final C69206VjZ A02;
    public final C69719VuE A03;
    public final C69627VsU A04;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.VsU] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.VuE] */
    public C69606Vs9(Paint paint, C69206VjZ c69206VjZ, long j) {
        AbstractC167017dG.A1P(c69206VjZ, paint);
        this.A02 = c69206VjZ;
        this.A01 = paint;
        this.A00 = j;
        ?? obj = new Object();
        obj.A05 = 0.0f;
        obj.A06 = 0.0f;
        obj.A02 = 0.0f;
        obj.A03 = 1.0f;
        obj.A04 = 1.0f;
        obj.A00 = 0.0f;
        obj.A01 = 0.0f;
        this.A04 = obj;
        ?? obj2 = new Object();
        obj2.A00 = 0.0f;
        obj2.A01 = 0.0f;
        obj2.A08 = 0.0f;
        obj2.A09 = 0.0f;
        obj2.A07 = 0.0f;
        obj2.A04 = 0.0f;
        obj2.A05 = 0.0f;
        obj2.A06 = 0.0f;
        obj2.A03 = -3.4028235E38f;
        obj2.A02 = Float.MAX_VALUE;
        this.A03 = obj2;
    }

    public final void A00(Canvas canvas) {
        int save = canvas.save();
        try {
            this.A04.A00(canvas);
            C69206VjZ c69206VjZ = this.A02;
            Paint paint = this.A01;
            long j = this.A00;
            C68925VeP c68925VeP = c69206VjZ.A02;
            Rect rect = c69206VjZ.A01;
            C14360o3.A0B(rect, 1);
            c68925VeP.A00.AQW(canvas, paint, rect, c68925VeP.A01[(int) ((((float) (j % 1000)) / 1000.0f) * 1.0f)]);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
