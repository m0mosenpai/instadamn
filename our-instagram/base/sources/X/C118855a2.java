package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.5a2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C118855a2 extends C58J implements InterfaceC113445Ag {
    public InterfaceC16820sZ A00;
    public boolean A01;

    @Override // X.InterfaceC113445Ag
    public final void AQV(InterfaceC1129057z interfaceC1129057z) {
        C14360o3.A0B(interfaceC1129057z, 0);
        if (!this.A01) {
            this.A01 = true;
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                new Handler(myLooper).postAtFrontOfQueue(new Runnable() { // from class: X.5b1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C118855a2.this.A00.invoke();
                    }
                });
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        interfaceC1129057z.AQf();
    }

    @Override // X.InterfaceC113445Ag
    public final /* synthetic */ void DRD() {
    }
}
