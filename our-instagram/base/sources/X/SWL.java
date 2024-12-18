package X;

/* loaded from: classes10.dex */
public final class SWL {
    public final C63166SeQ A00;
    public final InterfaceC65489TlA A01;
    public final SO7 A02;

    public SWL(InterfaceC65489TlA interfaceC65489TlA, SO7 so7) {
        C63166SeQ A01 = C63166SeQ.A01(so7.A00, interfaceC65489TlA);
        this.A02 = so7;
        this.A00 = A01;
        this.A01 = interfaceC65489TlA;
    }

    public static QKG A00(RkF rkF, SWL swl) {
        EnumC61155RgG enumC61155RgG = rkF.A00;
        EnumC61155RgG enumC61155RgG2 = EnumC61155RgG.INTERNAL_UNRECOVERABLE;
        SO7 so7 = swl.A02;
        if (enumC61155RgG == enumC61155RgG2) {
            return new QKG(enumC61155RgG2, so7);
        }
        return new QKG(enumC61155RgG, so7);
    }
}
