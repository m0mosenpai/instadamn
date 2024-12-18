package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public abstract class I62 {
    public static final void A00(IgImageView igImageView, C42334Iow c42334Iow, User user) {
        if (user == null) {
            igImageView.setVisibility(8);
            return;
        }
        igImageView.setVisibility(0);
        ImageUrl Bhu = user.A03.Bhu();
        if (Bhu != null) {
            igImageView.setUrl(Bhu, c42334Iow.A01);
        } else {
            igImageView.A09();
        }
        ViewOnClickListenerC42034Ik3.A00(igImageView, 64, user, c42334Iow);
        AbstractC166997dE.A18(igImageView.getContext(), igImageView, 2131969976);
    }
}
