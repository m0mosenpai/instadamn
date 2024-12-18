package X;

import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.DRr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30186DRr extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Modifier A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30186DRr(Modifier modifier, long j) {
        super(2);
        this.A00 = j;
        this.A01 = modifier;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1591191130, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:64)");
            }
            long j = this.A00;
            if (j != 9205357640488583168L) {
                c5Tl.Eno(1828881000);
                Modifier Eq3 = this.A01.Eq3(new SizeElement(C5XU.A00, AbstractC25231BEo.A00(j), AbstractC25232BEp.A00(j), Float.NaN, Float.NaN, false));
                InterfaceC1127857k A00 = C5XX.A00(C118195Wf.A0C, false);
                int A002 = C5X2.A00(c5Tl);
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C59P A04 = C117505Tk.A04(c117505Tk);
                Modifier A01 = C5X3.A01(c5Tl, Eq3);
                AbstractC25233BEq.A11(c5Tl, c117505Tk);
                AbstractC25231BEo.A12(c5Tl, A00, A04);
                InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
                }
                AbstractC25225BEi.A1K(c5Tl, A01);
                AbstractC28344CeW.A01(null, c5Tl, 0, 1);
                c5Tl.ASW();
            } else {
                c5Tl.Eno(1829217412);
                AbstractC28344CeW.A01(this.A01, c5Tl, 0, 0);
            }
            if (AbstractC25230BEn.A1Z(c5Tl, false)) {
                C0fH.A00(91904371);
            }
        }
        return C0eB.A00;
    }
}
