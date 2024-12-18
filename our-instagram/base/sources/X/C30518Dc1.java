package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.Dc1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30518Dc1 extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final boolean A01;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5Tl c5Tl;
        Modifier A0A;
        int i;
        long A02;
        long j;
        switch (this.A00) {
            case 0:
                c5Tl = (C5Tl) obj2;
                if (AbstractC25228BEl.A0D(obj3) != 16 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(716439904, "com.instagram.aiconsumption.mifu.fragment.getCloseFriendsAudienceSubtitle.<anonymous> (MifuComposeUtil.kt:82)");
                    }
                    C2DC A00 = C5Y7.A00(c5Tl, R.drawable.instagram_chevron_right_pano_outline_24, 0);
                    long A0F = AbstractC25226BEj.A0F(c5Tl);
                    float f = 0.3f;
                    if (this.A01) {
                        f = 1.0f;
                    }
                    A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (A0F & 63)], C1132359l.A03(A0F), C1132359l.A02(A0F), C1132359l.A01(A0F), f);
                    boolean A022 = AbstractC13620mo.A02(AbstractC25228BEl.A0K(c5Tl));
                    Modifier modifier = Modifier.A00;
                    if (A022) {
                        modifier = CBB.A00(modifier, -1.0f, 1.0f);
                    }
                    C5YS.A01(c5Tl, modifier, A00, 0, 18, A02);
                    if (C0fH.A02()) {
                        i = 1371010668;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 1:
                c5Tl = (C5Tl) obj2;
                if ((AbstractC25232BEp.A0p(obj3, obj) & 17) != 16 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1930249016, "com.instagram.aistudio.editor.AiCreationTopicPickerScreen.<anonymous>.<anonymous>.<anonymous> (AiCreationTopicPickerScreen.kt:83)");
                    }
                    C1130158n c1130158n = Modifier.A00;
                    boolean z = this.A01;
                    if (z) {
                        A0A = AbstractC25227BEk.A0H(c1130158n, 4.0f);
                    } else {
                        A0A = AbstractC118175Wb.A0A(c1130158n, 28.0f, 16.0f);
                    }
                    String A002 = C5YD.A00(c5Tl, 2131952756);
                    C118125Vw A0c = AbstractC25226BEj.A0c(c5Tl);
                    long A0M = AbstractC25226BEj.A0M(c5Tl);
                    int i2 = 3;
                    if (z) {
                        i2 = 5;
                    }
                    C5WR.A0J(c5Tl, A0A, A0c, A002, i2, 16248, A0M);
                    if (C0fH.A02()) {
                        i = 994257493;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            default:
                Modifier modifier2 = (Modifier) obj;
                C5Tl c5Tl2 = (C5Tl) obj2;
                boolean A1X = AbstractC25231BEo.A1X(obj3, modifier2);
                if (AbstractC25227BEk.A1U(c5Tl2, 589983672)) {
                    C0fH.A01(-1521183638, "com.instagram.compose.igds.components.formfield.indicatorLine.<anonymous> (IgdsFormField.kt:248)");
                }
                if (this.A01) {
                    j = AbstractC25227BEk.A0g(c5Tl2, 1489819643).A0l;
                } else {
                    j = AbstractC25227BEk.A0g(c5Tl2, 1489820731).A0t;
                }
                C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl2, A1X);
                InterfaceC74953Yl A003 = C5WZ.A00(c5Tl2, new C6L4(j));
                boolean A1Y = AbstractC25227BEk.A1Y(c5Tl2, A003, 1489821987);
                Object EEc = c5Tl2.EEc();
                if (A1Y || EEc == C5UI.A00) {
                    EEc = C30185DRq.A01(c5Tl2, A003, 35);
                }
                Modifier A0W = AbstractC25230BEn.A0W(A0K, modifier2, EEc, A1X);
                if (C0fH.A02()) {
                    C0fH.A00(-1469843647);
                }
                C117505Tk.A0L(A0K, A1X);
                return A0W;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30518Dc1(boolean z, int i) {
        super(3);
        this.A00 = i;
        this.A01 = z;
    }
}
