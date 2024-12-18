package X;

import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes9.dex */
public final class P32 implements InterfaceC58118Pph {
    public final ImageUrl A00;

    @Override // X.InterfaceC58118Pph
    public final void E5c(IgdsHeadline igdsHeadline) {
        igdsHeadline.setCircularImageUrl(this.A00, null, null, null, null);
    }

    @Override // X.InterfaceC58118Pph
    public final void E5d(IgdsHeadline igdsHeadline) {
        igdsHeadline.setImageURL(this.A00, null, null);
        ImageView A08 = AbstractC31171DnF.A08(igdsHeadline, R.id.igds_headline_url_image);
        if (A08 != null) {
            A08.setAdjustViewBounds(true);
        }
    }

    @Override // X.InterfaceC58118Pph
    public final void E5k(IgdsHeadline igdsHeadline, int i) {
        igdsHeadline.setImageURL(this.A00, null, null);
        AbstractC54026Nuc.A00(igdsHeadline, R.id.igds_headline_url_image, i);
    }

    public P32(ImageUrl imageUrl) {
        this.A00 = imageUrl;
    }
}
