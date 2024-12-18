package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import java.util.Arrays;

/* loaded from: classes5.dex */
public abstract class CJY {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        long A02;
        long A022;
        long A023;
        long A024;
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC16820sZ, modifier);
        c5Tl.Enr(754862966);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, modifier);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1941920143, "com.instagram.opal.impl.ui.OpalFlipShimmer (OpalFlipShimmer.kt:30)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -1287064668);
            Object obj = C5UI.A00;
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) AbstractC25234BEr.A0c(c5Tl, A0q, obj, A1R);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            float A01 = AbstractC25230BEn.A01(AbstractC25230BEn.A1X(interfaceC74953Yl) ? 1 : 0);
            C25245BFe A00 = C25245BFe.A00(200, 100);
            c5Tl.Eno(-1287055334);
            boolean A1R2 = AbstractC25228BEl.A1R(i2);
            Object EEc = c5Tl.EEc();
            if (A1R2 || EEc == obj) {
                EEc = new C57752Pjf(interfaceC16820sZ, 45);
                c5Tl.FBy(EEc);
            }
            Modifier A002 = CB8.A00(modifier, AbstractC25231BEo.A05(AbstractC28454Ch4.A02(A00, c5Tl, AbstractC25225BEi.A1B(A0K, EEc, false), A01, 3120, 4)));
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -1287048416);
            if (A0q2 == obj) {
                A0q2 = DH3.A01(c5Tl, interfaceC74953Yl, 17);
            }
            C117505Tk.A0L(A0K, false);
            C14360o3.A0B(A0q2, 0);
            if (AbstractC25227BEk.A1U(c5Tl, 883414966)) {
                C0fH.A01(-1498198125, "com.instagram.opal.impl.ui.opalShimmerBrush (OpalFlipShimmer.kt:52)");
            }
            InterfaceC74953Yl interfaceC74953Yl2 = (InterfaceC74953Yl) C6M6.A00(c5Tl, null, DDU.A00, new Object[0], 3072, 6);
            int integer = AbstractC25235BEs.A0B(c5Tl).getInteger(R.integer.config_flip_overshoot_first_rotate_duration);
            float min = (Math.min(AbstractC25231BEo.A03(interfaceC74953Yl2), 900.0f) * 0.06f) / 900.0f;
            Float valueOf = Float.valueOf(0.0f);
            long j = C1132359l.A09;
            float f = min / 1.5f;
            A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (j & 63)], C1132359l.A03(j), C1132359l.A02(j), C1132359l.A01(j), f);
            C09530e4 A0r = AbstractC25230BEn.A0r(valueOf, A02);
            Float valueOf2 = Float.valueOf(0.2f);
            A022 = C5AC.A02(AbstractC1132459m.A0K[(int) (j & 63)], C1132359l.A03(j), C1132359l.A02(j), C1132359l.A01(j), min);
            C09530e4 A0r2 = AbstractC25230BEn.A0r(valueOf2, A022);
            Float valueOf3 = Float.valueOf(0.8f);
            A023 = C5AC.A02(AbstractC1132459m.A0K[(int) (j & 63)], C1132359l.A03(j), C1132359l.A02(j), C1132359l.A01(j), min);
            C09530e4 A0r3 = AbstractC25230BEn.A0r(valueOf3, A023);
            Float A0m = AbstractC25227BEk.A0m();
            A024 = C5AC.A02(AbstractC1132459m.A0K[(int) (j & 63)], C1132359l.A03(j), C1132359l.A02(j), C1132359l.A01(j), f);
            C09530e4[] c09530e4Arr = {A0r, A0r2, A0r3, AbstractC25230BEn.A0r(A0m, A024)};
            C0eB c0eB = C0eB.A00;
            boolean A1X = AbstractC25225BEi.A1X(c5Tl, interfaceC74953Yl2, AbstractC25227BEk.A1V(c5Tl, 668803298, integer));
            Object EEc2 = c5Tl.EEc();
            if (A1X || EEc2 == obj) {
                EEc2 = new C50530MSj(A0q2, interfaceC74953Yl2, null, integer, 19);
                c5Tl.FBy(EEc2);
            }
            AbstractC25228BEl.A1K(c5Tl, A0K, EEc2, c0eB, false);
            C25766Ba5 A012 = C6L6.A01((C09530e4[]) Arrays.copyOf(c09530e4Arr, 4), 3, AbstractC119395aw.A00(AbstractC25231BEo.A03(interfaceC74953Yl2) / 2.0f, AbstractC25231BEo.A03(interfaceC74953Yl2) / 2.0f), AbstractC119395aw.A00(AbstractC25231BEo.A03(interfaceC74953Yl2), AbstractC25231BEo.A03(interfaceC74953Yl2)));
            if (C0fH.A02()) {
                C0fH.A00(1303216410);
            }
            C117505Tk.A0L(A0K, false);
            if (AbstractC25227BEk.A1X(c5Tl, C6L3.A00(A002, A012, C5AF.A00))) {
                C0fH.A00(-1526541497);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, interfaceC16820sZ, modifier, i, 39);
        }
    }
}
