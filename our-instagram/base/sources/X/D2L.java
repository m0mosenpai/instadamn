package X;

/* loaded from: classes5.dex */
public final class D2L implements Runnable {
    public final /* synthetic */ EnumC46298KeU A00;
    public final /* synthetic */ C45999KXn A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ InterfaceC16820sZ A03;

    public D2L(EnumC46298KeU enumC46298KeU, C45999KXn c45999KXn, Integer num, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = c45999KXn;
        this.A02 = num;
        this.A00 = enumC46298KeU;
        this.A03 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C45999KXn.A08(this.A00, this.A01, this.A02, this.A03, true);
    }
}
