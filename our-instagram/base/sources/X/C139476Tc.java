package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.6Tc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139476Tc {
    public View A00;
    public View A01;
    public View A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public RoundedCornerImageView A06;
    public RoundedCornerImageView A07;
    public RoundedCornerImageView A08;
    public final InterfaceC56392iX A09;

    public final void A00() {
        String str;
        this.A09.getView().setVisibility(8);
        RoundedCornerImageView roundedCornerImageView = this.A08;
        if (roundedCornerImageView != null) {
            roundedCornerImageView.setVisibility(8);
            RoundedCornerImageView roundedCornerImageView2 = this.A07;
            if (roundedCornerImageView2 != null) {
                roundedCornerImageView2.setVisibility(8);
                RoundedCornerImageView roundedCornerImageView3 = this.A06;
                if (roundedCornerImageView3 != null) {
                    roundedCornerImageView3.setVisibility(8);
                    return;
                }
                str = "productImage";
            } else {
                str = "productImageBottom";
            }
        } else {
            str = "productImageTop";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C139476Tc(InterfaceC56392iX interfaceC56392iX) {
        this.A09 = interfaceC56392iX;
        interfaceC56392iX.EZv(new InterfaceC69513Al() { // from class: X.6Td
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                C14360o3.A0B(view, 0);
                C139476Tc c139476Tc = C139476Tc.this;
                c139476Tc.A01 = view;
                View requireViewById = view.requireViewById(R.id.product_thumbnail_tappable_area);
                C14360o3.A0B(requireViewById, 0);
                c139476Tc.A02 = requireViewById;
                TextView textView = (TextView) view.requireViewById(R.id.product_thumbnail_header);
                C14360o3.A0B(textView, 0);
                c139476Tc.A05 = textView;
                TextView textView2 = (TextView) view.requireViewById(R.id.product_thumbnail_header_more_products);
                C14360o3.A0B(textView2, 0);
                c139476Tc.A04 = textView2;
                TextView textView3 = (TextView) view.requireViewById(R.id.product_thumbnail_subheader);
                C14360o3.A0B(textView3, 0);
                c139476Tc.A03 = textView3;
                View requireViewById2 = view.requireViewById(R.id.product_thumbnail_images_stacked);
                C14360o3.A0B(requireViewById2, 0);
                c139476Tc.A00 = requireViewById2;
                RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) view.requireViewById(R.id.product_thumbnail_image);
                C14360o3.A0B(roundedCornerImageView, 0);
                c139476Tc.A06 = roundedCornerImageView;
                RoundedCornerImageView roundedCornerImageView2 = (RoundedCornerImageView) view.requireViewById(R.id.product_thumbnail_image_stacked_top);
                C14360o3.A0B(roundedCornerImageView2, 0);
                c139476Tc.A08 = roundedCornerImageView2;
                RoundedCornerImageView roundedCornerImageView3 = (RoundedCornerImageView) view.requireViewById(R.id.product_thumbnail_image_stacked_bottom);
                C14360o3.A0B(roundedCornerImageView3, 0);
                c139476Tc.A07 = roundedCornerImageView3;
            }
        });
    }
}
