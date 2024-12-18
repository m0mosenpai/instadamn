package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* loaded from: classes6.dex */
public final class EK4 extends AbstractC59962oe implements InterfaceC60112ot {
    public static final String __redex_internal_original_name = "DirectPhoneContactsFragment";
    public RecyclerView A00;
    public C31877Dzj A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final boolean A03 = true;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_phone_contacts_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A02;
        AbstractC12990ll A0k = AbstractC25230BEn.A0k(interfaceC09390do, 0);
        this.A01 = new C31877Dzj(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), ((C36276FzT) A0k.A01(C36276FzT.class, new C50153MDg(A0k, 28))).A00);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) AbstractC166997dE.A0R(view, R.id.search_box);
        igdsInlineSearchBox.setSearchGlyphColor(AbstractC167007dF.A09(requireContext(), R.attr.igds_color_secondary_text));
        igdsInlineSearchBox.setTextsize(AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material));
        igdsInlineSearchBox.setImeOptions(6);
        igdsInlineSearchBox.A02 = new C36509G8h(this, 4);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 1, false);
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.direct_phone_contacts_recycler_view);
        this.A00 = A0G;
        String str = "recyclerView";
        if (A0G != null) {
            A0G.setItemAnimator(null);
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(linearLayoutManager);
                RecyclerView recyclerView2 = this.A00;
                if (recyclerView2 != null) {
                    C31877Dzj c31877Dzj = this.A01;
                    if (c31877Dzj == null) {
                        str = "adapter";
                    } else {
                        recyclerView2.setAdapter(c31877Dzj);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.InterfaceC60112ot
    public final boolean CPM() {
        return this.A03;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31175DnJ.A1I(interfaceC56362iU, AbstractC31176DnK.A05(this, interfaceC56362iU).getString(2131972475));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-722174587);
        super.onCreate(bundle);
        C0f9.A09(1508120717, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-891835706);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_share_contacts, viewGroup, false);
        C0f9.A09(-652804683, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1521612394);
        super.onDestroy();
        C0f9.A09(1420851555, A02);
    }
}
