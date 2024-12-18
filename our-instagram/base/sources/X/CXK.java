package X;

import com.facebook.common.dextricks.DalvikInternals;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CXK {
    public static final void A01(C5Tl c5Tl, List list, List list2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, int i) {
        int i2;
        boolean A1R = AbstractC167007dF.A1R(0, list, list2);
        AbstractC25234BEr.A1R(interfaceC16820sZ, interfaceC16620sF, interfaceC16820sZ2, interfaceC16620sF2, interfaceC16820sZ3);
        c5Tl.Enr(2015728240);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, list) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, list2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16620sF);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ2);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16620sF2);
        }
        if ((1572864 & i) == 0) {
            i2 |= AbstractC25232BEp.A0N(c5Tl, interfaceC16820sZ3);
        }
        if ((599187 & i2) == 599186 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-492590576, "com.instagram.aistudio.editor.AiKnowledgeScreen (AiKnowledgeScreen.kt:44)");
            }
            AbstractC12990ll A0d = AbstractC25229BEm.A0d(c5Tl);
            int size = list2.size();
            C06090Tz A0j = AbstractC25225BEi.A0j(A0d, 0);
            boolean A1Q = AbstractC167007dF.A1Q(size, AbstractC25225BEi.A07(A0j, A0d, 36605486574540055L));
            int size2 = list.size();
            C14360o3.A0B(A0d, 0);
            boolean A1Q2 = AbstractC167007dF.A1Q(size2, AbstractC25225BEi.A07(A0j, A0d, 36605486574605592L));
            boolean A1U = AbstractC25228BEl.A1U(c5Tl, list2, AbstractC25228BEl.A1U(c5Tl, list, AbstractC25226BEj.A1Y(c5Tl, A1Q2, AbstractC25227BEk.A1W(c5Tl, 1117425235, A1Q)), AbstractC167007dF.A1P(i2 & 896, 256)) | AbstractC167007dF.A1P(i2 & 7168, C3OO.FLAG_MOVED), AbstractC25234BEr.A1W(i2)) | AbstractC25234BEr.A1T(i2) | AbstractC167007dF.A1P(i2 & 3670016, 1048576);
            Object EEc = c5Tl.EEc();
            if (A1U || EEc == C5UI.A00) {
                EEc = new DIS(interfaceC16620sF, interfaceC16820sZ, list2, list, interfaceC16620sF2, interfaceC16820sZ2, interfaceC16820sZ3, A1R ? 1 : 0, A1Q, A1Q2);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C6IS.A08(c5Tl, (InterfaceC16660sJ) EEc);
            if (C0fH.A02()) {
                C0fH.A00(-639654303);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30289DVq(i, A1R ? 1 : 0, interfaceC16820sZ3, list2, list, interfaceC16820sZ2, interfaceC16820sZ, interfaceC16620sF, interfaceC16620sF2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5Tl r18, int r19, int r20, boolean r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CXK.A00(X.5Tl, int, int, boolean, boolean, boolean):void");
    }
}
