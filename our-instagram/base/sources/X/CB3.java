package X;

/* loaded from: classes5.dex */
public abstract class CB3 {
    public static final CUK A00(CUK cuk, C118125Vw c118125Vw, C5DD c5dd, InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583) {
        if (cuk != null && anonymousClass583 == cuk.A05 && C14360o3.A0K(c118125Vw, cuk.A02) && interfaceC1128957x.Awk() == cuk.A04.Awk() && c5dd == cuk.A03) {
            return cuk;
        }
        CUK cuk2 = CUK.A07;
        if (cuk2 != null && anonymousClass583 == cuk2.A05 && C14360o3.A0K(c118125Vw, cuk2.A02) && interfaceC1128957x.Awk() == cuk2.A04.Awk() && c5dd == cuk2.A03) {
            return cuk2;
        }
        CUK cuk3 = new CUK(AbstractC122525gn.A00(c118125Vw, anonymousClass583), c5dd, new AnonymousClass582(interfaceC1128957x.Awk(), interfaceC1128957x.B7e()), anonymousClass583);
        CUK.A07 = cuk3;
        return cuk3;
    }
}
