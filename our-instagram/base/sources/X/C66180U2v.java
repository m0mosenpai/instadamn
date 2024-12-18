package X;

import android.view.ViewGroup;

/* renamed from: X.U2v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66180U2v implements InterfaceC59892oW {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ ViewOnTouchListenerC60632pm A01;
    public final /* synthetic */ InterfaceC65252xN A02;
    public final /* synthetic */ C65867TvU A03;
    public final /* synthetic */ C3FQ A04;
    public final /* synthetic */ C15100pQ A05;

    public C66180U2v(ViewGroup viewGroup, ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, InterfaceC65252xN interfaceC65252xN, C65867TvU c65867TvU, C3FQ c3fq, C15100pQ c15100pQ) {
        this.A03 = c65867TvU;
        this.A02 = interfaceC65252xN;
        this.A01 = viewOnTouchListenerC60632pm;
        this.A04 = c3fq;
        this.A00 = viewGroup;
        this.A05 = c15100pQ;
    }

    @Override // X.InterfaceC59892oW
    public final void Dnp(int i, int i2) {
        C65867TvU c65867TvU = this.A03;
        if (c65867TvU.A0c) {
            c65867TvU.A01 = i;
            this.A02.EVk(i);
        } else {
            ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A01;
            C3FQ c3fq = this.A04;
            c65867TvU.A01 = AbstractC38152GqJ.A00(this.A00, viewOnTouchListenerC60632pm, this.A02, c3fq, i + this.A05.A00);
        }
    }
}
