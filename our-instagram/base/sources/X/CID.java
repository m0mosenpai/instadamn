package X;

import com.facebook.common.dextricks.DalvikInternals;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class CID {
    public static final void A00(C5Tl c5Tl, BP5 bp5, String str, String str2, C0s9 c0s9, C5Hc c5Hc, int i, int i2) {
        int i3;
        boolean z;
        c5Tl.Enr(2135900166);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25230BEn.A05(AbstractC25233BEq.A1U(c5Tl, c5Hc, i2) ? 1 : 0);
        }
        if ((i2 & 384) == 0) {
            i3 |= AbstractC25236BEt.A03(c5Tl, i);
        }
        if ((i2 & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, str2);
        }
        if ((i2 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, bp5);
        }
        if ((196608 & i2) == 0) {
            i3 |= AbstractC25232BEp.A0M(c5Tl, c0s9);
        }
        if ((74899 & i3) == 74898 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(502432314, "com.instagram.creator.agent.settings.facts.fragment.InformationScreen (InformationFragment.kt:105)");
            }
            c5Tl.Eno(-2094013940);
            if ((i3 & 112) == 32 || ((i3 & 64) != 0 && c5Tl.AH6(c5Hc))) {
                z = true;
            } else {
                z = false;
            }
            Object EEc = c5Tl.EEc();
            if (z || EEc == C5UI.A00) {
                EEc = C29908DGw.A01(c5Tl, c5Hc, 22);
            }
            C117505Tk A0J = AbstractC25225BEi.A0J(c5Tl);
            BVY A01 = AbstractC25656BVs.A01(c5Tl, (InterfaceC16820sZ) EEc, i, (i3 >> 6) & 14, 2);
            Object EEc2 = c5Tl.EEc();
            Object obj = C5UI.A00;
            C19L c19l = ((C137536Kz) AbstractC25234BEr.A0b(c5Tl, EEc2, obj)).A00;
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -2094011384);
            if (A0q == obj) {
                ArrayList A0q2 = AbstractC167017dG.A0q(c5Hc);
                Iterator it = c5Hc.iterator();
                while (it.hasNext()) {
                    int titleRes = ((InterfaceC30942Diw) it.next()).getTitleRes();
                    A0q2.add(new C26038BfR(Integer.valueOf(titleRes), null, C05F.A00, null, null));
                }
                A0q = AbstractC133095zb.A00(A0q2);
                c5Tl.FBy(A0q);
            }
            C5Hc c5Hc2 = (C5Hc) A0q;
            C117505Tk.A0L(A0J, false);
            int A03 = A01.A03();
            boolean A1X = AbstractC25232BEp.A1X(c5Tl, c19l, A01, -2094004969);
            Object EEc3 = c5Tl.EEc();
            if (A1X || EEc3 == obj) {
                EEc3 = C30172DRc.A00(c5Tl, c5Hc2, A01, c19l, 36);
            }
            CY1.A00(c5Tl, null, null, AbstractC25225BEi.A1B(A0J, EEc3, false), c5Hc2, A03, 48, 56, 0L);
            AbstractC28389Cfs.A00(c5Tl);
            AbstractC25663BVz.A01(null, A01, null, c5Tl, C118195Wf.A05, AbstractC25228BEl.A0V(), null, C5UA.A01(c5Tl, new C30725DfN(bp5, str, str2, c0s9, c5Hc), 944604964), 102236208, 7868);
            if (C0fH.A02()) {
                C0fH.A00(237624025);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DVH(bp5, c5Hc, c0s9, str, str2, i2, i, 0);
        }
    }
}
