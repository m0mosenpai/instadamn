package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.CYe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28050CYe {
    public static final void A00(C5Tl c5Tl, ImageUrl imageUrl, ImageUrl imageUrl2, int i) {
        int i2;
        C2DB A00;
        c5Tl.Enr(-1802307194);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, imageUrl) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, imageUrl2);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-763218061, "com.instagram.direct.fragment.managefolders.AvatarPile (DirectManageFoldersCreateFolderFragment.kt:259)");
            }
            C2DB A01 = AbstractC43541zP.A01(c5Tl, imageUrl, i2 & 14);
            c5Tl.Eno(438899677);
            if (imageUrl2 == null) {
                A00 = null;
            } else {
                A00 = AbstractC43541zP.A00(c5Tl, imageUrl2);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            BII.A01(c5Tl, null, A01, A00, 45.0f, 0.0f, 0.0f, 6, 1012, 0L, 0L, false, false);
            if (C0fH.A02()) {
                C0fH.A00(1962534020);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, imageUrl2, imageUrl, i, 3);
        }
    }

    public static final void A01(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, C5Hc c5Hc, int i) {
        int i2;
        c5Tl.Enr(-125343657);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c5Hc) | i;
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
                C0fH.A01(-38633152, "com.instagram.direct.fragment.managefolders.AddChats (DirectManageFoldersCreateFolderFragment.kt:226)");
            }
            C1130158n c1130158n = Modifier.A00;
            boolean A1P = AbstractC25233BEq.A1P(c5Tl, 351969151, i2);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = new C37014GSt(interfaceC16820sZ, 23);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A06 = C5XR.A06(c1130158n, (InterfaceC16820sZ) EEc);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A06);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            if (c5Hc.isEmpty()) {
                c5Tl.Eno(-145523328);
                AbstractC25705BXp.A0Q(c5Tl, C29198Cu3.A00, C5YD.A00(c5Tl, 2131959802));
            } else {
                c5Tl.Eno(-145313954);
                String A002 = C5YD.A00(c5Tl, 2131959806);
                Context A0K2 = AbstractC25228BEl.A0K(c5Tl);
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = c5Hc.iterator();
                while (it.hasNext()) {
                    User Ba5 = ((C2EE) it.next()).Ba5();
                    if (Ba5 != null) {
                        A1E.add(Ba5);
                    }
                }
                BI4.A02(c5Tl, null, null, null, A002, AbstractC101904i3.A00(A0K2, AbstractC25228BEl.A0u(c5Tl), A1E), null, null, C5UA.A01(c5Tl, C30715DfD.A00(c5Hc, 17), 912262612), AbstractC27763CMe.A00, 6, 6, 1012, false, false);
            }
            if (AbstractC25230BEn.A1U(c5Tl, A0K, false)) {
                C0fH.A00(-248083828);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, c5Hc, interfaceC16820sZ, i, 2);
        }
    }
}
