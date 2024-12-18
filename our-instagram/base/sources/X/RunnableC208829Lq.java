package X;

/* renamed from: X.9Lq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC208829Lq implements Runnable {
    public final /* synthetic */ C208769Lk A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public RunnableC208829Lq(C208769Lk c208769Lk, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = c208769Lk;
        this.A01 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C208769Lk c208769Lk = this.A00;
        C208769Lk.A0G(c208769Lk, true);
        c208769Lk.A03 = true;
        this.A01.invoke();
    }
}
