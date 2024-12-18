package X;

/* renamed from: X.9Dh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206769Dh extends C0YY implements InterfaceC16660sJ {
    public final float A00;
    public final float A01;
    public final int A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206769Dh(int i, float f, float f2) {
        super(1);
        this.A02 = i;
        this.A00 = f;
        this.A01 = f2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A02) {
            case 0:
                throw new NullPointerException("setName");
            case 1:
                InterfaceC144616fh interfaceC144616fh = (InterfaceC144616fh) obj;
                C14360o3.A0B(interfaceC144616fh, 0);
                interfaceC144616fh.DQV(this.A00, this.A01);
                return C0eB.A00;
            case 2:
                InterfaceC144626fi interfaceC144626fi = (InterfaceC144626fi) obj;
                C14360o3.A0B(interfaceC144626fi, 0);
                return Boolean.valueOf(interfaceC144626fi.DrS(this.A00, this.A01));
            default:
                InterfaceC144616fh interfaceC144616fh2 = (InterfaceC144616fh) obj;
                C14360o3.A0B(interfaceC144616fh2, 0);
                interfaceC144616fh2.DsB(this.A00, this.A01);
                return C0eB.A00;
        }
    }
}
