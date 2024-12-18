package X;

/* loaded from: classes8.dex */
public final class M59 implements Runnable {
    public final /* synthetic */ EnumC53262Nh0 A00;
    public final /* synthetic */ C54679ODf A01;
    public final /* synthetic */ String A02;

    public M59(EnumC53262Nh0 enumC53262Nh0, C54679ODf c54679ODf, String str) {
        this.A01 = c54679ODf;
        this.A02 = str;
        this.A00 = enumC53262Nh0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C54679ODf c54679ODf = this.A01;
        InterfaceC16660sJ interfaceC16660sJ = c54679ODf.A02;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(new KN9(this.A00, this.A02));
        }
        c54679ODf.A02 = null;
    }
}
