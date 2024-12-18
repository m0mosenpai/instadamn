package X;

import androidx.compose.ui.Modifier;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class BHu {
    public static final C09530e4 A00;

    static {
        C16930sl c16930sl = C16930sl.A00;
        A00 = new C09530e4(c16930sl, c16930sl);
    }

    public static final void A00(C5Tl c5Tl, C5C8 c5c8, List list, int i) {
        int i2;
        c5Tl.Enr(-1794596951);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c5c8) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, list);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1425840251, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:73)");
            }
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C127015of c127015of = (C127015of) list.get(i3);
                InterfaceC16610sE interfaceC16610sE = (InterfaceC16610sE) c127015of.A02;
                int i4 = c127015of.A01;
                int i5 = c127015of.A00;
                BIS bis = BIS.A00;
                C1130158n c1130158n = Modifier.A00;
                int A002 = C5X2.A00(c5Tl);
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C59P A04 = C117505Tk.A04(c117505Tk);
                Modifier A01 = C5X3.A01(c5Tl, c1130158n);
                InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
                c5Tl.Ent();
                if (c117505Tk.A0K) {
                    c5Tl.AMd(interfaceC16820sZ);
                } else {
                    c5Tl.FDO();
                }
                C5XJ.A00(c5Tl, bis, C5X8.A03);
                C5XJ.A00(c5Tl, A04, C5X8.A05);
                InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                if (c117505Tk.A0K || !C14360o3.A0K(c5Tl.EEc(), Integer.valueOf(A002))) {
                    Integer valueOf = Integer.valueOf(A002);
                    c5Tl.FBy(valueOf);
                    c5Tl.ABx(valueOf, interfaceC16620sF);
                }
                C5XJ.A00(c5Tl, A01, C5X8.A04);
                interfaceC16610sE.invoke(c5c8.subSequence(i4, i5).A00, c5Tl, 0);
                c5Tl.ASW();
            }
            if (C0fH.A02()) {
                C0fH.A00(2027916152);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, c5c8, list, i, 3);
        }
    }
}
