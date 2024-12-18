package X;

/* renamed from: X.T2y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64189T2y implements InterfaceC65507Tlc {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public C64189T2y(C1N8 c1n8, C58252li c58252li, SE2 se2, C63345Si1 c63345Si1, Object obj, String str, int i) {
        this.A00 = i;
        this.A01 = c63345Si1;
        this.A06 = str;
        if (i != 0) {
            this.A03 = c1n8;
            this.A04 = obj;
            this.A05 = c58252li;
            this.A02 = se2;
        } else {
            this.A02 = c1n8;
            this.A04 = obj;
            this.A05 = c58252li;
            this.A03 = se2;
        }
    }

    @Override // X.InterfaceC65507Tlc
    public final void CyJ(Throwable th) {
        ((C2GT) this.A05).A0A(C63406Sjd.A06(th));
    }

    @Override // X.InterfaceC65507Tlc
    public final void CyK(SGB sgb) {
        C1N8 c1n8;
        Object obj;
        C58252li c58252li;
        Object obj2;
        int i = this.A00;
        C63345Si1 c63345Si1 = (C63345Si1) this.A01;
        String str = this.A06;
        if (i != 0) {
            c1n8 = (C1N8) this.A03;
            obj = this.A04;
            c58252li = (C58252li) this.A05;
            obj2 = this.A02;
        } else {
            c1n8 = (C1N8) this.A02;
            obj = this.A04;
            c58252li = (C58252li) this.A05;
            obj2 = this.A03;
        }
        C63345Si1.A00(c1n8, c58252li, (SE2) obj2, sgb, c63345Si1, obj, str);
    }
}
