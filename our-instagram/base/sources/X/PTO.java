package X;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes9.dex */
public final class PTO implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC57909PmE A01;
    public final /* synthetic */ CountDownLatch A02;
    public final /* synthetic */ C15370ps A03;

    public PTO(Context context, InterfaceC57909PmE interfaceC57909PmE, CountDownLatch countDownLatch, C15370ps c15370ps) {
        this.A03 = c15370ps;
        this.A00 = context;
        this.A01 = interfaceC57909PmE;
        this.A02 = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A03.A00 = InterfaceC58261Ps5.A00.ALE(this.A00, this.A01);
        this.A02.countDown();
    }
}
