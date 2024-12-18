package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes9.dex */
public final class P30 implements InterfaceC58118Pph {
    public final Bitmap A00;

    @Override // X.InterfaceC58118Pph
    public final void E5c(IgdsHeadline igdsHeadline) {
        igdsHeadline.setCircularImageBitmap(this.A00);
    }

    @Override // X.InterfaceC58118Pph
    public final void E5d(IgdsHeadline igdsHeadline) {
        igdsHeadline.setImageBitmap(this.A00, null);
        ImageView A08 = AbstractC31171DnF.A08(igdsHeadline, R.id.igds_headline_url_image);
        if (A08 != null) {
            A08.setAdjustViewBounds(true);
        }
    }

    @Override // X.InterfaceC58118Pph
    public final void E5k(IgdsHeadline igdsHeadline, int i) {
        igdsHeadline.setImageBitmap(this.A00, null);
        AbstractC54026Nuc.A00(igdsHeadline, R.id.igds_headline_url_image, i);
    }

    public P30(Bitmap bitmap) {
        this.A00 = bitmap;
    }
}
