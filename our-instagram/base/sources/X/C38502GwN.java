package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.GwN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38502GwN extends C3OO {
    public C38294Gsd A00;
    public final View A01;
    public final View A02;
    public final FrameLayout A03;
    public final TextView A04;
    public final IgImageView A05;
    public final C57012jc A06;
    public final C57012jc A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38502GwN(View view, boolean z) {
        super(view);
        ViewStub viewStub;
        int i;
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A03 = (FrameLayout) AbstractC166987dD.A0c(this.itemView, R.id.thumbnail_image_container);
        this.A05 = AbstractC37302Gc3.A0K(this.itemView, R.id.thumbnail_image);
        View A0S = AbstractC166997dE.A0S(this.itemView, R.id.selected_border);
        this.A02 = A0S;
        this.A04 = AbstractC25230BEn.A0Q(this.itemView, R.id.label);
        View findViewById = this.itemView.findViewById(R.id.sold_out_separator_stub);
        if (findViewById instanceof ViewStub) {
            viewStub = (ViewStub) findViewById;
        } else {
            viewStub = null;
        }
        this.A07 = new C57012jc(viewStub);
        View findViewById2 = this.itemView.findViewById(R.id.sold_out_label_stub);
        this.A06 = new C57012jc(findViewById2 instanceof ViewStub ? (ViewStub) findViewById2 : null);
        Resources A0M = AbstractC25228BEl.A0M(this.A01);
        int dimensionPixelSize = A0M.getDimensionPixelSize(R.dimen.dynamic_ads_picker_padding_top);
        TextView textView = this.A04;
        int i2 = textView.getPaint().getFontMetricsInt().bottom - textView.getPaint().getFontMetricsInt().top;
        int dimensionPixelSize2 = (i2 * 2) + A0M.getDimensionPixelSize(R.dimen.thumbnail_variant_selector_label_top_padding);
        if (z) {
            i = dimensionPixelSize + dimensionPixelSize2 + A0M.getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height) + (AbstractC166997dE.A06(A0M) * 2) + i2;
        } else {
            i = dimensionPixelSize + dimensionPixelSize2;
        }
        view.setMinimumHeight(i);
        Context A05 = AbstractC31172DnG.A05(this);
        A0S.setBackground(new C149496o0(0.0f, AbstractC167017dG.A04(A05), AbstractC53242c7.A0F(A05, R.attr.inverseBackgroundColorPrimary), 0));
    }
}
