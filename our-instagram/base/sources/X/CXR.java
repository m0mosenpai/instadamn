package X;

import androidx.compose.ui.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CXR {
    /* JADX WARN: Type inference failed for: r21v1, types: [X.DgC, java.lang.Object] */
    public static final void A00(C5Tl c5Tl, C50726MaR c50726MaR, C28370CfW c28370CfW, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        boolean z;
        int A07;
        C5UU ASZ;
        int i3;
        boolean A1b = AbstractC25233BEq.A1b(c50726MaR, c28370CfW, interfaceC16660sJ);
        c5Tl.Enr(1749041410);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c50726MaR) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, c28370CfW);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-742614858, "com.instagram.aistudio.home.view.section.AiHomeIcebreakerSection (AiHomeIcebreakerSection.kt:50)");
            }
            C26003Ber c26003Ber = (C26003Ber) c50726MaR.A02;
            List list = (List) c50726MaR.A01;
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String str = ((C26021BfA) next).A03;
                if (str != null && !AbstractC001900j.A0T(str)) {
                    A1E.add(next);
                }
            }
            c5Tl.Eno(602813920);
            if (A1E.isEmpty()) {
                C1130158n c1130158n = Modifier.A00;
                InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
                int A00 = C5X2.A00(c5Tl);
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C59P A04 = C117505Tk.A04(c117505Tk);
                Modifier A01 = C5X3.A01(c5Tl, c1130158n);
                AbstractC25233BEq.A11(c5Tl, c117505Tk);
                AbstractC25231BEo.A12(c5Tl, A0Y, A04);
                InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
                }
                AbstractC25225BEi.A1K(c5Tl, A01);
                c5Tl.ASW();
                if (AbstractC25227BEk.A1b(c117505Tk, false)) {
                    C0fH.A00(-947346504);
                }
                ASZ = c5Tl.ASZ();
                if (ASZ == null) {
                    return;
                }
                i3 = 11;
                ASZ.A06 = C30509Dbs.A01(c50726MaR, c28370CfW, interfaceC16660sJ, i, i3);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            c5Tl.Eno(602823461);
            C5UP c5up = AbstractC117935Vd.A00;
            AbstractC12990ll A0v = AbstractC25226BEj.A0v(c5Tl, c5up);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, A0v, 36325081044038338L)) {
                A07 = 2;
            } else {
                A07 = AbstractC25225BEi.A07(c06090Tz, AbstractC25226BEj.A0v(c5Tl, c5up), 36606556020610547L);
            }
            C117505Tk.A0L(A0K, false);
            c5Tl.Eno(602832992);
            C57y c57y = (C57y) c5Tl.AJX(C5V2.A01);
            float EqG = 80.0f + ((c57y.EqG(AbstractC25225BEi.A0Y(c5Tl).A00.A04) + (c57y.EqG(AbstractC25226BEj.A0e(c5Tl).A00.A04) * A07)) * 2.0f);
            C1130158n A0O = AbstractC25225BEi.A0O(A0K);
            InterfaceC1127857k A0Y2 = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, A0O);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0Y2, A042);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            C5WR.A0Q(c5Tl, AbstractC118175Wb.A0A(A0O, 16.0f, 14.0f), AbstractC25226BEj.A0e(c5Tl), c26003Ber.A03, 5, AbstractC25226BEj.A0G(c5Tl));
            Modifier A08 = AbstractC118185Wd.A08(AbstractC25226BEj.A0T(A0O), EqG);
            C1333560c c1333560c = new C1333560c(16.0f, 4.0f, 16.0f, 4.0f);
            C6ID A013 = AbstractC118255Wn.A01(8.0f);
            ?? obj = new Object();
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, A1E, -2045411335);
            if ((i2 & 896) != 256) {
                z = false;
            }
            boolean A1X = AbstractC25233BEq.A1X(c5Tl, c26003Ber, c28370CfW, A1Z, z) | c5Tl.AH2(A07);
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == C5UI.A00) {
                EEc = new C29937DHz(c28370CfW, A1E, interfaceC16660sJ, c26003Ber, A07, A1b ? 1 : 0);
                c5Tl.FBy(EEc);
            }
            AbstractC28011CWj.A01(null, A013, c1333560c, null, obj, c5Tl, A08, AbstractC25225BEi.A1B(A0K, EEc, false), 8.0f, 1772544, 404, false, false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(23850965);
            }
        }
        ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            i3 = 12;
            ASZ.A06 = C30509Dbs.A01(c50726MaR, c28370CfW, interfaceC16660sJ, i, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0296  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C5Tl r47, X.C26021BfA r48, X.C26003Ber r49, X.C28370CfW r50, java.lang.String r51, X.InterfaceC16660sJ r52, int r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CXR.A01(X.5Tl, X.BfA, X.Ber, X.CfW, java.lang.String, X.0sJ, int, int, int):void");
    }
}
