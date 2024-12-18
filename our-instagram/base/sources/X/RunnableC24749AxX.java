package X;

import java.io.File;

/* renamed from: X.AxX, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24749AxX implements Runnable {
    public final /* synthetic */ C1MF A00;
    public final /* synthetic */ C1MS A01;
    public final /* synthetic */ File A02;

    public RunnableC24749AxX(C1MF c1mf, C1MS c1ms, File file) {
        this.A00 = c1mf;
        this.A01 = c1ms;
        this.A02 = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1MF c1mf = this.A00;
        if ((c1mf instanceof C25471Mb) && ((C25471Mb) c1mf).A00) {
            C1MS c1ms = this.A01;
            File file = this.A02;
            synchronized (c1mf) {
                C14360o3.A0A(file);
                c1ms.A03(c1mf, file);
            }
        }
    }
}
