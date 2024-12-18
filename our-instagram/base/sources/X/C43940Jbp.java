package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.Jbp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43940Jbp implements InterfaceC61452r8 {
    public C0k4 A00;
    public final C226418s A01;

    public C43940Jbp(C226418s c226418s) {
        C14360o3.A0B(c226418s, 1);
        this.A01 = c226418s;
    }

    @Override // X.InterfaceC61452r8
    public final void AJO(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        C14360o3.A0B(lightweightQuickPerformanceLogger, 0);
        C0k4 c0k4 = this.A00;
        if (c0k4 != null) {
            c0k4.A01(lightweightQuickPerformanceLogger);
        }
    }

    @Override // X.InterfaceC61452r8
    public final void Cxa(boolean z) {
        if (z) {
            this.A00 = new C0k4();
        }
    }

    @Override // X.InterfaceC61452r8
    public final void D9y() {
        C0k4 c0k4 = this.A00;
        if (c0k4 != null) {
            c0k4.A00();
        }
        this.A00 = null;
    }

    @Override // X.InterfaceC61452r8
    public final String getDestination() {
        return "direct_inbox";
    }
}
