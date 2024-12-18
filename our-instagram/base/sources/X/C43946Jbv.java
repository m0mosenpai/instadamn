package X;

/* renamed from: X.Jbv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43946Jbv implements InterfaceC50423MOd {
    public final /* synthetic */ JR2 A00;

    public C43946Jbv(JR2 jr2) {
        this.A00 = jr2;
    }

    @Override // X.InterfaceC50423MOd
    public final void Dsq(boolean z, boolean z2, boolean z3) {
        JR2 jr2 = this.A00;
        AbstractC59962oe abstractC59962oe = jr2.A1L;
        if (!abstractC59962oe.isResumed()) {
            C0w9.A01.EmN("DirectInboxPresenter", "Request should be canceled in onPause()");
            return;
        }
        AbstractC43594JPz.A1I(jr2);
        if (z) {
            C43782JXv c43782JXv = (C43782JXv) jr2.A1u.getValue();
            c43782JXv.A01.markerPoint(20125924, AnonymousClass001.A0c("inbox_fetch_", "_end", c43782JXv.A00));
            if (jr2.A0g == EnumC44049Jda.A07) {
                ((KWM) jr2.A2g.getValue()).A01.A05();
            }
            if (z2) {
                AbstractC43913JbO.A00(jr2.A0p()).A01();
            } else {
                C62112sC c62112sC = (C62112sC) jr2.A2o.getValue();
                if (c62112sC != null) {
                    c62112sC.A02();
                }
            }
        } else {
            if (jr2.A0g == EnumC44049Jda.A07) {
                ((KWM) jr2.A2g.getValue()).A01.A01();
            }
            ((C43782JXv) jr2.A1u.getValue()).A05("FETCH_THREADS_FAILED");
            C62112sC c62112sC2 = (C62112sC) jr2.A2o.getValue();
            if (c62112sC2 != null) {
                c62112sC2.A00();
            }
            AbstractC46744Km1.A00(jr2.A0p(), abstractC59962oe.requireContext(), !z3);
            jr2.A06 = 0L;
            jr2.A05 = 0L;
        }
        jr2.A17(null);
    }
}
