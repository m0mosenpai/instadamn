package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.GwP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38504GwP extends C3OO {
    public final Context A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final IgImageView A05;
    public final IgImageView A06;
    public final IgImageView A07;
    public final MediaFrameLayout A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38504GwP(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC166997dE.A0L(view);
        this.A05 = AbstractC37302Gc3.A0K(view, R.id.image);
        TextView A0Q = AbstractC25230BEn.A0Q(view, R.id.title);
        this.A04 = A0Q;
        TextView A0Q2 = AbstractC25230BEn.A0Q(view, R.id.subtitle);
        this.A03 = A0Q2;
        TextView A0Q3 = AbstractC25230BEn.A0Q(view, R.id.merchant_name);
        this.A02 = A0Q3;
        this.A06 = AbstractC37302Gc3.A0K(view, R.id.primary_avatar);
        this.A07 = AbstractC37302Gc3.A0K(view, R.id.secondary_avatar);
        this.A01 = (ImageView) AbstractC166987dD.A0c(view, R.id.share_button);
        this.A08 = (MediaFrameLayout) AbstractC166987dD.A0c(view, R.id.video_container);
        Resources resources = view.getResources();
        C13680mu.A03(A0Q, resources.getDimensionPixelSize(R.dimen.product_collection_header_content_tile_title_line_height));
        C13680mu.A03(A0Q2, resources.getDimensionPixelSize(R.dimen.auth_edit_field_text_size));
        AbstractC37300Gc1.A0d(A0Q3, true);
        C13680mu.A03(A0Q3, resources.getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material));
    }
}
