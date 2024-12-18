package X;

/* renamed from: X.M6d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50014M6d implements Runnable {
    public final /* synthetic */ EnumC46172KcA A00;
    public final /* synthetic */ EnumC46165Kc3 A01;
    public final /* synthetic */ EnumC46166Kc4 A02;
    public final /* synthetic */ EnumC46166Kc4 A03;
    public final /* synthetic */ InterfaceC16600sD A04;

    public RunnableC50014M6d(EnumC46172KcA enumC46172KcA, EnumC46165Kc3 enumC46165Kc3, EnumC46166Kc4 enumC46166Kc4, EnumC46166Kc4 enumC46166Kc42, InterfaceC16600sD interfaceC16600sD) {
        this.A04 = interfaceC16600sD;
        this.A00 = enumC46172KcA;
        this.A01 = enumC46165Kc3;
        this.A03 = enumC46166Kc4;
        this.A02 = enumC46166Kc42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A04.invoke(this.A00, this.A01, this.A03, this.A02);
    }
}
