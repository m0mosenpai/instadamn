package X;

import androidx.lifecycle.OnLifecycleEvent;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class THY implements Closeable, C07W, InterfaceC65678Tr8 {
    public static final C62442SBv A05 = new C62442SBv("MobileVisionBase", "");
    public final SKc A00;
    public final C5KS A01;
    public final RW7 A02;
    public final Executor A03;
    public final AtomicBoolean A04 = AbstractC166997dE.A17();

    @Override // java.io.Closeable, java.lang.AutoCloseable, X.InterfaceC65678Tr8
    @OnLifecycleEvent(C07R.ON_DESTROY)
    public synchronized void close() {
        if (!this.A04.getAndSet(true)) {
            this.A00.A00();
            final RW7 rw7 = this.A02;
            Executor executor = this.A03;
            if (((AbstractC62683SLw) rw7).A02.get() > 0) {
                final C58411Pup c58411Pup = new C58411Pup();
                ((AbstractC62683SLw) rw7).A00.A02(new Runnable() { // from class: X.TOt
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC62683SLw abstractC62683SLw = rw7;
                        C58411Pup c58411Pup2 = c58411Pup;
                        int decrementAndGet = abstractC62683SLw.A02.decrementAndGet();
                        if (decrementAndGet >= 0) {
                            if (decrementAndGet == 0) {
                                RW7 rw72 = (RW7) abstractC62683SLw;
                                synchronized (rw72) {
                                    RW7.A04 = true;
                                    rw72.A00.FFz();
                                }
                                abstractC62683SLw.A01.set(false);
                            }
                            THI.A00.clear();
                            S7I.A00.clear();
                            c58411Pup2.A01(null);
                            return;
                        }
                        throw AbstractC58318PtA.A0Z();
                    }
                }, executor);
            } else {
                throw AbstractC58318PtA.A0Z();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.SIT, java.lang.Object] */
    public THY(C63281Sgg c63281Sgg, RW7 rw7, C63010SaY c63010SaY, Executor executor) {
        EnumC61231Ris enumC61231Ris;
        this.A02 = rw7;
        SKc sKc = new SKc();
        this.A00 = sKc;
        this.A03 = executor;
        ((AbstractC62683SLw) rw7).A02.incrementAndGet();
        C5KS A01 = rw7.A01(sKc.A00, CallableC64788TUc.A00, executor);
        A01.A0B(T75.A00, AbstractC58437PvG.A00);
        this.A01 = A01;
        ?? obj = new Object();
        if (c63010SaY.A01()) {
            enumC61231Ris = EnumC61231Ris.TYPE_THICK;
        } else {
            enumC61231Ris = EnumC61231Ris.TYPE_THIN;
        }
        obj.A01 = enumC61231Ris;
        obj.A03 = new SGW(null, null, new SNP(EnumC61230Rir.LATIN));
        SGX sgx = new SGX(obj, 1);
        Rj8.A01.execute(new RunnableC64705TQm(EnumC72440Xdk.A04, c63281Sgg, sgx, C63281Sgg.A01(c63281Sgg)));
    }
}
