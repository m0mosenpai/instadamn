package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CHd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27632CHd {
    public static final void A00(C5Tl c5Tl, String str, InterfaceC19390xP interfaceC19390xP, int i, int i2) {
        String str2;
        String str3 = str;
        C14360o3.A0B(interfaceC19390xP, 0);
        c5Tl.Enr(-1574088655);
        if ((i2 & 2) != 0) {
            str3 = null;
        }
        if (C0fH.A02()) {
            C0fH.A01(475272243, "com.instagram.creation.genai.themes.ui.AiThemesLoadingStateContent (AiThemesLoadingStateContent.kt:21)");
        }
        InterfaceC74963Ym A01 = C6IB.A01(c5Tl, AbstractC27760CMb.A00.get(0), interfaceC19390xP, 8);
        C1130158n c1130158n = Modifier.A00;
        Modifier A0U = AbstractC25226BEj.A0U(c1130158n);
        InterfaceC1127857k A0e = AbstractC25228BEl.A0e(c5Tl);
        int A00 = C5X2.A00(c5Tl);
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C59P A04 = C117505Tk.A04(c117505Tk);
        Modifier A012 = C5X3.A01(c5Tl, A0U);
        AbstractC25233BEq.A11(c5Tl, c117505Tk);
        AbstractC25231BEo.A12(c5Tl, A0e, A04);
        InterfaceC16620sF interfaceC16620sF = C5X8.A02;
        if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
        }
        AbstractC25225BEi.A1K(c5Tl, A012);
        Modifier A002 = C6GM.A00.A00(c1130158n, true);
        c5Tl.Eno(-640614949);
        if (str3 == null) {
            Object value = A01.getValue();
            C14360o3.A07(value);
            str2 = C5YD.A00(c5Tl, AbstractC166987dD.A0H(value));
        } else {
            str2 = str3;
        }
        C117505Tk.A0L(c117505Tk, false);
        CH4.A00(c5Tl, A002, str2, 0, 0, AbstractC25226BEj.A0M(c5Tl));
        if (AbstractC25227BEk.A1R(c5Tl)) {
            C0fH.A00(394798158);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT2(interfaceC19390xP, str3, i2, i, 8);
        }
    }
}
