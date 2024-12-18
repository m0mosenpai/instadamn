package X;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

/* renamed from: X.TRm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64730TRm implements Runnable, InterfaceC65468Tkk {
    public C63373Sif A00;
    public final C63222SfT A01;
    public final C64104SzL A02;
    public final ConcurrentLinkedQueue A03;
    public final Semaphore A04 = new Semaphore(1);

    public RunnableC64730TRm(C63373Sif c63373Sif, C63222SfT c63222SfT, C64104SzL c64104SzL, ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.A00 = c63373Sif;
        this.A02 = c64104SzL;
        this.A03 = concurrentLinkedQueue;
        this.A01 = c63222SfT;
    }

    @Override // X.InterfaceC65468Tkk
    public final void CzM(SYG syg) {
        C14360o3.A0B(syg, 0);
        this.A04.release();
        int i = syg.A00;
        C63222SfT c63222SfT = this.A01;
        if (i == 0) {
            c63222SfT.A00.Ci3(null, null, "client_init_iap_store_connection_success");
        } else {
            InterfaceC65615To6 interfaceC65615To6 = c63222SfT.A00;
            LinkedHashMap A03 = AbstractC06930Yk.A03(AbstractC06930Yk.A0E());
            AbstractC63051SbX.A00(syg, A03);
            interfaceC65615To6.Ci3(A03, null, "client_init_iap_store_connection_fail");
        }
        A00(syg);
    }

    private final void A00(SYG syg) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.A03;
        LinkedList A11 = AbstractC58318PtA.A11();
        for (Object poll = concurrentLinkedQueue.poll(); poll != null; poll = concurrentLinkedQueue.poll()) {
            A11.add(poll);
        }
        while (true) {
            SPD spd = (SPD) A11.poll();
            if (spd != null) {
                if (spd instanceof C60516R1x) {
                    spd.A01(syg, new C65075Td4(syg, 43));
                } else {
                    spd.A00();
                }
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC65468Tkk
    public final void CzL() {
        this.A01.A00.Ci3(null, null, "client_init_iap_store_connection_stopped");
        this.A02.EnA(new C63702SsG(this, 1), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.SYG, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        C63373Sif c63373Sif = this.A00;
        if (!c63373Sif.A0F()) {
            Semaphore semaphore = this.A04;
            if (semaphore.tryAcquire()) {
                if (c63373Sif.A0F()) {
                    semaphore.release();
                } else {
                    this.A01.A00.Ci3(null, null, "client_init_iap_store_connection_init");
                    C0K8.A0C("DCP", "Starting in-app billing connection.");
                    c63373Sif.A09(this);
                    return;
                }
            } else {
                return;
            }
        }
        ?? obj = new Object();
        obj.A00 = 0;
        obj.A01 = "";
        A00(obj);
    }
}
