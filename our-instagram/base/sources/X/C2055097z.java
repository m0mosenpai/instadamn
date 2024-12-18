package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.97z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2055097z implements InterfaceC61452r8 {
    public static int A0A = 1;
    public static final C226618u A0B = AbstractC226518t.A00("paused");
    public static final C226618u A0C = AbstractC226518t.A00("invalid_state");
    public C0k4 A00;
    public final AnonymousClass980 A01;
    public final AnonymousClass980 A02;
    public final AnonymousClass980 A03;
    public final AnonymousClass980 A04;
    public final AnonymousClass980 A05;
    public final AnonymousClass980 A06;
    public final AnonymousClass980 A07;
    public final C226418s A08;
    public final String A09;

    public C2055097z(C226418s c226418s) {
        C14360o3.A0B(c226418s, 1);
        this.A08 = c226418s;
        this.A05 = new AnonymousClass980(c226418s, this, "on_create_direct_thread_toggle_fragment");
        this.A06 = new AnonymousClass980(c226418s, this, "on_view_created_direct_thread_toggle_fragment");
        this.A01 = new AnonymousClass980(c226418s, this, "inflate_composer");
        this.A07 = new AnonymousClass980(c226418s, this, "thread_loaded");
        this.A02 = new AnonymousClass980(c226418s, this, "initial_resnapshot");
        this.A03 = new AnonymousClass980(c226418s, this, "initialize_controllers");
        this.A04 = new AnonymousClass980(c226418s, this, "initialize_push_activity");
        this.A09 = "direct_thread";
    }

    public final void A01(C226618u c226618u) {
        C14360o3.A0B(c226618u, 0);
        this.A08.A0M(A00(this), c226618u, null);
    }

    @Override // X.InterfaceC61452r8
    public final void AJO(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        C14360o3.A0B(lightweightQuickPerformanceLogger, 0);
        C0k4 c0k4 = this.A00;
        if (c0k4 != null) {
            c0k4.A01(lightweightQuickPerformanceLogger);
        }
    }

    public static final LightweightQuickPerformanceLogger A00(C2055097z c2055097z) {
        C0k4 c0k4 = c2055097z.A00;
        if (c0k4 == null) {
            return C1IN.A00(C226218q.A01(AbstractC12960li.A00).A0D());
        }
        return c0k4;
    }

    public final void A02(String str, boolean z) {
        InterfaceC61452r8 interfaceC61452r8;
        C226418s c226418s = this.A08;
        LightweightQuickPerformanceLogger A00 = A00(this);
        C14360o3.A0B(A00, 3);
        C1KX c1kx = c226418s.A05;
        if (c1kx == null || (interfaceC61452r8 = c1kx.A02) == null || interfaceC61452r8 == this) {
            A00.markerAnnotate(15335435, str, z);
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
        return this.A09;
    }
}
