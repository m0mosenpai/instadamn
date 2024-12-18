package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Ny0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54222Ny0 {
    public static final void A00(View view, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, ImageUrl imageUrl2, String str, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z, boolean z2) {
        C51u c51u;
        String valueOf;
        AbstractC167017dG.A1P(interfaceC11380iw, str);
        View A0R = AbstractC166997dE.A0R(view, R.id.product_picture);
        View A0R2 = AbstractC166997dE.A0R(view, R.id.profile_picture);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.username);
        TextView A0N2 = AbstractC167007dF.A0N(view, R.id.available_items);
        if (imageUrl2 != null) {
            c51u = new C51u(A0R2, imageUrl2, A0R);
        } else {
            c51u = new C51u(A0R, imageUrl, A0R2);
        }
        IgImageView igImageView = (IgImageView) c51u.A00;
        ImageUrl imageUrl3 = (ImageUrl) c51u.A01;
        AbstractC43592JPx.A1U(c51u.A02, 8);
        igImageView.setVisibility(0);
        if (imageUrl3 != null) {
            igImageView.setUrl(imageUrl3, interfaceC11380iw);
        }
        A0N.setText(str);
        if (z2) {
            if (z) {
                valueOf = view.getContext().getString(2131973943);
            } else {
                valueOf = String.valueOf(i);
            }
            C14360o3.A0A(valueOf);
            A0N2.setText(AbstractC31175DnJ.A0W(AbstractC25228BEl.A0M(view), valueOf, R.plurals.shop_selector_product_count_label, i));
        } else {
            A0N2.setVisibility(8);
        }
        C0fQ.A00(new ViewOnClickListenerC28666ClE(interfaceC16820sZ, 40), view);
    }
}
