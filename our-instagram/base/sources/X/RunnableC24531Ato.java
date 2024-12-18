package X;

/* renamed from: X.Ato, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24531Ato implements Runnable {
    public final /* synthetic */ C175887s2 A00;
    public final /* synthetic */ InterfaceC176157sY A01;

    public RunnableC24531Ato(C175887s2 c175887s2, InterfaceC176157sY interfaceC176157sY) {
        this.A00 = c175887s2;
        this.A01 = interfaceC176157sY;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.onSuccess();
    }
}
