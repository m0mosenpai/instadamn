package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KNT extends KC7 {
    public static final String __redex_internal_original_name = "AlbumPickerFragment";
    public RecyclerView A00;
    public Jns A01;

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = AbstractC43592JPx.A0B(view, R.id.parent_recyclerview);
        UserSession A0r = AbstractC166987dD.A0r(super.A01);
        Resources A0N = AbstractC166997dE.A0N(this);
        int dimensionPixelOffset = A0N.getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        int dimensionPixelOffset2 = A0N.getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material);
        int A01 = (((AbstractC13890nF.A01(requireContext()) - (dimensionPixelOffset * 2)) - (dimensionPixelOffset2 * 3)) - A0N.getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding)) / 3;
        Jns jns = new Jns(new C51737MtK(A01, A01, 9), A0r);
        this.A01 = jns;
        jns.A00 = A01();
        RecyclerView recyclerView = this.A00;
        String str = "parentRecyclerview";
        if (recyclerView != null) {
            Jns jns2 = this.A01;
            if (jns2 == null) {
                str = "rowsAdapter";
            } else {
                recyclerView.setAdapter(jns2);
                RecyclerView recyclerView2 = this.A00;
                if (recyclerView2 != null) {
                    AbstractC31174DnI.A16(requireContext(), recyclerView2, 1, false);
                    RecyclerView recyclerView3 = this.A00;
                    if (recyclerView3 != null) {
                        UHR uhr = new UHR();
                        recyclerView3.A12(uhr);
                        recyclerView3.A14(uhr);
                        AbstractC43593JPy.A1E(getViewLifecycleOwner(), AbstractC31172DnG.A0E(A01().A05), new C50260MHp(this, 39), 17);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(490043480);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.album_picker_fragment_layout, viewGroup, false);
        C0f9.A09(506749860, A02);
        return inflate;
    }
}
