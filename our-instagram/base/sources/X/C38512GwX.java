package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.GwX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38512GwX extends C3OO {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final ViewGroup A04;
    public final ImageView A05;
    public final ImageView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final IgSimpleImageView A0E;
    public final IgImageView A0F;
    public final InterfaceC56392iX A0G;
    public final Runnable A0H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38512GwX(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A0F = AbstractC167007dF.A0T(view, R.id.product_thumbnail_image);
        View A0S = AbstractC166997dE.A0S(view, R.id.product_thumbnail_sold_out_slash);
        this.A03 = A0S;
        this.A08 = AbstractC167007dF.A0N(view, R.id.product_name);
        this.A0C = AbstractC167007dF.A0N(view, R.id.product_subtitle_multiline);
        this.A0D = AbstractC167007dF.A0N(view, R.id.product_subtitle_single_line);
        this.A05 = AbstractC31176DnK.A0D(view, R.id.remove_button);
        this.A00 = AbstractC166997dE.A0S(view, R.id.bottom_buttons);
        this.A04 = AbstractC31176DnK.A0C(view, R.id.item_quantity_button);
        this.A09 = AbstractC167007dF.A0N(view, R.id.item_quantity_text);
        this.A0E = AbstractC31176DnK.A0T(view, R.id.item_quantity_chevron);
        this.A07 = AbstractC167007dF.A0N(view, R.id.edit_button);
        this.A01 = AbstractC166997dE.A0S(view, R.id.edit_button_divider);
        this.A0A = AbstractC167007dF.A0N(view, R.id.save_text_button);
        this.A06 = AbstractC31176DnK.A0D(view, R.id.shipping_icon);
        this.A0B = AbstractC167007dF.A0N(view, R.id.shipping_estimate_label);
        this.A02 = AbstractC166997dE.A0S(view, R.id.divider);
        this.A0G = AbstractC31179DnN.A0M(view, R.id.left_in_stock_label);
        C38294Gsd c38294Gsd = new C38294Gsd(AbstractC166997dE.A0L(A0S));
        c38294Gsd.A00 = R.dimen.abc_action_bar_elevation_material;
        A0S.setBackground(c38294Gsd);
        this.A0H = new RunnableC43129J4s(this, AbstractC167017dG.A0E(view.getContext()));
    }
}
