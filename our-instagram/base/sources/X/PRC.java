package X;

/* loaded from: classes9.dex */
public final class PRC implements Runnable {
    public final /* synthetic */ C55815OqQ A00;
    public final /* synthetic */ Throwable A01;

    public PRC(C55815OqQ c55815OqQ, Throwable th) {
        this.A00 = c55815OqQ;
        this.A01 = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        C55673Ony c55673Ony;
        C55815OqQ c55815OqQ = this.A00;
        C53M A00 = C55815OqQ.A00(c55815OqQ);
        if (A00 != null) {
            A00.CmM();
        }
        C53M A002 = C55815OqQ.A00(c55815OqQ);
        if (A002 != null && A002.isValid()) {
            if (c55815OqQ.A08) {
                AnonymousClass501 anonymousClass501 = c55815OqQ.A07;
                if (anonymousClass501 instanceof AnonymousClass500) {
                    C55684Oo9 A003 = AbstractC54111Nw9.A00();
                    A003.A00(((AnonymousClass500) anonymousClass501).A00);
                    c55673Ony = A003;
                } else if (anonymousClass501 instanceof C50617MWe) {
                    C55673Ony c55673Ony2 = new C55673Ony();
                    c55673Ony2.A01.A01("use_defer");
                    boolean z = true;
                    String str = ((C50617MWe) anonymousClass501).A00;
                    c55673Ony2.A00.A04(AbstractC58410Puo.A01(43, 8, 117), str);
                    if (str == null) {
                        z = false;
                    }
                    c55673Ony2.A02 = z;
                    c55673Ony = c55673Ony2;
                } else {
                    throw B4Z.A00();
                }
                C1Dk A004 = c55673Ony.A00();
                A004.setFreshCacheAgeMs(1036800000L);
                A004.setNetworkTimeoutSeconds(0);
                C55661Onm.A00(new MV7(c55815OqQ, 13), A004, AbstractC40691uc.A01(c55815OqQ.A04), c55815OqQ, 10);
                return;
            }
            Throwable th = this.A01;
            C53M A005 = C55815OqQ.A00(c55815OqQ);
            if (A005 != null) {
                A005.EWZ(false);
            }
            C53M A006 = C55815OqQ.A00(c55815OqQ);
            if (A006 == null) {
                return;
            }
            A006.DGu(false, true, th.getMessage());
        }
    }
}
