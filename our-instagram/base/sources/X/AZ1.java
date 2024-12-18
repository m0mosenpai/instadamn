package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: classes4.dex */
public final class AZ1 implements InterfaceC178367wA {
    public final /* synthetic */ InterfaceC09390do A00;
    public final /* synthetic */ InterfaceC09390do A01;

    public AZ1(InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2) {
        this.A01 = interfaceC09390do;
        this.A00 = interfaceC09390do2;
    }

    @Override // X.InterfaceC178367wA
    public final QuickPerformanceLogger BjH() {
        return (QuickPerformanceLogger) AbstractC166987dD.A17(this.A01);
    }

    @Override // X.InterfaceC178367wA
    public final InterfaceC02550Ad CC6() {
        return (InterfaceC02550Ad) this.A00.getValue();
    }
}
