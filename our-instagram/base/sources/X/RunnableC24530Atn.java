package X;

/* renamed from: X.Atn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24530Atn implements Runnable {
    public final /* synthetic */ C175887s2 A00;
    public final /* synthetic */ InterfaceC176157sY A01;

    public RunnableC24530Atn(C175887s2 c175887s2, InterfaceC176157sY interfaceC176157sY) {
        this.A00 = c175887s2;
        this.A01 = interfaceC176157sY;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C212399b8 c212399b8 = new C212399b8("addOutput error: Failed to post message");
        c212399b8.A01(this.A00.A03());
        this.A01.DE8(c212399b8);
    }
}
