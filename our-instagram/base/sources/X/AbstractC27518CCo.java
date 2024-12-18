package X;

import android.app.Activity;

/* renamed from: X.CCo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27518CCo {
    public static final void A00(Activity activity, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(1116258367);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, activity) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2091679072, "com.instagram.aistudio.editor.AiPublishInReviewLayout (AiPublishInReviewFragment.kt:55)");
            }
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, activity, -741149879);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == C5UI.A00) {
                EEc = C29907DGv.A00(c5Tl, activity, 19);
            }
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) EEc;
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            String A00 = C5YD.A00(c5Tl, 2131952804);
            String A002 = C5YD.A00(c5Tl, 2131952803);
            boolean A1Z2 = AbstractC25227BEk.A1Z(c5Tl, activity, -741140055);
            Object EEc2 = c5Tl.EEc();
            if (A1Z2 || EEc2 == C5UI.A00) {
                EEc2 = C29907DGv.A00(c5Tl, activity, 20);
            }
            AbstractC28433Cgh.A03(c5Tl, CGH.A00(c5Tl, null, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), 2131952802, 14), null, A00, A002, interfaceC16820sZ, 0, 4080);
            if (C0fH.A02()) {
                C0fH.A00(-392922770);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, activity, i, 11);
        }
    }
}
