package X;

import android.graphics.Bitmap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.DUm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30259DUm extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C5AH A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16820sZ A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30259DUm(Bitmap bitmap, C5AH c5ah, ImageUrl imageUrl, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4) {
        super(2);
        this.A05 = interfaceC16820sZ;
        this.A02 = imageUrl;
        this.A04 = interfaceC16820sZ2;
        this.A07 = interfaceC16820sZ3;
        this.A00 = bitmap;
        this.A01 = c5ah;
        this.A06 = interfaceC16820sZ4;
        this.A03 = str;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-741362301, "com.instagram.creation.capture.quickcapture.potato.capture.view.compose.PotatoContributionPostCaptureScreen.<anonymous> (PotatoContributionPostCaptureScreen.kt:57)");
            }
            InterfaceC16820sZ interfaceC16820sZ = this.A05;
            ImageUrl imageUrl = this.A02;
            InterfaceC16820sZ interfaceC16820sZ2 = this.A04;
            InterfaceC16820sZ interfaceC16820sZ3 = this.A07;
            Bitmap bitmap = this.A00;
            C5AH c5ah = this.A01;
            InterfaceC16820sZ interfaceC16820sZ4 = this.A06;
            String str = this.A03;
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
            Modifier AB5 = c119645bN.AB5(alignment, AbstractC118175Wb.A08(c1130158n, 16.0f));
            C5XO c5xo = (C5XO) AbstractC25234BEr.A0Y(c5Tl, 1533161027);
            C117505Tk.A0L(c117505Tk, false);
            C5YS.A01(c5Tl, AbstractC25235BEs.A0F(c5xo, AB5, interfaceC16820sZ), C5Y7.A00(c5Tl, R.drawable.instagram_chevron_left_pano_outline_24, 0), 0, 18, AbstractC25226BEj.A0D(c5Tl));
            CY6.A01(c119645bN, c5Tl, imageUrl, interfaceC16820sZ2, interfaceC16820sZ3, 6);
            Modifier A0P = AbstractC25225BEi.A0P(c119645bN, C30711Df9.A00(AbstractC118175Wb.A0E(c1130158n, 34.0f, 0.0f, 34.0f, 0.0f).Eq3(AbstractC118185Wd.A01), C5XU.A00, 0));
            InterfaceC1127857k A0M = AbstractC25235BEs.A0M(c5Tl);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0P);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ5);
            C5XJ.A00(c5Tl, A0M, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            AbstractC27618CGo.A00(bitmap, c5Tl, c5ah, interfaceC16820sZ4, 0.0f, 0, 4);
            AbstractC25226BEj.A1O(c5Tl, c1130158n, 40.0f);
            Modifier A08 = AbstractC118175Wb.A08(c1130158n, 16.0f);
            String A17 = AbstractC25228BEl.A17(c5Tl, str, 2131969881);
            long A013 = AbstractC118155Vz.A01(14);
            C5WR.A0K(c5Tl, A08, AbstractC25225BEi.A0Y(c5Tl), A17, 3120, 16240, AbstractC25226BEj.A08(c5Tl), A013);
            AbstractC25226BEj.A1O(c5Tl, c1130158n, 16.0f);
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(-1786506576);
            }
        }
        return C0eB.A00;
    }
}
