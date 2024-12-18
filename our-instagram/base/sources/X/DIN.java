package X;

/* loaded from: classes5.dex */
public final class DIN extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ InterfaceC31142Dmh A05;
    public final /* synthetic */ C59Z A06;
    public final /* synthetic */ int[] A07;
    public final /* synthetic */ int[] A08;
    public final /* synthetic */ C59W[] A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DIN(InterfaceC31142Dmh interfaceC31142Dmh, C59Z c59z, int[] iArr, int[] iArr2, C59W[] c59wArr, int i, int i2, int i3, int i4, int i5) {
        super(1);
        this.A07 = iArr;
        this.A02 = i;
        this.A04 = i2;
        this.A03 = i3;
        this.A09 = c59wArr;
        this.A05 = interfaceC31142Dmh;
        this.A01 = i4;
        this.A06 = c59z;
        this.A00 = i5;
        this.A08 = iArr2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        C119135aV c119135aV;
        AbstractC119735bX abstractC119735bX;
        C5AW c5aw = (C5AW) obj;
        int[] iArr = this.A07;
        if (iArr != null) {
            i = iArr[this.A02];
        } else {
            i = 0;
        }
        int i2 = this.A04;
        while (i2 < this.A03) {
            C59W c59w = this.A09[i2];
            C14360o3.A0A(c59w);
            InterfaceC31142Dmh interfaceC31142Dmh = this.A05;
            Object BbJ = c59w.BbJ();
            if (BbJ instanceof C119135aV) {
                c119135aV = (C119135aV) BbJ;
            } else {
                c119135aV = null;
            }
            int i3 = this.A01;
            int i4 = this.A00;
            if (c119135aV == null || (abstractC119735bX = c119135aV.A01) == null) {
                abstractC119735bX = ((C28740CmY) interfaceC31142Dmh).A06;
            }
            c5aw.A05(c59w, 0.0f, this.A08[i2 - i2], abstractC119735bX.A00(c59w, AnonymousClass583.Ltr, i3 - c59w.A0F(), i4) + i);
            i2++;
        }
        return C0eB.A00;
    }
}
