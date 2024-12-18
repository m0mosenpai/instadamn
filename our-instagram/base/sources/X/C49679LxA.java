package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.LxA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49679LxA implements InterfaceC61452r8 {
    public static final C47120KsF A02 = new Object();
    public C0k4 A00;
    public final String A01;

    @Override // X.InterfaceC61452r8
    public final void AJO(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        C14360o3.A0B(lightweightQuickPerformanceLogger, 0);
        C0k4 c0k4 = this.A00;
        if (c0k4 != null) {
            c0k4.A01(lightweightQuickPerformanceLogger);
        }
    }

    @Override // X.InterfaceC61452r8
    public final void D9y() {
        this.A00 = null;
    }

    @Override // X.InterfaceC61452r8
    public final void Cxa(boolean z) {
        this.A00 = new C0k4();
    }

    @Override // X.InterfaceC61452r8
    public final String getDestination() {
        return this.A01;
    }

    public C49679LxA(String str) {
        this.A01 = str;
    }
}
