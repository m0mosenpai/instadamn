package X;

/* renamed from: X.PLs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56873PLs implements Runnable {
    public final /* synthetic */ OyC A00;

    public RunnableC56873PLs(OyC oyC) {
        this.A00 = oyC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OyC oyC = this.A00;
        if (oyC.A0F) {
            NHM nhm = oyC.A0C;
            if (nhm.A01) {
                C2UY.A01.A05(10L);
            } else {
                Object obj = oyC.A0D.A00.first;
                C14360o3.A07(obj);
                if ((obj == EnumC1810181d.A11 || obj == EnumC1810181d.A0y) && nhm.A06(oyC.A00)) {
                    nhm.A04(null, false, true, oyC.A00);
                }
            }
            oyC.A0A.removeCallbacks(this);
        }
    }
}
