package X;

/* loaded from: classes8.dex */
public final class M5A implements Runnable {
    public final /* synthetic */ C54679ODf A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ InterfaceC16820sZ A02;

    public M5A(C54679ODf c54679ODf, String str, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = c54679ODf;
        this.A01 = str;
        this.A02 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC16660sJ interfaceC16660sJ = this.A00.A02;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(new KNA(this.A01, this.A02));
        }
    }
}
