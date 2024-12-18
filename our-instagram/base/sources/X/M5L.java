package X;

/* loaded from: classes8.dex */
public final class M5L implements Runnable {
    public final /* synthetic */ EnumC46172KcA A00;
    public final /* synthetic */ EnumC46165Kc3 A01;
    public final /* synthetic */ InterfaceC16620sF A02;

    public M5L(EnumC46172KcA enumC46172KcA, EnumC46165Kc3 enumC46165Kc3, InterfaceC16620sF interfaceC16620sF) {
        this.A02 = interfaceC16620sF;
        this.A00 = enumC46172KcA;
        this.A01 = enumC46165Kc3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.invoke(this.A00, this.A01);
    }
}
