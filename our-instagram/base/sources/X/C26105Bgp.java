package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.Bgp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26105Bgp extends C0T6 implements InterfaceC31146Dmp {
    public final float A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26105Bgp) {
                C26105Bgp c26105Bgp = (C26105Bgp) obj;
                long j = this.A01;
                long j2 = c26105Bgp.A01;
                long j3 = AbstractC27755CLw.A00;
                if (j != j2 || Float.compare(this.A00, c26105Bgp.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC31146Dmp
    public final void AQS(Canvas canvas, Paint paint) {
        long j = this.A01;
        long j2 = AbstractC27755CLw.A00;
        canvas.drawCircle(AbstractC25231BEo.A00(j), AbstractC25232BEp.A00(j), this.A00, paint);
    }

    public final int hashCode() {
        long j = this.A01;
        long j2 = AbstractC27755CLw.A00;
        return AbstractC25226BEj.A01(AbstractC25235BEs.A03(j), this.A00);
    }

    public C26105Bgp(long j, float f) {
        this.A01 = j;
        this.A00 = f;
    }
}
