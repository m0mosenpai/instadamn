package X;

/* renamed from: X.Ae7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23672Ae7 implements InterfaceC25177BCa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C148176ln A01;
    public final /* synthetic */ String A02;

    @Override // X.InterfaceC25177BCa
    public final void DZL() {
    }

    public C23672Ae7(C148176ln c148176ln, String str, int i) {
        this.A02 = str;
        this.A01 = c148176ln;
        this.A00 = i;
    }

    @Override // X.InterfaceC25177BCa
    public final void DQ0() {
        String str = this.A02;
        if (str != null) {
            C148176ln c148176ln = this.A01;
            int i = this.A00;
            c148176ln.A0J.A01(str);
            C148176ln.A0E(c148176ln, i);
        }
    }
}
