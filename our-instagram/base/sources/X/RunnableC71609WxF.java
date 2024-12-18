package X;

import java.io.File;

/* renamed from: X.WxF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71609WxF implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ VDT A02;
    public final /* synthetic */ C66286U7h A03;
    public final /* synthetic */ File A04;

    public RunnableC71609WxF(VDT vdt, C66286U7h c66286U7h, File file, int i, long j) {
        this.A03 = c66286U7h;
        this.A04 = file;
        this.A02 = vdt;
        this.A00 = i;
        this.A01 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A03.A00.Dk5(this.A02, this.A04, this.A00, this.A01);
    }
}
