package X;

import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.List;

/* renamed from: X.Gtv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38359Gtv extends C2UU {
    public ProductVariantDimension A01;
    public C41072IGp A02;
    public final InterfaceC11380iw A03;
    public final List A04 = AbstractC166987dD.A1E();
    public final List A06 = AbstractC166987dD.A1E();
    public final List A05 = AbstractC166987dD.A1E();
    public int A00 = -1;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C38444GvR c38444GvR = new C38444GvR(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.layout_variant_tile, false));
        c38444GvR.A00.setPlaceHolderColor(AbstractC167007dF.A09(AbstractC31172DnG.A05(c38444GvR), R.attr.dividerColor));
        return c38444GvR;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C38444GvR c38444GvR = (C38444GvR) c3oo;
        C14360o3.A0B(c38444GvR, 0);
        if (this.A01 == null) {
            c38444GvR.A01.setVisibility(8);
            return;
        }
        ImageUrl imageUrl = (ImageUrl) this.A04.get(i);
        if (imageUrl != null) {
            c38444GvR.A00.setUrl(imageUrl, this.A03);
        }
        RoundedCornerImageView roundedCornerImageView = c38444GvR.A00;
        roundedCornerImageView.setSelected(AbstractC167007dF.A1P(i, this.A00));
        boolean isSelected = roundedCornerImageView.isSelected();
        RoundedCornerFrameLayout roundedCornerFrameLayout = c38444GvR.A01;
        if (isSelected) {
            roundedCornerFrameLayout.setVisibility(0);
        } else {
            roundedCornerFrameLayout.setVisibility(8);
        }
        ViewOnClickListenerC42028Ijx.A00(roundedCornerImageView, c38444GvR, this, i, 4);
    }

    public C38359Gtv(InterfaceC11380iw interfaceC11380iw) {
        this.A03 = interfaceC11380iw;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-326390048);
        int size = this.A04.size();
        C0f9.A0A(-1920399633, A03);
        return size;
    }
}
