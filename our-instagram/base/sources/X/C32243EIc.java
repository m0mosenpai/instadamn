package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.direct.ui.collections.DirectThreadDetailsCollectionRowViewModel;
import java.util.List;

/* renamed from: X.EIc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32243EIc extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ThreadDetailsCollectionsFragment";
    public RecyclerView A00;
    public C34426FFq A01;
    public C31888Dzu A02;
    public DirectThreadDetailsCollectionRowViewModel A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = AbstractC31172DnG.A0G(view, R.id.collections_grid);
        C34426FFq c34426FFq = this.A01;
        if (c34426FFq != null) {
            C31888Dzu c31888Dzu = new C31888Dzu(c34426FFq);
            DirectThreadDetailsCollectionRowViewModel directThreadDetailsCollectionRowViewModel = this.A03;
            if (directThreadDetailsCollectionRowViewModel != null) {
                List list = directThreadDetailsCollectionRowViewModel.A01;
                C14360o3.A0B(list, 0);
                AbstractC31175DnJ.A0x(c31888Dzu, list, c31888Dzu.A00);
                this.A02 = c31888Dzu;
                if (this.A00 == null) {
                    AbstractC166987dD.A1T(C18950wb.A01, "ThreadDetailsCollectionsFragment - recycler view is null", 20134884);
                }
                RecyclerView recyclerView = this.A00;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
                    RecyclerView recyclerView2 = this.A00;
                    if (recyclerView2 != null) {
                        recyclerView2.setAdapter(this.A02);
                        return;
                    }
                }
                C14360o3.A0F("recyclerView");
                throw C00O.createAndThrow();
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalArgumentException A12;
        int i;
        int A02 = C0f9.A02(1484051978);
        super.onCreate(bundle);
        if (requireArguments().getString("ThreadDetailsCollectionsFragment_threadId") != null) {
            DirectThreadDetailsCollectionRowViewModel directThreadDetailsCollectionRowViewModel = (DirectThreadDetailsCollectionRowViewModel) requireArguments().getParcelable("ThreadDetailsCollectionsFragment_collectionsViewModel");
            if (directThreadDetailsCollectionRowViewModel != null) {
                this.A03 = directThreadDetailsCollectionRowViewModel;
                this.A01 = new C34426FFq(this);
                C0f9.A09(-1297890043, A02);
                return;
            }
            A12 = AbstractC166987dD.A12("collections view model can't be null");
            i = -1358957864;
        } else {
            A12 = AbstractC166987dD.A12("thread id can't be null");
            i = -1548312861;
        }
        C0f9.A09(i, A02);
        throw A12;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1686821707);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_thread_details_collections_fragment, false);
        C0f9.A09(905970812, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(173966548);
        super.onDestroy();
        this.A03 = null;
        this.A01 = null;
        C0f9.A09(-551871464, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-68617306);
        super.onDestroyView();
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null) {
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
        recyclerView.setAdapter(null);
        this.A02 = null;
        C0f9.A09(128032274, A02);
    }
}
