package X;

import android.os.Handler;

/* renamed from: X.GQy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36981GQy implements Runnable {
    public long A00;
    public long A01;
    public Integer A02;
    public final Handler A03;
    public final InterfaceC37120GXf A04;
    public final InterfaceC37292Gbt A05;

    public RunnableC36981GQy(Handler handler, InterfaceC37120GXf interfaceC37120GXf, InterfaceC37292Gbt interfaceC37292Gbt, Integer num) {
        C14360o3.A0B(handler, 1);
        this.A03 = handler;
        this.A04 = interfaceC37120GXf;
        this.A05 = interfaceC37292Gbt;
        this.A02 = num;
        this.A01 = -1L;
        this.A00 = 3600L;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A02 == C05F.A0C) {
            InterfaceC37292Gbt interfaceC37292Gbt = this.A05;
            interfaceC37292Gbt.ENk();
            this.A02 = C05F.A0N;
            this.A04.Dko(interfaceC37292Gbt);
        }
    }
}
