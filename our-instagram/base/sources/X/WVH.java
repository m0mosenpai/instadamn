package X;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes11.dex */
public final class WVH implements XE6 {
    public final /* synthetic */ WVG A00;

    @Override // X.XE6
    public final void D6h(W63 w63) {
        C14360o3.A0B(w63, 0);
        Map map = this.A00.A01;
        WVF wvf = (WVF) map.get(this);
        if (wvf != null) {
            wvf.A01 = w63;
            wvf.A00 = null;
            wvf.A02 = true;
            synchronized (wvf) {
                wvf.notify();
            }
            map.remove(this);
        }
    }

    @Override // X.XE6
    public final void DFz(VIA via) {
        C14360o3.A0B(via, 0);
        WVG.A00(this, this.A00, via);
    }

    @Override // X.XE6
    public final void Dbk(float f) {
    }

    @Override // X.XE6
    public final void onStart() {
    }

    public WVH(WVG wvg) {
        this.A00 = wvg;
    }

    @Override // X.XE6
    public final void D1z() {
        WVG wvg = this.A00;
        WVF wvf = (WVF) wvg.A01.get(this);
        if (wvf != null) {
            WVG.A00(this, wvg, new VIA(null, "Cancellation", Collections.emptyMap(), 0, wvf.A03.A00, true));
        }
    }
}
