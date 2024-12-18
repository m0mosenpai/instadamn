package X;

import androidx.compose.ui.Modifier;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cg7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28401Cg7 {
    public static final C5C8 A00(C5W5 c5w5, String str, String str2, long j) {
        C14360o3.A0B(str, 0);
        C6C7 A0U = AbstractC25231BEo.A0U(str2);
        int A0E = AbstractC25230BEn.A0E(str2, str);
        int A04 = AbstractC25226BEj.A04(str, A0E);
        A0U.A06(new C5W3(null, null, null, c5w5, null, 65530, j, 0L, 0L), A0E, A04);
        return AbstractC25227BEk.A0R(A0U, "tag_span", str, A0E, A04);
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, ImmutableList immutableList, C75 c75, int i, int i2) {
        int i3;
        List A1G;
        C1132359l[] c1132359lArr;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-1479936625);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, c75) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, immutableList);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier2);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-28830592, "com.instagram.schools.management.ui.OnboardingProgressComponent (SchoolOnboardingCommonComponents.kt:152)");
            }
            Modifier A0E = AbstractC118175Wb.A0E(modifier2, 16.0f, 12.0f, 12.0f, 16.0f);
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(AbstractC118255Wn.A01, c5Tl, C118195Wf.A05, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            c5Tl.Eno(2129107186);
            Iterator<E> it = immutableList.iterator();
            while (it.hasNext()) {
                C75 c752 = (C75) it.next();
                Modifier A0E2 = AbstractC118175Wb.A0E(AbstractC118185Wd.A08(c6l0.A00(Modifier.A00), 4.0f), 0.0f, 0.0f, 4.0f, 0.0f);
                c5Tl.Eno(2129114710);
                int ordinal = c752.ordinal();
                if (ordinal <= c75.ordinal()) {
                    long j = 4293656979L;
                    switch (ordinal) {
                        case 0:
                        case 1:
                            c1132359lArr = new C1132359l[2];
                            c1132359lArr[0] = AbstractC25227BEk.A0O(4294932992L);
                            j = 4294917941L;
                            break;
                        case 2:
                            c1132359lArr = new C1132359l[2];
                            c1132359lArr[0] = AbstractC25227BEk.A0O(4294918196L);
                            j = 4294642794L;
                            break;
                        case 3:
                            c1132359lArr = new C1132359l[2];
                            c1132359lArr[0] = AbstractC25227BEk.A0O(4294907734L);
                            j = 4294377851L;
                            break;
                        case 4:
                            c1132359lArr = new C1132359l[2];
                            c1132359lArr[0] = AbstractC25227BEk.A0O(4294708839L);
                            break;
                        case 5:
                            c1132359lArr = new C1132359l[2];
                            c1132359lArr[0] = AbstractC25227BEk.A0O(4293656979L);
                            j = 4292149700L;
                            break;
                        default:
                            throw B4Z.A00();
                    }
                    c1132359lArr[1] = AbstractC25227BEk.A0O(j);
                    A1G = AbstractC16960so.A1Q(c1132359lArr);
                } else {
                    A1G = AbstractC25232BEp.A1G(AbstractC25225BEi.A0S(C5XL.A00(c5Tl).A0i), C5XL.A00(c5Tl).A0i);
                }
                C25766Ba5 A002 = C6L6.A00(A1G, AbstractC119395aw.A00(0.0f, 0.0f), AbstractC119395aw.A00(Float.POSITIVE_INFINITY, 0.0f));
                C117505Tk.A0L(c117505Tk, false);
                C5XL.A02(c5Tl);
                AbstractC119685bS.A00(c5Tl, C6L3.A00(A0E2, A002, C5WE.A02));
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(2026383375);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 38, modifier2, c75, immutableList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C5Tl r34, androidx.compose.ui.Modifier r35, X.C75 r36, X.InterfaceC16820sZ r37, X.InterfaceC16820sZ r38, X.InterfaceC16820sZ r39, X.InterfaceC16820sZ r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28401Cg7.A02(X.5Tl, androidx.compose.ui.Modifier, X.C75, X.0sZ, X.0sZ, X.0sZ, X.0sZ, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C5Tl r13, com.google.common.collect.ImmutableList r14, X.C75 r15, X.InterfaceC16820sZ r16, X.InterfaceC16820sZ r17, X.InterfaceC16820sZ r18, X.InterfaceC16820sZ r19, X.InterfaceC16610sE r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28401Cg7.A03(X.5Tl, com.google.common.collect.ImmutableList, X.C75, X.0sZ, X.0sZ, X.0sZ, X.0sZ, X.0sE, int, int):void");
    }
}
