package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.Ao9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24186Ao9 implements InterfaceC61452r8 {
    public C0k4 A00;
    public boolean A01;
    public boolean A02;
    public final String A03;

    public C24186Ao9(String str) {
        C14360o3.A0B(str, 1);
        this.A03 = str;
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
        this.A01 = true;
        this.A02 = z;
        if (z) {
            this.A00 = new C0k4();
        }
    }

    @Override // X.InterfaceC61452r8
    public final void D9y() {
        if (this.A02) {
            this.A01 = false;
        }
        C0k4 c0k4 = this.A00;
        if (c0k4 != null) {
            c0k4.A00();
        }
        this.A00 = null;
    }

    @Override // X.InterfaceC61452r8
    public final String getDestination() {
        return this.A03;
    }
}
