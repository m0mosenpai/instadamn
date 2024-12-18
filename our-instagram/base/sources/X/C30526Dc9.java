package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Dc9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30526Dc9 extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final int A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30526Dc9(int i, int i2, Object obj) {
        super(3);
        this.A00 = i2;
        this.A01 = i;
        this.A02 = obj;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        C5Tl c5Tl = (C5Tl) obj2;
        if (this.A00 != 0) {
            if (AbstractC25228BEl.A0D(obj3) != 16 || !c5Tl.Bxj()) {
                if (C0fH.A02()) {
                    C0fH.A01(-636875507, "com.instagram.creator.achievements.modules.fragments.AboutAchievementsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AboutAchievementsFragment.kt:142)");
                }
                int i2 = this.A01;
                C26117Bh1 c26117Bh1 = (C26117Bh1) ((InterfaceC31082DlQ) this.A02);
                AbstractC27641CHm.A00(c5Tl, null, c26117Bh1.A01, c26117Bh1.A00, i2, 0, 1);
                if (C0fH.A02()) {
                    i = -2046881938;
                    C0fH.A00(i);
                }
            }
            c5Tl.Em9();
        } else {
            int A0H = AbstractC166987dD.A0H(obj3);
            C14360o3.A0B(obj, 0);
            if ((A0H & 17) != 16 || !c5Tl.Bxj()) {
                if (C0fH.A02()) {
                    C0fH.A01(-1566227293, "com.instagram.aistudio.editor.sectionHeaderItems.<anonymous> (AiConversationScreen.kt:111)");
                }
                C1130158n c1130158n = Modifier.A00;
                Modifier A0D = AbstractC118175Wb.A0D(AbstractC25226BEj.A0T(c1130158n), 16.0f, 24.0f, 0.0f);
                int i3 = this.A01;
                Number number = (Number) this.A02;
                InterfaceC1127857k A0f = AbstractC25228BEl.A0f(c5Tl, 0);
                int A00 = C5X2.A00(c5Tl);
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C59P A04 = C117505Tk.A04(c117505Tk);
                Modifier A01 = C5X3.A01(c5Tl, A0D);
                AbstractC25233BEq.A11(c5Tl, c117505Tk);
                AbstractC25231BEo.A12(c5Tl, A0f, A04);
                InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
                }
                AbstractC25225BEi.A1K(c5Tl, A01);
                C6L0 c6l0 = C6L0.A00;
                String A002 = C5YD.A00(c5Tl, i3);
                C5WR.A0R(c5Tl, c6l0.A00(c1130158n), AbstractC25225BEi.A0X(c5Tl), A002, AbstractC25226BEj.A0G(c5Tl));
                c5Tl.Eno(-674816588);
                if (number != null) {
                    C5WR.A0u(c5Tl, AbstractC25225BEi.A0X(c5Tl), AbstractC25228BEl.A16(c5Tl, number), AbstractC25226BEj.A0C(c5Tl));
                }
                if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                    i = 301439150;
                    C0fH.A00(i);
                }
            }
            c5Tl.Em9();
        }
        return C0eB.A00;
    }
}
