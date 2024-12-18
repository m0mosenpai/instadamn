package X;

/* renamed from: X.AuS, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24571AuS implements Runnable {
    public final /* synthetic */ InterfaceC48212Jk A00;
    public final /* synthetic */ IllegalStateException A01;

    public RunnableC24571AuS(InterfaceC48212Jk interfaceC48212Jk, IllegalStateException illegalStateException) {
        this.A00 = interfaceC48212Jk;
        this.A01 = illegalStateException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC48212Jk interfaceC48212Jk = this.A00;
        if (interfaceC48212Jk != null) {
            interfaceC48212Jk.invoke(this.A01);
        }
    }
}
