package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HBd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38906HBd extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ShopSelectorFragment";
    public AbstractC39667Hiw A00;
    public final InterfaceC09390do A05;
    public final InterfaceC11380iw A06;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public final C57112jm A01 = C57112jm.A00();
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C43207J8e(this, 46));
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new C43207J8e(this, 47));

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_shopping_shop_selector";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public C38906HBd() {
        J8U j8u = new J8U(this, 1);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C43207J8e(new C43207J8e(this, 48), 49));
        this.A05 = AbstractC25225BEi.A0a(new J8U(A00, 0), j8u, C43208J8f.A00(null, A00, 11), AbstractC25225BEi.A1D(C38319GtE.class));
        this.A06 = AbstractC31171DnF.A0D("instagram_shopping_shop_selector");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        List list;
        int A02 = C0f9.A02(458973640);
        C14360o3.A0B(layoutInflater, 0);
        C66362zD A0R = AbstractC31173DnH.A0R(new C66392zG(layoutInflater), new HIT(this.A06, (C154716xM) this.A02.getValue(), C43361JEc.A01(this, 7)));
        C38319GtE c38319GtE = (C38319GtE) this.A05.getValue();
        if (c38319GtE != null && (list = c38319GtE.A08) != null) {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0q.add(new C42288IoC((C38652Gyt) it.next()));
            }
            ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
            A0E.A01(A0q);
            A0R.A05(A0E);
        }
        View inflate = layoutInflater.inflate(R.layout.layout_recyclerview, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) inflate;
        AbstractC31174DnI.A15(getContext(), recyclerView);
        recyclerView.setAdapter(A0R);
        AbstractC37301Gc2.A0v(recyclerView, this.A01, this);
        C0f9.A09(1254840068, A02);
        return recyclerView;
    }
}
