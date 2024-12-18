package X;

/* renamed from: X.CCr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27521CCr {
    public static final C5C8 A00(C5Tl c5Tl, String str, String str2) {
        AbstractC167007dF.A1K(str, str2);
        if (C0fH.A02()) {
            C0fH.A01(-1661425678, "com.instagram.aistudio.editor.AiSettingsUtil.buildAnnotatedString (AiSettingsUtil.kt:15)");
        }
        C6C7 A0g = AbstractC25228BEl.A0g();
        int length = str.length();
        int A07 = AbstractC001900j.A07(str, str2, length - 1);
        int A04 = AbstractC25226BEj.A04(str2, A07);
        A0g.A09(str);
        A0g.A06(new C5W3(null, null, null, AbstractC25225BEi.A0Y(c5Tl).A02.A08, null, 65530, AbstractC25226BEj.A0G(c5Tl), 0L, 0L), 0, length);
        A0g.A06(new C5W3(null, null, null, null, null, 65534, AbstractC25226BEj.A0N(c5Tl), 0L, 0L), A07, A04);
        C5C8 A0R = AbstractC25227BEk.A0R(A0g, "links to open in external activity", "clickable link", A07, A04);
        if (C0fH.A02()) {
            C0fH.A00(192269772);
        }
        return A0R;
    }
}
