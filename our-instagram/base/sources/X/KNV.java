package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KNV extends KC7 implements MOR {
    public static final String __redex_internal_original_name = "ShowAllAlbumsFragment";
    public RecyclerView A00;
    public KNS A01;

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        int dimensionPixelOffset = AbstractC166997dE.A0N(this).getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A00 = AbstractC43592JPx.A0B(view, R.id.albums_recyclerview);
        int A01 = (AbstractC13890nF.A01(requireContext()) - (dimensionPixelOffset * 3)) / 2;
        UserSession A0r = AbstractC166987dD.A0r(super.A01);
        Jn9 A012 = A01();
        C51737MtK c51737MtK = new C51737MtK(A01, A01, 9);
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            KNS kns = new KNS(c51737MtK, A0r, new C44321JiD(recyclerView, this), A012);
            this.A01 = kns;
            RecyclerView recyclerView2 = this.A00;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(kns);
                RecyclerView recyclerView3 = this.A00;
                if (recyclerView3 != null) {
                    recyclerView3.setLayoutManager(new GridLayoutManager(requireContext(), 2, 1, false));
                    int i = requireArguments().getInt("args_album_category");
                    AbstractC43593JPy.A1E(getViewLifecycleOwner(), AbstractC31172DnG.A0E(A01().A05), new DHO(i, 11, this), 19);
                    RecyclerView recyclerView4 = this.A00;
                    if (recyclerView4 != null) {
                        recyclerView4.A10(new JoJ(1, 2, dimensionPixelOffset, dimensionPixelOffset));
                        return;
                    }
                }
            }
        }
        C14360o3.A0F("albumsRecyclerview");
        throw C00O.createAndThrow();
    }

    @Override // X.MOR
    public final /* bridge */ /* synthetic */ void DLn(Object obj, int i) {
        C51756Mtf c51756Mtf = (C51756Mtf) obj;
        C14360o3.A0B(c51756Mtf, 0);
        A01().CiN(c51756Mtf, i);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1293410477);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.show_all_albums_fragment_layout, viewGroup, false);
        C0f9.A09(-385787353, A02);
        return inflate;
    }
}
