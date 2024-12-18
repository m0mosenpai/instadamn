package X;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* renamed from: X.U7h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66286U7h implements XET {
    public final XET A00;
    public final ExecutorService A01;

    @Override // X.XET
    public final void D21(C70129W5q c70129W5q) {
        C14360o3.A0B(c70129W5q, 0);
        this.A01.execute(new RunnableC71444Wu6(c70129W5q, this));
    }

    @Override // X.XET
    public final void Dk5(VDT vdt, File file, int i, long j) {
        C14360o3.A0B(file, 0);
        this.A01.execute(new RunnableC71609WxF(vdt, this, file, i, j));
    }

    @Override // X.XET
    public final void Dk3(VDT vdt, float f) {
        this.A01.execute(new RunnableC66285U7f(vdt, this, f));
    }

    @Override // X.XET
    public final void Dk7(C55176Odf c55176Odf, VDT vdt, int i) {
        this.A01.execute(new RunnableC71599Wwv(c55176Odf, vdt, this, i));
    }

    @Override // X.XET
    public final void onStart() {
        this.A01.execute(new RunnableC71271Wr0(this));
    }

    @Override // X.XET
    public final void onSuccess() {
        this.A01.execute(new RunnableC71272Wr1(this));
    }

    public C66286U7h(XET xet, ExecutorService executorService) {
        this.A00 = xet;
        this.A01 = executorService;
    }

    @Override // X.XET
    public final void DEe(C105764pn c105764pn, C70129W5q c70129W5q) {
        AbstractC167017dG.A1N(c105764pn, c70129W5q);
        this.A01.execute(new RunnableC71550Wvz(c105764pn, c70129W5q, this));
    }
}
