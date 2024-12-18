package X;

import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.N9a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52211N9a extends C1P1 {
    public final Collection A00;
    public final Collection A01;
    public final /* synthetic */ N6N A02;

    public C52211N9a(N6N n6n, Collection collection, Collection collection2) {
        AbstractC167017dG.A1R(collection, collection2);
        this.A02 = n6n;
        this.A00 = collection;
        this.A01 = collection2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-136020972);
        N6N n6n = this.A02;
        C11T.A03(new PLL(n6n));
        C9GR.A03(n6n.requireContext(), n6n.getString(2131976159), "HighlightsReel_unknown_error_occured", 0);
        C0f9.A0A(1792436694, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(124185373);
        EBB ebb = (EBB) obj;
        int A032 = C0f9.A03(787934861);
        C14360o3.A0B(ebb, 0);
        N6N n6n = this.A02;
        C11T.A03(new PLL(n6n));
        if (ebb.A00 != null) {
            InterfaceC09390do interfaceC09390do = n6n.A0A;
            if (!AbstractC167007dF.A1Z(interfaceC09390do)) {
                AbstractC31173DnH.A13(n6n.requireContext(), n6n, 2131963638);
            }
            InterfaceC09390do interfaceC09390do2 = n6n.A0C;
            ReelStore A04 = C1OU.A04(AbstractC166987dD.A0r(interfaceC09390do2));
            C37771pE c37771pE = ebb.A00;
            if (c37771pE != null) {
                Reel A0I = A04.A0I(c37771pE, true);
                if (AbstractC167007dF.A1Z(interfaceC09390do)) {
                    A04.A0c(AbstractC25225BEi.A15(n6n.A0B));
                }
                Iterator it = this.A00.iterator();
                while (it.hasNext()) {
                    AbstractC31172DnG.A0i(it).A4N(AbstractC25225BEi.A15(n6n.A0B));
                }
                Iterator it2 = this.A01.iterator();
                while (it2.hasNext()) {
                    AbstractC31172DnG.A0i(it2).A4O(AbstractC25225BEi.A15(n6n.A0B));
                }
                AbstractC31176DnK.A0Q(interfaceC09390do2).A05(new C3DH(A0I));
                n6n.requireActivity().setResult(-1);
                AbstractC25227BEk.A1B(n6n);
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A0A(-921607039, A032);
                throw A0g;
            }
        } else {
            C9GR.A03(n6n.requireContext(), n6n.getString(2131976159), "HighlightsReel_unknown_error_occured", 0);
        }
        C0f9.A0A(-1495505383, A032);
        C0f9.A0A(850238905, A03);
    }
}
