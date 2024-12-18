package X;

/* loaded from: classes5.dex */
public abstract class CBX {
    public static final C28211Cc9 A00(C5Tl c5Tl) {
        if (C0fH.A02()) {
            C0fH.A01(218784619, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:45)");
        }
        C5DD c5dd = (C5DD) c5Tl.AJX(C5V2.A03);
        InterfaceC1128957x A0h = AbstractC25228BEl.A0h(c5Tl);
        AnonymousClass583 anonymousClass583 = (AnonymousClass583) AbstractC25226BEj.A18(c5Tl);
        boolean A1a = AbstractC25232BEp.A1a(c5Tl, A0h, anonymousClass583, c5Tl.AH4(c5dd)) | (c5Tl.AH2(8));
        Object EEc = c5Tl.EEc();
        if (A1a || EEc == C5UI.A00) {
            EEc = new C28211Cc9(c5dd, A0h, anonymousClass583);
            c5Tl.FBy(EEc);
        }
        C28211Cc9 c28211Cc9 = (C28211Cc9) EEc;
        if (C0fH.A02()) {
            C0fH.A00(2033026127);
        }
        return c28211Cc9;
    }
}
