package X;

import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.ui.collections.DirectThreadDetailsCollectionViewModel;
import com.instagram.save.model.SavedCollection;
import java.util.List;

/* renamed from: X.Dzu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31888Dzu extends C2UU {
    public final List A00 = AbstractC166987dD.A1E();
    public final C34426FFq A01;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        SavedCollection savedCollection;
        ImageUrl A1S;
        C14360o3.A0B(c3oo, 0);
        if ((c3oo instanceof E3M) && (savedCollection = ((DirectThreadDetailsCollectionViewModel) this.A00.get(i)).A00) != null) {
            E3M e3m = (E3M) c3oo;
            FpQ.A01(e3m.A01, 58, this.A01, savedCollection);
            C38321qM c38321qM = savedCollection.A04;
            if (c38321qM != null && (A1S = c38321qM.A1S()) != null) {
                e3m.A04.setUrl(A1S, AbstractC31171DnF.A0D(C32243EIc.__redex_internal_original_name));
            }
            e3m.A03.setText(savedCollection.A0G);
            e3m.A02.setText(AbstractC167017dG.A0k(e3m.A00.getResources(), AbstractC167017dG.A0K(savedCollection.A0E), R.plurals.collection_post_count));
        }
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        int intValue = C05F.A00(2)[i].intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new E1S(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.direct_thread_details_collection_loading_indicator, false));
            }
            throw B4Z.A00();
        }
        int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new E3M(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.direct_thread_details_redesign_collection_item, false));
    }

    public C31888Dzu(C34426FFq c34426FFq) {
        this.A01 = c34426FFq;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1680716110);
        int size = this.A00.size();
        C0f9.A0A(1868775946, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(94762748);
        int intValue = ((DirectThreadDetailsCollectionViewModel) this.A00.get(i)).A01.intValue();
        C0f9.A0A(1760398114, A03);
        return intValue;
    }
}
