package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.Ia5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41556Ia5 {
    public static final InterfaceC65702y7 A00 = C42360IpM.A00;

    public static final void A00(C38487Gw8 c38487Gw8, C42325Ion c42325Ion) {
        C14360o3.A0B(c38487Gw8, 0);
        View view = c38487Gw8.itemView;
        view.setVisibility(0);
        ViewOnClickListenerC42035Ik4.A01(view, 4, c42325Ion);
        RoundedCornerFrameLayout roundedCornerFrameLayout = c38487Gw8.A04;
        C38681GzM c38681GzM = c42325Ion.A00;
        roundedCornerFrameLayout.setStrokeWidth(AbstractC25228BEl.A0M(c38487Gw8.itemView).getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height));
        Number number = (Number) c38681GzM.A03;
        if (number != null) {
            roundedCornerFrameLayout.setCornerRadius(number.intValue());
        }
        IgImageView igImageView = c38487Gw8.A02;
        ImageUrl imageUrl = (ImageUrl) c38681GzM.A01;
        if (imageUrl == null) {
            igImageView.A09();
        } else {
            igImageView.setUrl(imageUrl, c42325Ion.A01.A00);
        }
        IgImageView igImageView2 = c38487Gw8.A03;
        ImageUrl imageUrl2 = (ImageUrl) c38681GzM.A02;
        if (imageUrl2 == null) {
            igImageView2.A09();
        } else {
            igImageView2.A0I = A00;
            igImageView2.setUrl(imageUrl2, c42325Ion.A01.A00);
        }
        c38487Gw8.A01.setText(c38681GzM.A04);
        View view2 = c38487Gw8.A00;
        view2.setVisibility(c38681GzM.A05 ? 0 : 8);
        ViewOnClickListenerC42035Ik4.A01(view2, 5, c42325Ion);
    }
}
