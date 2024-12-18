package X;

/* renamed from: X.Wwt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71597Wwt implements Runnable {
    public final /* synthetic */ WZF A00;
    public final /* synthetic */ InterfaceC71894X9b A01;
    public final /* synthetic */ EnumC222789sJ A02;
    public final /* synthetic */ EnumC222789sJ A03;

    public RunnableC71597Wwt(WZF wzf, InterfaceC71894X9b interfaceC71894X9b, EnumC222789sJ enumC222789sJ, EnumC222789sJ enumC222789sJ2) {
        this.A00 = wzf;
        this.A01 = interfaceC71894X9b;
        this.A02 = enumC222789sJ;
        this.A03 = enumC222789sJ2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.DZC(this.A02, this.A03);
    }
}
