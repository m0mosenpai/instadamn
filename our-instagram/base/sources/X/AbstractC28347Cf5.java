package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.Cf5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28347Cf5 {
    public static final EnumC193878i8 A00 = EnumC193878i8.A0A;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r7 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        if ((r38 & 32) != 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5Tl r30, X.C28374Cfc r31, com.instagram.creation.genai.magicmod.model.MagicModLaunchParams r32, X.C25808BbP r33, X.InterfaceC16820sZ r34, X.InterfaceC16620sF r35, X.InterfaceC16620sF r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28347Cf5.A00(X.5Tl, X.Cfc, com.instagram.creation.genai.magicmod.model.MagicModLaunchParams, X.BbP, X.0sZ, X.0sF, X.0sF, int, int):void");
    }

    public static final void A01(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        int i2;
        c5Tl.Enr(-59110251);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(818287443, "com.instagram.creation.genai.magicmod.tools.expander.ui.UndoButton (MagicModExpanderScreen.kt:190)");
            }
            Modifier A01 = AbstractC118175Wb.A01(Modifier.A00);
            if (z) {
                c5Tl.Eno(2090738322);
                C2DC A002 = C5Y7.A00(c5Tl, R.drawable.instagram_undo_pano_filled_24, 0);
                String A003 = AbstractC136736Hc.A00(c5Tl, 2131965959);
                c5Tl.Eno(483091404);
                boolean A1T = AbstractC25228BEl.A1T(i2);
                Object EEc = c5Tl.EEc();
                if (A1T || EEc == C5UI.A00) {
                    EEc = new DGV(interfaceC16820sZ, 28);
                    c5Tl.FBy(EEc);
                }
                AbstractC25225BEi.A1V(c5Tl, false);
                C5YS.A09(c5Tl, C5XR.A06(A01, (InterfaceC16820sZ) EEc), A002, A003, AbstractC25225BEi.A0C(c5Tl));
            } else {
                c5Tl.Eno(2091013540);
                AbstractC119685bS.A00(c5Tl, A01);
            }
            if (AbstractC25230BEn.A1Y(c5Tl)) {
                C0fH.A00(114540955);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30502Dbl.A01(ASZ, interfaceC16820sZ, i, 11, z);
        }
    }
}
