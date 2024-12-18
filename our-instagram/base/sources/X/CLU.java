package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.user.model.User;

/* loaded from: classes5.dex */
public abstract class CLU {
    public static final void A00(C5Tl c5Tl, InterfaceC74953Yl interfaceC74953Yl, InterfaceC74953Yl interfaceC74953Yl2, InterfaceC74953Yl interfaceC74953Yl3, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, int i) {
        int i2;
        String str;
        String str2;
        String optionalStringField;
        AbstractC167007dF.A1K(interfaceC74953Yl, interfaceC74953Yl2);
        AbstractC25234BEr.A1R(interfaceC74953Yl3, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4);
        c5Tl.Enr(1466639934);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, interfaceC74953Yl) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, interfaceC74953Yl2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, interfaceC74953Yl3);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ2);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16820sZ3);
        }
        if ((1572864 & i) == 0) {
            i2 |= AbstractC25232BEp.A0N(c5Tl, interfaceC16820sZ4);
        }
        if ((599187 & i2) == 599186 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1157456944, "instagram.features.devoptions.graphql.consistency.ConsistencyView (GraphQLRestConsistencyFragment.kt:176)");
            }
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            InterfaceC16820sZ interfaceC16820sZ5 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ5);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0Y, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            InterfaceC118275Wp interfaceC118275Wp = AbstractC118255Wn.A01;
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A05;
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(interfaceC118275Wp, c5Tl, interfaceC118225Wj, 0);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ5);
            C5XJ.A00(c5Tl, A02, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            User user = (User) interfaceC74953Yl.getValue();
            String str3 = "Loading...";
            if (user == null || (str = user.getFullName()) == null) {
                str = "Loading...";
            }
            C5WR.A12(c5Tl, AnonymousClass001.A0R("REST, using API Framework. Name: ", str));
            c5Tl.ASW();
            InterfaceC1127857k A022 = AbstractC118375Wz.A02(interfaceC118275Wp, c5Tl, interfaceC118225Wj, 0);
            int A003 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(c117505Tk);
            Modifier A013 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ5);
            C5XJ.A00(c5Tl, A022, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            User user2 = (User) interfaceC74953Yl2.getValue();
            if (user2 == null || (str2 = user2.getFullName()) == null) {
                str2 = "Loading...";
            }
            C5WR.A12(c5Tl, AnonymousClass001.A0R("GraphQL, convert to API Framework. Name: ", str2));
            c5Tl.ASW();
            InterfaceC1127857k A023 = AbstractC118375Wz.A02(interfaceC118275Wp, c5Tl, interfaceC118225Wj, 0);
            int A004 = C5X2.A00(c5Tl);
            C59P A044 = C117505Tk.A04(c117505Tk);
            Modifier A014 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ5);
            C5XJ.A00(c5Tl, A023, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A044, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A014, A1K);
            C2JS c2js = (C2JS) interfaceC74953Yl3.getValue();
            if (c2js != null && (optionalStringField = c2js.getOptionalStringField(0, "full_name")) != null) {
                str3 = optionalStringField;
            }
            C5WR.A12(c5Tl, AnonymousClass001.A0R("GraphQL, using fragment models. Name: ", str3));
            c5Tl.ASW();
            InterfaceC1127857k A024 = AbstractC118375Wz.A02(interfaceC118275Wp, c5Tl, interfaceC118225Wj, 0);
            int A005 = C5X2.A00(c5Tl);
            C59P A045 = C117505Tk.A04(c117505Tk);
            Modifier A015 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ5);
            C5XJ.A00(c5Tl, A024, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A045, A0q) || !AbstractC25231BEo.A1O(c5Tl, A005)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A005);
            }
            C5XJ.A00(c5Tl, A015, A1K);
            Modifier A0A = AbstractC118175Wb.A0A(c1130158n, 0.0f, 8.0f);
            C6GA c6ga = C6GA.A00;
            C6GE.A05(c5Tl, A0A, c6ga.A02(c5Tl), "Mutate API Framework model", interfaceC16820sZ, ((i2 >> 9) & 14) | 1573296);
            c5Tl.ASW();
            InterfaceC1127857k A025 = AbstractC118375Wz.A02(interfaceC118275Wp, c5Tl, interfaceC118225Wj, 0);
            int A006 = C5X2.A00(c5Tl);
            C59P A046 = C117505Tk.A04(c117505Tk);
            Modifier A016 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ5);
            C5XJ.A00(c5Tl, A025, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A046, A0q) || !AbstractC25231BEo.A1O(c5Tl, A006)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A006);
            }
            C5XJ.A00(c5Tl, A016, A1K);
            C6GE.A05(c5Tl, AbstractC118175Wb.A0A(c1130158n, 0.0f, 8.0f), c6ga.A02(c5Tl), "Publish update to Pando", interfaceC16820sZ2, ((i2 >> 12) & 14) | 1573296);
            c5Tl.ASW();
            InterfaceC1127857k A026 = AbstractC118375Wz.A02(interfaceC118275Wp, c5Tl, interfaceC118225Wj, 0);
            int A007 = C5X2.A00(c5Tl);
            C59P A047 = C117505Tk.A04(c117505Tk);
            Modifier A017 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ5);
            C5XJ.A00(c5Tl, A026, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A047, A0q) || !AbstractC25231BEo.A1O(c5Tl, A007)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A007);
            }
            C5XJ.A00(c5Tl, A017, A1K);
            C6GE.A05(c5Tl, AbstractC118175Wb.A0A(c1130158n, 0.0f, 8.0f), c6ga.A02(c5Tl), "Refetch REST", interfaceC16820sZ3, ((i2 >> 15) & 14) | 1573296);
            c5Tl.ASW();
            InterfaceC1127857k A027 = AbstractC118375Wz.A02(interfaceC118275Wp, c5Tl, interfaceC118225Wj, 0);
            int A008 = C5X2.A00(c5Tl);
            C59P A048 = C117505Tk.A04(c117505Tk);
            Modifier A018 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ5);
            C5XJ.A00(c5Tl, A027, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A048, A0q) || !AbstractC25231BEo.A1O(c5Tl, A008)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A008);
            }
            C5XJ.A00(c5Tl, A018, A1K);
            C6GE.A05(c5Tl, AbstractC118175Wb.A0A(c1130158n, 0.0f, 8.0f), c6ga.A02(c5Tl), "Refetch GraphQL", interfaceC16820sZ4, ((i2 >> 18) & 14) | 1573296);
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(354125302);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30289DVq(i, 7, interfaceC74953Yl, interfaceC74953Yl2, interfaceC74953Yl3, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4);
        }
    }
}
