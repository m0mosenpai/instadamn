package X;

import android.os.Handler;

/* renamed from: X.Att, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24536Att implements Runnable {
    public byte[] A00;
    public final /* synthetic */ AM5 A01;

    public RunnableC24536Att(AM5 am5) {
        this.A01 = am5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AM5 am5 = this.A01;
        C175927s7 c175927s7 = am5.A09;
        c175927s7.A01("recARa");
        byte[] bArr = this.A00;
        if (bArr == null) {
            bArr = new byte[am5.A00];
            this.A00 = bArr;
        }
        int A00 = AM5.A00(am5, bArr);
        Handler handler = am5.A06;
        handler.removeCallbacks(this);
        if (A00 != 0) {
            if (A00 != 1 && A00 != 2) {
                c175927s7.A01("recRECs");
                this.A00 = null;
                return;
            } else {
                long j = am5.A05;
                if (j > 0) {
                    handler.postDelayed(this, j);
                    return;
                }
            }
        }
        handler.post(this);
    }
}
