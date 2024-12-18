package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class Jo5 extends C2UU implements InterfaceC189068Yw {
    public final int A00;
    public final C8SG A01;
    public final MOO A02;
    public final Integer A03;
    public final ArrayList A04 = AbstractC166987dD.A1E();
    public final boolean A05;

    @Override // X.InterfaceC189068Yw
    public final void EYj(List list, String str) {
        C14360o3.A0B(list, 0);
        ArrayList arrayList = this.A04;
        arrayList.clear();
        arrayList.addAll(list);
        notifyDataSetChanged();
    }

    @Override // X.InterfaceC189068Yw
    public final void EdU(GalleryItem galleryItem, boolean z, boolean z2) {
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C44773Jru c44773Jru = (C44773Jru) c3oo;
        C14360o3.A0B(c44773Jru, 0);
        Medium medium = (Medium) AbstractC31173DnH.A0i(this.A04, i);
        C14360o3.A0B(medium, 0);
        c44773Jru.A02 = medium;
        RoundedCornerImageView roundedCornerImageView = c44773Jru.A04;
        roundedCornerImageView.A01 = medium.A07;
        boolean Cff = medium.Cff();
        IgTextView igTextView = c44773Jru.A03;
        if (Cff) {
            igTextView.setText(medium.B8m());
            igTextView.setVisibility(0);
        } else {
            igTextView.setVisibility(4);
        }
        View.OnLayoutChangeListener onLayoutChangeListener = c44773Jru.A00;
        if (onLayoutChangeListener != null) {
            roundedCornerImageView.removeOnLayoutChangeListener(onLayoutChangeListener);
            c44773Jru.A00 = null;
        }
        roundedCornerImageView.setImageDrawable(null);
        AbstractC43593JPy.A1A(roundedCornerImageView);
        c44773Jru.A01 = this.A01.AGR(null, c44773Jru.A01, medium, c44773Jru, null, null, null);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View A0C = AbstractC31173DnH.A0C(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.gallery_sticker_grid_item, false);
        AbstractC13880nE.A0W(A0C, this.A00);
        return new C44773Jru(A0C, this.A02, this.A03, this.A05);
    }

    public Jo5(C8SG c8sg, MOO moo, Integer num, int i, boolean z) {
        this.A01 = c8sg;
        this.A00 = i;
        this.A02 = moo;
        this.A05 = z;
        this.A03 = num;
    }

    @Override // X.InterfaceC189068Yw
    public final List ANA() {
        return AbstractC166987dD.A1E();
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1476487044);
        int size = this.A04.size();
        C0f9.A0A(-684206348, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        int A03 = C0f9.A03(-455732734);
        long hashCode = ((Medium) this.A04.get(i)).A0X.hashCode();
        C0f9.A0A(-1594246343, A03);
        return hashCode;
    }
}
