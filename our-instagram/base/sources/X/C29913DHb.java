package X;

/* renamed from: X.DHb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29913DHb extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29913DHb(Object obj, String str, String str2, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0020. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (3 - this.A00 != 0) {
            ((InterfaceC132365yF) this.A01).CrC(this.A02, AbstractC167027dH.A0Q(obj), null, this.A03);
        } else {
            switch (AbstractC25227BEk.A05((C7A) obj, 0)) {
                case 0:
                case 1:
                case 4:
                case 6:
                    break;
                case 2:
                case 3:
                case 5:
                    ((C5yI) this.A01).DwI(this.A02, null, this.A03);
                    break;
                case 7:
                    ((C5yI) this.A01).DhO(this.A02);
                    break;
                default:
                    throw B4Z.A00();
            }
        }
        return C0eB.A00;
    }
}
