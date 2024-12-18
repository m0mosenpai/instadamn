package X;

import androidx.compose.ui.Modifier;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.Dco, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30567Dco extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30567Dco(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(3);
        this.A00 = i2;
        this.A06 = obj;
        this.A02 = obj2;
        this.A05 = obj3;
        this.A03 = obj4;
        this.A01 = i;
        this.A04 = obj5;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        String A16;
        int i;
        C5Tl c5Tl = (C5Tl) obj2;
        if (this.A00 != 0) {
            if (AbstractC25228BEl.A0E(obj3) != 16 || !c5Tl.Bxj()) {
                if (C0fH.A02()) {
                    C0fH.A01(872840753, "com.instagram.potato.reply.PotatoReplyLikesList.<anonymous>.<anonymous>.<anonymous> (PotatoReplyLikesList.kt:51)");
                }
                if (((Map) ((C51757Mtg) this.A06).A00).get(((User) this.A02).getUsername()) == C6A.A03) {
                    c5Tl.Eno(-56619382);
                    AbstractC28323CeB.A02(new BFI(this.A01, 21, this.A05, this.A03), c5Tl, 0);
                } else {
                    c5Tl.Eno(-56516276);
                    AbstractC28323CeB.A01(new BFI(this.A01, 22, this.A04, this.A03), c5Tl, 0);
                }
                if (AbstractC25230BEn.A1Z(c5Tl, false)) {
                    i = 1299782674;
                    C0fH.A00(i);
                }
            }
            c5Tl.Em9();
        } else {
            int A0H = AbstractC166987dD.A0H(obj3);
            C14360o3.A0B(obj, 0);
            if ((A0H & 17) != 16 || !c5Tl.Bxj()) {
                if (C0fH.A02()) {
                    C0fH.A01(-1384668132, "com.instagram.creator.agent.settings.facts.fragment.AddFact.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddFactFragment.kt:209)");
                }
                InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) this.A02;
                String A1D = AbstractC25226BEj.A1D(interfaceC74953Yl);
                C26045BfY c26045BfY = (C26045BfY) this.A06;
                String A00 = AbstractC136736Hc.A00(c5Tl, c26045BfY.A00);
                Integer num = c26045BfY.A03;
                c5Tl.Eno(-1726514331);
                if (num == null) {
                    A16 = null;
                } else {
                    A16 = AbstractC25228BEl.A16(c5Tl, num);
                }
                C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
                Modifier A0X = AbstractC25230BEn.A0X(AbstractC25226BEj.A0T(Modifier.A00), (C25338BJh) this.A03);
                c5Tl.Eno(-1726526134);
                int i2 = this.A01;
                boolean AH2 = c5Tl.AH2(i2);
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A04;
                boolean A1X = AbstractC25225BEi.A1X(c5Tl, interfaceC16620sF, AH2);
                InterfaceC74953Yl interfaceC74953Yl2 = (InterfaceC74953Yl) this.A05;
                Object EEc = c5Tl.EEc();
                if (A1X || EEc == C5UI.A00) {
                    EEc = new C30176DRg(interfaceC74953Yl, interfaceC74953Yl2, interfaceC16620sF, i2, 8);
                    c5Tl.FBy(EEc);
                }
                AbstractC28505Chy.A01(null, null, null, c5Tl, A0X, null, true, null, null, A1D, A00, A16, null, AbstractC25225BEi.A1B(A0K, EEc, false), 0, Integer.MAX_VALUE, 1572864, 48, 55216, false);
                if (C0fH.A02()) {
                    i = -1598186534;
                    C0fH.A00(i);
                }
            }
            c5Tl.Em9();
        }
        return C0eB.A00;
    }
}
