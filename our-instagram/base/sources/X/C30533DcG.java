package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.compose.ui.Modifier;

/* renamed from: X.DcG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30533DcG extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30533DcG(Object obj, int i, int i2, int i3) {
        super(3);
        this.A00 = i3;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = obj;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        if (this.A00 != 0) {
            Modifier modifier = (Modifier) obj;
            C5Tl c5Tl = (C5Tl) obj2;
            boolean A1X = AbstractC25231BEo.A1X(obj3, modifier);
            if (AbstractC25227BEk.A1U(c5Tl, -1610575008)) {
                C0fH.A01(505922081, "com.instagram.creation.genai.magicmod.common.ui.detectMagicModImageTaps.<anonymous> (MagicModBackdropSegmentedImage.kt:90)");
            }
            InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A03;
            if (interfaceC16660sJ != null) {
                C0eB c0eB = C0eB.A00;
                c5Tl.Eno(-697148493);
                int i = this.A02;
                boolean AH2 = c5Tl.AH2(i);
                int i2 = this.A01;
                boolean A1V = AbstractC25228BEl.A1V(c5Tl, interfaceC16660sJ, AH2, c5Tl.AH2(i2));
                Object EEc = c5Tl.EEc();
                if (A1V || EEc == C5UI.A00) {
                    EEc = new PZ4(null, interfaceC16660sJ, i, i2);
                    c5Tl.FBy(EEc);
                }
                AbstractC25225BEi.A1V(c5Tl, A1X);
                obj4 = C6KX.A00(modifier, c0eB, (InterfaceC16620sF) EEc);
            } else {
                obj4 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A00(-1997100009);
            }
            AbstractC25225BEi.A1V(c5Tl, A1X);
            return obj4;
        }
        int A0H = AbstractC166987dD.A0H(obj);
        int A0H2 = AbstractC166987dD.A0H(obj2);
        int A0H3 = AbstractC166987dD.A0H(obj3);
        if (Color.alpha(A0H3) != this.A02) {
            ((Bitmap) this.A03).setPixel(A0H, A0H2, AbstractC167017dG.A02(this.A01, Color.alpha(A0H3)));
        }
        return C0eB.A00;
    }
}
