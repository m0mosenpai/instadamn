package X;

/* renamed from: X.Mhs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51093Mhs extends AbstractC154146wP {
    public final int A00;
    public final Object A01;

    public C51093Mhs(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Override // X.AbstractC154146wP
    public final int A03(int i) {
        switch (this.A00) {
            case 0:
                return P2X.A00(P2X.A01((P2X) this.A01), i);
            case 1:
                return P2Y.A00(P2Y.A01((P2Y) this.A01), i);
            case 2:
                C51175MjJ c51175MjJ = (C51175MjJ) ((N7L) this.A01).A0A.getValue();
                ?? A1W = AbstractC167007dF.A1W(c51175MjJ.A00);
                if (i >= A1W && i < c51175MjJ.A02.size() + (A1W == true ? 1 : 0)) {
                    return 1;
                }
                return 3;
            case 3:
                AbstractC43842Ja5 abstractC43842Ja5 = (AbstractC43842Ja5) this.A01;
                if (!abstractC43842Ja5.isModelClass(i, C56073Ouq.class) && !abstractC43842Ja5.isModelClass(i, C52361NEz.class)) {
                    return 1;
                }
                return 3;
            default:
                return ((InterfaceC58131Ppu) this.A01).Bz3(i, 2);
        }
    }
}
