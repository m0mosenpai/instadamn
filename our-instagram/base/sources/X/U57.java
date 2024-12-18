package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes11.dex */
public final class U57 {
    public final Paint A00;
    public final Path A01 = new Path();
    public final VJ4 A02;
    public final VJ4 A03;
    public final VJ4 A04;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.VJ4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.VJ4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.VJ4, java.lang.Object] */
    public U57() {
        ?? obj = new Object();
        obj.A00 = 0.0f;
        obj.A01 = 0.0f;
        this.A04 = obj;
        ?? obj2 = new Object();
        obj2.A00 = 0.0f;
        obj2.A01 = 0.0f;
        this.A02 = obj2;
        ?? obj3 = new Object();
        obj3.A00 = 0.0f;
        obj3.A01 = 0.0f;
        this.A03 = obj3;
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setDither(true);
        paint.setColor(-14298266);
        paint.setMaskFilter(new BlurMaskFilter(175.0f, BlurMaskFilter.Blur.NORMAL));
    }
}
