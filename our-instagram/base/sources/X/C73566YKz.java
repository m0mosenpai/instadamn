package X;

/* renamed from: X.YKz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73566YKz extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73566YKz(C5yI c5yI, String str, String str2, int i) {
        super(0);
        this.A00 = i;
        this.A01 = c5yI;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            ((C5yI) obj).DlX(this.A02, null, this.A03);
        } else {
            ((C5yI) obj).DlT(this.A02, null, this.A03);
        }
        return C0eB.A00;
    }
}
