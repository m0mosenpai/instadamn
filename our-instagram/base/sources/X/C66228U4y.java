package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: X.U4y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66228U4y {
    public final Paint A00;
    public final Path A01 = new Path();
    public final VJ4 A02;
    public final VJ4 A03;
    public final VJ4 A04;
    public final VJ4 A05;
    public final VJ4 A06;

    public final void A00() {
        Path path = this.A01;
        path.reset();
        VJ4 vj4 = this.A06;
        path.moveTo(vj4.A00, vj4.A01);
        VJ4 vj42 = this.A02;
        float f = vj42.A00;
        float f2 = vj42.A01;
        VJ4 vj43 = this.A03;
        float f3 = vj43.A00;
        float f4 = vj43.A01;
        VJ4 vj44 = this.A04;
        path.cubicTo(f, f2, f3, f4, vj44.A00, vj44.A01);
        VJ4 vj45 = this.A05;
        path.lineTo(vj45.A00, vj45.A01);
        path.close();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.VJ4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.VJ4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.VJ4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.VJ4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.VJ4, java.lang.Object] */
    public C66228U4y(int i, int i2) {
        ?? obj = new Object();
        obj.A00 = 0.0f;
        obj.A01 = 0.0f;
        this.A05 = obj;
        ?? obj2 = new Object();
        obj2.A00 = 0.0f;
        obj2.A01 = 0.0f;
        this.A06 = obj2;
        ?? obj3 = new Object();
        obj3.A00 = 0.0f;
        obj3.A01 = 0.0f;
        this.A04 = obj3;
        ?? obj4 = new Object();
        obj4.A00 = 0.0f;
        obj4.A01 = 0.0f;
        this.A02 = obj4;
        ?? obj5 = new Object();
        obj5.A00 = 0.0f;
        obj5.A01 = 0.0f;
        this.A03 = obj5;
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setDither(true);
        paint.setColor(i);
        paint.setMaskFilter(new BlurMaskFilter(i2, BlurMaskFilter.Blur.NORMAL));
    }
}
