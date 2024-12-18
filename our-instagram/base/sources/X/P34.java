package X;

/* loaded from: classes9.dex */
public final class P34 implements InterfaceC57949Pmv {
    public final int A00;
    public final int A01;
    public final Object A02;

    public P34(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    @Override // X.InterfaceC57949Pmv
    public final C54543O7v getState(C54543O7v c54543O7v, CharSequence charSequence, boolean z) {
        C51753Mtc c51753Mtc;
        C51753Mtc c51753Mtc2;
        int i = this.A00;
        C14360o3.A0B(c54543O7v, 0);
        Object obj = this.A02;
        if (i != 0) {
            N68 n68 = (N68) obj;
            C2GT c2gt = (C2GT) AbstractC001800i.A0O(n68.A01().A09, this.A01);
            if (c2gt != null && (c51753Mtc2 = (C51753Mtc) c2gt.A02()) != null) {
                N68.A00(c51753Mtc2, c54543O7v, n68);
            }
        } else {
            N66 n66 = (N66) obj;
            C2GT c2gt2 = (C2GT) AbstractC001800i.A0O(n66.A01().A05, this.A01);
            if (c2gt2 != null && (c51753Mtc = (C51753Mtc) c2gt2.A02()) != null) {
                N66.A00(c51753Mtc, c54543O7v, n66);
                return c54543O7v;
            }
        }
        return c54543O7v;
    }
}
