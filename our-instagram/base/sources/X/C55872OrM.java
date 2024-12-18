package X;

import android.view.Surface;

/* renamed from: X.OrM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55872OrM implements BDp {
    public final /* synthetic */ C54845OMq A00;
    public final /* synthetic */ C1813982r A01;

    @Override // X.BDp
    public final void Dre() {
    }

    public C55872OrM(C54845OMq c54845OMq, C1813982r c1813982r) {
        this.A01 = c1813982r;
        this.A00 = c54845OMq;
    }

    @Override // X.BDp
    public final int BI0() {
        return this.A00.A04;
    }

    @Override // X.BDp
    public final int BIB() {
        return this.A00.A05;
    }

    @Override // X.BDp
    public final void D73() {
        if (AbstractC23021Ah.A00(this.A01.A0L).A1r()) {
            AbstractC195978lm.A02.A01(C1813982r.A0Z, "onStartInputComponent");
            this.A00.A0B.connect();
        }
    }

    @Override // X.BDp
    public final void DM2(Surface surface) {
        String str = C1813982r.A0Z;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MediaStreamStateListener:onInit - mCameraController: ");
        AbstractC195978lm.A02.A01(str, AbstractC166997dE.A0v(this.A01.A02, A1C));
        C54845OMq c54845OMq = this.A00;
        c54845OMq.A01();
        c54845OMq.A06(C1813982r.__redex_internal_original_name);
        c54845OMq.A06(C52154N6e.__redex_internal_original_name);
        c54845OMq.A06("sup:IgLiveCaptureFragment_DISCONNECT_ON_STREAM_ENDED");
        c54845OMq.A03(surface);
        c54845OMq.A04(new N1N(this, 1), C1813982r.__redex_internal_original_name);
    }

    @Override // X.BDp
    public final void DeW() {
        AbstractC195978lm.A02.A01(C1813982r.A0Z, "onRelease");
        this.A00.A0B.release();
    }

    @Override // X.BDp
    public final void Drd() {
        AbstractC195978lm.A02.A01(C1813982r.A0Z, "onSwitchToCamera");
        C54845OMq c54845OMq = this.A00;
        c54845OMq.A0B.stop(false);
        c54845OMq.A01 = 0;
        c54845OMq.A03 = 0;
        c54845OMq.A02 = 0;
    }

    @Override // X.BDp
    public final void EbR(Surface surface) {
        this.A00.A03(surface);
    }
}
