package X;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.4U4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4U4 implements C4U5, DisplayManager.DisplayListener {
    public InterfaceC71909X9t A00;
    public final DisplayManager A01;

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    @Override // X.C4U5
    public final void ED0(InterfaceC71909X9t interfaceC71909X9t) {
        this.A00 = interfaceC71909X9t;
        DisplayManager displayManager = this.A01;
        Looper myLooper = Looper.myLooper();
        C4B8.A01(myLooper);
        displayManager.registerDisplayListener(this, new Handler(myLooper, null));
        interfaceC71909X9t.D9W(displayManager.getDisplay(0));
    }

    @Override // X.C4U5
    public final void F9T() {
        this.A01.unregisterDisplayListener(this);
        this.A00 = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        InterfaceC71909X9t interfaceC71909X9t = this.A00;
        if (interfaceC71909X9t != null && i == 0) {
            interfaceC71909X9t.D9W(this.A01.getDisplay(0));
        }
    }

    public C4U4(DisplayManager displayManager) {
        this.A01 = displayManager;
    }
}
