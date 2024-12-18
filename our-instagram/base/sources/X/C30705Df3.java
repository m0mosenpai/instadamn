package X;

/* renamed from: X.Df3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30705Df3 extends C0YY implements InterfaceC16610sE {
    public static final C30705Df3 A00 = new C30705Df3();

    public C30705Df3() {
        super(3);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC50812Vc c26399Bli;
        CUo cUo = (CUo) obj;
        C27906CRr c27906CRr = (C27906CRr) obj2;
        AbstractC167017dG.A1N(cUo, c27906CRr);
        String string = cUo.A01.getResources().getString(2131977151);
        if (string == null) {
            c26399Bli = new C75723ad();
        } else {
            c26399Bli = new C26399Bli(string, C05F.A00, C16930sl.A00, null);
        }
        return new C26321BkS(new C26320BkR(c27906CRr.A00, c27906CRr.A01), c26399Bli);
    }
}
