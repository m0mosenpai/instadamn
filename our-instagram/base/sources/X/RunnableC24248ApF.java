package X;

/* renamed from: X.ApF, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24248ApF implements Runnable {
    public final /* synthetic */ AM5 A00;

    public RunnableC24248ApF(AM5 am5) {
        this.A00 = am5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AM5 am5 = this.A00;
        C175927s7 c175927s7 = am5.A09;
        c175927s7.A01("recAR");
        byte[] bArr = new byte[am5.A00];
        while (am5.A0F == C05F.A0C) {
            if (AM5.A00(am5, bArr) == 1) {
                long j = am5.A05;
                if (j > 0) {
                    try {
                        Thread.sleep(j);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        c175927s7.A01("recRECs");
    }
}
