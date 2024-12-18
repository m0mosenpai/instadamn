package X;

import androidx.compose.ui.Modifier;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.CeM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28334CeM {
    public static final void A00(C5Tl c5Tl, Modifier modifier, User user, int i) {
        int i2;
        boolean A1R = AbstractC167007dF.A1R(0, modifier, user);
        c5Tl.Enr(415706182);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, user);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-160969575, "com.instagram.wonderwall.ui.compose.screens.WallUserMentionItem (WallMentionTypeAheadScreen.kt:89)");
            }
            InterfaceC1127857k A0M = AbstractC25236BEt.A0M(c5Tl, C118195Wf.A00, i2);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0M, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C2DB A002 = AbstractC43541zP.A00(c5Tl, user.Bhu());
            String username = user.getUsername();
            C1130158n c1130158n = Modifier.A00;
            C6LQ.A0C(c5Tl, AbstractC25231BEo.A0R(c1130158n, 56.0f), A002, username, 0);
            String username2 = user.getUsername();
            C5WR.A0B(c5Tl, AbstractC118185Wd.A0D(AbstractC118175Wb.A0E(c1130158n, 0.0f, 4.0f, 0.0f, 0.0f), 56.0f), AbstractC25225BEi.A0Y(c5Tl), username2, 3, A1R ? 1 : 0, 2, 48, 390, 11132, 0L);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-269203661);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30508Dbr.A01(ASZ, user, modifier, i, 29);
        }
    }

    public static final void A02(C5Tl c5Tl, List list, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        AbstractC167007dF.A1K(list, interfaceC16660sJ);
        c5Tl.Enr(-384383244);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, list) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1489116327, "com.instagram.wonderwall.ui.compose.screens.WallUserMentionRow (WallMentionTypeAheadScreen.kt:73)");
            }
            boolean z = true;
            Modifier A0U = AbstractC25226BEj.A0U(Modifier.A00);
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            C1333560c c1333560c = new C1333560c(16.0f, 0.0f, 16.0f, 0.0f);
            C6ID A01 = AbstractC118255Wn.A01(16.0f);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, list, -2061015206);
            if ((i2 & 112) != 32) {
                z = false;
            }
            boolean z2 = A1Z | z;
            Object EEc = c5Tl.EEc();
            if (z2 || EEc == C5UI.A00) {
                EEc = new C57751Pje(35, interfaceC16660sJ, list);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C6IS.A02(A01, c1333560c, null, c5Tl, interfaceC118225Wj, A0U, (InterfaceC16660sJ) EEc, 12804486, 74);
            if (C0fH.A02()) {
                C0fH.A00(-2021292269);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30508Dbr(list, interfaceC16660sJ, i, 30);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r16.AH6(r11) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
    
        if ((r23 & 4) != 0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C5Tl r16, androidx.compose.ui.Modifier r17, X.C50919Meo r18, java.lang.String r19, X.InterfaceC16820sZ r20, X.InterfaceC16660sJ r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28334CeM.A01(X.5Tl, androidx.compose.ui.Modifier, X.Meo, java.lang.String, X.0sZ, X.0sJ, int, int):void");
    }
}
