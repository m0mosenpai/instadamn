package X;

/* renamed from: X.Atr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24534Atr implements Runnable {
    public final /* synthetic */ C175887s2 A00;
    public final /* synthetic */ InterfaceC176157sY A01;

    public RunnableC24534Atr(C175887s2 c175887s2, InterfaceC176157sY interfaceC176157sY) {
        this.A00 = c175887s2;
        this.A01 = interfaceC176157sY;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC223559ty abstractC223559ty = new AbstractC223559ty(41000, "prepareRecorder error: Failed to post message");
        abstractC223559ty.A01(this.A00.A03());
        this.A01.DE8(abstractC223559ty);
    }
}
