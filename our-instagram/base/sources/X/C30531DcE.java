package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DcE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30531DcE extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ InterfaceC16660sJ A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30531DcE(String str, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        super(3);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
        this.A03 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5Tl c5Tl = (C5Tl) obj2;
        if (AbstractC25228BEl.A0E(obj3) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1834960844, "com.instagram.creation.genai.themes.ui.AiThemesImagePickerHScrollSelector.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AiThemesImagePickerHScrollSelector.kt:65)");
            }
            c5Tl.Eno(-1269404028);
            int i = this.A00;
            int i2 = this.A01;
            Modifier modifier = Modifier.A00;
            if (i == i2) {
                modifier = AbstractC25228BEl.A0Y(modifier, 4.0f, 2.0f, AbstractC25226BEj.A0H(c5Tl));
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            String str = this.A02;
            c5Tl.Eno(-1269394200);
            InterfaceC16660sJ interfaceC16660sJ = this.A03;
            boolean AH4 = c5Tl.AH4(interfaceC16660sJ) | c5Tl.AH2(i);
            Object EEc = c5Tl.EEc();
            if (AH4 || EEc == C5UI.A00) {
                EEc = new C57249PbX(i, 22, interfaceC16660sJ);
                c5Tl.FBy(EEc);
            }
            CYN.A01(c5Tl, modifier, str, AbstractC25225BEi.A1A(c117505Tk, EEc, false), 0);
            if (C0fH.A02()) {
                C0fH.A00(-970520248);
            }
        }
        return C0eB.A00;
    }
}
