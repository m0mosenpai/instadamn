package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.compose.core.ui.IgClickableTextKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CJ4 {
    /* JADX WARN: Type inference failed for: r8v0, types: [boolean] */
    public static final void A00(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, C5Hc c5Hc, int i) {
        int i2;
        int i3;
        Object obj;
        Object obj2;
        Object[] objArr;
        Object obj3;
        Object obj4;
        Object obj5;
        String A01;
        Object obj6;
        Object obj7;
        ?? A1R = AbstractC167007dF.A1R(0, c5Hc, interfaceC16820sZ);
        c5Tl.Enr(-211158828);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c5Hc) | i;
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
                C0fH.A01(-1115963257, "com.instagram.friendmap.view.compose.FriendMapNotesNux (FriendMapNotesNux.kt:28)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            InterfaceC1127857k A0e = AbstractC25228BEl.A0e(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0T);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0e, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            C6LQ.A05(c5Tl, A0T, C5Y7.A00(c5Tl, R.drawable.friend_map_notes_illo_friend_map_notes, 0));
            String A002 = AbstractC136736Hc.A00(c5Tl, 2131962891);
            C5WR.A0Z(c5Tl, AbstractC118175Wb.A0E(c1130158n, C5XT.A02(c5Tl, R.dimen.action_button_min_width), C5XT.A01(c5Tl), C5XT.A02(c5Tl, R.dimen.action_button_min_width), 0.0f), AbstractC28417CgO.A00(c5Tl), A002, AbstractC25226BEj.A0G(c5Tl));
            if (C0fH.A02()) {
                C0fH.A01(1479705564, "com.instagram.friendmap.view.compose.subtitle (FriendMapNotesNux.kt:68)");
            }
            C6C7 A0g = AbstractC25228BEl.A0g();
            int size = c5Hc.size();
            String A003 = AbstractC136736Hc.A00(c5Tl, 2131962890);
            String str = "";
            if (size <= A1R) {
                c5Tl.Eno(1336018075);
                C117505Tk.A0L(c117505Tk, false);
                A01 = "";
            } else {
                if (size == 2) {
                    c5Tl.Eno(-233995686);
                    i3 = 2131962894;
                    if (c5Hc.size() <= 0) {
                        obj6 = "";
                    } else {
                        obj6 = c5Hc.get(0);
                    }
                    if (A1R >= c5Hc.size()) {
                        obj7 = "";
                    } else {
                        obj7 = c5Hc.get(A1R == true ? 1 : 0);
                    }
                    objArr = new Object[]{obj6, obj7};
                } else if (size == 3) {
                    c5Tl.Eno(-233987396);
                    i3 = 2131962893;
                    if (c5Hc.size() <= 0) {
                        obj3 = "";
                    } else {
                        obj3 = c5Hc.get(0);
                    }
                    if (A1R >= c5Hc.size()) {
                        obj4 = "";
                    } else {
                        obj4 = c5Hc.get(A1R == true ? 1 : 0);
                    }
                    if (2 >= c5Hc.size()) {
                        obj5 = "";
                    } else {
                        obj5 = c5Hc.get(2);
                    }
                    objArr = new Object[]{obj3, obj4, obj5};
                } else {
                    c5Tl.Eno(-233977232);
                    i3 = 2131962892;
                    if (c5Hc.size() <= 0) {
                        obj = "";
                    } else {
                        obj = c5Hc.get(0);
                    }
                    if (A1R >= c5Hc.size()) {
                        obj2 = "";
                    } else {
                        obj2 = c5Hc.get(A1R == true ? 1 : 0);
                    }
                    objArr = new Object[]{obj, obj2, Integer.valueOf(c5Hc.size() - 2)};
                }
                A01 = AbstractC136736Hc.A01(c5Tl, objArr, i3);
                C117505Tk.A0L(c117505Tk, false);
            }
            int length = A01.length();
            if (AbstractC167007dF.A1O(length)) {
                str = " ";
            }
            String A0g2 = AnonymousClass001.A0g(A003, str, A01);
            A0g.A09(A0g2);
            if (length > 0) {
                if (size > 3) {
                    size = 2;
                }
                List A0d = AbstractC001800i.A0d(c5Hc, size);
                ArrayList<C09530e4> A1E = AbstractC166987dD.A1E();
                Iterator it = A0d.iterator();
                while (it.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it);
                    int A08 = AbstractC001900j.A08(A0g2, A1B, 0, false);
                    int A042 = AbstractC25226BEj.A04(A1B, A08);
                    C09530e4 A0o = AbstractC167007dF.A0o(Integer.valueOf(A08), A042);
                    if (A08 >= 0) {
                        StringBuilder sb = A0g.A00;
                        if (A08 <= sb.length() && A08 <= A042 && A042 <= sb.length()) {
                            A1E.add(A0o);
                        }
                    }
                }
                for (C09530e4 c09530e4 : A1E) {
                    A0g.A06(new C5W3(null, null, null, C5W5.A01, null, 65531, 0L, 0L, 0L), AbstractC25230BEn.A0F(c09530e4), AbstractC25229BEm.A0A(c09530e4));
                }
            }
            C5C8 A02 = A0g.A02();
            if (C0fH.A02()) {
                C0fH.A00(834836124);
            }
            IgClickableTextKt.A04(c5Tl, AbstractC118175Wb.A0A(AbstractC118175Wb.A0A(c1130158n, C5XT.A02(c5Tl, R.dimen.abc_star_medium), C5XT.A00(c5Tl)), C5XT.A01(c5Tl), 0.0f), A02, AbstractC25225BEi.A0Y(c5Tl), DOP.A00, 3, DalvikInternals.IOPRIO_BACKGROUND, AbstractC25226BEj.A0M(c5Tl));
            c5Tl.ASW();
            C0eB c0eB = C0eB.A00;
            boolean A1Y = AbstractC25234BEr.A1Y(c5Tl, 974385206, i2);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                EEc = new MC2(interfaceC16820sZ, null, 39);
                c5Tl.FBy(EEc);
            }
            if (AbstractC25232BEp.A1V(c5Tl, c117505Tk, EEc, c0eB, false)) {
                C0fH.A00(-392427026);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, c5Hc, interfaceC16820sZ, i, 27);
        }
    }
}
