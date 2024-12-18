package X;

/* renamed from: X.TOb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64645TOb implements Runnable {
    public final /* synthetic */ C60683RMb A00;
    public final /* synthetic */ InterfaceC65258Tgo A01;

    public RunnableC64645TOb(C60683RMb c60683RMb, InterfaceC65258Tgo interfaceC65258Tgo) {
        this.A00 = c60683RMb;
        this.A01 = interfaceC65258Tgo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        C60692RMk c60692RMk = this.A00.A00;
        InterfaceC65258Tgo interfaceC65258Tgo = this.A01;
        long j2 = c60692RMk.A00;
        SX6.A00();
        c60692RMk.A0I();
        C60688RMg c60688RMg = ((AbstractC63371Sic) c60692RMk).A00.A0D;
        C63335Shm.A02(c60688RMg);
        long A0K = c60688RMg.A0K();
        if (A0K != 0) {
            j = Math.abs(AbstractC37300Gc1.A00(A0K));
        } else {
            j = -1;
        }
        c60692RMk.A0E("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(j));
        C60692RMk.A03(c60692RMk);
        try {
            C60692RMk.A04(c60692RMk);
            C63335Shm.A02(c60688RMg);
            c60688RMg.A0L();
            c60692RMk.A0K();
            if (interfaceC65258Tgo != null) {
                T66 t66 = (T66) interfaceC65258Tgo;
                t66.A00.A01.post(t66.A01);
            }
            if (c60692RMk.A00 != j2) {
                C63335Shm.A03(c60692RMk);
            }
        } catch (Exception e) {
            c60692RMk.A0G("Local dispatch failed", e);
            C63335Shm.A02(c60688RMg);
            c60688RMg.A0L();
            c60692RMk.A0K();
            if (interfaceC65258Tgo != null) {
                T66 t662 = (T66) interfaceC65258Tgo;
                t662.A00.A01.post(t662.A01);
            }
        }
    }
}
