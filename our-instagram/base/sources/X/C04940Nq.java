package X;

/* renamed from: X.0Nq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04940Nq extends C0YY implements InterfaceC16820sZ {
    public static final C04940Nq A00 = new C04940Nq();

    public C04940Nq() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC08830cm interfaceC08830cm = EnumC12920le.A01;
        if (interfaceC08830cm == null) {
            C0K8.A02(EnumC12920le.class, "Release Channel not set yet");
            return EnumC12920le.A0B;
        }
        EnumC12920le enumC12920le = EnumC12920le.A00;
        if (enumC12920le == null || enumC12920le == EnumC12920le.A0B) {
            enumC12920le = (EnumC12920le) interfaceC08830cm.get();
            EnumC12920le.A00 = enumC12920le;
        }
        C14360o3.A0A(enumC12920le);
        return enumC12920le;
    }
}
