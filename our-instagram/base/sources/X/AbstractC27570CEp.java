package X;

import android.content.res.Resources;
import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.CEp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27570CEp {
    public static final void A00(Modifier modifier, C5Tl c5Tl, int i, int i2) {
        int i3;
        long A02;
        long A022;
        C14360o3.A0B(modifier, 1);
        c5Tl.Enr(-2011648080);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1166503316, "com.instagram.barcelona.quotemedia.QuoteCountButton (QuoteCountButton.kt:24)");
            }
            C5WI A00 = C5WF.A00();
            A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (r0 & 63)], C1132359l.A03(r0), C1132359l.A02(r0), C1132359l.A01(C1132359l.A01), 0.4f);
            Modifier A01 = C6L3.A01(modifier, A00, A02);
            A022 = C5AC.A02(AbstractC1132459m.A0K[(int) (r0 & 63)], C1132359l.A03(r0), C1132359l.A02(r0), C1132359l.A01(C1132359l.A09), 0.2f);
            Modifier A0A = AbstractC118175Wb.A0A(C6L3.A01(A01, A00, A022), 10.0f, 5.0f);
            InterfaceC1127857k A0S = AbstractC25231BEo.A0S(c5Tl);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0A);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0S, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            C2DC A003 = C5Y7.A00(c5Tl, R.drawable.instagram_search_pano_filled_24, 0);
            C1130158n c1130158n = Modifier.A00;
            C5YS.A03(c5Tl, AbstractC118185Wd.A0C(c1130158n, 14.0f), A003, AbstractC25226BEj.A0D(c5Tl));
            Resources A0B = AbstractC25235BEs.A0B(c5Tl);
            C14360o3.A07(A0B);
            C5WR.A0Y(c5Tl, AbstractC118175Wb.A0E(c1130158n, 2.0f, 0.0f, 0.0f, 0.0f), AbstractC25226BEj.A0f(c5Tl), C84963qk.A04(A0B, Integer.valueOf(i), 1000, true, false), AbstractC25226BEj.A0D(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-443521049);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30501Dbk.A01(ASZ, modifier, i, i2, 4);
        }
    }
}
