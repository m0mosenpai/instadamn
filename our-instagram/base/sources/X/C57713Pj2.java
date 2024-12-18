package X;

/* renamed from: X.Pj2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57713Pj2 extends C0YY implements InterfaceC16660sJ {
    public static final C57713Pj2 A00 = new C57713Pj2();

    public C57713Pj2() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AbstractC55145Od4 abstractC55145Od4 = (AbstractC55145Od4) obj;
        C14360o3.A0B(abstractC55145Od4, 0);
        InterfaceC37109GWu A06 = abstractC55145Od4.A06();
        boolean z = true;
        if (!C14360o3.A0K(A06, GGY.A00) && !C14360o3.A0K(A06, C56724PFs.A00)) {
            if (!(A06 instanceof C56723PFr) && !(A06 instanceof GGX) && !(A06 instanceof C51917Mwz)) {
                throw B4Z.A00();
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
