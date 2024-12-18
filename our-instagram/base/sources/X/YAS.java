package X;

import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes12.dex */
public final class YAS implements XGn {
    public final XGn A00;
    public final ExecutorService A01;

    @Override // X.XE6
    public final void D6h(W63 w63) {
        C14360o3.A0B(w63, 0);
        this.A01.execute(new YHI(w63, this));
    }

    @Override // X.XGn
    public final void DFo(Exception exc, String str, String str2, Map map, int i, long j, boolean z) {
        C14360o3.A0B(str, 1);
        this.A01.execute(new RunnableC73548YIu(this, exc, str, str2, map, i, j, z));
    }

    @Override // X.XE6
    public final void DFz(VIA via) {
        C14360o3.A0B(via, 0);
        this.A01.execute(new YHJ(via, this));
    }

    @Override // X.XGn
    public final void D16(long j) {
        this.A01.execute(new YHH(this, j));
    }

    @Override // X.XE6
    public final void D1z() {
        this.A01.execute(new YGQ(this));
    }

    @Override // X.XGn
    public final void DHA(String str, Map map) {
        this.A01.execute(new YID(this, str, map));
    }

    @Override // X.XGn
    public final void DHE(String str, Map map, boolean z) {
        this.A01.execute(new RunnableC73530YIa(this, str, map, z));
    }

    @Override // X.XE6
    public final void Dbk(float f) {
        this.A01.execute(new YHK(this, f));
    }

    @Override // X.XGn
    public final void DkZ(long j, boolean z) {
        this.A01.execute(new YIE(this, j, z));
    }

    @Override // X.XGn
    public final void Dkd(String str, Map map) {
        this.A01.execute(new YIF(this, str, map));
    }

    @Override // X.XGn
    public final void DvI(C69684VtU c69684VtU) {
        this.A01.execute(new YHL(c69684VtU, this));
    }

    @Override // X.XE6
    public final void onStart() {
        this.A01.execute(new YGR(this));
    }

    public YAS(XGn xGn, ExecutorService executorService) {
        this.A00 = xGn;
        this.A01 = executorService;
    }
}
