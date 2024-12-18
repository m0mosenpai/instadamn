package X;

/* renamed from: X.DdN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30601DdN extends C0YY implements InterfaceC16610sE {
    public static final C30601DdN A00 = new C30601DdN();

    public C30601DdN() {
        super(3);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) obj;
        C5Tl c5Tl = (C5Tl) obj2;
        int A0H = AbstractC166987dD.A0H(obj3);
        if ((A0H & 6) == 0) {
            A0H |= AbstractC25232BEp.A0H(c5Tl, interfaceC16620sF);
        }
        if ((A0H & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1654696238, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda-3.<anonymous> (BasicTextField.kt:806)");
            }
            AbstractC25227BEk.A1P(c5Tl, interfaceC16620sF, A0H & 14);
            if (C0fH.A02()) {
                C0fH.A00(-2039898033);
            }
        }
        return C0eB.A00;
    }
}
