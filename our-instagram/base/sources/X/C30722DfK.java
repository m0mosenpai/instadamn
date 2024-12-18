package X;

import androidx.compose.ui.Modifier;
import java.util.List;

/* renamed from: X.DfK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30722DfK extends C0YY implements InterfaceC16600sD {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Modifier A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ InterfaceC16660sJ A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30722DfK(Modifier modifier, List list, InterfaceC16660sJ interfaceC16660sJ, int i) {
        super(4);
        this.A02 = list;
        this.A01 = modifier;
        this.A00 = i;
        this.A03 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int A0H = AbstractC166987dD.A0H(obj2);
        C5Tl c5Tl = (C5Tl) obj3;
        int A0H2 = AbstractC166987dD.A0H(obj4);
        if ((A0H2 & 6) == 0) {
            i = A0H2 | AbstractC25232BEp.A0R(c5Tl, obj);
        } else {
            i = A0H2;
        }
        if ((A0H2 & 48) == 0) {
            i |= AbstractC25232BEp.A09(c5Tl, A0H);
        }
        if ((i & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                AbstractC25225BEi.A1J(-461537120);
            }
            C26062Bfp c26062Bfp = (C26062Bfp) this.A02.get(A0H);
            c5Tl.Eno(-1274697785);
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0V = AbstractC25225BEi.A0V(c5Tl, interfaceC118225Wj);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0V, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C5YL c5yl = C5YJ.A00;
            C2DB A002 = AbstractC43541zP.A00(c5Tl, AbstractC25225BEi.A0t(c26062Bfp.A01));
            Modifier modifier = this.A01;
            C6LQ.A09(c5Tl, C5XR.A06(AbstractC25228BEl.A0X(C6L7.A02(AbstractC118185Wd.A0C(modifier, 32.0f), new C6L4(AbstractC25226BEj.A0E(c5Tl)), C5WF.A01(4.0f), 1.0f), 4.0f), new C29894DGi(15, this.A03, c26062Bfp)), A002, c5yl);
            Modifier A0E = AbstractC118175Wb.A0E(modifier, 16.0f, 0.0f, 0.0f, 0.0f);
            int i2 = c26062Bfp.A00;
            int i3 = this.A00;
            CI0.A00(c5Tl, A0E, AnonymousClass001.A01('/', i2, i3), null, i2 / i3, 0, 44, 0L, 0L);
            c5Tl.ASW();
            if (AbstractC25227BEk.A1b(c117505Tk, false)) {
                C0fH.A00(510602855);
            }
        }
        return C0eB.A00;
    }
}
