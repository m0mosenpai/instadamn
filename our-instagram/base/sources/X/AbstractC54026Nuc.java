package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.Nuc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC54026Nuc {
    public static void A00(IgdsHeadline igdsHeadline, int i, int i2) {
        ImageView A08 = AbstractC31171DnF.A08(igdsHeadline, i);
        if (A08 != null) {
            ViewGroup.LayoutParams layoutParams = A08.getLayoutParams();
            if (layoutParams != null) {
                C56302iJ c56302iJ = (C56302iJ) layoutParams;
                ((ViewGroup.LayoutParams) c56302iJ).width = 0;
                c56302iJ.A0Y = 0;
                c56302iJ.A0q = 0;
                A08.setMaxWidth(i2);
                A08.setLayoutParams(c56302iJ);
                A08.setScaleType(ImageView.ScaleType.CENTER_CROP);
                A08.setClipToOutline(true);
                A08.setAdjustViewBounds(true);
                A08.setBackgroundResource(R.drawable.igds_prism_dialog_full_width_bg);
                return;
            }
            throw AbstractC166987dD.A15(AbstractC111324zv.A00(0));
        }
    }
}
