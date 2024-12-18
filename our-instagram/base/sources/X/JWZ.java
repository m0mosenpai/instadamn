package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class JWZ implements InterfaceC66382zF {
    public final int A00;
    public final Object A01;

    public JWZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC66382zF
    public final void DxB() {
        C69613Av c69613Av;
        List list;
        switch (this.A00) {
            case 0:
                LLk lLk = (LLk) this.A01;
                if (lLk.A0D && (c69613Av = lLk.A04.A00) != null) {
                    c69613Av.A05();
                }
                if (lLk.A0E) {
                    KWM kwm = lLk.A04;
                    kwm.A02.A05();
                    ((C98O) kwm).A08.A01(lLk.A12.size());
                }
                if (LLk.A0U(lLk) && lLk.A0I) {
                    KWM kwm2 = lLk.A04;
                    ((C98O) kwm2).A08.A01(lLk.A12.size());
                    C69613Av c69613Av2 = kwm2.A00;
                    if (c69613Av2 != null) {
                        c69613Av2.A05();
                    }
                    LLk.A0H(lLk);
                    return;
                }
                return;
            case 1:
                N6U n6u = (N6U) this.A01;
                RecyclerView recyclerView = n6u.A02;
                if (recyclerView == null) {
                    C14360o3.A0F("recyclerView");
                    throw C00O.createAndThrow();
                }
                recyclerView.A0h();
                C51053Mh7 c51053Mh7 = (C51053Mh7) n6u.A0O.getValue();
                C57745PjY c57745PjY = new C57745PjY(n6u, 17);
                OTU otu = c51053Mh7.A00;
                if (otu != null) {
                    c57745PjY.invoke(otu);
                    c51053Mh7.A00 = null;
                    return;
                }
                return;
            case 2:
                MerchantShoppingCartFragment merchantShoppingCartFragment = (MerchantShoppingCartFragment) this.A01;
                C41634IbP c41634IbP = merchantShoppingCartFragment.A0E;
                if (!merchantShoppingCartFragment.A0b && c41634IbP != null && merchantShoppingCartFragment.A0Z != null) {
                    for (C41730Ie1 c41730Ie1 : Collections.unmodifiableList(c41634IbP.A06)) {
                        if (merchantShoppingCartFragment.A0Z.containsKey(c41730Ie1.A05())) {
                            int A02 = merchantShoppingCartFragment.A07.A08.A02(c41730Ie1.A05());
                            if (A02 >= 0) {
                                RecyclerView recyclerView2 = merchantShoppingCartFragment.mRecyclerView;
                                AbstractC70663Fe abstractC70663Fe = recyclerView2.A0D;
                                abstractC70663Fe.getClass();
                                if (!AbstractC72193Ls.A06(abstractC70663Fe, recyclerView2, A02)) {
                                    C51111MiG c51111MiG = new C51111MiG(merchantShoppingCartFragment.requireContext(), merchantShoppingCartFragment, 1);
                                    ((AbstractC110824yu) c51111MiG).A00 = A02;
                                    AbstractC70663Fe abstractC70663Fe2 = merchantShoppingCartFragment.mRecyclerView.A0D;
                                    if (abstractC70663Fe2 != null) {
                                        abstractC70663Fe2.A10(c51111MiG);
                                    }
                                }
                                merchantShoppingCartFragment.A0b = true;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 3:
                C37546Gg2 c37546Gg2 = (C37546Gg2) this.A01;
                if (c37546Gg2.A0G) {
                    c37546Gg2.A02 = false;
                    list = c37546Gg2.A0E;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC16820sZ) it.next()).invoke();
                    }
                    list.clear();
                    return;
                }
                return;
            default:
                C37546Gg2 c37546Gg22 = (C37546Gg2) this.A01;
                if (!c37546Gg22.A0G) {
                    c37546Gg22.A02 = false;
                    list = c37546Gg22.A0E;
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC16820sZ) it2.next()).invoke();
                    }
                    list.clear();
                    return;
                }
                return;
        }
    }
}
