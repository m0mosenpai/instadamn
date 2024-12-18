package X;

import android.hardware.display.DisplayManager;

/* renamed from: X.4Tz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96164Tz implements DisplayManager.DisplayListener {
    public final DisplayManager A00;
    public final /* synthetic */ C96154Ty A01;

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    public C96164Tz(DisplayManager displayManager, C96154Ty c96154Ty) {
        this.A01 = c96154Ty;
        this.A00 = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            C96154Ty.A00(this.A01);
        }
    }
}
