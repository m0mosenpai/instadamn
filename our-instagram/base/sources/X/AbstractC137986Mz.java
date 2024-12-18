package X;

/* renamed from: X.6Mz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC137986Mz {
    public static final void A00(C5Tl c5Tl, InterfaceC16610sE interfaceC16610sE, int i) {
        int i2;
        c5Tl.Enr(674185128);
        if ((i & 6) == 0) {
            int i3 = 2;
            if (c5Tl.AH6(interfaceC16610sE)) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(839529685, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)");
            }
            C5UP c5up = C5VP.A00;
            Object A01 = C5UT.A01(c5up, C117505Tk.A04((C117505Tk) c5Tl));
            Object[] objArr = {A01};
            C5C6 c5c6 = new C5C6(new DRS(A01, 41), C6N0.A00);
            boolean AH6 = c5Tl.AH6(A01);
            Object EEc = c5Tl.EEc();
            if (AH6 || EEc == C5UI.A00) {
                EEc = new C9EV(A01, 8);
                c5Tl.FBy(EEc);
            }
            Object A00 = C6M6.A00(c5Tl, c5c6, (InterfaceC16820sZ) EEc, objArr, 0, 4);
            AbstractC117695Ue.A00(c5Tl, c5up.A02(A00), C5UA.A01(c5Tl, new C207169Ev(1, interfaceC16610sE, A00), 1863926504), 56);
            if (C0fH.A02()) {
                C0fH.A00(-1586922590);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30499Dbi(interfaceC16610sE, i, 3);
        }
    }
}
