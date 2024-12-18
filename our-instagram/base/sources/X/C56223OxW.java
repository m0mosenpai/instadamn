package X;

import android.os.Handler;
import android.view.Surface;

/* renamed from: X.OxW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56223OxW implements InterfaceC185668Ll {
    public final /* synthetic */ P0A A00;

    @Override // X.InterfaceC185668Ll
    public final void Dr3(int i, int i2) {
    }

    public C56223OxW(P0A p0a) {
        this.A00 = p0a;
    }

    @Override // X.InterfaceC185668Ll
    public final void Dr6(Surface surface, int i, int i2) {
        P0A p0a = this.A00;
        p0a.A0Q = true;
        p0a.A0R = false;
    }

    @Override // X.InterfaceC185668Ll
    public final void DrA() {
        P0A p0a = this.A00;
        p0a.A0Q = false;
        p0a.A0R = false;
        Handler handler = p0a.A0F.A02;
        Runnable runnable = p0a.A0J;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
    }
}
