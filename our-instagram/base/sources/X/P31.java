package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes9.dex */
public final class P31 implements InterfaceC58118Pph {
    public final Drawable A00;

    @Override // X.InterfaceC58118Pph
    public final void E5c(IgdsHeadline igdsHeadline) {
        igdsHeadline.setCircularImageDrawable(this.A00);
    }

    @Override // X.InterfaceC58118Pph
    public final void E5d(IgdsHeadline igdsHeadline) {
        igdsHeadline.setImageDrawable(this.A00);
        ImageView A08 = AbstractC31171DnF.A08(igdsHeadline, R.id.igds_headline_image);
        if (A08 != null) {
            A08.setAdjustViewBounds(true);
        }
    }

    @Override // X.InterfaceC58118Pph
    public final void E5k(IgdsHeadline igdsHeadline, int i) {
        igdsHeadline.setImageDrawable(this.A00);
        AbstractC54026Nuc.A00(igdsHeadline, R.id.igds_headline_image, i);
    }

    public P31(Drawable drawable) {
        this.A00 = drawable;
    }
}
