package X;

/* renamed from: X.CEg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27561CEg {
    public static final void A00(C5Tl c5Tl, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        C14360o3.A0B(interfaceC16660sJ, 0);
        c5Tl.Enr(-1433437924);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-707955486, "com.instagram.barcelona.interactive.OnEveryFrameWithDeltaSeconds (RepeatWithFrameDeltaSeconds.kt:10)");
            }
            C0eB c0eB = C0eB.A00;
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, -1174302198, i2);
            Object EEc = c5Tl.EEc();
            if (A1O || EEc == C5UI.A00) {
                EEc = new MBs(interfaceC16660sJ, null, 11);
                c5Tl.FBy(EEc);
            }
            AbstractC25231BEo.A10(c5Tl, EEc, c0eB);
            if (C0fH.A02()) {
                C0fH.A00(1408915072);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, interfaceC16660sJ, i, 22);
        }
    }
}
