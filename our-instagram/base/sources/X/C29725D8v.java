package X;

/* renamed from: X.D8v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29725D8v extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29725D8v(C5yI c5yI, String str, String str2, String str3, String str4, int i) {
        super(0);
        this.A00 = i;
        this.A01 = c5yI;
        if (i != 0) {
            this.A02 = str;
            this.A04 = str2;
            this.A06 = null;
            this.A05 = str3;
            this.A03 = str4;
        } else {
            this.A06 = str;
            this.A03 = str2;
            this.A05 = null;
            this.A04 = str3;
            this.A02 = str4;
        }
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i = this.A00;
        C5yI c5yI = (C5yI) this.A01;
        if (i != 0) {
            str = this.A02;
            str2 = this.A04;
            str3 = this.A06;
            str4 = this.A05;
            str5 = this.A03;
        } else {
            str = this.A06;
            str2 = this.A03;
            str3 = this.A05;
            str4 = this.A04;
            str5 = this.A02;
        }
        c5yI.DbY(str, str2, str3, str4, str5);
        return C0eB.A00;
    }
}
