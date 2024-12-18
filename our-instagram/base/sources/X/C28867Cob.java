package X;

/* renamed from: X.Cob, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28867Cob implements InterfaceC31101Dlj {
    public final C5W3 A00;
    public final CQJ A01;
    public final CQJ A02;

    @Override // X.InterfaceC31101Dlj
    public final CVF AVH(C5C8 c5c8) {
        CQJ cqj;
        C14360o3.A0B(c5c8, 0);
        int i = 0;
        boolean A1N = AbstractC167007dF.A1N(c5c8.length());
        C6C7 A0g = AbstractC25228BEl.A0g();
        CQJ cqj2 = this.A02;
        int A00 = A0g.A00(cqj2.A00);
        try {
            String str = cqj2.A01;
            A0g.A09(str);
            A0g.A04(A00);
            int A002 = A0g.A00(this.A00);
            A0g.A05(c5c8);
            A0g.A04(A002);
            if (A1N && (cqj = this.A01) != null) {
                A00 = A0g.A00(cqj.A00);
                A0g.A09(cqj.A01);
            }
            C5C8 A02 = A0g.A02();
            int length = str.length();
            CQJ cqj3 = this.A01;
            if (cqj3 != null) {
                i = cqj3.A01.length();
            }
            return new CVF(A02, new C28863CoX(A1N, length, i));
        } finally {
            A0g.A04(A00);
        }
    }

    public C28867Cob(C5W3 c5w3, CQJ cqj, CQJ cqj2) {
        this.A02 = cqj;
        this.A01 = cqj2;
        this.A00 = c5w3;
    }
}
