package X;

/* loaded from: classes8.dex */
public final class M3W implements Runnable {
    public final /* synthetic */ String A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    public M3W(String str, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
        this.A00 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC16660sJ interfaceC16660sJ = this.A01;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(this.A00);
        }
    }
}
