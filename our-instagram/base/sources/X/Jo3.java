package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class Jo3 extends C2UU implements InterfaceC189068Yw {
    public final int A00;
    public final int A01;
    public final C8SG A02;
    public final C48278LYb A03;
    public final List A04 = AbstractC166987dD.A1E();

    @Override // X.InterfaceC189068Yw
    public final void EYj(List list, String str) {
        C14360o3.A0B(list, 0);
        List list2 = this.A04;
        list2.clear();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if (((Medium) obj).A03 >= 5000) {
                A1E.add(obj);
            }
        }
        list2.addAll(A1E);
        notifyDataSetChanged();
    }

    @Override // X.InterfaceC189068Yw
    public final void EdU(GalleryItem galleryItem, boolean z, boolean z2) {
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C44770Jrr c44770Jrr = (C44770Jrr) c3oo;
        C14360o3.A0B(c44770Jrr, 0);
        Medium medium = (Medium) this.A04.get(i);
        C14360o3.A0B(medium, 0);
        IgImageView igImageView = c44770Jrr.A04;
        C14360o3.A0C(igImageView, "null cannot be cast to non-null type android.widget.ImageView");
        igImageView.setImageBitmap(null);
        AbstractC31171DnF.A14(c44770Jrr.A03);
        c44770Jrr.A01 = medium;
        c44770Jrr.A00 = c44770Jrr.A02.AGR(null, c44770Jrr.A00, medium, c44770Jrr, null, null, null);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View A0R = AbstractC25226BEj.A0R(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.gallery_grid_item, false);
        A0R.setVisibility(0);
        AbstractC13880nE.A0h(A0R, this.A01, this.A00);
        return new C44770Jrr(A0R, this.A02, this);
    }

    @Override // X.InterfaceC189068Yw
    public final List ANA() {
        return C16930sl.A00;
    }

    public Jo3(C8SG c8sg, C48278LYb c48278LYb, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = c8sg;
        this.A03 = c48278LYb;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1315933809);
        int size = this.A04.size();
        C0f9.A0A(588774928, A03);
        return size;
    }
}
