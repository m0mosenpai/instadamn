package X;

/* renamed from: X.9Dg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206759Dg extends C0YY implements InterfaceC16660sJ {
    public final float A00;
    public final int A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206759Dg(float f, int i) {
        super(1);
        this.A01 = i;
        this.A00 = f;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A01 != 0) {
            InterfaceC144616fh interfaceC144616fh = (InterfaceC144616fh) obj;
            C14360o3.A0B(interfaceC144616fh, 0);
            interfaceC144616fh.DBc(this.A00);
            return C0eB.A00;
        }
        throw new NullPointerException("setName");
    }
}
