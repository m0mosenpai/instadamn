package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.Bgs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26108Bgs extends C0T6 implements InterfaceC31146Dmp, InterfaceC30790DgR {
    public final int A00;
    public final long A01;
    public final long A02;

    public C26108Bgs(long j, long j2, int i) {
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    @Override // X.InterfaceC31146Dmp
    public final void AQS(Canvas canvas, Paint paint) {
        int i = this.A00;
        long j = this.A02;
        long j2 = AbstractC27755CLw.A00;
        if (i != 0) {
            float A01 = AbstractC25227BEk.A01(j);
            float A00 = AbstractC25232BEp.A00(j);
            long j3 = this.A01;
            canvas.drawLine(A01, A00, AbstractC25227BEk.A01(j3), AbstractC25232BEp.A00(j3), paint);
            return;
        }
        canvas.drawOval(C28369CfV.A01(AbstractC25227BEk.A01(j), AbstractC25232BEp.A00(j), this.A01), paint);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else {
            if (this == obj) {
                return true;
            }
            i = 0;
        }
        if (obj instanceof C26108Bgs) {
            C26108Bgs c26108Bgs = (C26108Bgs) obj;
            if (c26108Bgs.A00 == i) {
                long j = this.A02;
                long j2 = c26108Bgs.A02;
                long j3 = AbstractC27755CLw.A00;
                if (j == j2 && this.A01 == c26108Bgs.A01) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.A02;
        long j2 = AbstractC27755CLw.A00;
        int A03 = AbstractC25227BEk.A03(j);
        long j3 = this.A01;
        return A03 + ((int) (j3 ^ (j3 >>> 32)));
    }
}
