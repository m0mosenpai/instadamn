package X;

import android.graphics.Bitmap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.DWq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30315DWq extends C0YY implements InterfaceC16620sF {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30315DWq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, float f, int i, int i2, int i3) {
        super(2);
        this.A01 = i3;
        this.A03 = i;
        this.A05 = obj;
        this.A00 = f;
        this.A04 = obj2;
        this.A07 = obj3;
        this.A0A = obj4;
        this.A08 = obj5;
        this.A06 = obj6;
        this.A09 = obj7;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.A01 != 0) {
            C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
            int i = this.A03;
            C5AH c5ah = (C5AH) this.A05;
            float f = this.A00;
            AbstractC27619CGp.A00((Bitmap) this.A04, A0S, c5ah, (InterfaceC16820sZ) this.A07, (InterfaceC16820sZ) this.A0A, (InterfaceC16820sZ) this.A06, (InterfaceC16820sZ) this.A09, (InterfaceC16660sJ) this.A08, f, i, AbstractC25225BEi.A04(this.A02));
        } else {
            C5Tl c5Tl = (C5Tl) obj;
            if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
                c5Tl.Em9();
            } else {
                if (C0fH.A02()) {
                    C0fH.A01(1927887614, "com.instagram.creation.capture.quickcapture.potato.capture.view.compose.PotatoCreationPostCaptureScreen.<anonymous> (PotatoCreationPostCaptureScreen.kt:55)");
                }
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A07;
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A0A;
                Bitmap bitmap = (Bitmap) this.A04;
                C5AH c5ah2 = (C5AH) this.A05;
                float f2 = this.A00;
                InterfaceC16820sZ interfaceC16820sZ3 = (InterfaceC16820sZ) this.A09;
                int i2 = this.A02;
                InterfaceC16820sZ interfaceC16820sZ4 = (InterfaceC16820sZ) this.A06;
                int i3 = this.A03;
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A08;
                C1130158n c1130158n = Modifier.A00;
                Alignment alignment = C118195Wf.A0E;
                InterfaceC1127857k A00 = C5XX.A00(alignment, false);
                int A002 = C5X2.A00(c5Tl);
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C59P A04 = C117505Tk.A04(c117505Tk);
                Modifier A01 = C5X3.A01(c5Tl, c1130158n);
                InterfaceC16820sZ interfaceC16820sZ5 = C5X8.A00;
                AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ5);
                InterfaceC16620sF interfaceC16620sF = C5X8.A03;
                InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A00, A04, interfaceC16620sF);
                InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
                }
                InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
                C119645bN c119645bN = C119645bN.A00;
                Modifier AB5 = c119645bN.AB5(alignment, AbstractC118175Wb.A02(c1130158n));
                Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -659092396);
                Object obj3 = C5UI.A00;
                C5XO c5xo = (C5XO) AbstractC25232BEp.A1C(c5Tl, A0q2, obj3);
                C117505Tk.A0L(c117505Tk, false);
                C5YS.A01(c5Tl, AbstractC25235BEs.A0F(c5xo, AB5, interfaceC16820sZ), C5Y7.A00(c5Tl, R.drawable.instagram_chevron_left_pano_outline_24, 0), 0, 18, AbstractC25226BEj.A0D(c5Tl));
                Modifier A08 = AbstractC118175Wb.A08(c119645bN.AB5(C118195Wf.A0D, c1130158n), 16.0f);
                C5XO c5xo2 = (C5XO) AbstractC25234BEr.A0Z(c5Tl, obj3, -659076044);
                C117505Tk.A0L(c117505Tk, false);
                Modifier A0F = AbstractC25235BEs.A0F(c5xo2, A08, interfaceC16820sZ2);
                String A003 = C5YD.A00(c5Tl, 2131973639);
                long A012 = AbstractC118155Vz.A01(17);
                C5WR.A0L(c5Tl, A0F, AbstractC25225BEi.A0X(c5Tl), A003, 3072, 16368, AbstractC25226BEj.A08(c5Tl), A012);
                Modifier A0P = AbstractC25225BEi.A0P(c119645bN, C30711Df9.A00(AbstractC118175Wb.A0E(c1130158n, 34.0f, 0.0f, 34.0f, 0.0f).Eq3(AbstractC118185Wd.A01), C5XU.A00, 0));
                InterfaceC1127857k A0M = AbstractC25235BEs.A0M(c5Tl);
                int A004 = C5X2.A00(c5Tl);
                C59P A042 = C117505Tk.A04(c117505Tk);
                Modifier A013 = C5X3.A01(c5Tl, A0P);
                AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ5);
                C5XJ.A00(c5Tl, A0M, interfaceC16620sF);
                if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
                }
                C5XJ.A00(c5Tl, A013, A1K);
                AbstractC27618CGo.A00(bitmap, c5Tl, c5ah2, interfaceC16820sZ3, f2, 0, 0);
                AbstractC25226BEj.A1O(c5Tl, c1130158n, 24.0f);
                AbstractC27616CGm.A00(c5Tl, interfaceC16820sZ4, i2, 0);
                AbstractC25226BEj.A1O(c5Tl, c1130158n, 16.0f);
                AbstractC27617CGn.A00(c5Tl, interfaceC16660sJ, i3, 0);
                AbstractC25226BEj.A1O(c5Tl, c1130158n, 16.0f);
                if (AbstractC25230BEn.A1T(c5Tl)) {
                    C0fH.A00(-1226931972);
                }
            }
        }
        return C0eB.A00;
    }
}
