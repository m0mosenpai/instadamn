package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class V1i extends C53Z implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "QuickPromotionDebugItemFragment";
    public C69703Vty A00;
    public C66414UGi A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "quick_promotion_item";
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String str;
        AbstractC25235BEs.A1H(interfaceC56362iU);
        C69703Vty c69703Vty = this.A00;
        if (c69703Vty != null) {
            str = c69703Vty.A00.name();
        } else {
            str = "Slot";
        }
        interfaceC56362iU.setTitle(AbstractC31174DnI.A0w(this, str, 2131958540));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1044080801);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.quick_promotion_slot_details_fragment, viewGroup, false);
        C69703Vty c69703Vty = this.A00;
        if (c69703Vty != null) {
            TextView A0N = AbstractC167007dF.A0N(inflate, R.id.qp_slot_info_tv);
            C27961Xa A00 = AbstractC54912fq.A00();
            UserSession session = getSession();
            QuickPromotionSlot quickPromotionSlot = c69703Vty.A00;
            C23031Ai A002 = AbstractC23021Ah.A00(getSession());
            String name = quickPromotionSlot.name();
            C14360o3.A0B(name, 0);
            boolean A08 = A00.A08(session, quickPromotionSlot, new C55372gc(A002.A01.getString(AnonymousClass001.A0R(name, "_qp_slot_impression_data"), null)));
            int i = 2131958518;
            if (A08) {
                i = 2131958521;
            }
            A0N.setText(i);
            RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(inflate, R.id.qp_slot_details_rv);
            ArrayList arrayList = new ArrayList();
            Map map = c69703Vty.A02;
            Map map2 = c69703Vty.A03;
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry entry = (Map.Entry) A15.next();
                EnumC61092qX enumC61092qX = (EnumC61092qX) entry.getKey();
                List<C117035Rm> list = (List) entry.getValue();
                if (list != null && (!list.isEmpty())) {
                    for (C117035Rm c117035Rm : list) {
                        Object obj = map2.get(c117035Rm.A02.A05);
                        if (obj != null) {
                            arrayList.add(new C69142ViX((C5OL) obj, enumC61092qX, c117035Rm));
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                }
            }
            this.A01 = new C66414UGi(this, arrayList);
            AbstractC31174DnI.A15(getContext(), recyclerView);
            recyclerView.A10(new C50H(requireContext(), 1));
            C66414UGi c66414UGi = this.A01;
            if (c66414UGi == null) {
                C14360o3.A0F("adapter");
                throw C00O.createAndThrow();
            }
            recyclerView.setAdapter(c66414UGi);
            schedule(new KK2(2, c69703Vty, this));
            C0f9.A09(-1459710673, A02);
            return inflate;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(533966296, A02);
        throw A0g;
    }
}
