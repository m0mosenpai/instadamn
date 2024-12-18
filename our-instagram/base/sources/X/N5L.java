package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.util.List;

/* loaded from: classes9.dex */
public final class N5L extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PublisherControlFragment";
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A01 = C57509Pfj.A00(this, 40);
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131963850);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.loading_indicator);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        AbstractC31178DnM.A0z(this, recyclerView);
        AbstractC37304Gc5.A10(recyclerView, this.A01);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new JTH(c07s, this, viewLifecycleOwner, recyclerView, findViewById, (InterfaceC23621Ds) null, 47), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public N5L() {
        C57509Pfj c57509Pfj = new C57509Pfj(this, 44);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57509Pfj(new C57509Pfj(this, 41), 42));
        this.A02 = AbstractC25225BEi.A0a(new C57509Pfj(A00, 43), c57509Pfj, new C57255Pbd(29, null, A00), AbstractC25225BEi.A1D(C50934Mf3.class));
    }

    public static final void A00(N5L n5l, List list, List list2, int i) {
        String quantityString;
        int size = list2.size();
        if (size <= 5) {
            quantityString = AbstractC31175DnJ.A0a(", ", list2);
        } else {
            int i2 = size - 5;
            quantityString = AbstractC166997dE.A0N(n5l).getQuantityString(i, i2, AbstractC166987dD.A16(list2), list2.get(1), list2.get(2), list2.get(3), list2.get(4), Integer.valueOf(i2));
        }
        list.add(new C56475P5p(quantityString, R.style.control_option_title_text));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1314368080);
        super.onCreate(bundle);
        getParentFragmentManager().A0u(new C55552Olm(this, 3), this, "BLOCKLIST_FRAGMENT_REQUEST_KEY");
        C0f9.A09(393284472, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1341733881);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.creator_blocklist, false);
        C0f9.A09(-1385716381, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(2086751964);
        super.onDestroy();
        getParentFragmentManager().A0w("BLOCKLIST_FRAGMENT_REQUEST_KEY");
        C0f9.A09(-34427244, A02);
    }
}
