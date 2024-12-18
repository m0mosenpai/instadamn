package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: X.Bgq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26106Bgq extends C0T6 implements InterfaceC31146Dmp {
    public final float A00;
    public final long A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26106Bgq) {
                C26106Bgq c26106Bgq = (C26106Bgq) obj;
                long j = this.A02;
                long j2 = c26106Bgq.A02;
                long j3 = AbstractC27755CLw.A00;
                if (j != j2 || this.A01 != c26106Bgq.A01 || Float.compare(this.A00, c26106Bgq.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC31146Dmp
    public final void AQS(Canvas canvas, Paint paint) {
        long j = this.A02;
        long j2 = AbstractC27755CLw.A00;
        RectF A01 = C28369CfV.A01(AbstractC25227BEk.A01(j), AbstractC25232BEp.A00(j), this.A01);
        float f = this.A00;
        canvas.drawRoundRect(A01, f, f, paint);
    }

    public final int hashCode() {
        long j = this.A02;
        long j2 = AbstractC27755CLw.A00;
        return AbstractC25226BEj.A01(AbstractC167007dF.A07(this.A01, AbstractC25227BEk.A03(j)), this.A00);
    }

    public C26106Bgq(float f, long j, long j2) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = f;
    }
}
