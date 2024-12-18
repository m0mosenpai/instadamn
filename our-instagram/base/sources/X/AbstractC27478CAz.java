package X;

/* renamed from: X.CAz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27478CAz {
    public static final void A00(BXF bxf, C5Tl c5Tl, InterfaceC16620sF interfaceC16620sF, int i) {
        int i2;
        c5Tl.Enr(-1985516685);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, bxf) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16620sF);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(552240289, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:35)");
            }
            Object EEc = c5Tl.EEc();
            Object obj = C5UI.A00;
            if (EEc == obj) {
                EEc = new C28252Ccw(BZV.A00);
                c5Tl.FBy(EEc);
            }
            C28252Ccw c28252Ccw = (C28252Ccw) EEc;
            Object EEc2 = c5Tl.EEc();
            if (EEc2 == obj) {
                EEc2 = new DGT(c28252Ccw, 26);
                c5Tl.FBy(EEc2);
            }
            AbstractC28008CWf.A01(c28252Ccw, c5Tl, null, (InterfaceC16820sZ) EEc2, new DRZ(44, c28252Ccw, bxf), interfaceC16620sF, ((i2 << 12) & 458752) | 54, 8, AbstractC25230BEn.A1X(bxf.A0J));
            if (C0fH.A02()) {
                C0fH.A00(1521350983);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, bxf, interfaceC16620sF, i, 4);
        }
    }
}
