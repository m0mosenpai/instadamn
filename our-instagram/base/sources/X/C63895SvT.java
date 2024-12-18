package X;

/* renamed from: X.SvT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63895SvT implements InterfaceC38361qQ, InterfaceC37991pg {
    public static C63895SvT A03;
    public int A00;
    public Integer A01;
    public String A02;

    @Override // X.InterfaceC37991pg
    public final synchronized void Cyz() {
        this.A00++;
        this.A01 = C05F.A01;
    }

    @Override // X.InterfaceC37991pg
    public final synchronized void DI6() {
        this.A00++;
        this.A01 = C05F.A00;
    }

    @Override // X.InterfaceC38361qQ
    public final synchronized String E6h() {
        StringBuilder A1C;
        String str;
        A1C = AbstractC166987dD.A1C();
        A1C.append("UFS");
        A1C.append("-");
        A1C.append(this.A02);
        A1C.append("-");
        if (1 - this.A01.intValue() != 0) {
            str = "fg";
        } else {
            str = "bg";
        }
        A1C.append(str);
        A1C.append("-");
        return AbstractC58318PtA.A0l(A1C, this.A00);
    }
}
