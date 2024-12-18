package X;

/* renamed from: X.DdL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30599DdL extends C0YY implements InterfaceC16610sE {
    public static final C30599DdL A00 = new C30599DdL();

    public C30599DdL() {
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
                C0fH.A01(-1905450551, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda-1.<anonymous> (BasicTextField.kt:610)");
            }
            AbstractC25227BEk.A1P(c5Tl, interfaceC16620sF, A0H & 14);
            if (C0fH.A02()) {
                C0fH.A00(-347499217);
            }
        }
        return C0eB.A00;
    }
}
