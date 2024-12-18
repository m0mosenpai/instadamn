package X;

/* renamed from: X.0A2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0A2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ AbstractC12990ll A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0A2(AbstractC12990ll abstractC12990ll) {
        super(0);
        this.A00 = abstractC12990ll;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C18720vz deviceSession = this.A00.getDeviceSession();
        C14360o3.A0B(deviceSession, 0);
        return deviceSession.A01(C17110t6.class, new C0A1(deviceSession));
    }
}
