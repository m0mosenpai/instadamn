package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: X.Bgr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26107Bgr extends C0T6 implements InterfaceC31146Dmp {
    public final float A00;
    public final float A01;
    public final float A02;
    public final long A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26107Bgr) {
                C26107Bgr c26107Bgr = (C26107Bgr) obj;
                long j = this.A03;
                long j2 = c26107Bgr.A03;
                long j3 = AbstractC27755CLw.A00;
                if (j != j2 || Float.compare(this.A01, c26107Bgr.A01) != 0 || Float.compare(this.A02, c26107Bgr.A02) != 0 || Float.compare(this.A00, c26107Bgr.A00) != 0 || this.A04 != c26107Bgr.A04) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC31146Dmp
    public final void AQS(Canvas canvas, Paint paint) {
        long j = this.A03;
        float f = this.A01;
        C09530e4 A00 = CCQ.A00(this.A02, this.A00, this.A04);
        float A09 = AbstractC166987dD.A09(A00.A00);
        float A092 = AbstractC166987dD.A09(A00.A01);
        long j2 = AbstractC27755CLw.A00;
        float A002 = AbstractC25231BEo.A00(j);
        float A003 = AbstractC25232BEp.A00(j);
        canvas.drawArc(new RectF(A002 - f, A003 - f, A002 + f, A003 + f), A09, A092, false, paint);
    }

    public final int hashCode() {
        long j = this.A03;
        long j2 = AbstractC27755CLw.A00;
        return AbstractC166987dD.A0K(this.A04, AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC25235BEs.A03(j), this.A01), this.A02), this.A00));
    }

    public C26107Bgr(float f, float f2, float f3, long j, boolean z) {
        this.A03 = j;
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A04 = z;
    }
}
