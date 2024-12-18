package X;

import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window;

/* renamed from: X.Svv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63920Svv implements InterfaceC100084eW, C0Hd {
    @Override // X.InterfaceC100084eW
    public final void AGj(SN2 sn2, StackTraceElement[] stackTraceElementArr) {
    }

    @Override // X.InterfaceC100084eW
    public final String getName() {
        return "touch";
    }

    @Override // X.InterfaceC100084eW
    public final void update() {
    }

    @Override // X.C0Hd
    public final void DOE(KeyEvent keyEvent, Window window) {
        C88023wA c88023wA = C88023wA.A0F;
        if (c88023wA != null) {
            c88023wA.A00++;
            c88023wA.A03 = Math.max(c88023wA.A03, SystemClock.uptimeMillis() - keyEvent.getEventTime());
        }
    }

    @Override // X.C0Hd
    public final void Du9(MotionEvent motionEvent, Window window) {
        C88023wA c88023wA = C88023wA.A0F;
        if (c88023wA != null) {
            c88023wA.A02++;
            c88023wA.A04 = Math.max(c88023wA.A04, SystemClock.uptimeMillis() - motionEvent.getEventTime());
        }
    }

    public C63920Svv() {
        C03490Hc c03490Hc = C03490Hc.A03;
        if (c03490Hc.A02) {
            c03490Hc.A00 = this;
        }
    }
}
