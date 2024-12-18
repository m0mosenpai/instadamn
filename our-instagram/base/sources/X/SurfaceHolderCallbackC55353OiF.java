package X;

import android.view.Surface;
import android.view.SurfaceHolder;

/* renamed from: X.OiF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class SurfaceHolderCallbackC55353OiF implements SurfaceHolder.Callback {
    public final InterfaceC58085PpA A00;
    public final /* synthetic */ OB4 A01;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C14360o3.A0B(surfaceHolder, 0);
        InterfaceC58085PpA interfaceC58085PpA = this.A00;
        Surface surface = surfaceHolder.getSurface();
        C14360o3.A07(surface);
        interfaceC58085PpA.EpW(surface, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C14360o3.A0B(surfaceHolder, 0);
        C14360o3.A07(surfaceHolder.getSurface());
    }

    public SurfaceHolderCallbackC55353OiF(InterfaceC58085PpA interfaceC58085PpA, OB4 ob4) {
        this.A01 = ob4;
        this.A00 = interfaceC58085PpA;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.A00.EpY();
    }
}
