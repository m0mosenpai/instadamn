package X;

import com.facebook.R;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;

/* loaded from: classes5.dex */
public final class D11 implements Runnable {
    public final /* synthetic */ CUH A00;

    public D11(CUH cuh) {
        this.A00 = cuh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CUH cuh = this.A00;
        CS2 cs2 = cuh.A04;
        WeakReference weakReference = cs2.A03;
        Object obj = weakReference.get();
        if (obj != null) {
            InterfaceC103384lE interfaceC103384lE = cs2.A01;
            C6FX A0s = AbstractC25225BEi.A0s();
            A0s.A01(cs2.A02);
            A0s.A02(obj);
            C131845xK.A00(cs2.A00, A0s.A00(), interfaceC103384lE);
        }
        if (cuh.A06) {
            if (!cuh.A00 && !cuh.A01) {
                cuh.A03.postDelayed(this, cuh.A02);
                return;
            }
            return;
        }
        C6FG c6fg = (C6FG) weakReference.get();
        if (c6fg == null) {
            return;
        }
        ((AbstractMap) c6fg.A00(R.id.bk_context_key_timers)).remove(cs2.A02);
    }
}
