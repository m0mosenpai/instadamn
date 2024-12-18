package X;

/* renamed from: X.CpE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28905CpE implements InterfaceC48212Jk {
    public final /* synthetic */ C27264C1h A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    public C28905CpE(C27264C1h c27264C1h, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
        this.A00 = c27264C1h;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        this.A01.invoke(EnumC27384C6n.A05);
        AbstractC25226BEj.A12(this.A00.A01).A07("failed to load school eligibility status");
    }
}
