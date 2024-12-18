package X;

/* renamed from: X.LRt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48119LRt implements InterfaceC58097PpM {
    public final /* synthetic */ C54679ODf A00;

    @Override // X.InterfaceC58097PpM
    public final void DG8(EnumC53262Nh0 enumC53262Nh0, String str) {
        C14360o3.A0B(str, 0);
        C11T.A02(new M59(enumC53262Nh0, this.A00, str));
    }

    public C48119LRt(C54679ODf c54679ODf) {
        this.A00 = c54679ODf;
    }

    @Override // X.InterfaceC58097PpM
    public final void DiG() {
        C54679ODf c54679ODf = this.A00;
        InterfaceC16660sJ interfaceC16660sJ = c54679ODf.A02;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(KNB.A00);
        }
        c54679ODf.A02 = null;
    }

    @Override // X.InterfaceC58097PpM
    public final void E1x(String str, InterfaceC16820sZ interfaceC16820sZ, byte[] bArr) {
        C11T.A02(new M5A(this.A00, str, interfaceC16820sZ));
    }
}
