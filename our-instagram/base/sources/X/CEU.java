package X;

import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CEU {
    public static final void A00(C5Tl c5Tl, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        AbstractC167017dG.A1S(interfaceC16820sZ, interfaceC16820sZ2);
        c5Tl.Enr(-1537385611);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, str3);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0e(c5Tl, z);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16820sZ2);
        }
        if ((74899 & i2) == 74898 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(339927218, "com.instagram.barcelona.feed.post.ui.PostUserFollowPromptDialog (PostUserFollowPromptDialog.kt:23)");
            }
            Object A11 = AbstractC25225BEi.A11(c5Tl);
            Object AJX = c5Tl.AJX(C5VZ.A00);
            if (z) {
                c5Tl.Eno(889125318);
                i3 = 2131953714;
            } else {
                c5Tl.Eno(889128328);
                i3 = 2131953716;
            }
            String A17 = AbstractC25228BEl.A17(c5Tl, str, i3);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            if (z) {
                c5Tl.Eno(889134021);
                i4 = 2131953713;
            } else {
                c5Tl.Eno(889137127);
                i4 = 2131953715;
            }
            String A00 = C5YD.A00(c5Tl, i4);
            C117505Tk.A0L(A0K, false);
            C26079Bg8 c26079Bg8 = new C26079Bg8(C05F.A01, A00, interfaceC16820sZ2, 12);
            String A002 = C5YD.A00(c5Tl, 2131953712);
            Integer num = C05F.A00;
            int i5 = i2 & 112;
            int i6 = i2 & 896;
            boolean A1W = AbstractC25233BEq.A1W(c5Tl, A11, AJX, 889150319) | AbstractC167007dF.A1P(i5, 32) | AbstractC25232BEp.A1S(i6);
            Object EEc = c5Tl.EEc();
            if (A1W || EEc == C5UI.A00) {
                EEc = new C57265Pbn(AJX, A11, str3, str2, 2);
                c5Tl.FBy(EEc);
            }
            AbstractC28433Cgh.A01(null, c5Tl, c26079Bg8, new C26079Bg8(num, A002, AbstractC25225BEi.A1A(A0K, EEc, false), 12), null, A17, null, interfaceC16820sZ, ((i2 >> 12) & 14) | 100663296, 3812, true);
            C0eB c0eB = C0eB.A00;
            boolean A1W2 = AbstractC25233BEq.A1W(c5Tl, A11, AJX, 889161311) | AbstractC167007dF.A1P(i5, 32) | AbstractC25232BEp.A1S(i6);
            Object EEc2 = c5Tl.EEc();
            if (A1W2 || EEc2 == C5UI.A00) {
                EEc2 = new MBY(AJX, A11, str3, str2, null, 2);
                c5Tl.FBy(EEc2);
            }
            if (AbstractC25232BEp.A1V(c5Tl, A0K, EEc2, c0eB, false)) {
                C0fH.A00(571767234);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30234DTn(str, str2, str3, interfaceC16820sZ, interfaceC16820sZ2, i, z);
        }
    }
}
