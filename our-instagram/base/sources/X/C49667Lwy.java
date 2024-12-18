package X;

/* renamed from: X.Lwy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49667Lwy implements InterfaceC147206jw {
    public final /* synthetic */ ViewOnTouchListenerC48077LQc A00;

    @Override // X.InterfaceC147206jw
    public final void DZe() {
    }

    public C49667Lwy(ViewOnTouchListenerC48077LQc viewOnTouchListenerC48077LQc) {
        this.A00 = viewOnTouchListenerC48077LQc;
    }

    @Override // X.InterfaceC147206jw
    public final void DZf() {
        ViewOnTouchListenerC48077LQc viewOnTouchListenerC48077LQc = this.A00;
        InterfaceC103384lE A0B = viewOnTouchListenerC48077LQc.A04.A0B(46);
        if (A0B != null) {
            C6FP.A03(viewOnTouchListenerC48077LQc.A02, viewOnTouchListenerC48077LQc.A03, C6FW.A01, A0B);
        }
    }

    @Override // X.InterfaceC147206jw
    public final void onClick() {
        ViewOnTouchListenerC48077LQc viewOnTouchListenerC48077LQc = this.A00;
        InterfaceC103384lE A0A = viewOnTouchListenerC48077LQc.A04.A0A();
        if (A0A != null) {
            C6FP.A03(viewOnTouchListenerC48077LQc.A02, viewOnTouchListenerC48077LQc.A03, C6FW.A01, A0A);
        }
    }
}
