package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* loaded from: classes10.dex */
public final class TFU implements InterfaceC65453TkP {
    public InterfaceC65453TkP A00;
    public final LightweightQuickPerformanceLogger A01;

    @Override // X.InterfaceC65453TkP
    public final InterfaceC65528Tlx Enq(C1QW c1qw, C1QY c1qy, InterfaceC65592TnX interfaceC65592TnX, C18240vB c18240vB) {
        InterfaceC65453TkP interfaceC65453TkP = this.A00;
        TFZ tfz = new TFZ(this.A01, c1qw, c1qy, interfaceC65453TkP, interfaceC65592TnX, c18240vB);
        tfz.A02 = interfaceC65453TkP.Enq(c1qw, c1qy, tfz, c18240vB);
        return tfz;
    }

    public TFU(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, InterfaceC65453TkP interfaceC65453TkP) {
        this.A00 = interfaceC65453TkP;
        this.A01 = lightweightQuickPerformanceLogger;
    }
}
