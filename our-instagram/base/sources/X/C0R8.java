package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.0R8, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0R8 implements InterfaceC05710Rv {
    public C05730Rz A00;
    public final C0Rw A01;

    public final C0Rw A05(Class cls) {
        C0Rw c0Rw = this.A01;
        if (!cls.isInstance(c0Rw)) {
            return null;
        }
        return c0Rw;
    }

    public final LightweightQuickPerformanceLogger A06() {
        C05730Rz c05730Rz = this.A00;
        if (c05730Rz == null) {
            return null;
        }
        return (LightweightQuickPerformanceLogger) c05730Rz.A00.get();
    }

    public final C0f6 A07() {
        C05730Rz c05730Rz = this.A00;
        if (c05730Rz == null) {
            return null;
        }
        return (C0f6) c05730Rz.A01.get();
    }

    public C0R8(C0Rw c0Rw) {
        this.A01 = c0Rw;
    }

    public final void A08() {
        if (A06() != null) {
            A06().markerAnnotate(157825012, AnonymousClass001.A0R(getName(), "_enabled"), true);
        }
    }

    public final void A09(String str) {
        if (A06() != null) {
            A06().markerAnnotate(157825012, AnonymousClass001.A0R(getName(), "_disabled"), str);
        }
    }

    public final void A0A(String str) {
        C0f5 AEp;
        if (A07() != null) {
            C0f6 A07 = A07();
            String name = getName();
            A07.AEp(name, 817901561);
            if (A07() == null) {
                AEp = null;
            } else {
                AEp = A07().AEp(name, 817901561);
            }
            AEp.ABW(DialogModule.KEY_MESSAGE, str);
            AEp.report();
        }
    }

    public final void A0B(String str) {
        if (A06() != null) {
            A06().markerAnnotate(157825012, AnonymousClass001.A0g(getName(), "_enabled_", str), true);
            A08();
        }
    }

    public final void A0C(Throwable th) {
        th.getMessage();
        if (A07() != null) {
            C0f5 AEq = A07().AEq(true, getName(), 817901561);
            AEq.ERI(th);
            AEq.report();
        }
    }
}
